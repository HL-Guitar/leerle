package com.taotao.content.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.taotao.common.pojo.EasyUITreeNode;
import com.taotao.common.pojo.TaotaoResult;
import com.taotao.content.service.ContentCategoryService;
import com.taotao.mapper.TbContentCategoryMapper;
import com.taotao.pojo.TbContentCategory;
import com.taotao.pojo.TbContentCategoryExample;
import com.taotao.pojo.TbContentCategoryExample.Criteria;

@Service
public class ContentCategoryServiceImpl implements ContentCategoryService {

	@Autowired
	private TbContentCategoryMapper mapper;
	@Override
	public List<EasyUITreeNode> getContentCategoryList(long parentId) {
	
		//1.注入mapper
		//2.创建example，ple
		TbContentCategoryExample example = new TbContentCategoryExample();
		//3.设置条件
		Criteria criteria = example.createCriteria();
		criteria.andParentIdEqualTo(parentId);
		//4.执行查询
		List<TbContentCategory> list = mapper.selectByExample(example);
		//5.转成EASYUITREENODE列表
		ArrayList<EasyUITreeNode> nodes = new ArrayList<>();
		for (TbContentCategory tbContentCategory : list) {
			EasyUITreeNode node = new EasyUITreeNode();
			node.setId(tbContentCategory.getId());
			node.setText(tbContentCategory.getName());
			node.setState(tbContentCategory.getIsParent()?"closed":"open");
			System.out.println(node);
			nodes.add(node);
		}
		return nodes;
	}
	@Override
	public TaotaoResult createContentCategory(Long parentId, String name) {

		//1.构建对象  补全其他的属性
				TbContentCategory category = new TbContentCategory();
				category.setCreated(new Date());
				category.setIsParent(false);//新增的节点都是叶子节点
				category.setName(name);
				category.setParentId(parentId);
				category.setSortOrder(1);
				category.setStatus(1);
				category.setUpdated(category.getCreated());
				//2.插入contentcategory表数据
				mapper.insertSelective(category);
				//3.返回taotaoresult 包含内容分类的id   需要主键返回
				
				//判断如果要添加的节点的父节点本身叶子节点  需要更新其为父节点
				TbContentCategory parent = mapper.selectByPrimaryKey(parentId);
				if(parent.getIsParent()==false){//原本就是叶子节点
					parent.setIsParent(true);
					mapper.updateByPrimaryKeySelective(parent);//更新节点的is_parent属性为true
				}
				
				return TaotaoResult.ok(category);
	}
	@Override
	public TaotaoResult updateContentCategory(Long id, String name) {
		TbContentCategory category = new TbContentCategory();
		category.setName(name);
		category.setId(id);;
		mapper.updateByPrimaryKeySelective(category);
		return TaotaoResult.ok(category);
	}
	@Override
	public TaotaoResult deleteContentCategory(Long id) {
		TbContentCategory tb = mapper.selectByPrimaryKey(id);
		if (tb.getIsParent()==true) {
			return TaotaoResult.build(200, "failure");
		}else {
			Long parentId=tb.getParentId();
			mapper.deleteByPrimaryKey(id);
			List<TbContentCategory> isChange = mapper.selectByParentId(parentId);
			System.out.println(isChange);
			if (isChange.size()==0 || isChange.isEmpty()==true) {
				tb = new TbContentCategory();
				tb.setId(parentId);
				tb.setIsParent(false);
				mapper.updateByPrimaryKeySelective(tb);
			}
			return TaotaoResult.ok(tb);
		}
		
	}

}
