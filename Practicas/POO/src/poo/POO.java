/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

import java.util.Scanner;


public class POO {
Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
      Scanner entrada = new Scanner(System.in);
      int menu;
        Figuras objfiguras = new Figuras();
     do{
         System.out.println("Selecciona una figura\n"
         + "1) Cuadrado\n"
         + "2) Circulo\n"
         + "3) Triangulo\n"
         + "4) rectangulo\n"
         + "5) salir\n");
         menu = entrada.nextInt();
         System.out.println(" ");
         System.out.println(" ");
         switch(menu){
             case 1: objfiguras.cuadrado();
             break;
             case 2: objfiguras.circulo();
             break;
             case 3: objfiguras.triangulo();
             break;
             case 4: objfiguras.rectnagulo();
             break;
            
         }//cierre de switch
         
     }while(menu !=5);
      
    }
    
    
}
