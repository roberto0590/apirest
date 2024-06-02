package com.productos.apirest.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
@Entity // (name = "XYZ")
@Table(name = "prueba")
public class Prueba {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
            generator = "prueba_id_seq")
    @SequenceGenerator(
            name = "prueba_id_seq",
            sequenceName = "prueba_id_seq",
            initialValue = 1,
            allocationSize=1
    )
    private Integer id;

    @Size(min =3, max = 10, message = "Minimo Requerido es 3 & Maximo Permitido 10")
    @Column(name = "nombre", nullable = true, length = 255)
    private String nombre;



}
