/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package recursividad_part2;


public class Ejemplo8 {
    public static int main(int[] a,int ini, int fin, int x){
        //Con esta condición aseguramos que x no esta en el array
        if(ini <= fin){
            //Una marea optima para ahorrarte la mitad del trabajo es buscar el medio del array 
            //Y partir de ahi (No pasa nada que sea par o inpar ya que se redondea)
            //Por la recrsividad este medio se irá actualizando y calculando medias hasta que coincida con el numero buscado
           int medio = (ini+fin)/2;
           //En el caso que medio coincida con x pues ya hemos encontrado la pos
           if(a[medio] == x){
               //SIEMPRE va a entrar a esta condición si se da el caso que existe el valor buscado
               return medio;
           }else //En el caso que no hayamos tenido esa suerte comienza la busqueda
               //Vemos si el valor que buscamos se encuentra a la izquierda o derecha del médio calculado
               if(a[medio] < x){
                   //Si x se encunetra a la derecha de la media
                   return main(a,medio+1,fin,x);
               }else{
                   //Si x se encuentra a la izquierda de la media
                   return main(a,ini,medio-1,x);
               }
       }else{
            return -1;
        } 
    }
}
