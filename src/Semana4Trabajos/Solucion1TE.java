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
public class Solucion1TE {
    public double calcularImpuestos (int numDependientes, double salario){
        double resultado=0;
        double montoDependientes = 0;
        if(numDependientes==1){
            resultado = salario*1;
            if(salario<200000){
               resultado = 0;
            }
            else if(salario < 400000){
                resultado = montoDependientes*0.1;
            }
            else if(salario < 600000){
                resultado = montoDependientes*0.15;
            }
            else if(salario < 800000){
                resultado = montoDependientes*0.2;
            }
            else {
                resultado = montoDependientes*0.3;
            }
            
            
            
        }
        else if(numDependientes==2){
            montoDependientes = salario*0.9;
            if(salario<200000){
               resultado = 0;
            }
            else if(salario < 400000){
                resultado = montoDependientes*0.1;
            }
            else if(salario < 600000){
                resultado = montoDependientes*0.15;
            }
            else if(salario < 800000){
                resultado = montoDependientes*0.2;
            }
            else {
                resultado = montoDependientes*0.3;
            }
        }
        else if(numDependientes==3){
            montoDependientes = salario*0.7;
            if(salario<200000){
               resultado = 0;
            }
            else if(salario < 400000){
                resultado = montoDependientes*0.1;
            }
            else if(salario < 600000){
                resultado = montoDependientes*0.15;
            }
            else if(salario < 800000){
                resultado = montoDependientes*0.2;
            }
            else {
                resultado = montoDependientes*0.3;
            }
        }
        else if(numDependientes==4){
            montoDependientes = salario*0.6;
            if(salario<200000){
               resultado = 0;
            }
            else if(salario < 400000){
                resultado = montoDependientes*0.1;
            }
            else if(salario < 600000){
                resultado = montoDependientes*0.15;
            }
            else if(salario < 800000){
                resultado = montoDependientes*0.2;
            }
            else {
                resultado = montoDependientes*0.3;
            }
        }
        else {
            montoDependientes = salario*0.4;
            if(salario<200000){
               resultado = 0;
            }
            else if(salario < 400000){
                resultado = montoDependientes*0.1;
            }
            else if(salario < 600000){
                resultado = montoDependientes*0.15;
            }
            else if(salario < 800000){
                resultado = montoDependientes*0.2;
            }
            else {
                resultado = montoDependientes*0.3;
            }
        }
        
        return resultado;
    }
}
