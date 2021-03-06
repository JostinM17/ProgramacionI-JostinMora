/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Semana13Trabajo;

import Poo.Mvc.*;

/**
 *
 * @author Jostin Mora
 */
public class Nota {
    private double[] arregloNotas;
    private String[] arregloCiclos;
    private int indice;

    public Nota(int cantidadDeNotas) {
        arregloNotas = new double[cantidadDeNotas];
        arregloCiclos = new String[cantidadDeNotas];
        indice = 0;
    }

    public void agregarNota(double notaEstudiante, String ciclo) {
        try {
        
            try {
                arregloNotas[indice] = notaEstudiante;
                arregloCiclos[indice] = ciclo;
                indice++;
                
                
                //arregloNotas[indice] = notaEstudiante;
                //indice = indice + 1;

            } catch (ArrayIndexOutOfBoundsException ae) {
                System.out.println("demasiados datos para el vector de quices");
               //indice--;
            } 
        }
        catch(Exception e){
                System.out.println("error mas general");
        } 
    }

    public int getIndice() {
        return indice;
    }

    public double getNota(int i) {
        return arregloNotas[i];
    }
    
    public double getCiclo(int i) {
        return arregloNotas[i];
    }
    

    public double[] getArregloNotas() {
        return arregloNotas;
    }

    public void setArregloNotas(double[] arregloNotas) {
        this.arregloNotas = arregloNotas;
    }
    
    public String[] getArregloCiclos() {
        return arregloCiclos;
    }

    public void setArregloCiclos(String[] arregloNotas) {
        this.arregloCiclos = arregloCiclos;
    }
}
