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
 * Crear un programa que dado un numero determine si es par o impar.
 */
public class Eje07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        System.out.println("Ingrese un numero");
        int num;
        
        num = leer.nextInt();
        
        if (num %2==0) {
            System.out.println("El numero ingresado es PAR");
        } else {
            System.out.println("El numero ingresado es IMPAR");
        }
                
    }
    
}
