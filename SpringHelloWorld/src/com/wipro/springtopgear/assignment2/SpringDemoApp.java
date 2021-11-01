package com.wipro.springtopgear.assignment2;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringDemoApp {
	
	public static void main(String args[]) {
		
		ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("applicationContext2.xml");
		
		Movie movie=context.getBean("movie",Movie.class);
		System.out.println(movie);
	}

}
