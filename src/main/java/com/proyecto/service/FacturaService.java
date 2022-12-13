/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.proyecto.service;

import com.proyecto.entity.Factura;
import com.proyecto.repository.FacturaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class FacturaService implements IFacturaService{
    
    @Autowired
    private FacturaRepository facturaRepository;

    @Override
    public List<Factura> getAllFactura() {
         return (List<Factura>) facturaRepository.findAll();
         }

    @Override
    public Factura getFacturaById(long id) {
         return facturaRepository.findById(id).orElse(null);
       }

    @Override
    public void saveFactura(Factura factura) {
         facturaRepository.save(factura);
      }

    @Override
    public void delete(long id) {
         facturaRepository.deleteById(id);
      }
    
    
}
