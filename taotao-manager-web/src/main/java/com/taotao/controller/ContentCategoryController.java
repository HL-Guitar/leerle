package com.taotao.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.taotao.common.pojo.EasyUITreeNode;
import com.taotao.common.pojo.TaotaoResult;
import com.taotao.content.service.ContentCategoryService;

@Controller
public class ContentCategoryController {

	@Autowired
	private ContentCategoryService service;
	
	@RequestMapping(value="/content/category/list")
	@ResponseBody
	public List<EasyUITreeNode> getContentCategoryList(@RequestParam(value="id",defaultValue="0") Long parentId){
		//1.引入服务
		//2.注入服务
		//3调用
	//	System.out.println(parentId);
		return service.getContentCategoryList(parentId);
	}
	
	///content/category/create
		//method=post
		//参数：
		//parentId：就是新增节点的父节点的Id
		//name：新增节点的文本
		//返回值taotaoresult 包含分类的id
		/**
		 * 添加节点
		 * @param parentId
		 * @param name
		 * @return
		 */
	@RequestMapping(value="/content/category/create",method=RequestMethod.POST)
	@ResponseBody
	public TaotaoResult createContentCategory(Long parentId, String name) {
		return service.createContentCategory(parentId, name);
	}
	
/*	$.post("/content/category/update",{id:node.id,name:node.text});
 * 更新节点
*/
	@RequestMapping(value="/content/category/update",method=RequestMethod.POST)
	@ResponseBody
	public TaotaoResult updateContentCategory(Long id, String name) {
		return service.updateContentCategory(id, name);
	}
	
	/**
	 * /content/category/delete/
	 * 删除节点
	 */
	@RequestMapping(value="/content/category/delete",method=RequestMethod.POST)
	@ResponseBody
	public TaotaoResult deleteContentCategory(Long id) {
	  System.out.println(id);
	 
	  return service.deleteContentCategory(id);
	}
	
}
