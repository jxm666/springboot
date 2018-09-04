package com.edu.myjdbc;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.edu.myjdbc.transaction.MyJdbcTransaction;

@RunWith(SpringRunner.class)
@SpringBootTest(classes=JdbcTransactionApplication.class)
public class TestJdbcTransactionApplication {

	@Autowired
	MyJdbcTransaction jdbcTransaction;

	@Test
	public void saveBatch() {
		jdbcTransaction.saveBatch("Mp3", "Mp4", "Mp5");
	}
}
