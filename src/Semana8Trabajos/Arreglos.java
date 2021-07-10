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
public class Arreglos {
    public static void main(String[] args) {
        
        String[] motosEnduro = {"Yamaha","Suzuki","Honda","KTM"};
        
        for (int i=0; i < motosEnduro.length;i++){
            System.out.println(motosEnduro[i]);
            System.out.println("-------------");
        }
        
        
        
        
        int[] arreglo ={2,5,8,1,0};
        int n = arreglo.length;
        
        for(int i=0; i < arreglo.length-1  ;i++){
            
            System.out.println(arreglo[i]);
        }
        for(int i=n-1; i > 0  ;i--){
            
            System.out.println(arreglo[i]);
        }
        
        
        
        
        boolean[] numeros;
        numeros = new boolean[100];
        numeros [30] = true;
        
        n = numeros.length;
        for(int i=0; i <=n-1  ;i++){
            
            System.out.println(numeros[i]);
        }
        
        
        
        int[] cajas;
        cajas = new int[100];
        
        n = cajas.length;
        for(int i=0; i <= n-1  ;i++){
            cajas[i] = i;
        }
                n = cajas.length;
        for(int i=0; i <= n-1  ;i++){
            System.out.println(cajas[i]);
        }
        
        
          
     
    }
}
