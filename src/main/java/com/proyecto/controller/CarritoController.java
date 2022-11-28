/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.proyecto.controller;

import com.proyecto.entity.Carrito;
import com.proyecto.service.CarritoService;
import com.proyecto.service.ICarritoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 *
 * @author andre
 */
@Controller
public class CarritoController {
    
    @Autowired
    private ICarritoService carritoService;
    
    @GetMapping("/carritodecompras")
    public String mostrarCarrito (Model model) {
        List<Carrito> listaArticulos = carritoService.getAllArticulos();
        model.addAttribute("titulo", "Carrito de Compras");
        model.addAttribute("carrito",listaArticulos);
        return "carrito";
    }
    
    @GetMapping("/deleteArticulo/{id}")
    public String eliminarArticulo(@PathVariable("id") Long idCarrito) {
        carritoService.delete(idCarrito);
        return "redirect:/carritodecompras";
    }
}
