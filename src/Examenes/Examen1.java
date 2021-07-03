/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Examenes;

import java.util.Scanner;

/**
 *
 * @author Jostin Mora
 */
public class Examen1 {
    public static void main(String[] args){
        
        String nombreDeEmpresa = "";
        String provincia = "";
        int cantTrabTotl = 0;
        int cantTrabCovid = 0;
        int montoProm = 0;
        boolean creditos = false;

        Scanner escaner = new Scanner(System.in);
        
        while(true){
            System.out.println("Menu Dinamico \n1)Digitar datos de la empresa \n2)"
                    + "Imprimir la informacion de la empresa\n3)"
                    + "Cantidad de personas por provincia\n4)Imprimir monto de prestamo y ajuste\n5)"
                    + "Estado inicial");
            int opcion = escaner.nextInt();
            
            switch(opcion){
                
                case 1:{
                    System.out.println("Digite el nombre de la empresa");
                    nombreDeEmpresa = escaner.next();
                    
                    System.out.println("Digite la provincia donde se ubica");
                    provincia = escaner.next();
                    
                    System.out.println("Digite la cantidad de trabajadores totales");
                    cantTrabTotl = escaner.nextInt();
                    
                    System.out.println("Digite la cantidad de trabajadores que han tenido COVID-19");
                    cantTrabCovid = escaner.nextInt();
                    
                    System.out.println("Digite el ingreso promedio por mes");
                    montoProm = escaner.nextInt();
                    
                    System.out.println("Digite si la empresa tiene creditos o no");
                    creditos = escaner.nextBoolean();
                    break;
                }
                case 2:{
                    System.out.println("Informacion completa de la empresa: "
                            +"\n "+nombreDeEmpresa+"\n "+provincia+"\n"+cantTrabTotl+"\n"+cantTrabCovid
                            +"\n"+montoProm+"\n"+creditos+"\n");
                    break;
                }
                case 3:{
                    break;
                }
                case 4:{
                    break;
                }
                case 5:{
                    break;
                }
                case 6:{
                    break;
                }
            }
        }
    }
    
}
