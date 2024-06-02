package com.productos.apirest.controller;

import com.productos.apirest.entity.Greeting;
import com.productos.apirest.entity.Prueba;
import com.productos.apirest.exception.ModeloNotFoundException;
import com.productos.apirest.repo.IPruebaRepo;
import com.productos.apirest.service.IPruebaService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/prueba")
public class PruebaController {

    @Autowired
    private IPruebaService pruebaService;

    @PostMapping("/insert")
    public ResponseEntity<Prueba> insert(@Valid @RequestBody Prueba prueba) throws Exception {

        Prueba pruebaResult=pruebaService.registrar(prueba);
        return new ResponseEntity<Prueba>(pruebaResult, HttpStatus.OK);
    }

    @GetMapping("/findAll")
    public ResponseEntity<List<Prueba>> findAll() throws Exception {
        List<Prueba> pruebas = pruebaService.listar();
        return new ResponseEntity<List<Prueba>>(pruebas,HttpStatus.OK);

    }

    @PutMapping("/update")
    public ResponseEntity<Prueba> update(@Valid @RequestBody Prueba prueba) throws Exception {

        Prueba pruebaResult=pruebaService.registrar(prueba);
        return new ResponseEntity<Prueba>(pruebaResult,HttpStatus.OK);

    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> delete(@PathVariable("id") Integer id) throws Exception {
        if(id == 0) {
            throw new ModeloNotFoundException("ID no puede ser 0 " + id);
        }
        pruebaService.eliminar(id);
        return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
    }
}
