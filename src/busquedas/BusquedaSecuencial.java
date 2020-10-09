/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package busquedas;

/**
 *
 * @author working
 */
public class BusquedaSecuencial {
    
   
    public long tInicio;
    public long tFinal;
    public long tTotal;

    public BusquedaSecuencial() {
        this.tFinal = 0;
        this.tInicio = 0;
        this.tTotal = 0 ;
    }
    
    public int buscar (int[] datos, int x){
        this.tInicio = System.currentTimeMillis();
        int pos = Busquedas.busquedaLineal(datos, x);
        this.tFinal = System.currentTimeMillis();
        this.tTotal = this.tFinal - this.tInicio;
        return pos;
    }

    public long gettFinal() {
        return tFinal;
    }

    public long gettInicio() {
        return tInicio;
    }

    public long gettTotal() {
        return tTotal;
    }
    
    
}
