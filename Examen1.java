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
       double num1=0;

       double num2=0;
       double resul=0;



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
                      System.out.println("introduce un numero");
                      num1=sc.nextInt();
                      System.out.println("introduce otro numero");
                      num2=sc.nextInt();
                      resul=num1+num2;
                      System.out.println("resultado de la suma es: " +resul);
                      
               }
                         case 2 -> {
                             System.out.println("introduce un numero");
                             num1=sc.nextInt();
                              System.out.println("introduce otro numero");
                             num2=sc.nextInt();
                             resul=num1-num2;
                             System.out.println("el resultado de la resta es: " +resul);
                             
               }
                         case 3 -> {
                             System.out.println("introduce un numero");
                             num1=sc.nextInt();
                             System.out.println("introduce otro numero");
                             num2=sc.nextInt();
                             resul=num1*num2;
                             System.out.println("el resultado de la multiplicacion es: " +resul);
                             
               }
                         case 4 -> {
               }
                         case 5 -> System.out.println("cerrando programa...");
                         default -> System.out.println("desicion erronea");
                             
              }
       }while(desicion!=5);
       
    }
    
}
