package com.edu.myredis;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.edu.myredis.cache.BookService;
import com.edu.myredis.cache.support.Book;



@RunWith(SpringRunner.class)
@SpringBootTest(classes=CacheBootApplication.class)
public class TestRedisCache {
	
	@Autowired
	private BookService bookService;
	
	@Test
	public void getCache() {
		
		for (int i = 0; i <3; i++) {

			System.out.println("----------调用方法-------------");
			Book book = bookService.queryBookCacheable("1");
			System.out.println(book.toString());
		}
		
	}

}
