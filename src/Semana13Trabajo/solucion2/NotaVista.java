/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Semana13Trabajo.solucion2;

import Poo.Mvc.*;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

/**
 *
 * @author Jostin Mora
 */
public class NotaVista{

    private ExpedienteEstudiante nota;

    public NotaVista(ExpedienteEstudiante notaInstanciada) {
        this.nota = notaInstanciada;
    }
    
    public int leaTamanoArreglo() {
        return Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de cursos de los estudiantes."));
    }

    public void leaNota() {
        String codigoCurso;
        codigoCurso = JOptionPane.showInputDialog("Codigo curso?");
        
        String nombreCurso = null;
        codigoCurso = JOptionPane.showInputDialog("Nombre curso?");
                
        String carne = null;
        codigoCurso = JOptionPane.showInputDialog("Carné?");
                
        String nombreEstudiante = null;
        codigoCurso = JOptionPane.showInputDialog("Nombre estudiante?");
        
        double notaDigitada;
        notaDigitada = Double.parseDouble(JOptionPane.showInputDialog("Nota?"));
        
        Curso c = new Curso(codigoCurso, nombreCurso);
        Estudiante e = new Estudiante(carne, nombreEstudiante);
        CursoEstudiante ce = new CursoEstudiante(c,e,notaDigitada);
        
        nota.agregarRegistro(ce);
    }

    public void muestreNotas() {
        JTextArea jt = new JTextArea();
        for (int i = 0; i < nota.getIndice(); i++) {
            jt.append(
                        nota.getNota(i).getCurso().getCodigo() 
                  + " " + nota.getNota(i).getCurso().getNombre()
                  + " " + nota.getNota(i).getEstudiante().getCarne()
                  + " " + nota.getNota(i).getEstudiante().getNombre()
                  + " " + nota.getNota(i).getNota()
                  + "\n");
        }
        JOptionPane.showMessageDialog(null, jt);
    }

    public int getOpcion() {
        int r = 0;
        try {
            r = Integer.parseInt(JOptionPane.showInputDialog("1. Agregar registro\n2. Mostrar registro\n3.Salir"));
            if ((r < 1) || (r > 3)) {
                throw new Exception("# de opcion  es inválido");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return r;
    }
}
