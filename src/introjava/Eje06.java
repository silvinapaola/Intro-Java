/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introjava;

/**
 *
 * @author Silvina Paola
 * 
 * Implementar un programa que dado dos números enteros determine cuál es el
mayor y lo muestre por pantalla.
 */
public class Eje06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num1;
        int num2;
        int mayor;
        
        num1= 6;
        num2= 10;
        
        if (num1>num2) {
            mayor= num1;
        }else {
          mayor= num2;    
          }
        System.out.println("El numero mas alto es " + mayor); 
    }
    
}
