package com.alphabirdz;

import com.alphabirdz.model.Bird;
import com.alphabirdz.repository.BirdRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


@SpringBootApplication

public class AlphabirdzApplication {

	private static final Logger log = LoggerFactory.getLogger(AlphabirdzApplication.class);
	public static void main(String[] args) {

		SpringApplication.run(AlphabirdzApplication.class, args);
	}
/*
	@Bean
	public CommandLineRunner demo(BirdRepository repository){
		return (args -> {
			repository.save(new Bird("Maguari Stork", "Ciconia maguari", "João-grande", "White", "Campo alagado", "Ciconiidae", "85 cm"));
			repository.save(new Bird("Wood Stork", "Mycteria americana", "Cabeça-seca", "White", "Campo alagado", "Ciconiidae", "65 cm"));

			Bird bird = repository.findById(2L);
			log.info("Birds found with findById():");
			log.info("---------------------------");
			log.info(bird.toString());
			log.info("");


			log.info("Birds found with foundAll()");
			log.info("-----------------------------");
			for (Bird allBirds : repository.findAll()) {
				log.info(allBirds.toString());
			};
			log.info("-----------------------------");

			log.info("Birds found with englishName");
			log.info("-----------------------------");
			repository.findByEnglishName("Wood Stork").forEach(stork -> {
				log.info(stork.toString());
			});
		});*/
	//}
}


