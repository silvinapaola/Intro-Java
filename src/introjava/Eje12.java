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
 * Escriba un programa que valide si una nota está entre 0 y 10, sino está entre 0 y 10
la nota se pedirá de nuevo hasta que la nota sea correcta. 
 */
public class Eje12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese su nota");
        int nota = leer.nextInt();
        
        do { 
          if ((nota<0)||(nota>10)) {
              System.out.println("Por favor, ingrese una nota valida");
              nota=leer.nextInt();
        } 
                    
      
              } while ((nota<0)||(nota>10));
        
        if ((nota >=0)|| (nota<=10)) {
            System.out.println("La nota ha sido registrada correctamente");
            
        }
           
    }
            }
            
        
            

       
                
            
        
    

    

