package com.productos.apirest.service;

import com.productos.apirest.entity.Prueba;

public interface IPruebaService extends ICRUD<Prueba, Integer> {
    public Prueba findByUser_name(String user_name);
}
