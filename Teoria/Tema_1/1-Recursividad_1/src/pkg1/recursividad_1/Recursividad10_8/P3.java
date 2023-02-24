/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg1.recursividad_1.Recursividad10_8;

/**
 *
 * @author Urben
 */
public class P3 {
    public static void main(int n){
        n = (n<=0) ? n = 1 : n;
        for(int i = n; i > 0; i--){
            System.out.print(i+" ");
        }
    }
}
