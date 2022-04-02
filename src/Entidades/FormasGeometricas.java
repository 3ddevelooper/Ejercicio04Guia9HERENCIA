/*
 * Bienvenido, este es un mensaje auto-generado por Damian Dries
 * Damian Dries - JAVA DEV 
 * www.damiandries.com.ar
 */
package Entidades;

import Interfaces.calculosFormas;

/**
 *
 * @author Damian Dries - "www.damiandries.com.ar"
 */
public class FormasGeometricas implements calculosFormas{

    @Override
    public double areaCiruclo(double radio) {
       return Math.PI*Math.pow(radio, 2);
    }

    @Override
    public double perimetroCirculo(double radio) {
        return 2*Math.PI*radio;
    }

    @Override
    public double areaRectangulo(double base, double altura) {
        return base*altura;
    }

    @Override
    public double perimetroRectangulo(double base, double altura) {
        return (base+altura)*2;
        
    }
    
}
