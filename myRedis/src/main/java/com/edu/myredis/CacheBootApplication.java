package com.edu.myredis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class CacheBootApplication {
    //启动开启缓存的SpringBoot程序

    public void  Main(String arges){
        SpringApplication.run(CacheBootApplication.class,arges);
    }
}
