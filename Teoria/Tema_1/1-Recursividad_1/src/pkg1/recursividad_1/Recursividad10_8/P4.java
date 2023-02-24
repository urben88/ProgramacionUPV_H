/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg1.recursividad_1.Recursividad10_8;

/**
 *
 * @author Urben
 */
public class P4 {
    public static void main(int n){
       
        if(n > 0){
            System.out.print(n+"(1)");
            main(n-1);
            System.out.print(n+"(2)");
        }else{
            System.out.println(0);
        }
    }
}
