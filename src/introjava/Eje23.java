/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introjava;

import java.util.Iterator;


/**
 *
 * @author Silvina Paola
 * 
 * . Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y muestre
la traspuesta de la matriz.
 */
public class Eje23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
      int matriz [][];
      matriz= new int [4][4];
      
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                
                matriz[i][j]= (int) (Math.random()*10);
                
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println(" ");
        }
        
        System.out.println(" ");
      
        // Transposición de la matriz
        int aux;
        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < i; j++) {
                aux= matriz[i][j];
                matriz[i][j]=matriz[j][i];
                matriz[j][i]=aux;
                
               
            }
            
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                
                System.out.print(matriz[i][j]+ " ");
            }
            System.out.println(" ");  
        }
       
    }
    
}
