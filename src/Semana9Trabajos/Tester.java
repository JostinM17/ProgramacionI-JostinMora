/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Semana9Trabajos;

import java.util.Scanner;

/**
 *
 * @author Jostin Mora
 */
public class Tester {
    String NOMBRE_EMPRESA = "GALLITO";
    
    public static void main(String[] args) {
        double tasa = 0.5;
        
        Repaso repasoHoy = new Repaso();
        double impuestoPagar = repasoHoy.calcularImpuesto(3, 1000000,tasa);
        
        Scanner escaner = new Scanner(System.in);
        int ssss = escaner.nextInt();
        
  
        
    } 
}
