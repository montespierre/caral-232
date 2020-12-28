package com.weimont.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.weimont.app.entity.Articulo;
import com.weimont.app.service.ArticuloService;

public class ArticuloController {

	@Autowired
	private ArticuloService articuloService;
	
	@GetMapping({"/a", "/todos"})
	public String listar(Model model) {
		List<Articulo> lista = articuloService.listarTodos();
		model.addAttribute("titulo", "LISTA DE ARTICULOS");
		model.addAttribute("articulos", lista);
		return "/articulos/listado";
	}
}
