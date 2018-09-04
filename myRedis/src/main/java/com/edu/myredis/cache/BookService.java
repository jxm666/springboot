package com.edu.myredis.cache;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;

import com.edu.myredis.cache.support.Book;


@Component
public class BookService extends AbstractService {
	
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