package com.wipro.springtopgear.ioc.assignment1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringDemoApp {
	
	public static void main(String args[]) {
		
		ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("applicationContext3.xml");
		
		Student student1= context.getBean("student1", Student.class);
		Student student21= context.getBean("student2-1", Student.class);
		Student student22= context.getBean("student2-2", Student.class);
		
		System.out.println("student1: "+student1);
		System.out.println("student2: Test 1: "+student21 +" Test 2: "+student22);
		
	}

}
