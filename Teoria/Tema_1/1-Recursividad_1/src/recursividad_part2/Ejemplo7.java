/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package recursividad_part2;

public class Ejemplo7 {

    /**
     * Comprueba si a[ini..a.length - 1] esta ordenado. Precondicion: 0 <= ini.
     *
     * @param a (Array ordenado de mayor a menor)
     * @param ini
     */
    //Comienza desde ini = 0
    //{1,2,3,4}
    
    //Pero empieza Controlando si ini se ha pasado de la longitud de a
    //Luego comprueba a[2] <= a[3] && 
        //a[1] <= a[2] &&
            //a[0] <= a[1] &&
    //Si siempre se cumple esta cadena va a devolver TRUE
    //En caso de que una de estas falle devuelve false
    
    //Acaba viendo si ini[0] -> 1 >= ini[0+1] -> 2 
    public static boolean main(int[] a, int ini) {
        if(ini < a.length - 1){
            return a[ini] <= a[ini+1] && main(a,ini+1);
        }else{
            return true;
        }
    }
}
