package com.edu.myjdbc.simple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class TestJdbcUser {
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	public void save(String name) {
	
		String sql ="insert into my_user(`name`) values(\""+name+"\");";
		
		jdbcTemplate.execute(sql);
		
	}

}
