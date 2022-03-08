/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introjava;

import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Silvina Paola
 * Escriba un programa que lea 20 números. Si el número leído es igual a cero se debe
salir del bucle y mostrar el mensaje "Se capturó el numero cero". El programa
deberá calcular y mostrar el resultado de la suma de los números leídos, pero si el
número es negativo no debe sumarse. Nota: recordar el uso de la sentencia break.
 */
public class Eje14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer= new Scanner(System.in);
        
        int suma;
        suma=0;
                
        for (int i=1; i<=20; i++) {
            System.out.println("Ingrese el valor n° "+i);
            int num= leer.nextInt();
            
            if (num == 0) {
                 System.out.println("Se capturó el número cero");break;
            } else {
                if (num > 0) {
                   
                    
                    suma=suma+num;
                
            }
            
            
        }
      
    }
    
      System.out.println("La suma total de los numero es " + suma);
    }
}


