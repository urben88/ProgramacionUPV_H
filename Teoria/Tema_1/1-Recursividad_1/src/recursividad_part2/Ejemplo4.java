/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package recursividad_part2;

/**
 *
 * @author Urben
 */
public class Ejemplo4 {
    /**
     * Escribe las componentes de a[0..fin] en orden inverso.
     * Precondicion: fin < a.length.
     * @param a
     * @param fin (Hay que poner la longitud del array - 1)
     */
    public static void main(char[] a, int fin){
        if(fin >= 0){
            System.out.print(a[fin]);
            main(a,--fin);
        }else{
            //Cuando acabe la recursión
            System.out.println("");
        }
    }
}
