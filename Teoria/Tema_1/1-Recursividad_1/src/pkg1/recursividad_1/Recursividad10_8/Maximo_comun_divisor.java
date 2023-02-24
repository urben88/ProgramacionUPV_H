/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg1.recursividad_1.Recursividad10_8;

/**
 *
 * @author Urben
 */
public class Maximo_comun_divisor {
    //Se hace uso del algoritmo de euclides --> Dado en mad
    public static int cmd(int a,int b){
        if(a>b){
            return cmd(a-b,b);
        }else if(b>a){
            return cmd(a,b-a);
        }else{
            return a;
        }
    }
}
