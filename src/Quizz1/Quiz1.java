/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Quizz1;

import java.util.Scanner;

/**
 *
 * @author Jostin Mora
 */
public class Quiz1 {

    /**
     * Este metodo te factura la pizza que quieras.
     * @param ingredientes ingredientes es el numero de ingredientes de su pizza.
     * @return resultado de tu orden
     */
    public float pizza(int ingredientes){
        float resultado;
        resultado = ingredientes ; 
        return resultado;
    }
    
    public static void main(String[] args){
        Scanner escaner = new Scanner(System.in);
        
        System.out.println("Pizzeria La Favorita");
        System.out.println("¿Desea el primer ingrediente?");
        int ingrediente1 = escaner.nextInt();
        
        System.out.println("¿Desea el segundo ingrediente?");
        int ingrediente2 = escaner.nextInt();
        
        System.out.println("¿Desea el tercer ingrediente?");
        int ingrediente3 = escaner.nextInt();
        
        System.out.println(ingrediente1 + ingrediente2 + ingrediente3);
    }
    
}
