/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.proyecto.service;

import com.proyecto.entity.Carrito;
import com.proyecto.repository.CarritoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class CarritoService implements ICarritoService {
    
    @Autowired
    private CarritoRepository carritoRepository;

    @Override
    public List<Carrito> getAllArticulos() {
        return (List<Carrito>) carritoRepository.findAll();
        }

    @Override
    public Carrito getArticuloById(long id) {
        return carritoRepository.findById(id).orElse(null);
        }

    @Override
    public void saveArticulo(Carrito carrito) {
        carritoRepository.save(carrito);
        }

    @Override
    public void delete(long id) {
        carritoRepository.deleteById(id);
        }
    
}
