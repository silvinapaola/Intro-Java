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
 */
public class Eje01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer= new Scanner(System.in);
        
       int num1;
       int num2;
       int suma;
       
      System.out.println("Ingrese dos números separados con enter");
        
        num1= leer.nextInt();
        num2= leer.nextInt();
        suma= num1 + num2;
        
        System.out.println("La suma de ambos nuemros es "+suma);
    }
    
}
