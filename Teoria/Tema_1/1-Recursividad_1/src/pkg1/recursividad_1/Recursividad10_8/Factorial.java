/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg1.recursividad_1.Recursividad10_8;

/**
 *
 * @author Urben
 */
public class Factorial {
    
    public static void main(int n){
        System.out.println("Normal:"+normal(n));
        System.out.println("Recursivo:"+recursivo(n));
    }
    
    public static int normal(int n){
        int f = 1,i=1;
        while(i<n){
            i++;
            f= f*i;
        }
        return f;
    }
    
   // Le introducimos el argumento n y este va estar modificandose en bucle por la recursividad
    //
    public static int recursivo(int n){
       return (n == 0) ?  1 : (n * recursivo(n-1));
    }
}
