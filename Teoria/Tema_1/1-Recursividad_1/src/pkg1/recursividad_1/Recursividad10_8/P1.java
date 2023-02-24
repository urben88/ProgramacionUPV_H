
package pkg1.recursividad_1.Recursividad10_8;

public class P1 {
    public static int fact(int n){
        int p;
        if(n == 0){
            p = 1;
        }else{
            p = n * fact(n-1);
        }
        return p;
    }
}
