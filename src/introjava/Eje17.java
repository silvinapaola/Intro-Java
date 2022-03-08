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
 * Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. Por ejemplo,
si el cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
 * * *
 *   *
 *   *
 * * *
 */
public class Eje17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        
        int n;
        
        System.out.println("Ingrese la cantidad de elementos para su cuatrado");
        n= leer.nextInt();
        
       
            
         
            
                for (int i=1; i<= n; i++){
                    
                    if (i==1 || i==n) {
                        
                        System.out.println("****");
                        
                    } else {
                        
                        System.out.println("*  *");
                        
                    }
                    
                }
            
        
        
        
       
    }
    
}
