package com.taotao.test.jedis;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.taotao.content.jedis.JedisClient;

public class JredisClientTest {
	@Test
	public void test1() {
		//初始化spring容器
		ApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring/applicationContext-redis.xml");
		//获取类方法实例
		JedisClient jedisClient = context.getBean(JedisClient.class);
		//调用方法操作
		jedisClient.set("jedisclientTestkey11", "jedisclientkey");
		System.out.println(jedisClient.get("jedisclientTestkey11"));

	}
}
