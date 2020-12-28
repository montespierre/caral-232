package com.weimont.app.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.weimont.app.entity.Empleado;
import com.weimont.app.repository.EmpleadoRepository;
import com.weimont.app.service.EmpleadoService;

@Service
public class EmpleadoServiceImpl implements EmpleadoService{
	
	@Autowired
	private EmpleadoRepository repository;

	@Override
	public List<Empleado> listarTodos() {
		List<Empleado> lista = (List<Empleado>) repository.findAll();
		return lista;
	}

	@Override
	public void grabar(Empleado empleado) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Empleado buscarPorId(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void eliminar(Long id) {
		// TODO Auto-generated method stub
		
	}

}
