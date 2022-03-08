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
 * 
 * Escribir un programa que lea un número entero por teclado y muestre por pantalla
el doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función
Math.sqrt().
 */
public class Eje05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        int num;
        System.out.println("Ingrese un numero");
        num = leer.nextInt();
        
        double xdos;
        double xtres;
        double raiz;
        
        xdos = num*2;
        xtres = num*3;
        raiz = Math.sqrt(num);
        
        System.out.println("El doble de numero "+ num + "es " + xdos + " y su triple es " + xtres + " y su raiz cuadrada es " + raiz);
        
        
        
       
       
        
        
        
        
                
                
    }
    
}
