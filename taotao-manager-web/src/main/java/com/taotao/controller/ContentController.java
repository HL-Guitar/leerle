package com.taotao.controller;

import java.util.List;

import org.quartz.simpl.LoadingLoaderClassLoadHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.taotao.common.pojo.EasyUIDataGridResult;
import com.taotao.common.pojo.TaotaoResult;
import com.taotao.content.service.ContentService;
import com.taotao.pojo.TbContent;

@Controller
public class ContentController {

	@Autowired
	private ContentService service;
//	$.post("/content/save",$("#contentAddForm").serialize(), function(data){
	//返回值是JSON
	
	@RequestMapping(value="/content/save",method=RequestMethod.POST)
	@ResponseBody
	public TaotaoResult saveContent(TbContent tbContent) {
		//1.引入服务
		//2.注入服务
		//3.调用
		return service.saveContent(tbContent);
	}
	///content/query/list
	@RequestMapping(value="content/query/list",method=RequestMethod.GET)
	@ResponseBody
	public List<TbContent> queryList(Long categoryId) {
		return service.getContentListByCatId(categoryId);
	}
	
}
