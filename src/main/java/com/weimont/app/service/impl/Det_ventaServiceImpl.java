package com.weimont.app.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.weimont.app.entity.Det_venta;
import com.weimont.app.repository.Det_ventaRepository;
import com.weimont.app.service.Det_ventaService;

@Service
public class Det_ventaServiceImpl implements Det_ventaService{

	@Autowired
	private Det_ventaRepository repository;
	
	@Override
	public List<Det_venta> listarTodos() {
		List<Det_venta> lista = (List<Det_venta>) repository.findAll();
		return lista;
	}

	@Override
	public void grabar(Det_venta det_venta) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Det_venta buscarPorId(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void eliminar(Long id) {
		// TODO Auto-generated method stub
		
	}

}
