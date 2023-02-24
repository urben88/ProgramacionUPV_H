/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg1.recursividad_1.Recursividad10_8;

/**
 *
 * @author Urben
 */
public class Numero_de_cifras {
    public static int numCifras(int num){
       return (num <10) ? 1 : numCifras(num/10) + 1; 
    }
}
