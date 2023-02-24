/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package recursividad_part2;


public class Ejemplo5 {
    /**
     * Invertir a[ini..fin]. Precondicion: 0 <= ini, fin < a.length.
     * Modifica el orden del array de Char parecido al ejercicio anterior pero este no imprime sino modifica el array dado
     * @param a
     * @param ini 
     * @param fin
     */
    public static void main(char[] a, int ini, int fin){
        if(ini<fin){
            char aux = a[ini];
            a[ini] = a[fin];
            a[fin] =aux;
            main(a,ini+1,fin-1);
        }
    }
}
