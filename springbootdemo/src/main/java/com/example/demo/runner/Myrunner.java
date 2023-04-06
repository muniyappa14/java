package com.example.demo.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
@Component
public class Myrunner implements CommandLineRunner {
	private void sayHello() {
		System.out.println("java springboot");
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		sayHello();
		}

}
