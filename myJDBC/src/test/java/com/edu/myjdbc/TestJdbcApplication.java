package com.edu.myjdbc;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.edu.myjdbc.simple.TestJdbcUser;

@RunWith(SpringRunner.class)
@SpringBootTest(classes=JdbcApplication.class)
public class TestJdbcApplication {

	@Autowired
	TestJdbcUser jdbcUser ;
	
	@Test
	public void save() {
		
		jdbcUser.save("test1");
	}
	
	
}
