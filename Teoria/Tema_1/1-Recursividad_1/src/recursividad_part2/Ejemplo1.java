/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package recursividad_part2;

/**
 * Inicia con valores aleatorios en [0.0, 0.1[ las componentes de
 * a[ini..a.length - 1]. Precondicion: 0<= ini< a.length, a.length > 0, array no
 * vacio.
 */
public class Ejemplo1 {

    /**
    Le das una array Double y la posición donde quires que comienze a poner números
    random.
    * 
    @param ini Posición donde comenzará a poner valores random (poner 1)
    * @param a Un array de double que pasas por refereincia y será modificado
    */
    public static void main(double[] a, int ini) {
        if (ini == a.length - 1) {
            a[ini] = Math.random();
            System.out.println("Acaba la iteración");
        }else{
            a[ini] = Math.random();
            main(a,ini + 1);
        }
    }
}
