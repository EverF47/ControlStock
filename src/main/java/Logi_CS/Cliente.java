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
public class Cliente implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String nombrec;
    private String cel_c;
    private String cc_nit;
    private String ciudad;

    public Cliente() {
    }

    public Cliente(String nombrec, String cel_c, String cc_nit, String ciudad) {
        this.nombrec = nombrec;
        this.cel_c = cel_c;
        this.cc_nit = cc_nit;
        this.ciudad = ciudad;
    }

    public String getNombrec() {
        return nombrec;
    }

    public void setNombrec(String nombrec) {
        this.nombrec = nombrec;
    }

    public String getCel_c() {
        return cel_c;
    }

    public void setCel_c(String cel_c) {
        this.cel_c = cel_c;
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
