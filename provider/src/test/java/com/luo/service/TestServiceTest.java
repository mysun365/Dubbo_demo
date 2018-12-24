package com.luo.service;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestServiceTest {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"application.xml"});
		context.start();
		System.out.println("提供者服务已经注册成功");
		try{
			System.in.read();
		}catch(IOException e){
			e.printStackTrace();
		}
	}

}
