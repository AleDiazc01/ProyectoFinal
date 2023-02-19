/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.DeLaCasa.domain;

import jakarta.persistence.*;
import java.io.Serializable;
import lombok.Data;

/**
 *
 * @author Laboratorios
 */
@Data
@Entity
@Table(name="receta")
public class Receta implements Serializable{

    private static final long serialVersionUID =1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idReceta;
    private String nombre;
    private String descripcion;
    private String ingredientes;
    private String preparacion;

    public Receta() {
    }

    public Receta(String nombre, String descripcion, String ingredientes, String preparacion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.ingredientes = ingredientes;
        this.preparacion = preparacion;
    }

}
