/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.proyecto.controller;

import com.proyecto.entity.ProductoFactura;
import com.proyecto.service.IProductoFacturaService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;
/**
 *
 * @author andre
 */
@Controller
public class ProductoFacturaController {

    private final IProductoFacturaService productoFacturaService;

    public ProductoFacturaController(IProductoFacturaService productoFacturaService) {
        this.productoFacturaService = productoFacturaService;
    }

    @GetMapping("")
    public String llenarCarrito (Model model) {
        
        
        return "";
    }
}
