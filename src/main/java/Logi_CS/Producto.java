/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logi_CS;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

/**
 *
 * @author everf
 */
@Entity
public class Producto implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private int id_producto;
    private String nombrep;
    
    @OneToOne
    private Cliente uncliente;
    @OneToOne
    private Proveedor unproveedor;
    public Producto() {
    }

    public Producto(int id_producto, String nombrep, Cliente uncliente, Proveedor unproveedor) {
        this.id_producto = id_producto;
        this.nombrep = nombrep;
        this.uncliente = uncliente;
        this.unproveedor = unproveedor;
    }

    public int getId_producto() {
        return id_producto;
    }

    public void setId_producto(int id_producto) {
        this.id_producto = id_producto;
    }

    public String getNombrep() {
        return nombrep;
    }

    public void setNombrep(String nombrep) {
        this.nombrep = nombrep;
    }

    public Cliente getUncliente() {
        return uncliente;
    }

    public void setUncliente(Cliente uncliente) {
        this.uncliente = uncliente;
    }

    public Proveedor getUnproveedor() {
        return unproveedor;
    }

    public void setUnproveedor(Proveedor unproveedor) {
        this.unproveedor = unproveedor;
    }
    
    
}
