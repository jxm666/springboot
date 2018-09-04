package com.edu.myredis.cache;

import java.io.Serializable;

import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.stereotype.Component;

import com.edu.myredis.cache.support.Book;


@Component
//@CacheConfig(cacheNames="asdf")
public class BookService extends AbstractService {
	
	/**
	 * 1 SprinBoot Redis 缓存  其实不需要引用 Spring-boot-starter-cache , 默认在该jar包下 spring-context-4.3.10.RELEASE.jar
	 * 2 需要在启动类 加上启用缓存 注解 @EnableCaching
	 * 3 在需要缓存的地方 加上@Cacheable 注解表示缓存,cacheNames 名称,key =#id 方法变量id值
	 * 4 @CachePut 更新缓存
	 * 5 @CacheEvict 去除缓存
	 * 6 需要缓存对象支持序列化 implements Serializable
	 * 
	 * 7 @CacheConfig(cacheNames="book1") 那么在 cacheable 里就需要写了.
	 * 8 @Cacheable 两个属性 condition ="#id.length() >3 "才缓存, nuless ="#result.getxx() !=0" 依据结果条件进行缓存.
	 */
	
	//获取
	@Cacheable(cacheNames="book1",key="#id")
	public Book queryBookCacheable(String id) {
		System.out.println(" 处理方法 queryBookCacheable,id="+id);
		return repositoryBook.get(id);
		
	}

}

/*
 * @Cacheable(cacheNames="book1", key="#id")
	public Book queryBookCacheable(String id){
		logger.info("queryBookCacheable,id={}",id);
		return repositoryBook.get(id);
	}
*/