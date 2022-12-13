/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.proyecto.controller;

import com.proyecto.entity.Factura;
import com.proyecto.service.IFacturaService;
import java.util.List;
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
public class FacturaController {
    @Autowired
    private IFacturaService facturaService;
    
    @GetMapping("/facturamos")
    public String mostrarFactura (Model model) {
        List<Factura> listaFactura = facturaService.getAllFactura();
        
        model.addAttribute("facturas",listaFactura);
        return "facturas";
    }
    
    @GetMapping("/deleteFactura/{id}")
    public String eliminarFactura(@PathVariable("id") Long idFactura) {
        facturaService.delete(idFactura);
        return "redirect:/factura";
    }
    
    @PostMapping("/saveFac")
    public String guardarFactura(@ModelAttribute Factura factura) {
        facturaService.saveFactura(factura);
        return "redirect:/home.html";
    }
    
    @GetMapping("/usuarioNFactura")
    public String mostrarFactura1 (Model model) {
        List<Factura> listaFactura = facturaService.getAllFactura();
        
        model.addAttribute("facturas",listaFactura);
        return "catalogo_hombre_camisas";
  }
    
    @GetMapping("/facturanueva")
    public String crearFactura(Model model) {
        
        
        model.addAttribute("factura", new Factura());
        
        
        return "checkout";

    }
    
    @GetMapping("/seleccionfac/{id}")
    public String seleccion(@PathVariable Integer id) {
      
     return "crear_factura";
  }

}