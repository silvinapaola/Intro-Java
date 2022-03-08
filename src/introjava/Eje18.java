/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introjava;

import java.util.Scanner;

/**
 *
 * @author Silvina Paola
 * 
 * Realizar un programa que lea 4 números (comprendidos entre 1 y 20) e imprima el
número ingresado seguido de tantos asteriscos como indique su valor. Por ejemplo:
5 *****
3 ***
11 ***********
2 **
 */
public class Eje18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        
        
        System.out.println("Ingrese 4 numeros del 1 al 20");
        int n1=leer.nextInt(); 
       
        
        
        if ((n1>=1) || (n1 <=20)) {
            System.out.print(n1);
            
            for (int i=1; i<= n1; i++) {
                System.out.print("*");
                
            }
            
        } else {
            
            System.out.println("Porfavor reinicie el programa e ingrese un numero válido");
        }
        
        int n2=leer.nextInt(); 
        if ((n2>=1) || (n2 <=20)) {
            
            System.out.print(n2);
            for (int i=1; i<= n2; i++) {
                System.out.print("*");
                
            }
            
        } else {
            System.out.println("Porfavor reinicie el programa e ingrese un numero válido");
        }
        
        int n3=leer.nextInt(); 
        if ((n3>=1) || (n3 <=20)) {
            
            System.out.print(n3);
            for (int i=1; i<= n3; i++) {
                System.out.print("*");
                
            }
            
        } else {
            System.out.println("Porfavor reinicie el programa e ingrese un numero válido");
        }
        
        int n4=leer.nextInt(); 
        if ((n4>=1) || (n4 <=20)) {
            
            System.out.print(n4);
            for (int i=1; i<= n4; i++) {
                System.out.print("*");
                
            }
            
        } else {
            System.out.println("Porfavor reinicie el programa e ingrese un numero válido");
        }
        
        
    }
    
}
