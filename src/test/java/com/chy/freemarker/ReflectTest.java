package com.chy.freemarker;

import java.lang.reflect.Method;

public class ReflectTest {
	
	public static void main(String[] args) throws Exception {
		Class cls = ReflectTest.class;
		Method method = cls.getMethod("sayHello", String.class);
		Object obj = cls.newInstance();
		method.invoke(obj, "Hello World");
	}

	public void sayHello(String str){
		System.out.println(str);
	}
}
