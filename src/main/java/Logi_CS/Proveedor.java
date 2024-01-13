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

/**
 *
 * @author everf
 */
@Entity
public class Proveedor implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String nombreprov;
    private String cel_prov;
    private String cc_nit;
    private String ciudad;

    
    
    public Proveedor() {
    }

    public Proveedor(String nombreprov, String cel_prov, String cc_nit, String ciudad) {
        this.nombreprov = nombreprov;
        this.cel_prov = cel_prov;
        this.cc_nit = cc_nit;
        this.ciudad = ciudad;
    }

    public String getNombreprov() {
        return nombreprov;
    }

    public void setNombreprov(String nombreprov) {
        this.nombreprov = nombreprov;
    }

    public String getCel_prov() {
        return cel_prov;
    }

    public void setCel_prov(String cel_prov) {
        this.cel_prov = cel_prov;
    }

    public String getCc_nit() {
        return cc_nit;
    }

    public void setCc_nit(String cc_nit) {
        this.cc_nit = cc_nit;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
    
    
}
