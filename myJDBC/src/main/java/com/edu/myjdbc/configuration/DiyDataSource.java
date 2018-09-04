/*package com.edu.myjdbc.configuration;

import javax.sql.DataSource;

import org.apache.tomcat.jdbc.pool.DataSourceProxy;
import org.apache.tomcat.jdbc.pool.PoolConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.Environment;
      
*//**
 * 自定义配置DataSource ,默认是自动配置的.
 * @author edb
 *
 *//*
@SpringBootConfiguration
public class DiyDataSource {

	@Autowired
	private Environment env;
	
	@Bean
	public DataSource createDataSource() {
		
		PoolConfiguration pc = new DataSourceProxy();
		pc.setDriverClassName(env.getProperty("spring.datasource.driver-class-name"));
		pc.setUrl(env.getProperty("spring.datasource.url"));
		pc.setName(env.getProperty("spring.datasource.username"));
		pc.setPassword(env.getProperty("spring.datasource.password"));
//		pc.setName(env.getProperty(""));
		
		DataSource ds = new org.apache.tomcat.jdbc.pool.DataSource(pc);
		
		return ds;
	}
}
*/