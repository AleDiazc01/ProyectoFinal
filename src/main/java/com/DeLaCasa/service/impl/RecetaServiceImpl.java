/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.DeLaCasa.service.impl;

import com.DeLaCasa.domain.Receta;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.DeLaCasa.dao.RecetaDao;
import com.DeLaCasa.service.RecetaService;
import java.util.ArrayList;


@Service
public class RecetaServiceImpl implements RecetaService {

    @Autowired
    private RecetaDao recetaDao;

    @Transactional(readOnly = true)
    public List<Receta> getReceta() {
        return recetaDao.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Receta getReceta(Receta receta) {
        return recetaDao.findById(receta.getIdReceta()).orElse(null);
    }
    
    @Transactional(readOnly = true)
    public Receta buscarReceta(String palabra) {
        List<Receta> lista = new ArrayList<>();
        lista=recetaDao.findAll();
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getNombre().equalsIgnoreCase(palabra)) {
                return lista.get(i);
            }
        }
        return null;
    }

    @Override
    @Transactional
    public void save(Receta receta) {
        recetaDao.save(receta);
    }

    @Override
    @Transactional
    public void delete(Receta receta) {
        recetaDao.delete(receta);
    }

}
