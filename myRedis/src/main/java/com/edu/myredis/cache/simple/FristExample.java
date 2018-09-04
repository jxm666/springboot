package com.edu.myredis.cache.simple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

@Service
public class FristExample {

	@Autowired
	private RedisTemplate<String, String> redisTemplate ;
	
//	@Autowired
//	StringRedisTemplate stringRedisTemplate ;
	
	
	public void save(String userId,String value) {
		redisTemplate.opsForSet().add(userId, value);
//		stringRedisTemplate.opsForSet().add(userId, value);
		System.out.println("abcd");
	}

}

/*
 * @Service
public class FirstExample {
	@Autowired
	private RedisTemplate<String, String> redisTemplate;

	public void save(String userId, String value) {
		redisTemplate.boundListOps(userId).leftPush(value);
	}
 *
*/