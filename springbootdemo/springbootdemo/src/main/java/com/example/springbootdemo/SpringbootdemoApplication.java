package com.example.springbootdemo;

import com.example.springbootdemo.model.Alien;
import com.example.springbootdemo.model.Alien2;
import com.example.springbootdemo.service.AlienService;
import com.example.springbootdemo.model.Developer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringbootdemoApplication {

	public static void main(String[] args) {

		ApplicationContext context=SpringApplication.run(SpringbootdemoApplication.class, args);

		Developer dev=context.getBean(Developer.class);
		dev.build();
		Alien alien=context.getBean(Alien.class);
		Alien2 alien2=context.getBean(Alien2.class);

		AlienService service=context.getBean(AlienService.class);
		service.addAlien(alien);
		service.addAlien(alien2);
	}

}
