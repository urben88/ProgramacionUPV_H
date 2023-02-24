/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg1.recursividad_1;
//Importo las clases de los ejercicios del primer tema
import pkg1.recursividad_1.Recursividad10_8.*;


// Problemas Cap10-1 PDF
public class Recursividad_1 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // Aqui voy a importar las clases de los ejecicios
//        P2.main(0);
//        System.out.println("");
//        P3.main(20);
        System.out.println("\nEjer4=");
        P4.main(5);
        System.out.println("\nFactorial=");
        Factorial.main(5);
        System.out.println("\nNúmero de cifras=");
        System.out.println(Numero_de_cifras.numCifras(23850)); 
        System.out.println("Recursividad sencilla=");
        Para_Entender.Imprimir(1);
        System.out.println("Coeficiente division entera\n"+Coeficiente_Division_Entera.main(7, 3));
        Dibujo_triangulo.main(8);
        Dibujo_triangulo.triangulo1(5);
        Mas_ejers.main();
    }
    
}
