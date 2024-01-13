/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logi_CS;


import Persis_CS.Controladora_Persistencia;

/**
 *
 * @author everf
 */
public class Controlador {
    
    Controladora_Persistencia controlPersis = new Controladora_Persistencia ();

    public void guardar(String Nombreclien, String Nombrepr, String Nombreprv) {
     
        Cliente clien = new Cliente();
        clien.setNombrec(Nombreclien);
        
        
        
        Producto prod = new Producto();
        prod.setNombrep(Nombrepr);
        prod.setUncliente(clien);
        /*prod.setUnproveedor(unproveedor);*/
        
        Proveedor prov = new Proveedor();
        prov.setNombreprov(Nombreprv);
        
        
        Controladora_Persistencia.guardar(prod,clien,prov);
        
    }
    
}
