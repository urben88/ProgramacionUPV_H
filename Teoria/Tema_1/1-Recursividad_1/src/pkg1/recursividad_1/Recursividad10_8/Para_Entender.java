/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg1.recursividad_1.Recursividad10_8;
/**
 *
 * @author Urben
 */
public class Para_Entender {
    // Va modificando la variable x, haciendo un bucle sin el uso de bucles
    public static void Imprimir(int x){
        if(x <= 5){
            System.out.println(x+" ");
            Imprimir(++x);
        }
    }
}
