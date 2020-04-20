package com.crazy.learn.service;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @Author guofeng@picooc.com
 * @Date 2020-04-12
 * @Version V1.0
 **/
@Component
@Aspect
public class ServiceAspect {

	@Pointcut("execution(* com.crazy.learn.service.UserService.*(..))")
	public void pointCut(){}

	@Before("pointCut()")
	public void before(){
		System.out.println("---------before advice");
	}


	@After("pointCut()")
	public void after(){
		System.out.println("---------after advice");
	}

//	@Around("pointCut()")
//	public void around(){
//		System.out.println("---------around advice");
//	}


}
