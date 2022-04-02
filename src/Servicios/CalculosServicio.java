/*
 * Bienvenido, este es un mensaje auto-generado por Damian Dries
 * Damian Dries - JAVA DEV 
 * www.damiandries.com.ar
 */
package Servicios;

import Entidades.Circulo;
import Entidades.Rectangulo;
import java.util.Scanner;

/**
 *
 * @author Damian Dries - "www.damiandries.com.ar"
 */
public class CalculosServicio {
     Scanner read = new Scanner(System.in);
    public void mostrarValoresCiruclo() {
        System.out.println("Ingrese el radio del circulo");
        double rad = read.nextDouble();
        Circulo c1 = new Circulo();
        System.out.println("EL AREA DEL CIRCULO ES: " + c1.areaCiruclo(rad));
        System.out.println("EL PERIMETRO DEL ES: " + c1.perimetroCirculo(rad));

    }

    public void mostrarValoresRectangulo() {
        System.out.println("Ingrese la base del rectangulo");
        double base = read.nextDouble();
        System.out.println("Ingrese la altura del rectangulo");
        double altura = read.nextDouble();
        Rectangulo r1 = new Rectangulo();
        System.out.println("EL AREA DEL RECTANGULO ES: " + r1.areaRectangulo(base, altura));
        System.out.println("EL PERIMETRO DEL RECTANGULO ES: " + r1.perimetroRectangulo(base, altura));
    }
}
