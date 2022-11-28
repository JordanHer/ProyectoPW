/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */

package com.proyecto.service;

import com.proyecto.entity.Carrito;
import java.util.List;


public interface ICarritoService {
    public List<Carrito> getAllArticulos();
    public Carrito getArticuloById (long id);
    public void saveArticulo(Carrito usuario);
    public void delete (long id);
}
