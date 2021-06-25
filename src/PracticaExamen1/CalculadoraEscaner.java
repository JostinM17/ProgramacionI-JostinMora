/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PracticaExamen1;

import java.util.Scanner;

/**
 *
 * @author Jostin Mora
 */
public class CalculadoraEscaner {
    public float promedio(int a, int b){
        float resultado;
        
        resultado = a + b;
        resultado = resultado / 2;
        
        return resultado;
    }
    
    public static void main(String[] args) {
        int num1;
        int num2;
        float resultado;
        Scanner f23frr = new Scanner(System.in);
        
        System.out.println ("Favor digite un numero: ");
        num1 = f23frr.nextInt();
        
        System.out.println("Favor digite otro numero: ");
        num2 = f23frr.nextInt();
        
        CalculadoraEscaner calc = new CalculadoraEscaner();
        resultado = calc.promedio(num2, num2);
        System.out.println("Resultado es: "+resultado);
        
    }
}
}
