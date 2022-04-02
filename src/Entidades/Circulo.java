/*
 * Bienvenido, este es un mensaje auto-generado por Damian Dries
 * Damian Dries - JAVA DEV 
 * www.damiandries.com.ar
 */
package Entidades;

import java.util.Scanner;

/**
 *
 * @author Damian Dries - "www.damiandries.com.ar"
 */
public class Circulo extends FormasGeometricas {
    
    private double radio;

    public Circulo() {
    }
    
    
    public Circulo(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    @Override
    public double areaCiruclo(double radio) {
       return Math.round((Math.PI*Math.pow(radio, 2))*100.0)/100.0;
    }
    
    @Override
    public double perimetroCirculo(double radio) {
        return Math.round((2*Math.PI*radio)*100.0)/100.0;
    }
    
    
}
