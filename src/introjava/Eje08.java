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
 * Crear un programa que pida una frase y si esa frase es igual a “eureka” el programa
pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto. Nota:
investigar la función equals() en Java.
 */
public class Eje08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        String frase;
        System.out.println("Ingrese la frase correcta");
        
        frase = leer.nextLine();
        
        
            
            if (frase.equals("Eureka")) {
                System.out.println("La frase es Correcta");
            } else {
                System.out.println("La frase es Incorrecta");
            }
            
        
    }
    
}
