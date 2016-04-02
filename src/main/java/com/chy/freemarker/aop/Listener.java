package com.chy.freemarker.aop;

import org.aspectj.lang.ProceedingJoinPoint;

public class Listener {
	
	public Object around(ProceedingJoinPoint pjp) throws Throwable{
		System.out.println("beginning***************");
		Object obj = pjp.proceed();
		return obj + " Hello World";
	}
	

}
