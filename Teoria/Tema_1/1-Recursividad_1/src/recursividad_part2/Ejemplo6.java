/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package recursividad_part2;

public class Ejemplo6 {

    /**
     * Devuelve la posicion en la que se encuentra x en a[ini..a.length - 1]. Si
     * x no se encuentra, devuelve -1. Precondicion: 0 <= ini.
     */
    public static int main(int[] a, int ini, int x) {
        if (ini < a.length) {
            if (a[ini] == x) {
                return ini;
            } else {
                return main(a, ++ini, x);
            }

        } else {
            return -1;

        }
    }

}
