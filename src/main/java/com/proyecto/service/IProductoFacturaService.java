/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.proyecto.service;

import com.proyecto.entity.ProductoFactura;
import java.util.List;
/**
 *
 * @author andre
 */

public interface IProductoFacturaService {

    List<ProductoFactura> findAll();
}
