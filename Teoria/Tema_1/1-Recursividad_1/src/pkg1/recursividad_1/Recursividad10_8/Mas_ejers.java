package pkg1.recursividad_1.Recursividad10_8;

// Ejercicios sacados de https://aulaenlanube.com/zona-programacion/java/ejercicios-recursividad-java/
public class Mas_ejers {
    
    public static void main(){
        System.out.println(ejer1(5));
        ejer2(4);
        System.out.println("");
        ejer3(4);
        System.out.println(ejer4(2089757));
        System.out.println(ejer5(3)); 
        System.out.println("");
        secCreDecre(4,6);
        System.out.println("");
        System.out.println(ejer6_fibonacci_1(7));
        System.out.println("");
        System.out.println(ejer6_fibonacci_2(7));
        System.out.println("");
        System.out.println(ejer7(2,6));
        System.out.println("");
        ejer8(3892);
        System.out.println("");
        ejer9(7,5);
        System.out.println("");
        ejer10(5);
        System.out.println(ejer11("acbd"));
        System.out.println(ejer12("RECONOCER"));
  
    }
    /*Crea un método que obtenga la suma de los números 
    naturales desde 1 hasta N. Se debe pasar como parámetro 
    el número N
    */
    //Muy parecido que el factorial, solo habria que cambiar la suma por la mult
    public static int ejer1(int n){
        if(n < 1){
            return 1;
        }else{
            System.out.print(n+" ");
            return ejer1(n-1)+n;
        }
    }
    
    /*Crea un método que imprima los dígitos desde 1 hasta N.
    Se debe pasar como parámetro el número N*/
    /*
    met(3) -> 4
        met(2) -> 3
            met(1) -> 2 =>Sefundo q imprime
                met(0) -> "" =>Primero q imprime
    */
    public static void ejer2(int n){
        if(n > 0){
            //Le resto antes para que llegue a 1, imprima el 1 y luego llegue hasta el n
            ejer2(n-1);
            //Este seria el último output 
            System.out.print(n+" ");
        }else{
            //Como llega al 0 empieza a imprimir el 1 que es el que estaba en la cola
            System.out.print("(Llega al "+n+")");
        }
    }
    
    /*Crea un método que imprima los dígitos desde N hasta 1.
    Se debe pasar como parámetro el número N*/
    /*
      met(3) -> 4 =>Primero q imprime
        met(2) -> 3 =>Segundo q imprime
            met(1) -> 2 
                met(0) -> "" 
    */
    public static void ejer3(int n){
        if( n == 0 ){
            //Este es el último output
            System.out.println("");
        }else{
            //OJO Simplemente cambia cuando imprimo o pongo el método
            System.out.print(n+" ");
            //Si pongo este método antes que el print hara como el ejer2 el inverso
            ejer3(n-1);
        }
    }
    /*Crea un método que obtenga la cantidad de dígitos de 
    un número N. Se debe pasar como parámetro el número N*/
    /*
    n=382
    met(382/10) ==> 382 (n --> +1)
        met(38/10) ==> 38 (n --> +1+1)
            met(4/10) ==> 4 (n --> +1+1+1)
         NO! ejecuta met() ==> 0,4 (return 1)
                
    */
    public static int ejer4(int n){
        if(n <= 10){
            return 1;
        }else{
            //El +1 simplemente es para contar las iteraciones que hace que coincide con la longitud del numero
            return ejer4(n/10)+1;
        }
    }
    /*
    Crea un método que obtenga el factorial de un número N.
    Se debe pasar como parámetro el número N
    */
    //Como el ejer1 pero pero multiplicando
    public static int ejer5(int n){
        if(n == 0){
            return 1;
        }else{
            return ejer5(n-1)*n;
        }
    }
    //Otro ejer
    /*
    (1)met(4,6) -> 4
       (2) met(4+1,6) -> 5
           (3) met(5+1,6) -> if(true) -> 6
       (2) -> 5 
    (1) -> 4
    */
    public static void secCreDecre(int i,int n){
        if(i==n){
            System.out.print(n);
        }else{
            // Se imprime i creciente
            System.out.print(i+" ");
            secCreDecre(i+1,n); //Entra en la recursividad
            // Se imprime la i decreciente
            System.out.print(" "+i);
        }
    }
    
    /*Crea un método que calcule el número de fibonacci 
    a partir de un número pasado como parámetro*/
    //https://matesfacil.com/ESO/progresiones/sucesion-Fibonacci-formulas-problemas-resueltos-suma-espiral-triangulo-Pascal.html
    
    // => 1 1 2 3 5 8 13 21 34 55 89
    //Sucension donde => a0=0, a1=1, an=an-2+an-1
    
    //Output --> El n marco la posición de la sucesión que deseo sacar. 
    public static int ejer6_fibonacci_1(int n){
      if(n>1){
          return ejer6_fibonacci_1(n-1)+ejer6_fibonacci_1(n-2);
      }else if(n==1){
          return 1;
      }else{
          return 0;
      }
    }
    
    /*
    n = 4
    met(4-1)+met(4-2)
        met(3-1)+met(2-2)
            met(2-1)+met(0) ->El segundo método es return n (0)
                met(1-1)+met(0) ->El primer método 
    */
    public static int ejer6_fibonacci_2(int n){
        if(n>1){
            return ejer6_fibonacci_2(n-1) + ejer6_fibonacci_2(n-2);
        }
        return n;
    }
    
    public static int ejer6_fibonacci_3(int n){
        if(n<2){
            return n;
        }else{
            return ejer6_fibonacci_3(n-1)+ejer6_fibonacci_3(n-2);
        }
    }
    
    /*Crear un método que obtenga el resultado de elevar un número a otro*/
    public static int ejer7(int a, int b){
        if(b>0){
            return ejer7(a,b-1)*a;
        }else{
            return 1;
        }
    }
    
    /*Crea un método que dado un número, lo imprima invertido por pantalla*/
    // n=3892 
    // Si divido entre 10 me da el num reducido, pero si quiero saber el número que he quitado, es el resto de la división
    public static void ejer8(int n){
        if(n<10){
            System.out.print(n);
        }else{
            //Num que quito
            System.out.print(n%10);
            //Num reducido
            ejer8(n/10);
        }
    }
    
    /*
    Crea un método que imprima por pantalla un Rectángulo a partir de los valores de la base y la altura
    */
    //b=7 h=5
    
    public static void ejer9(int b, int h){
        if(h>0){
            for (int i = 0; i < b; i++) {
              System.out.print("* ");
            }
            System.out.println("");
            ejer9(b,h-1);
            
        }else{
            System.out.print("");
        }
    }
    /*Crea un método que imprima por pantalla un Triángulo rectángulo a partir del valor de la altura del triángulo*/
    // h=5
    public static void ejer10(int h){
        if(h>1){
            ejer10(h-1);
            for(int i = 0; i<h; i++){   
                System.out.print("*");
            }
            System.out.println("");
        }else{
            System.out.println("*"); 
        }
    }
    
    /*Crea un método que compruebe si una palabra está ordenada alfabéticamente*/
    public static boolean ejer11(String f){
        
        f = f.toLowerCase();
        
        if(f.length()>1){
            if(f.charAt(0)<=f.charAt(1)){
                //Incluye la pos 1 de la cadena pero no el tamaño máximo de la cadena
                return ejer11(f.substring(1,f.length()));
            }else{
                return false;
            }
        }else{
            return true;
        }
    }
    
    /*Crea un método que compruebe si una palabra es un palíndromo*/
    
    //¿Que significa?
    /*Una palabra palíndromo es una palabra que se puede leer de igual manera de recha a 
    izquierda que de izquierda a derecha, por ejemplo la palabra RECONOCER, ANA, OTTO, OJO, OSO*/
    
    //https://pseudocodigoejemplos.com/algoritmo-para-determinar-si-una-palabra-es-palindromo/#:~:text=Finalmente%20evaluamos%20si%20la%20variable%20pal%C3%ADndromo%20es%20igual,pantalla%20indicando%20que%20la%20palabra%20no%20es%20pal%C3%ADndromo.
    public static boolean ejer12(String palabra){
        palabra = palabra.toLowerCase();
        if(palabra.length()>1){
            if(palabra.charAt(0) == palabra.charAt(palabra.length()-1)){
                return ejer12(palabra.substring(1,palabra.length()-1));
            }else{
                return false;
            }
        }else{ 
            return true;
        }
    }
}

