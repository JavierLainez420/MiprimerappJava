/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miprimerappjava.Ejercicios;

/**
 *
 * @author ITCA
 */
public class ValorMonedaPaises {
    public static void main(String[] args) {
        double monedaEuropa, monedaReinoUnido, monedaAustralia, monedaCanada,dolares;
        monedaEuropa = 0.70;
        monedaReinoUnido = 0.61;
        monedaAustralia = 0.95;
        monedaCanada = 0.97;
        dolares = 100.00;
        
        monedaEuropa = monedaEuropa * dolares;
        monedaReinoUnido = monedaReinoUnido * dolares;
        monedaAustralia = monedaAustralia * dolares;
        monedaCanada = monedaCanada * dolares;
        
        System.out.println("Conversion de Moneda de Europa: " + monedaEuropa);
        System.out.println("Conversion de Moneda de Reino Unido: " + monedaReinoUnido);
        System.out.println("Conversion de Moneda de Australia: " + monedaAustralia);
        System.out.println("Conversion de Moneda de Canada: " + monedaCanada);
        
        
    }
}
