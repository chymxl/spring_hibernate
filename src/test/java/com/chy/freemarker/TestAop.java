package com.chy.freemarker;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.chy.freemarker.aop.TestClass;

public class TestAop {
	
	@Test
	public void test(){
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:.xml");
		TestClass test = (TestClass)ctx.getBean("test");
		System.out.println(test.doTest());
	}

}
