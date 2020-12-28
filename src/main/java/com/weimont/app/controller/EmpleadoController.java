package com.weimont.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.weimont.app.entity.Empleado;
import com.weimont.app.service.EmpleadoService;

@Controller
@RequestMapping({"/empleados"})
public class EmpleadoController {

	@Autowired
	private EmpleadoService empleadoService;
	
	@GetMapping({"/", "/todos"})
	public String listar(Model model) {
		List<Empleado> lista = empleadoService.listarTodos();
		model.addAttribute("titulo", "LISTA DE ARTICULOS");
		model.addAttribute("empleados", lista);
		return "empleados/listado";
	}
}
