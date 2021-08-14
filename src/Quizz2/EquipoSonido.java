/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Quizz2;

import Semana13Trabajo.*;
import Poo.Mvc.*;

/**
 *
 * @author Jostin Mora
 */
public class EquipoSonido {
    private String[] arregloAudios;
    private int indice;
    Parlante parlanIzq;
    Parlante parlanDer;
    Parlante subwo;

    public EquipoSonido(int cantidadDeAudios) {
        arregloAudios = new String[cantidadDeAudios];
        indice = 0;
        
        parlanIzq = new Parlante(7,true,'I');
        parlanDer = new Parlante(7,true,'D');
        subwo = new Parlante(7,true,'S');
    }

    public void agregarAudio(String audio) {
        try {
            try {
                arregloAudios[indice++] = audio;
                
                //arregloNotas[indice] = notaEstudiante;
                //indice = indice + 1;

            } catch (ArrayIndexOutOfBoundsException ae) {
                System.out.println("demasiados datos para el vector de audios");
                indice--;
            } 
        }
        catch(Exception e){
                System.out.println("error mas general");
        } 
    }

    public int getIndice() {
        return indice;
    }

    public void setIndice(int indice) {
        this.indice = indice;
    }

    public String getAudio(int i) {
        return arregloAudios[i];
    }

    public String[] getArregloAudios() {
        return arregloAudios;
    }

    public void setArregloAudios(String[] arregloAudios) {
        this.arregloAudios = arregloAudios;
    }
}
