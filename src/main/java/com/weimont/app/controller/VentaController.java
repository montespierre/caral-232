package com.weimont.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.weimont.app.entity.Venta;
import com.weimont.app.service.VentaService;

@Controller
@RequestMapping({"/ventas"})
public class VentaController {

	@Autowired
	private VentaService ventaService;
	
	@GetMapping({"/","/todos"})
	public String listar(Model model) {
		List<Venta> lista = ventaService.listarTodos();
		model.addAttribute("titulo", "Ventas");
		model.addAttribute("ventas", lista);
		
		return "ventas/listado";
		
	}
}
