package com.alphabirdz;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.alphabirdz.model.User;
import com.alphabirdz.repository.UserRepository;



@SpringBootApplication

public class AlphabirdzApplication {

	private static final Logger log = LoggerFactory.getLogger(AlphabirdzApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(AlphabirdzApplication.class, args);
	}

	@Bean
	public CommandLineRunner demo(UserRepository repository) {
		return (args) -> {
			// Save a few Addresses
			repository.save(new User("https://cdn.discordapp.com/attachments/1019435827157287073/1027814174501371944/download20221001021201.png", "lolla", "lollapedrita3@gmail.com", "123456"));
			repository.save(new User("https://cdn.discordapp.com/attachments/1019435827157287073/1027813731805171722/Prancheta_4.png", "celso", "celsothedog@hotmail.com", "celsinho123"));

			

			log.info("Users found with findAll():");
			log.info("-------------------------------");
			for (User user : repository.findAll()) {
				log.info(user.toString());
			}
			log.info("");

			User user = repository.findById(1L);
			log.info("User found with findById(1L):");
			log.info("--------------------------------");
			log.info(user.toString());
			log.info("");

			// Fetch Addresses by CEP
			log.info("User found with findByEmail('01004000'):");
			log.info("--------------------------------------------");
			User email = repository.findByEmail("celsothedog@hotmail.com");
			// for (Address a : repository.findByCep("01004000")) {
			// log.info(a.toString());}
			log.info(email.toString());
			log.info("");
		};
	}
}