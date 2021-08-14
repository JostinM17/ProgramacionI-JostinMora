/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Quizz2;

import Semana13Trabajo.*;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

/**
 *
 * @author Jostin Mora
 */
public class EquipoSonVista {
    private EquipoSonido equipoSonido;

    public EquipoSonVista(EquipoSonido equipoSonido) {
        this.equipoSonido = notaInstanciada;
    }

    EquipoSonVista(EquipoSonido nota) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public int leaTamanoArreglo() {
        return Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de estudiantes."));
    }

    public void leaNota() {
        double notaDigitada;
        
        notaDigitada = Double.parseDouble(JOptionPane.showInputDialog("Nota?"));

        String cicloDigitado;
        
        cicloDigitado = JOptionPane.showInputDialog("Ciclo?");
        
        nota.agregarNota(notaDigitada, cicloDigitado);
    }

    public void muestreNotas() {
        JTextArea jt = new JTextArea();
        for (int i = 0; i < nota.getIndice(); i++) {
            jt.append(nota.getNota(i) + " " + nota.getCiclo(i)+ "\n");
        }
        JOptionPane.showMessageDialog(null, jt);
    }

    public int getOpcion() {
        int r = 0;
        try {
            r = Integer.parseInt(JOptionPane.showInputDialog("1. Agregar nota\n2. Mostrar Notas\n3.Salir"));
            if ((r < 1) || (r > 3)) {
                throw new Exception("# de opcion  es inválido");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return r;
    }
}