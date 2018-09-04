package com.edu.myBatis.dao;

import com.edu.myBatis.model.User;
import org.apache.ibatis.annotations.*;

import java.util.List;
import java.util.Map;

public interface IUserDao {
	
	/**
	 * SpringBoot 使用MyBatis 添加依赖 <groupId>org.mybatis.spring.boot</groupId><artifactId>mybatis-spring-boot-starter</artifactId> 
	 * 由于JDBC驱动是MySQL还得添加依赖<groupId>mysql</groupId> <artifactId>mysql-connector-java</artifactId>
	 * 在启动SpringBoot主类里添加 MyBatis扫描包的路径.@MapperScan(basePackages="com.edu.myBatis.dao")
	 * 接下来编写一个接口 ,使用@Insert,@Select ...
	 */

	@Insert("insert into my_user(`name`) values(#{userName,jdbcType=VARCHAR})")
	int saveUser(Map<String, Object> map);
	
	@Insert("insert into my_user(`name`) values(#{userName,jdbcType=VARCHAR})")
	int saveUserByObject(User user);
	
	//where id = {#userId}
	@Select("select * from my_user where id=#{userId}")
	@Results({
		@Result(column="id",property="id"),
		@Result(column="name",property="userName")
	})
	User findByUserId(@Param(value="userId") Integer userId);
	
	
	@Select("select * from my_user where `name` = #{userName}")
	@Results({
		@Result(column="id",property="id"),
		@Result(column="name",property="userName")
	})
	List<User> findByUserName(String userName);
	
	
	@Select("select * from my_user ")
	@Results({
		@Result(column="id",property="id"),
		@Result(column="name",property="userName")
	})
	List<User> getAllUser();
	
	@Update("update my_user set name = #{name} where id = #{id}")
	int updateUser(@Param("id")Integer id,@Param("name")String name);
	
	@Delete("delete from my_user where id =#{id}")
	int deleteUser(Integer id);
}
