/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Semana9Trabajos;

/**
 *
 * @author Jostin Mora
 */
public class TexterArrg {
    
    public static void main(String[] args) {
        //Arreglos arreglos = new Arreglos();
        //arreglos.llenarArreglo();
        //System.out.println(arreglos.imprimirArreglo());
        
        ArreglosPrimos a = new ArreglosPrimos();
        a.setTamanho(25);
        a.solicitarDatosUsuario();
        System.out.println(a.imprimirArreglo());
    }
}
