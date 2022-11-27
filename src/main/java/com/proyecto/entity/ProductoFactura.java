
package com.proyecto.entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "productos_facturas")
public class ProductoFactura {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
    private long id;
    
    @ManyToOne
    @JoinColumn (name="producto_id")
    private Producto producto;
    
    @ManyToOne
    @JoinColumn (name="factura_id")
    private Factura factura;
}
