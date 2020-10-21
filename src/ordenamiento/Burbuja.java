/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordenamiento;

/**
 *
 * @author working
 */
public class Burbuja {
     
   
    public long tInicio;
    public long tFinal;
    public long tTotal;

    public Burbuja() {
        this.tFinal = 0;
        this.tInicio = 0;
        this.tTotal = 0 ;
    }
  
    public void ordenar(int[] datos){
        this.tInicio = System.currentTimeMillis();
        ordenarDatos(datos);
        this.tFinal = System.currentTimeMillis();
        this.tTotal = this.tFinal - this.tInicio;
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

    private void ordenarDatos(int[] datos) { // peor de los casos  3 + 3n + 16n2  notación "O" grande O(n2)
      int i, j, aux; // 3
        for (i = 0; i < datos.length - 1; i++) { //  3(n)
            // subir la burbuja o elemento a ordenar (ajustamos en la pos que le corresponde)
            for (j = 0; j < datos.length - 1; j++) { // 16(n)(n) = 16n2
                // si entra al if se hace intercambio
                if (datos[j + 1] < datos[j]) { // 4  13
                    aux = datos[j + 1]; // 3
                    datos[j + 1] = datos[j]; // 4
                    datos[j] = aux; // 2
                }
            }
        }
    }    
    
}
