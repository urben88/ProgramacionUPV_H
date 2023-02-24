/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg1.recursividad_1.Recursividad10_8;

/**
 *
 * @author Urben
 */
public class Coeficiente_Division_Entera {
    //Por ejemplo 7/3 es 2.3 por lo tanto el coeficiente es el resultado de la operación
    //Y lo calculamos así
    public static int main(int a, int b){
        if(a<b){
            return 0;
        }else{
            return main(a-b,b)+1;
        }
    }
}
