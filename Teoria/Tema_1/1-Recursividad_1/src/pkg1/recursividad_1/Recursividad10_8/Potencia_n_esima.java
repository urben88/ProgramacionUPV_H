/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg1.recursividad_1.Recursividad10_8;

/**
 *
 * @author Urben
 */
public class Potencia_n_esima {
    //a^n
    public static int main(int a, int n){
        return (n == 0) ? 1 : 
                main(a,n-1)*a
                ;
    }
}
