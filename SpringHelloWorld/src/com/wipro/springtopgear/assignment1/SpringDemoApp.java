package com.wipro.springtopgear.assignment1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringDemoApp {
	
	public static void main(String args[]) {
		
		ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Movie movie=context.getBean("movie",Movie.class);
		System.out.println(movie);
	}

}
