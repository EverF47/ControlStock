/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persis_CS;

import Logi_CS.Cliente;
import Logi_CS.Producto;
import Logi_CS.Proveedor;


public class Controladora_Persistencia {

static ProductoJpaController ProductJpa = new ProductoJpaController();
static ClienteJpaController ClietJpa = new ClienteJpaController();
static ProveedorJpaController ProvJpa = new ProveedorJpaController();
    
    public static void guardar(Producto prod, Cliente clien, Proveedor prov) {
        ProductJpa.create(prod);
        ClietJpa.create(clien);
        ProvJpa.create(prov); 
        
        
    }
    
}
