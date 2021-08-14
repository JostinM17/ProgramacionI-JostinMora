/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Quizz2;

/**
 *
 * @author Jostin Mora
 */
public class Parlante {
    int volumen;
    boolean habilitado;
    char tipo; //I Izq, D Derecho y S Sub

    public Parlante(int volumen, boolean habilitado, char tipo) {
        this.volumen = volumen;
        this.habilitado = habilitado;
        this.tipo = tipo;
    }

    
    public int getVolumen() {
        return volumen;
    }

    public void setVolumen(int volumen) {
        this.volumen = volumen;
    }

    public boolean isHabilitado() {
        return habilitado;
    }

    public void setHabilitado(boolean habilitado) {
        this.habilitado = habilitado;
    }

    public char getTipo() {
        return tipo;
    }

    public void setTipo(char tipo) {
        this.tipo = tipo;
    }
    
    
}
