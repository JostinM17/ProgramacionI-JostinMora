/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Semana2Trabajos;

import java.util.Scanner;

/**
 *
 * @author Jostin Mora
 */
public class Contatenar {
    public static void main (String[] args){
        
        Scanner escaner = new Scanner(System.in);
        
        System.out.println(" Universidad Latina de Costa Rica ");
        System.out.println(" Facultad TICs ");
        System.out.println(" Programacion para TI ");
        System.out.println();
        System.out.println("Por favor digite un numero: ");
        
        int num2 = escaner.nextInt();
        System.out.println("Por favor digite otro numero: ");
        
        int box1 = escaner.nextInt();
        
        System.out.println("Resultado: ");
        String nombre = "Jostin Mora";
        
   
        System.out.println(nombre + " " + num2 + " " + box1);
        
    }
}
