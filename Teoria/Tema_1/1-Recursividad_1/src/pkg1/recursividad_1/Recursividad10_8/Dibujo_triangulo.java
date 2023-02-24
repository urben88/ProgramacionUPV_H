/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg1.recursividad_1.Recursividad10_8;

/**
 *
 * @author Urben
 */
public class Dibujo_triangulo {
    public static void main(int n){
        if( n == 1 ){
            System.out.println("*");
        }else{
            for(int i=0; i<=n; i++){
                System.out.print("*");
            }
            System.out.println("");
            main(n-1);
        }
    }
    public static void triangulo1(int n){
        if(n == 1){
            System.out.print("*");
        }else{
            for(int i=n; i>=n+1;i--){
                System.out.print("_");
            }
            for(int i=0; i<=n;i++){
                System.out.print("*");
            }
            System.out.println("");
            triangulo1(n-1);
        }
    }
}
