/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.DeLaCasa.domain;

import jakarta.persistence.*;
import java.io.Serializable;
import lombok.Data;
/**
 *
 * @author alejadro
 */
@Data
@Entity
@Table(name="cliente")
public class Cliente implements Serializable{
 private static final long serialVersionUID =1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idCliente;
    private String nombre;
    private String apellidos;
    private String correo;
    private String contra;

    public Cliente(long idCliente, String nombre, String apellidos, String correo, String contra) {
        this.idCliente = idCliente;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.correo = correo;
        this.contra = contra;
    }

    public Cliente() {
    }
}
