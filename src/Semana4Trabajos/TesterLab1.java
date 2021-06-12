/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Semana4Trabajos;

/**
 *
 * @author Jostin Mora
 */
public class TesterLab1 {
    public static void main(String[] args){
        ProblemaLab1 solucion = new ProblemaLab1();
        
        short nFactores = 5;
        String mensaje;
        
        mensaje = solucion.vacunaRiesgos(nFactores);
        
        System.out.println(mensaje);
    }
}
