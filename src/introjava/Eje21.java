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
 * 
 * Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le
pida al usuario un numero a buscar en el vector. El programa mostrará donde se
encuentra el numero y si se encuentra repetido
 */
public class Eje21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
         int vector[];
         
         System.out.println("Ingrese el tamaño del vector");
        int n=leer.nextInt();
        
        vector = new int [n];
        for (int i=0; i< n;i++) {
            
            vector[i]= (int) (Math.random()*100);
            
            System.out.println(vector[i]);          
            
        }
        
        System.out.println("Indique el numero que desea buscar");
        
        int num= leer.nextInt();
        
        String aux= " ";
        
        for (int i=0; i<n; i++) {
           
            if (vector[i] == num) {
                
                System.out.println(" El numero ingresado " + num + " se encuentra en la posición " + (i+1));
                num++;
            }
            
            
        }
        for (int i=0; i<n; i++) {
            
            if (num<1) {
                System.out.println(" y esta repetido");break;
            } else{
                System.out.println(" y no esta repetido");break;
            }
            }
            
        }
        
        
    }
    

