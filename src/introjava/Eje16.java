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
 * Realizar un programa que simule el funcionamiento de un dispositivo RS232, este
tipo de dispositivo lee cadenas enviadas por el usuario. Las cadenas deben llegar
con un formato fijo: tienen que ser de un máximo de 5 caracteres de largo, el primer
carácter tiene que ser X y el último tiene que ser una O.
Las secuencias leídas que respeten el formato se consideran correctas, la
secuencia especial “&&&&&” marca el final de los envíos (llamémosla FDE), y toda
secuencia distinta de FDE, que no respete el formato se considera incorrecta.
Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas
correctas e incorrectas recibidas. Para resolver el ejercicio deberá investigar cómo
se utilizan las siguientes funciones de Java Substring(), Length(), equals().
 */
public class Eje16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            Scanner leer =new Scanner(System.in);
            
            
            int centinela =0;
         
             
            do {            
               System.out.println("Ingrese la palabra de 5 digitos");
                String cadena = leer.nextLine();
                int tam= cadena.length();
                   String letra1 =cadena.substring(0);
                   String letra2 =cadena.substring(4);
                
                if (tam !=5) {
                    System.out.println("La cantidad de digitos es incorrecta");
                     centinela=0;
                     
                } else {
                    if (tam==5)  {
                        if (letra1.equals("X")||letra1.equals("x")&& letra2.equals("O")||letra2.equals("o")) {
                            System.out.println("La palabra " +cadena + " ha sido registrada correctamente");
                            centinela=0;
                        } else {
                            System.out.println("Por favor, intente con otra palabra");
                            centinela=0;
                        }
                        if (cadena.equals("&&&&&")) {
                            centinela++;
                        }
                        
                    } 
                }
        } while (centinela==0);
            System.out.println("El programa RS232 a finalizado con éxito");
        }
    }
    

