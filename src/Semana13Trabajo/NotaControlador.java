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
public class NotaControlador {

    private Nota nota;
    private NotaVista nv;
    
    public NotaControlador(){
        nota = new Nota(0);
        nv = new NotaVista(nota);
    }
    
    public void iniciar() {
        int op;
        do {
            op = nv.getOpcion();
            switch (op) {
                case 1:
                    if(nota.getArregloNotas().length==0){
                        int cant = nv.leaTamanoArreglo();
                        double[] elNuevoArreglo = new double[cant];
                        nota.setArregloNotas(elNuevoArreglo);
                        
                        String[] elNuevoArregloCiclos = new String[cant];
                        nota.setArregloCiclos(elNuevoArregloCiclos);
                    }
                    
                    nv.leaNota();
                    break;
                case 2:
                    nv.muestreNotas();
                    break;
                default:
            }
        } while (op != 3);
    }
}
