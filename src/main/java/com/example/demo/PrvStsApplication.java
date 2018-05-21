package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PrvStsApplication implements CommandLineRunner {
	
	@Autowired
	PersonRepo tabelata;

	public static void main(String[] args) {
		SpringApplication.run(PrvStsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Zdravo");
		Person ani = new Person("ani", "gago", 35);
		Person kiko = new Person("kiko", "gago", 32);
		tabelata.save(ani);
		tabelata.save(kiko);
	}
}
