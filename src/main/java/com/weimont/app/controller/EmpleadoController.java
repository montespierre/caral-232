package com.weimont.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
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
		model.addAttribute("titulo", "Empleados");
		model.addAttribute("empleados", lista);
		return "empleados/listado";
	}
	
	@GetMapping({"/crear"})
	public String crear(Model model) {
		Empleado empleado = new Empleado();
		model.addAttribute("titulo", "NUEVO EMPLEADO");
		model.addAttribute("empleado", empleado);
		return "empleados/frmEditar";
	}
	
	@PostMapping("/grabar")
	public String guardar(@ModelAttribute Empleado empleado) {
	empleadoService.grabar(empleado);
	System.out.println("Empleado grabado con exito!");
	return "redirect:/empleados/";
	}
}
