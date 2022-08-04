package com.mx.springboot.app.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mx.springboot.app.model.dao.ISucursalDao;
import com.mx.springboot.app.model.entity.Sucursal;

@Service
public class ServiceSucursalImp implements IServiceSucursal {

	@Autowired
	ISucursalDao sucursalDao;

	
	@Override
	@Transactional(readOnly = true)
	public List<Sucursal> getAll() {
		return (List<Sucursal>) sucursalDao.findAll();
	}

	@Override
	@Transactional
	public Sucursal save(Sucursal sucursal) {
		// TODO Auto-generated method stub
		return sucursalDao.save(sucursal);
	}

	@Override
	@Transactional
	public Sucursal update(Sucursal sucursal, Long id) {

		return sucursalDao.findById(id).map(newSucursal ->
		{
			newSucursal.setNombre(sucursal.getNombre());
			newSucursal.setOrdenes(sucursal.getOrdenes());
			return sucursalDao.save(sucursal);
		}).orElseGet(()->{ 
		return sucursalDao.save(sucursal);
				});
				
	}

	@Override
	@Transactional(readOnly = true)
	public Sucursal getById(Long id) {
		return sucursalDao.findById(id).orElse(null);
	}

}
