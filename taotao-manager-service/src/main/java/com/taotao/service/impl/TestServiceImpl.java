package com.taotao.service.impl;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.taotao.mapper.TestMapper;
import com.taotao.service.TestService;

@Service
public class TestServiceImpl implements TestService,Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 7103415746617992802L;
	@Autowired
	private TestMapper mapper;
	@Override
	public String queryNow() {
		//1.注入mapper 
		//2.调用mapper的方法 返回
		return mapper.queryNow();
	}

}
