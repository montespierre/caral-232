package com.weimont.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.weimont.app.entity.Articulo;
import com.weimont.app.service.ArticuloService;

@Controller
@RequestMapping({ "/articulos" })
public class ArticuloController {

	@Autowired
	private ArticuloService articuloService;

	@GetMapping({ "/", "/todos" })
	public String listar(Model model) {
		List<Articulo> lista = articuloService.listarTodos();
		model.addAttribute("titulo", "Articulos");
		model.addAttribute("articulos", lista);
		return "articulos/listado";
	}

	@GetMapping({"/crear"})
	public String crear(Model model) {
		Articulo articulo = new Articulo();
		model.addAttribute("titulo", "NUEVO ARTICULO");
		model.addAttribute("articulo", articulo);
		return "articulos/frmEditar";
	}
	
	@PostMapping("/grabar")
	public String guardar(@ModelAttribute Articulo articulo) {
	articuloService.grabar(articulo);
	System.out.println("Articulo grabado con exito!");
	return "redirect:/articulos/";
	}
}
