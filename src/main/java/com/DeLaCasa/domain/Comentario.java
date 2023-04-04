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
@Table(name="comentario")
public class Comentario implements Serializable{
 private static final long serialVersionUID =1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_comentario")
    private long idComentario;
    private long idCliente;
    private long idReceta;
    private String texto;

    public Comentario(long idCliente, long idReceta, String texto) {
        this.idCliente = idCliente;
        this.idReceta = idReceta;
        this.texto = texto;
    }


    public Comentario() {
    }
}
