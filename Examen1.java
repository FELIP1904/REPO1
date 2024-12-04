/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examen1;

import java.util.Scanner;

/**
 *
 * @author juaareuru
 */
public class Examen1 {


    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int desicion=0;
       do{
           System.out.println("menu");
           System.out.println("1. Sumar dos números.");
          System.out.println("2. Restar dos números.");
            System.out.println("3. Multiplicar dos números.");
              System.out.println("4. Dividir dos números.");
              System.out.println("5. Salir.");
              desicion=sc.nextInt();
              switch(desicion){
                  case 1 -> {
               }
                         case 2 -> {
               }
                         case 3 -> {
               }
                         case 4 -> {
               }
                         case 5 -> System.out.println("cerrando programa...");
                         default -> System.out.println("desicion erronea");
                             
              }
       }while(desicion!=5);
       
    }
    
}
