/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introjava;

import org.omg.CORBA.FloatHolder;

/**
 *
 * @author Silvina Paola
 * 
 * Dada una cantidad de grados centígrados se debe mostrar su equivalente en
grados Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
 */
public class Eje04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        float centi, fahr;
        
        centi= 35;
        fahr= 32 + (9 * centi/5);
        
        System.out.println("El equivalente de "+centi+" grados centigrados en fahranheit es "+fahr);
    }
    
}
