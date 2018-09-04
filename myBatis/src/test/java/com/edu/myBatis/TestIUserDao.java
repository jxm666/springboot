package com.edu.myBatis;

import com.edu.myBatis.dao.IUserDao;
import com.edu.myBatis.model.User;
import junit.framework.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest(classes=MyBatisApplication.class)
public class TestIUserDao {
	
	@Autowired
	private IUserDao userDao ;
	
	@Test
	public void TestUserDao() {
		
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("userName", "jxmTestMyBatis");
		int result = userDao.saveUser(map);
		Assert.assertEquals(1, result);
	}
	
//	@Test
//	public void TestUserDaoByObject() {
//		User user = new User();
//		user.setUserName("jxmOjbectTest");
//		int result = userDao.saveUserByObject(user);
//		
//		Assert.assertEquals( 1, result);
//	}
	
	@Test
	public void TestUserDaoSelectById() {
		User user= userDao.findByUserId(18);
		System.out.println(user);
		Assert.assertNotNull(user);
	}
	
	@Test
	public void TestUserDaoSelectByUserName() {
		List<User> userList = userDao.findByUserName("jxmTestMyBatis");
		
		System.out.println("TestUserDaoSelectByUserName get number is "+userList.size());
		Assert.assertNotNull(userList);
	}
	
	@Test
	public void TestUpdateUser() {
		int result = userDao.updateUser(18, "update User");
		
		System.out.println("TestUpdateUser update is "+result);
		Assert.assertEquals(1, result);
		
	}
	
	@Test
	public void TestUserDaoDelete() {
		int result = userDao.deleteUser(19);
		
		System.out.println("Delete User is "+result);
		Assert.assertEquals(1, result);
	}

}
