package com.edu.myaop.dao;

import org.springframework.stereotype.Repository;

@Repository
public class UserDao {

	public void save(String name ,String pwd) {
		
		System.out.println("save modth:[name,pwd]");
		
	}
	
}
