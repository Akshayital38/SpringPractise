package com.self.demo;

import com.self.demo.example.code;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {


//		ApplicationContext context =  SpringApplication.run(DemoApplication.class, args);
//
//		code code1 = context.getBean(code.class);
//
//		code1.sumOfAll();

		SpringApplication.run(DemoApplication.class,args);


	}

}
