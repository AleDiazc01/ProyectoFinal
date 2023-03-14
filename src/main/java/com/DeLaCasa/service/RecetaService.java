 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.DeLaCasa.service;

import com.DeLaCasa.domain.Receta;
import java.util.List;


public interface RecetaService {
    
    
    
    
    public List<Receta> getReceta();
    
    public Receta getReceta(Receta receta);
    
    public void save(Receta receta);
    
    public void delete(Receta receta);
    
    public Receta buscarReceta(String palabra);
}
