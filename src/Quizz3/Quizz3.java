/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Quizz3;

/**
 *
 * @author Jostin Mora
 */
public class Quizz3 {
   // 1. Porque no se podria imprimir el resultado esperado. 7 ptos
   // 2. Agregue una clase, pruebe este codigo, agregue un comentario respondiendo la pregunta 1 y suba Git. 3 ptos
    public static void main3(String[] args) {
       Short i = 122, j = 122;
       if (i == j) {
            System.out.println("true");
       } else {
        System.out.println("false");
      }
    }
    public static void main(String[] args) {
       Short i = 1222, j = 1222;
       if (i == j) {
            System.out.println("true");
       } else {
        System.out.println("false");
       }
       System.out.println(" Esto sucede porque se ocupa un metodo main para la clase Quizz3 y si hay 2 metodos main el+"
               + " primero es el que va a tirarnos el true, el siguiente nos va a tirar un false aunque este todo bien. ");
    }
    
}

