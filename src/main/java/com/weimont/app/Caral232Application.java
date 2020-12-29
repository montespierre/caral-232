package com.weimont.app;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.weimont.app.entity.Articulo;
import com.weimont.app.entity.Det_venta;
import com.weimont.app.entity.Empleado;
import com.weimont.app.entity.Venta;
import com.weimont.app.repository.ArticuloRepository;
import com.weimont.app.repository.Det_ventaRepository;
import com.weimont.app.repository.EmpleadoRepository;
import com.weimont.app.repository.VentaRepository;



@SpringBootApplication
public class Caral232Application {

	public static void main(String[] args) {
		SpringApplication.run(Caral232Application.class, args);
	}

	@Bean
	ApplicationRunner applicationRunner(ArticuloRepository articuloRepository, EmpleadoRepository empleadoRepository, 
			VentaRepository ventaRepository, Det_ventaRepository det_ventaRepository) {
		return args -> {
			
			Articulo articulo1 = new Articulo((long) 1, "Zapato", 12.5, (long) 200);
			Articulo articulo2 = new Articulo((long) 2, "Polo", (double) 14, (long) 500);
			Articulo articulo3 = new Articulo((long) 3, "Camisa", 50.4, (long) 300);
			
			articuloRepository.save(articulo1);
			articuloRepository.save(articulo2);
			articuloRepository.save(articulo3);
			
			Empleado empleado1 = new Empleado((long) 1, "Juan", "Vendedor", (long) 232121);
			Empleado empleado2 = new Empleado((long) 2, "Carlos", "Cajero", (long) 5151);
			Empleado empleado3 = new Empleado((long) 3, "Jose", "Vendedor", (long) 8888);
			
			empleadoRepository.save(empleado1);
			empleadoRepository.save(empleado2);
			empleadoRepository.save(empleado3);
			
			Venta venta1 = new Venta((long) 1, empleado1, "12/01/2020", "12:45", (long) 300, 150.44, 12.45, 151.111);
			Venta venta2 = new Venta((long) 2, empleado1, "12/02/2020", "12:45", (long) 400, 50.44, 14.45, 551.111);
			Venta venta3 = new Venta((long) 3, empleado3, "12/03/2020", "12:45", (long) 500, 350.44, 2.45, 651.111);
			
			ventaRepository.save(venta1);
			ventaRepository.save(venta2);
			ventaRepository.save(venta3);
			
			det_ventaRepository.save(new Det_venta((long) 1, venta1, articulo3, (long) 2, 3.14, 155.12));
			det_ventaRepository.save(new Det_venta((long) 2, venta1, articulo2, (long) 3, 4.14, 655.12));
			det_ventaRepository.save(new Det_venta((long) 3, venta1, articulo1, (long) 1, 5.14, 55.12));
			det_ventaRepository.save(new Det_venta((long) 4, venta2, articulo2, (long) 5, 8.14, 155.12));
			det_ventaRepository.save(new Det_venta((long) 5, venta2, articulo3, (long) 6, 9.14, 125.12));
			det_ventaRepository.save(new Det_venta((long) 6, venta3, articulo3, (long) 7, 2.14, 165.12));
			
		};
	}
	
	
}
