/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introjava;

import java.util.Scanner;
import jdk.nashorn.internal.ir.ContinueNode;

/**
 *
 * @author Silvina Paola
 * 
 * Realizar un programa que pida dos números enteros positivos por teclado y
muestre por pantalla el siguiente menú:
MENU
1. Sumar
2. Restar
3. Multiplicar
4. Dividir
5. Salir
Elija opción:

El usuario deberá elegir una opción y el programa deberá mostrar el resultado por
pantalla y luego volver al menú. El programa deberá ejecutarse hasta que se elija la
opción 5. Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir
del programa directamente, se debe mostrar el siguiente mensaje de confirmación:
¿Está seguro que desea salir del programa (S/N)? Si el usuario selecciona el
carácter ‘S’ se sale del programa, caso contrario se vuelve a mostrar el menú.
 */
public class Eje15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        
        System.out.println("Ingrese el primer elemento de la operación");
         int num1=leer.nextInt();
         
        System.out.println("Ingrese el segundo elemento de la operación");
        int num2=leer.nextInt();
        
        
        
        double operator;
        int centinela= 0;
            
        do {            
            System.out.println("Ingrese la opción deseada: ");
        System.out.println("MENU"
                + "1.Sumar"
                + "2.Restar"
                + "3.Multiplicar"
                + "4.Dividir"
                + "5.Salir");
       
          int selec=leer.nextInt();
        
            switch (selec){
            
                case 1 :
                           operator= num1 + num2;
                    System.out.println("El resultado es "+ operator);
                    centinela=0;
                   break;
                case 2 :
                    operator= num1-num2;
                    System.out.println("El resultado es "+operator);
                    centinela=0;
                    break;
                case 3 :
                    operator= num1*num2;
                    System.out.println("El resultado es "+operator);
                    centinela=0;
                    break;
                case 4 :
                    operator=num1/num2;
                    System.out.println("El resultado es "+operator);
                    centinela=0;
                    break;
                case 5 :
                    System.out.println("Está seguro que desea salir del programa? S/N");
                    
                    String resp = leer.next();
                    
                    if (resp.equals("n")||resp.equals("N")) {
                        centinela=0;
                    } else {
                        centinela++;
                    } break;
                    
            }
         
         } while (centinela==0);
                         
            System.out.println("Muchas gracias, hasta la proxima");
    } 
        
  
    }
    

