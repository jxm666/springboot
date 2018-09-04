package com.edu.myjdbc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
public class JdbcTransactionApplication {
	
	public void main(String [] args) {
		
		SpringApplication.run(JdbcTransactionApplication.class, args);
	}

}
