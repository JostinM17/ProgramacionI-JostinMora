/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Semana8Trabajos;

/**
 *
 * @author Jostin Mora
 */
public class Casting {
    public static void main(String[] args) {
        int a = 50000;
        short b = 32767;
        
        System.out.println("Valor a = "+a);
        System.out.println("Valor a = "+b);
        
       
        b = (short)a;
        
        
        System.out.println("Valor a = "+b);
       
        double f = 200;
        float g = 400;
        System.out.println("Valor a = "+f);
        System.out.println("Valor a = "+g);
        
       
        g = (float)f;
        
        
        System.out.println("Valor a = "+g);
        
        
        
    }
}
