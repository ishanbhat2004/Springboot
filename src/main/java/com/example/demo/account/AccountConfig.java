package com.example.demo.account;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.demo.user.User;

@Configuration
public class AccountConfig {
	
	@Bean
	CommandLineRunner commandLineRunner(AccountRepository repository) {
		return args-> {
			
			User ishan = new User("ishan", 1L, LocalDate.of(2007, Month.AUGUST, 14), 2);
			
			
			Account first = new Account (ishan, 2000, "bhat52"); 
			Account second = new Account (3000, "jeet60");
			
			repository.saveAll(
					List.of(first, second)); 
			
		};
	}

}

