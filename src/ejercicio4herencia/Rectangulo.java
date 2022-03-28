/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4herencia;

import Interfaz.Calcular;
import static Interfaz.Calcular.PI;
import java.util.Scanner;

/**
 *
 * @author Mariana
 */
public final class Rectangulo implements Calcular {
  public double base;
  public double altura;
  
  public double ingresarBase(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la base");
        return base=leer.nextInt();
    }
    
    public double ingresarAltura(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la altura");
        return altura=leer.nextInt();
    }
    
  @Override
    public double calcularArea() {
     double totalArea=base*altura;
     System.out.println("El total del área del rectángulo es: "+totalArea);   
     return totalArea;
    }

  @Override
    public double calcularPerimetro() {
     double totalPerimetro=Math.pow((base*altura), 2);
     System.out.println("El total del círculo del rectángulo es: "+totalPerimetro);
     return totalPerimetro;
    }
}
