package com.edu.myredis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@ComponentScan(basePackages = { "com.qiqi.myboot" })
public class MyBootApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("开始");
		System.out.println("开始");
		
		
		SpringApplication.run(MyBootApplication.class, args);
		System.out.println("完成");

	}

}
