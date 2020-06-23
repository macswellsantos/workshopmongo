package com.macswell.workshopmongo.config;


import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.macswell.workshopmongo.domain.User;
import com.macswell.workshopmongo.repository.UserRepository;

@Configuration
public class Instantiation implements CommandLineRunner{

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public void run(String... args) throws Exception {
		
		userRepository.deleteAll();
		
		User julia = new User(null,"Julia Bauer","julia@gmail.com");
		User alice = new User(null,"Alice Menezes","alice@gmail.com");
		User lucas = new User(null,"Lucas Santos","lucas@gmail.com");
		
		userRepository.saveAll(Arrays.asList(julia,alice,lucas));
		
	}

}
