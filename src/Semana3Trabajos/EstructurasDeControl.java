/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Semana3Trabajos;

import java.util.Scanner;

/**
 *
 * @author Jostin Mora
 */
public class EstructurasDeControl {
    public static void main (String[] args) {
        
        Scanner s = new Scanner (System.in);
        int edad = s.nextInt();
        
        if(edad >= 60){
            int factorRiesgo = 5;
            System.out.println("Es urgente la inyección: " +edad+ " riesgo: "+factorRiesgo);            
        }
        else if(edad >= 40 ){
            System.out.println("Es relativamente urgente la inyección"+edad);
        }
        else{
            System.out.println("No es tan urgente la inyección"+edad);
        }
    }
}
