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
 */
public class Eje11bis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el numero de motor");
        int motor= leer.nextInt();
        
        switch (motor){
            case 1:
                System.out.println("La bomba " + motor + " es una bomba de agua"); break;
            case 2:
                System.out.println("La bomba " + motor + " es una bomba de gasolina");break;
            case 3:
                System.out.println("La bomba " + motor + " es una bomba de hormigón");break;
            case 4:
                 System.out.println("La bomba " + motor + "es una bomba de pasta alimenticia");break;
            default:
                System.out.println("No existe un valor válido para tipo de bomba");break;
        }
    }
    
}
