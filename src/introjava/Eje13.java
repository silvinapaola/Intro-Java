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
 * Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación
solicite números al usuario hasta que la suma de los números introducidos supere el
límite inicial
 */
public class Eje13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        
        System.out.println("Ingrese el valor limite");
        int limit= leer.nextInt();
        int suma, num;
        
        suma= 0;
        
        while (suma<=limit) {  
            
            System.out.println("Ingrese un numero");
            num= leer.nextInt();
            
            suma=suma+num;
        }
        System.out.println("Se ha superado el limite indicado");
    }
    
}
