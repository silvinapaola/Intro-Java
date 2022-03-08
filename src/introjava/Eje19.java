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
 * Crea una aplicación que a través de una función nos convierta una cantidad de
euros introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o
libras. La función tendrá como parámetros, la cantidad de euros y la moneda a
converir que será una cadena, este no devolverá ningún valor y mostrará un
mensaje indicando el cambio (void).
El cambio de divisas es:
 * 0.86 libras es un 1 €
 * 1.28611 $ es un 1 €
 * 129.852 yenes es un 1 €
 */
public class Eje19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        
       double euro=1;
            
        convertor(euro);
    }
    
    public static double convertor(double a){
        Scanner leer=new Scanner(System.in);
       System.out.println("Ingrese la cantidad de Euros a convertir");
        
        double euros= leer.nextDouble(); 
        
        System.out.println("Ingrese 1. para convertir en Yen");
        System.out.println("Ingrese 2. para convertir en Libra");
        System.out.println("Ingrese 3. para convertir en Dolar");
        
         
    
        int respu = leer.nextInt();
        double euro;
        
        switch (respu){
          
            case 1:   System.out.println(euros* 129.852 + " yenes");break;
            
            case 2:   System.out.println(euros *0.86 + " libras");break;
            
            case 3:    System.out.println(euros * 1.28611 + " dolares");break;
        
            
        }
        return respu;
    
    }
    
}
