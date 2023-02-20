package pract1;
// Importa la clase Graph2D (del paquete graph2D).
import graph2D.Graph2D;
// Importa la clase Color (del paquete java.awt) para poder
// cambiar los colores de los elementos que se representen.
import java.awt.Color;
/**
 * La clase SimpleRecFig incluye los elementos basicos
 * para dibujar una figura recursivamente.
 * 
 * @author PRG-DSIC-ETSINF, pmarques 
 * @version Curso 2022-23
 */
public class SimpleRecFig {
    /** No hay objetos de esta clase. */
    private SimpleRecFig() { }

    /**
     * Dibuja, recursivamente, una serie de cuadrados encadenados
     * en una diagonal. El numero de cuadrados viene dado por iniOrd.    
     * @param iniOrd int, numero de cuadrados que se dibujan.
     * PRECONDICION: iniOrd >= 1
     */
    public static void recFig(int iniOrd) {
        // Dimensiones del espacio de dibujo en coords. reales:
        double minX = -0.1, maxX = 2.1;
        double minY = -0.1, maxY = 2.1;
        
        Graph2D gd = new Graph2D(minX, maxX, minY, maxY);
        // Titulo de la ventana donde se dibuja:
        gd.setTitle("Recursive Figure: Chained Squares. Order: " + iniOrd); 
        
        // Figura de orden iniOrd, con iniOrd cuadrados.
        // El cuadrado mayor de la figura es de lado 1.0, 
        // y con esquina superior izquierda en (1.0, 1.0)
        // Llamada inicial al metodo recursivo:
        recFig(gd, iniOrd, 1.0, 1.0, 1.0);
    }
   
    /**
     * Dibuja, iterativamente, una serie de cuadrados encadenados
     * en una diagonal. El numero de cuadrados viene dado por iniOrd.    
     * @param iniOrd int, numero de cuadrados que se dibujan.
     * PRECONDICION: iniOrd >= 1
     */
    public static void iterFig(int iniOrd) {
        // Dimensiones del espacio de dibujo en coords. reales:
        double minX = -0.1, maxX = 2.1;
        double minY = -0.1, maxY = 2.1;
        
        Graph2D gd = new Graph2D(minX, maxX, minY, maxY);
        // Titulo de la ventana donde se dibuja:
        gd.setTitle("Iterative figure: Chained Squares. Order: " + iniOrd); 
        
        // Figura de orden iniOrd, con iniOrd cuadrados.
        // El cuadrado mayor de la figura es de lado 1.0, 
        // y con esquina superior izquierda en (1.0, 1.0)
        // Llamada al metodo iterativo:
        iterFig(gd, iniOrd, 1.0, 1.0, 1.0);
    }
    
    /**
     * Dibuja, recursivamente, una diagonal de ord cuadrados, de lados decrecientes.
     * El cuadrado mas grande tiene lado l, y el resto de cuadrados
     * van reduciendo su lado a la mitad.
     * @param g Graph2D, el espacio Graph2D donde se realiza el dibujo.
     * @param ord int, orden (o numero) de cuadrados.
     * @param l double, longitud del lado del cuadrado mayor.
     * @param xSL double, abscisa de la esquina superior izquierda del cuadrado mayor.
     * @param ySL double, ordenada de la esquina superior izquierda del cuadrado mayor.
     * PRECONDICION: ord >= 1 
     */
    private static void recFig(Graph2D g, int ord, double l, double xSL, double ySL) {
        // Caso base: ord == 1, se dibuja el cuadrado de lado l.
        // Caso general: ord > 1, se dibuja el cuadrado de lado l, y se encadena 
        // en diagonal una subfigura de orden ord - 1.
        if (ord == 1) {
            delay();
            g.drawRect(xSL, ySL, l, l, Color.BLUE, 2);
        } else {
            delay();
            g.drawRect(xSL, ySL, l, l, Color.BLUE, 2);
            recFig(g, ord - 1, l / 2, xSL - l / 2, ySL + l / 2);
        }
    } 

    /**
     * Dibuja, iterativamente, una diagonal de ord cuadrados, de lados decrecientes.
     * El cuadrado mas grande tiene lado l, y el resto de cuadrados
     * van reduciendo su lado a la mitad.
     * @param g Graph2D, el espacio Graph2D donde se realiza el dibujo.
     * @param ord int, orden (o numero) de cuadrados.
     * @param l double, longitud del lado del cuadrado mayor.
     * @param xSL double, abscisa de la esquina superior izquierda del cuadrado mayor.
     * @param ySL double, ordenada de la esquina superior izquierda del cuadrado mayor.
     * PRECONDICION: ord >= 1 
     */
    private static void iterFig(Graph2D g, int ord, double l, double xSL, double ySL) {
        for (int i = ord; ord >= 1; ord --) {        
            g.drawRect(xSL, ySL, l, l, Color.RED, 2);
            delay();
            xSL = xSL - l / 2;
            ySL = ySL + l / 2;
            l = l / 2;
        }
    }           
    
    /** Suspende temporalmente la ejecucion durante 300 ms. */
    private static void delay() {
        try { Thread.sleep(300); } catch (Exception e) { ; }
    }
}
