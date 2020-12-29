package com.weimont.app.service;

import java.util.List;

import com.weimont.app.entity.Det_venta;


public interface Det_ventaService {

	public List<Det_venta> listarTodos();
	public void grabar(Det_venta det_venta);
	public Det_venta buscarPorId(Long id);
	public void eliminar(Long id);
}
