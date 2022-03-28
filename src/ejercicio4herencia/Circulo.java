/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4herencia;

import Interfaz.Calcular;
import java.util.Scanner;

/**
 *
 * @author Mariana
 */
public final class Circulo implements Calcular {

    public double radio;
    
    public double ingresarRadio(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el radio");
        return radio=leer.nextInt();
    }
     
    @Override
    public double calcularArea() {
     double totalArea=PI*Math.pow((radio*2), 2); 
       System.out.println("El total del área del círculo es: "+totalArea);
       return totalArea;
    }

    @Override
    public double calcularPerimetro() {
     double totalPerimetro=PI*(radio*2);
     System.out.println("El total del perímetro del círculo es: "+totalPerimetro);
     return totalPerimetro;
    }
   
}
