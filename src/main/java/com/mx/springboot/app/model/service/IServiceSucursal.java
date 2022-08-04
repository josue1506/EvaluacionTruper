package com.mx.springboot.app.model.service;

import java.util.List;

import com.mx.springboot.app.model.entity.Sucursal;

public interface IServiceSucursal {

	public List<Sucursal> getAll();
	
	public Sucursal getById(Long id);
	
	public Sucursal save(Sucursal sucursal);
	
	public Sucursal update(Sucursal sucursal, Long id);
	
}
