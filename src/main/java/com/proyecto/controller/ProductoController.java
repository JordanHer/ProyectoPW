/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.proyecto.controller;

import com.proyecto.entity.Producto;
import com.proyecto.service.IProductoService;


import java.util.List;
import org.hibernate.annotations.common.util.impl.LoggerFactory;
import org.slf4j.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;



/**
 *
 * @author jorda
 */
@Controller
public class ProductoController {
    
    
    
    @Autowired
    private IProductoService productoService;
    
    @GetMapping("/producto")
    public String mostrarProducto (Model model) {
        List<Producto> listaProducto = productoService.getAllProducto();
        
        model.addAttribute("productos",listaProducto);
        return "productos";
    }
    
    @GetMapping("/deleteProducto/{id}")
    public String eliminarProducto(@PathVariable("id") Long idProducto) {
        productoService.delete(idProducto);
        return "redirect:/producto";
    }
    
    @PostMapping("/savePro")
    public String guardarProducto(@ModelAttribute Producto producto) {
        productoService.saveProducto(producto);
        return "redirect:/producto";
    }
    
    @GetMapping("/usuarioNProducto")
    public String mostrarProducto1 (Model model) {
        List<Producto> listaProducto = productoService.getAllProducto();
        
        model.addAttribute("productos",listaProducto);
        return "catalogo_hombre_camisas";
  }
    
    @GetMapping("/productonuevo")
    public String crearProducto(Model model) {
        
        
        model.addAttribute("producto", new Producto());
        
        
        return "crear_producto";

    }
    
    @GetMapping("/seleccion/{id}")
    public String seleccion(@PathVariable Integer id) {
      
     return "crear_producto";
  }
 

 
    
    
}
