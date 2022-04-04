package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class HotelMenuSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(HotelMenuSpringApplication.class, args);
		
		ApplicationContext context=new ClassPathXmlApplicationContext("NewFile.xml");
		
		Menu menu = (Menu)context.getBean("mens");
		
		System.out.println("The menu Items are");
		System.out.println(menu);
		System.out.print("The sum of all the menu items is : ");
		System.out.print(menu.getSum());
	}

}
