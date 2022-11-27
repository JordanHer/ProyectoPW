/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.proyecto.service;


import com.proyecto.entity.ProductoFactura;
import com.proyecto.repository.ProductoFacturaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *
 * @author andre
 */
@Service
public class ProductoFacturaService implements IProductoFacturaService {

    private final ProductoFacturaRepository repository;

    public ProductoFacturaService(ProductoFacturaRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<ProductoFactura> findAll() {

        return (List<ProductoFactura>) repository.findAll();
    }
}

