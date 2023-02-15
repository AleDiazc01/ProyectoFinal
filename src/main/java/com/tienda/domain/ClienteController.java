package com.tienda.domain;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import com.tienda.service.ClienteService;
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
public class ClienteController {

    @Autowired
    private ClienteService clienteService;
    
    @GetMapping("/")
    public String inicio(Model model) {
        var saludo = "Hola desde el back end";
        model.addAttribute("variable", saludo);
        
       
       
        var clientes =clienteService.getCliente();
        model.addAttribute("clientes", clientes);
        return "index";
    }
    
     @GetMapping("/cliente/nuevo")
    public String clienteNuevo(Cliente cliente) {
        return "modifica_cliente";
    }
    
     @PostMapping("/cliente/guardar")
    public String clienteGuardar(Cliente cliente) {
        clienteService.save(cliente);
        return "redirect:/";
    }
    
         @GetMapping("/cliente/eliminar/{idCliente}")
    public String clienteEliminar(Cliente cliente) {
        clienteService.delete(cliente);
        return "redirect:/";
    }
    
             @GetMapping("/cliente/modificar/{idCliente}")
    public String clienteModificar(Cliente cliente, Model model) {
            cliente= clienteService.getCliente(cliente);
            model.addAttribute("cliente", cliente);
        return "modifica_cliente";
    }
}
