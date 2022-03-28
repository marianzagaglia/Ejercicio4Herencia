/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4herencia;

/**
 *
 * @author Mariana
 */
public class Ejercicio4Herencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Circulo n1=new Circulo();
        System.out.println("-----------------------------");
        System.out.println("CÁLCULO CÍRCULO");
        System.out.println("-----------------------------");
        n1.ingresarRadio();
        n1.calcularArea();
        n1.calcularPerimetro();
        System.out.println("-----------------------------");
        System.out.println("CÁLCULO RECTÁNGULO");
        System.out.println("-----------------------------");
        Rectangulo r1=new Rectangulo();
        r1.ingresarAltura();
        r1.ingresarBase();
        r1.calcularArea();
        r1.calcularPerimetro();
    }
    
}
