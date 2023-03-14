/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.DeLaCasa.dao;

/**
 *
 * @author alejadro
 */
import com.DeLaCasa.domain.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteDao extends JpaRepository <Cliente,Long>{
    
}
