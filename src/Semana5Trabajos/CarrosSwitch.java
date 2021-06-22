/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Semana5Trabajos;

/**
 *
 * @author Jostin Mora
 */
public class CarrosSwitch {
    public void main (String[] args){
        
        String carros="hyundai";
        
        switch (carros){
            case "bmw": {
                System.out.println("bmw");
                break;
            }
            case "hyundai":{
                System.out.println("hyundai");
                break;
            }
            case "mitsubishi":{
                System.out.println("mitsubishi");
                break;
            }
            default:{
                System.out.println("Estos carros no estan disponibles");
            }
        }
    }
}
