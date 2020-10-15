/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aa20201;

import aa20201.data.Grafica;
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
        
        int limite = 2500000;
        int[] aux;
        double[] tiempos = new double[limite];
        BusquedaSecuencial b1 = new BusquedaSecuencial();
        for (int j = 0; j < limite; j++){
            aux = GeneradorDatos.generarArregloIntPeorCaso(6, j+1, 1000);
            int pos = b1.buscar(aux, 6);
            tiempos[j] = (int) b1.gettTotal();
            //System.out.println("j= "+j+" :"+tiempos[j]);
        }  
        System.out.println();
        Grafica g1 = new Grafica("N","Tiempo","Tiempos");
        g1.agregarSerie("t1",tiempos);
        g1.crearGrafica();
        g1.muestraGrafica();
        
        // grafica y le mandan tiempos
        
        
        
       
     
        // Guardar los tiempos
        
           
        
        
        System.out.println("T: "+b1.gettTotal()+"");
       
    }
    
}
