
package paquete1;

import java.util.Scanner;

/**
 *
 * @author Erick Gaona
 */
public class Ejemplo071 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Declarar y generar arreglos en Java
        Scanner entrada = new Scanner(System.in);
        int dato;
        int suma = 0;
        // arreglo de tipo entero
        int[] arreglo1 = new int[5];
        
        // Se asigna valores al arreglo, pidiendo valores por teclado
        // se usa un ciclo repetitivo
        for (int i = 0; i < arreglo1.length; i++) {
            System.out.println("Ingrese un valor para el arreglo");
            dato = entrada.nextInt();
            // se asigna la variable dato a la posición del arreglo
            // de acuerdo al valor de i
            arreglo1[i] = dato;
        }
        
        // Se hace uso del ciclo repetitivo for para recorrer el arreglo
        for (int i = 0; i < arreglo1.length; i++) {
            // agrego el valor de la posición del arreglo a la variable
            // acumuladora  suma
            suma = suma + arreglo1[i];
        }
        for (int i = 0; i < arreglo1.length; i++) {
            System.out.printf("Los valores del arreglo son: %s\n",arreglo1[i]);
            
        }
        System.out.println("la suma de los valores es: "+suma);
        //System.out.printf("La suma de los valores del arreglo es: %d\n", suma);
        
    }

}
