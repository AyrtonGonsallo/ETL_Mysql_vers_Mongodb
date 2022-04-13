package com.test.microservices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;




@SpringBootApplication
public class EtlAlljudoApplication implements CommandLineRunner{
	@Autowired
	ReaderWriter rw;
	public static void main(String[] args) {
		SpringApplication.run(EtlAlljudoApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
		Classes c=Classes.Evenement;
		rw.readAndWrite(20,c, c.toString()+".txt");
		
		
		
		
	}

}
