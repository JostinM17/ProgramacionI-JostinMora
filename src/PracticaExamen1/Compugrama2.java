/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PracticaExamen1;

/**
 *
 * @author Jostin Mora
 */
public class Compugrama2 {
    public static void main(String[] args) {
        int z = 3;
        
        int i=0;
        while(i<z){
            System.out.print((i+1)+"\t");
            compugrama2();
            i++;
        }
    }
    
   
    public static void compugrama2(){
        int n=5;
        
        int i=1;
        while(i<=n){
            if(i==n){ //si es la ult repeticion
                System.out.print(">\t");
            }
            else{ 
                System.out.print("-\t");
            }
            i++;
        }
        System.out.println();
    }
}
