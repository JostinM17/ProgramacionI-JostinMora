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
public class EquipoSonControlador {

    private EquipoSonido equipoSonido;
    private EquipoSonVista vista;
    
    public EquipoSonControlador(){
        equipoSonido = new EquipoSonido(0);
        vista = new EquipoSonVista(equipoSonido);
    }
    
    public void iniciar() {
        int op;
        do {
            op = vista.getOpcion();
            switch (op) {
                case 1:
                    if(equipoSonido.getArregloAudios().length==0){
                        int cant = vista.leaTamanoArreglo();
                        String[] elNuevoArreglo = new String[cant];
                        equipoSonido.setArregloAudios(elNuevoArreglo);
                    }
                    
                    vista.leaNota();
                    break;
                case 2:
                    vista.muestreNotas();
                    break;
                default:
            }
        } while (op != 3);
    }
}
