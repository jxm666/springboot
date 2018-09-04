package com.edu.myaop;

import com.edu.myaop.dao.UserDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes=AopApplication.class)
public class TestAopApplication {
	
	@Autowired
	UserDao userDao;
	
	@Test
	public void TestSave() {
		userDao.save("jxm", "123");
	}

}
