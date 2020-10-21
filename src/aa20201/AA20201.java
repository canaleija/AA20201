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
import ordenamiento.Burbuja;

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
        
        int n = 5000;
        int[] aux;
        double[] tiempos = new double[n];
        Burbuja b = new Burbuja();
       
        // complejidad algoritmica Sumatoria ( Generar los datos aleatorios + busqueda + almacenar el tiempo)
        for (int j = 0; j < n; j++){
            aux = GeneradorDatos.generarArregloInt(j,1000);
            b.ordenar(aux);
            tiempos[j] = (int) b.gettTotal();
            //System.out.println("j= "+j+" :"+tiempos[j]);
        }  
        System.out.println();
        Grafica g1 = new Grafica("N","Tiempo","Tiempos");
        g1.agregarSerie("t1",tiempos);
        g1.crearGrafica();
        g1.muestraGrafica();
       
       
    }
    
}
