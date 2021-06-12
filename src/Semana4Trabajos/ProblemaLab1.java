/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Semana4Trabajos;

import java.util.Scanner;

/**
 *
 * @author Jostin Mora
 */
public class ProblemaLab1 {

    /**
     * Este metodo te dice que dia te vacunan:
     * @param numRiesgos
     * @return
     */
    public String vacunaRiesgos(short numRiesgos){
        String resultado;
       
        if (numRiesgos == 1){
            resultado = "1 SEMANA";
        }
        else if(numRiesgos == 2){
            resultado = "3 DIAS";
        }
        else{
            resultado= "DIA SIGUIENTE";
        }
        return resultado;
    }
}
