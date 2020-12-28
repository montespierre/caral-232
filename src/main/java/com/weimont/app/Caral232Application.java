package com.weimont.app;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.weimont.app.entity.Articulo;
import com.weimont.app.entity.Empleado;
import com.weimont.app.repository.ArticuloRepository;
import com.weimont.app.repository.EmpleadoRepository;



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
	
	@Bean
	ApplicationRunner applicationRunner(EmpleadoRepository empleadoRepository) {
		return args -> {
			empleadoRepository.save(new Empleado((long) 1, "Juan", "Vendedor", (long) 232121));
			empleadoRepository.save(new Empleado((long) 2, "Carlos", "Cajero", (long) 5151));
			empleadoRepository.save(new Empleado((long) 3, "Jose", "Vendedor", (long) 8888));
		};
	}
}
