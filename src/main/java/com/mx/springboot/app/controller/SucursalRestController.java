package com.mx.springboot.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mx.springboot.app.model.entity.Sucursal;
import com.mx.springboot.app.model.service.IServiceSucursal;

@RestController
@RequestMapping("/api")
public class SucursalRestController {

	@Autowired
	IServiceSucursal service;
	
	@GetMapping("/sucursal")
	public List<Sucursal> getAll(){
		return service.getAll();
	}
	
	@GetMapping("/sucursal/{id}")
	public Sucursal getById(@PathVariable Long id) {
		return service.getById(id);
	}
	
	
	@PostMapping("/sucursal")
	public Sucursal create(@RequestBody Sucursal sucursal) {
		return service.save(sucursal);
	}
	
	@PutMapping("/sucursal/{id}")
	public Sucursal update(@RequestBody Sucursal sucursal, @PathVariable Long id) {
		return service.update(sucursal, id);
	}
	

	
}
