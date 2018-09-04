package com.edu.myaop.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Aspect
@Component
public class LogAspect {
	
	/**
	 * AOP 切面编程讲解
	 * 1 添加SpringBoot AOP 依赖 spring-boot-starter-aop ,添加后自动启用切面AOP
	 * 2 在切面类添加注解 @Aspect 并且纳入Spring容器管理 @Component
	 * 3 需要配置通知(前置通知@Before,后置通知@After,环绕通知灯)和切入点(哪个包的哪个类的哪个方法)
	 * 
	 * 配置文件里spring.aop.auto=true 默认是启用的 没有配置项时默认也是true
	 */
	
	@Before("execution( * com.edu.myaop.dao..*.*(..))")
//	@Before("execution(public * com.edu.myaop.dao.*.impl..*.*(..))")
	public void Log() {
		System.out.println("before method log done");
	}
	
	
	@After("execution( * com.edu.myaop.dao..*.*(..))")
//	@@After("execution(public * com.edu.myaop.dao.*.impl..*.*(..))")
	public void Log2(JoinPoint point) {
		System.out.println("------after method log ------");
		System.out.println("ClassName ="+point.getTarget().getClass());
		System.out.println("method ="+point.getSignature().getName());
		System.out.println("args ="+Arrays.asList(point.getArgs()));
		
		
		
	}

}
