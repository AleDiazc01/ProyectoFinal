package com.DeLaCasa.controller;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import com.DeLaCasa.domain.Receta;
import com.DeLaCasa.service.RecetaService;
import java.util.Arrays;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

/**
 *
 * @author Laboratorios
 */
@Controller
@Slf4j
public class IndexController {

    @Autowired
    private RecetaService recetaService;
    
    @GetMapping("/")
    public String inicio(Model model) {    
        var recetas =recetaService.getReceta();
        model.addAttribute("recetas", recetas);
        return "index";
    }
    
                    @GetMapping("/sobre_web")
    public String sobre() {
        return "sobre_web";
    }
    
    
}
