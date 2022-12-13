/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.proyecto.service;

import com.proyecto.entity.Factura;
import java.util.List;

/**
 *
 * @author jorda
 */
public interface IFacturaService {
    public List<Factura> getAllFactura();
    public Factura getFacturaById (long id);
    public void saveFactura(Factura factura);
    public void delete (long id);
}
