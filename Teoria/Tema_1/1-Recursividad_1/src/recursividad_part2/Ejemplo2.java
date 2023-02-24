/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package recursividad_part2;

/** 
 Suma las componentes de a[ini..a.length - 1].
 Precondicion: 0 <= ini. 
*/
public class Ejemplo2 {
    public static double main(double[] a, int ini){
        //Para controlar si ini sobrepasa el final der array
        //Recordar que ini se va sumando y si ini =3 y length =2 pues devuelve un 0
        if(ini <= a.length - 1){
            return a[ini] + main(a,++ini);
        }else{
             return 0;
        }
    }
}
