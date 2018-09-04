package com.edu.myjdbc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import javax.sql.DataSource;

@SpringBootApplication
public class JdbcApplication {

    public static void main (String [] args){

        ConfigurableApplicationContext context = SpringApplication.run(JdbcApplication.class,args);
        //SpringApplication content = new SpringApplication(JdbcApplication.class);测试类
        System.out.print(context.getBean(DataSource.class));

    }
}
