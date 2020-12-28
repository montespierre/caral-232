package com.weimont.app.service;

import java.util.List;

import com.weimont.app.entity.Empleado;



public interface EmpleadoService {

	public List<Empleado> listarTodos();
	public void grabar(Empleado empleado);
	public Empleado buscarPorId(Long id);
	public void eliminar(Long id);
}
