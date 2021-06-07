/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Semana3Trabajos;

/**
 *
 * @author Jostin Mora
 */
public class Metodos {
    static int iva = 100;
    /**
     * Este metodo calcula la suma de dos numeros
     * @param numero1
     * @param numero2
     * @return retorna un numero entero int
     */
    public static int sumar(int numero1, int numero2) {
        int resultado;
        resultado = numero1 + numero2 + iva;
        return resultado;
    }
    /**
     * Este metodo calcula una suma de dos numeros tipo float
     * @param numero1
     * @param numero2
     * @return 
     */
    public static float sumar(float numero1, float numero2) {
        float resultado;
        resultado = numero1 + numero2 + iva;
        return resultado;
    }
    /**
     * Este metodo calcula la multiplicacion de dos numeros
     * @param numero1
     * @param numero2
     * @return 
     */
    public static int multiplicar(int numero1, int numero2) {
        int resultado;
        int mult = numero1 * numero2;
        resultado = sumar(mult,iva);
        return resultado;
    }
    /**
     * Este metodo calcula la multiplicacion de tres numeros
     * @param numero1
     * @param numero2
     * @param numero3
     * @return 
     */
    public static int multiplicar(int numero1, int numero2,int numero3) {
        int resultado;
        resultado = (numero1 * numero2 * numero3) + iva;
        return resultado;
    }
    /**
     * 
     * @param args 
     */
    public static void main(String[] args) {
        
        int salarioBase = 14244;
        int bonoVentas = 234562;
        
        float resultadoParaJefe;
        
        resultadoParaJefe = multiplicar(salarioBase,bonoVentas);
        
        System.out.println(resultadoParaJefe);
        
    }
}
