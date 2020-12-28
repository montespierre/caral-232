package com.weimont.app;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.weimont.app.entity.Articulo;
import com.weimont.app.entity.Empleado;
import com.weimont.app.entity.Venta;
import com.weimont.app.repository.ArticuloRepository;
import com.weimont.app.repository.EmpleadoRepository;
import com.weimont.app.repository.VentaRepository;



@SpringBootApplication
public class Caral232Application {

	public static void main(String[] args) {
		SpringApplication.run(Caral232Application.class, args);
	}

	@Bean
	ApplicationRunner applicationRunner(ArticuloRepository articuloRepository, EmpleadoRepository empleadoRepository, VentaRepository ventaRepository) {
		return args -> {
			articuloRepository.save(new Articulo((long) 1, "Zapato", 12.5, (long) 200));
			articuloRepository.save(new Articulo((long) 2, "Polo", (double) 14, (long) 500));
			articuloRepository.save(new Articulo((long) 3, "Camisa", 50.4, (long) 300));
			
			Empleado empleado1 = new Empleado((long) 1, "Juan", "Vendedor", (long) 232121);
			Empleado empleado2 = new Empleado((long) 2, "Carlos", "Cajero", (long) 5151);
			Empleado empleado3 = new Empleado((long) 3, "Jose", "Vendedor", (long) 8888);
			
			empleadoRepository.save(empleado1);
			empleadoRepository.save(empleado2);
			empleadoRepository.save(empleado3);
			ventaRepository.save(new Venta((long) 1, empleado1, "12/01/2020", "12:45", (long) 300, 150.44, 12.45, 151.111));
			ventaRepository.save(new Venta((long) 2, empleado1, "12/02/2020", "12:45", (long) 400, 50.44, 14.45, 551.111));
			ventaRepository.save(new Venta((long) 3, empleado3, "12/03/2020", "12:45", (long) 500, 350.44, 2.45, 651.111));
			
		};
	}
	
	
}
