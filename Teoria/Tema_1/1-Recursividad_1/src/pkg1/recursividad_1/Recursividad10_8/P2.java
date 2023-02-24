/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg1.recursividad_1.Recursividad10_8;

/**
 *
 * @author Urben
 */
public class P2 {
    public static void main(int n){
        n = (n<=0) ? n = 1 : n;
        for (int i = 1; i <= n; i++) {
            System.out.print(i+ " ");
        }
    }
}
