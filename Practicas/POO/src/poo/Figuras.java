/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

import java.util.Scanner;

/**
 *
 * @author Raul
 */
public class Figuras {
    Scanner entrada = new Scanner(System.in);
    
    public void cuadrado(){
    int lado, area;
    System.out.println("Escriba el lado:");
    lado= entrada.nextInt();
    area = lado*lado;
        System.out.println("El area del cuadrado es: " +area);
    }
    
    public void circulo(){
    double radio, pi=3.1416, area;
        System.out.println("Dame el radio del circulo");
    radio = entrada.nextDouble();
    area = pi*Math.pow(radio, 2);
        System.out.println("El area del circulo es: " + area);
    
    }
    
    public void triangulo(){
    double base, altura, area;
    System.out.println("dame la base del triangulo");
    base = entrada.nextDouble();
    System.out.println("dame la altura del triangulo");
    altura = entrada.nextDouble();
    area = ((base*altura)/2);
    System.out.println("El area del triangulo es: " + area);
    }
    
    public void rectnagulo(){
    int base, altura, area;
    System.out.println("dame la base del rectangulo");
    base = entrada.nextInt();
    System.out.println("dame la altura del rectangulo");
    altura = entrada.nextInt();
    area = base*altura;
        System.out.println("El area del rectngulo es: "+  area);
    }
}
