/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Semana10;

/**
 *
 * @author Jostin Mora
 */
public class TesterMaquiConvertidora {
   public static void main(String[] args) {
        
        Moneda modenaEuro = new Moneda("Euro", 0.8f);
        Moneda modenaColon = new Moneda("Colon", 620);
        Moneda modenaDolar = new Moneda("Dolar", 1);
        
        
        MaquinaConvertidora m = new MaquinaConvertidora();
        double montoDolares = m.convertir(modenaColon, modenaDolar, 1000);
        System.out.println("Monto en Dólares: "+montoDolares);
        
        double montoColones = m.convertir(modenaDolar, modenaColon, 2);
        System.out.println("Monto en Colones: "+montoColones);
    }
}
