/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Semana10;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Jostin Mora
 */
public class Calculadora {
     public float promedio(int a, int b){
        float resultado;
        
        resultado = a + b;
        resultado = resultado / 2;
        
        return resultado;
    }
    
    public static void main(String[] args) {
        
        if(args==null || args.length==0){
            System.out.println("Debe digitar 1 Terminal 2 Interfaz Grafica");
        }
        else{
            if(args[0].equals("1")){
                porTerminal();
            }
            else{
                conGUI();
            }
        }
    }
    
    public static void porTerminal(){
        int num1;
        int num2;
        float resultado;
        Scanner f23frr = new Scanner(System.in);
        
        System.out.println ("Favor digite un numero: ");
        num1 = f23frr.nextInt();
        
        System.out.println("Favor digite otro numero: ");
        num2 = f23frr.nextInt();
        
        Calculadora calc = new Calculadora();
        resultado = calc.promedio(num2, num2);
        System.out.println("Resultado es: "+resultado);
        
    }
    public static void conGUI(){
        int num1;
        int num2;
        float resultado;
        
        String num1Texto = JOptionPane.showInputDialog(null, "Favor digite un numero: ");
        
        num1 = Integer.parseInt(num1Texto);
        
        String num2Texto = JOptionPane.showInputDialog(null, "Favor digite un numero: ");
        
        num2 = Integer.parseInt(num2Texto);
        
        Calculadora calc = new Calculadora();
        resultado = calc.promedio(num2, num2);
     
        JOptionPane.showMessageDialog(null, "Resultado es: "+resultado);
    }

}
