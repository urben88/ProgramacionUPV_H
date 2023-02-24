/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package recursividad_part2;
import java.util.Arrays;
import recursividad_part2.*;
//Aqui voy a ejecutar los ejemplos del pdf recursividad parte 2
public class Main {
    public static void main(String[] args){
        System.out.println("Estas ejecutando Tema1 Parte 2");
        
        //Ejemplo 1 del power
        double[] a = new double[8];
        System.out.println(Arrays.toString(a));
        Ejemplo1.main(a,2);
        System.out.println(Arrays.toString(a));
        
        //Ejemplo 2 del power
        // Suma de las componentes de un array
        double[] b = {1,2,3};
        System.out.println(Ejemplo2.main(b, 0));
        

        //Ejer 3 power
        //Posición del mínimo de un array
        double[] c = {3,53,1,3};
        System.out.println(Ejemplo3.main(c, 0));
        
        //Ejer 4 power
        //Escritura de las componentes en orden inverso
        char[] d = "ruben".toCharArray();
        Ejemplo4.main(d, d.length-1);
    
        //Ejer 5 power
        //Invertir las componentes de un array
        char[] e = "ruben".toCharArray();
        Ejemplo5.main(e, 0, e.length-1);
        System.out.println(e);
        
        //Ejer 6 power
        //Busqueda secuencial
        int[] f = {8,66,446,87};
        System.out.println( Ejemplo6.main(f, 0, 8));
       
        //Ejer 7 power
        //Comprobar si un array esta ordenado
        int[] g = {8,2,3,4};
        System.out.println(Ejemplo7.main(g,0));
    
        //Ejer 8 power
        //Busqueda binaria
        int[] h = {3,64,29,49};
        int num_buscar = 64;
        System.out.println(Ejemplo8.main(h, 0, h.length - 1,num_buscar));
       
    }
}
