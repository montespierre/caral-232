package com.weimont.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.weimont.app.entity.Det_venta;
import com.weimont.app.service.Det_ventaService;

@Controller
@RequestMapping({"/det_ventas"})
public class Det_ventaController {

	@Autowired
	private Det_ventaService det_ventaService;
	
	@GetMapping({"/", "/todos"})
	public String listar(Model model) {
		List<Det_venta> lista = det_ventaService.listarTodos();
		model.addAttribute("titulo", "LISTA DE ARTICULOS");
		model.addAttribute("det_ventas", lista);
		return "det_ventas/listado";
	}
}
