package com.edu.myjdbc.transaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class MyJdbcTransaction {

	@Autowired
	JdbcTemplate jdbcTemplate;

	/**
	 * 注解 Transactional ,想要使用该注解,需要在SpringBoot 启动时开启 EnableTransactionManager
	 * 默认只能是运行异常才能回滚 ，但是可以制定rollbackFor 异常类型来回滚
	 * rollbackFor=Exception.class 制定回滚的类型。
	 * @param names
	 */
	@Transactional
	public void saveBatch(String... names){

		for (String name : names) {
			String sql = "insert into my_user(`name`) values(\"" + name + "\");";
			jdbcTemplate.execute(sql);
			
			if("".equals("")) {
				System.out.print("------------------------");
				throw new NullPointerException();
			}
		}
	}

}
