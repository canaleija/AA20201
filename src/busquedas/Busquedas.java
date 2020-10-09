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
public class Busquedas {
    
    
    public static int busquedaLineal (int[] datos, int x){
        for (int j = 0; j < datos.length; j++){
            if(datos[j]== x) return j;
        }
        return -1;
    }
    
}
