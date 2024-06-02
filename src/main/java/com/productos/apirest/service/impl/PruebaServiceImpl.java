package com.productos.apirest.service.impl;

import com.productos.apirest.entity.Prueba;
import com.productos.apirest.repo.IGenericRepo;
import com.productos.apirest.repo.IPruebaRepo;
import com.productos.apirest.service.IPruebaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PruebaServiceImpl extends CRUDImpl<Prueba, Integer> implements IPruebaService {

	@Autowired
	private IPruebaRepo repo;
	
	@Override
	protected IGenericRepo<Prueba, Integer> getRepo() {
		return repo;
	}

	public Prueba findByUser_name(String user_name){
		Prueba usuario = repo.findByUser_name(user_name);
		return usuario;
	}

}
