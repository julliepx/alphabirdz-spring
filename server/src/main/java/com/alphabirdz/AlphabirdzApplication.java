package com.alphabirdz;

// import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
// import org.springframework.context.annotation.Bean;

// import com.alphabirdz.model.Post;
// import com.alphabirdz.repository.PostRepository;

@SpringBootApplication

public class AlphabirdzApplication {

	public static void main(String[] args) {
		SpringApplication.run(AlphabirdzApplication.class, args);
	}

	/* @Bean
	public CommandLineRunner demo(PostRepository repository) {
		return args -> {
			repository.save(new Post("image.png", "Porto Alegre", "07/01/22", 1, 1));
		};
	} */
}