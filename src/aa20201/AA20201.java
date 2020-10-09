/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aa20201;

import busquedas.BusquedaSecuencial;
import busquedas.Busquedas;
import busquedas.GeneradorDatos;

/**
 *
 * @author working
 */
public class AA20201 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int[] aux = GeneradorDatos.generarArregloIntPeorCaso(6, 100000000, 100);
     
        BusquedaSecuencial b1 = new BusquedaSecuencial();
        int pos = b1.buscar(aux, 6);
        System.out.println(pos);
        System.out.println("I: "+b1.gettInicio());
        System.out.println("F: "+b1.gettFinal());
        System.out.println("T: "+b1.gettTotal()+"");
       
    }
    
}
