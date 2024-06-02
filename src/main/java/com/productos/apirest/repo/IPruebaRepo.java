package com.productos.apirest.repo;


import com.productos.apirest.entity.Prueba;
import org.springframework.data.jpa.repository.Query;

//@Repository
public interface IPruebaRepo extends IGenericRepo<Prueba, Integer>{
    @Query("SELECT u FROM Prueba u WHERE u.nombre = ?1")
    public Prueba findByUser_name(String user_name);
}
