package com.wipro.springtopgear.ioc.assignment2;

import java.util.Scanner;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringDemoApp {

	public static void main(String args[]) {

		ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("applicationContext4.xml");

		Player player1= context.getBean("player1", Player.class);
		Player player2= context.getBean("player2", Player.class);
		Player player3= context.getBean("player3", Player.class);
		Player player4= context.getBean("player4", Player.class);
		Player player5= context.getBean("player5", Player.class);

		Player [] players = new Player[]{player1, player2, player3, player4, player5};

		for(Player player: players) {
			System.out.println(player);
		}

		System.out.println("Enter country name: ");
		Scanner scan = new Scanner(System.in);
		String countryName = scan.nextLine();
		for(Player player: players) {
			if(player.getCountry().getCountryName().equalsIgnoreCase(countryName)){
				System.out.println(player);
			}
		}
	}

}
