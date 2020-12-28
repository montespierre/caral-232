package com.weimont.app;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.weimont.app.entity.Articulo;
import com.weimont.app.repository.ArticuloRepository;



@SpringBootApplication
public class Caral232Application {

	public static void main(String[] args) {
		SpringApplication.run(Caral232Application.class, args);
	}

	@Bean
	ApplicationRunner applicationRunner(ArticuloRepository articuloRepository) {
		return args -> {
			articuloRepository.save(new Articulo((long) 1, "Zapato", 12.5, (long) 200));
			articuloRepository.save(new Articulo((long) 2, "Polo", (double) 14, (long) 500));
			articuloRepository.save(new Articulo((long) 3, "Camisa", 50.4, (long) 300));
		};
	}
}
