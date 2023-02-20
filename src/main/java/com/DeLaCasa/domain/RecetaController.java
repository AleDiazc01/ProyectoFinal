package com.DeLaCasa.domain;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
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
public class RecetaController {

    @Autowired
    private RecetaService recetaService;

    @GetMapping("/")
    public String inicio(Model model) {
        var recetas = recetaService.getReceta();
        model.addAttribute("recetas", recetas);
        return "index";
    }

    @GetMapping("/receta/nuevo")
    public String recetaNuevo(Receta receta) {
        return "modifica_receta";
    }

    @PostMapping("/receta/guardar")
    public String recetaGuardar(Receta receta) {
        recetaService.save(receta);
        return "redirect:/";
    }

    @GetMapping("/receta/eliminar/{idReceta}")
    public String recetaEliminar(Receta receta) {
        recetaService.delete(receta);
        return "redirect:/";
    }

    @GetMapping("/receta/modificar/{idReceta}")
    public String recetaModificar(Receta receta, Model model) {
        receta = recetaService.getReceta(receta);
        model.addAttribute("receta", receta);
        return "modifica_receta";
    }
    
        @GetMapping("/registro")
    public String registro() {
        return "registro";
    }
    
            @GetMapping("/recetas_presentacion")
    public String recetasPresntacion(Model model) {
        var recetas = recetaService.getReceta();
        model.addAttribute("recetas", recetas);
        return "recetas_presentacion";
    }
    
                @GetMapping("/sobre_web")
    public String sobre() {
        return "sobre_web";
    }
    
                    @GetMapping("/iniciar_sesion")
    public String iniciarSesion() {
        return "iniciar_sesion";
    }
    
        @GetMapping("/receta/mostrar/{idReceta}")
    public String mostrarReceta(Receta receta, Model model) {
        receta = recetaService.getReceta(receta);
        model.addAttribute("receta", receta);
        return "mostrar_receta";
    }
}
