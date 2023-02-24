/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package recursividad_part2;

public class Ejemplo3 {

    /**
     * In!dice del primer minimo de a[ini..a.length - 1]. Precondicion: 0 <= ini
     * <= a.length - 1.
     * Simplemente hace que devuelva la posición del primer mínimo
     */
    public static int main(double[] a, int ini) {
       //Si llega al tope del array
       if(ini == a.length -1){
           return ini;
       }else{
           //Obtengo el mínimo de 
           int posMin = main(a,++ini);
           if(a[ini] <= a[posMin]){
               return ini;
           }else{
               return posMin;
           }
       }
    }
}
