package com.mx.springboot.app.model.dao;

import org.springframework.data.repository.CrudRepository;

import com.mx.springboot.app.model.entity.Sucursal;

public interface ISucursalDao extends CrudRepository<Sucursal, Long>{

}
