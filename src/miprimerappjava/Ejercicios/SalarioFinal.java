/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miprimerappjava.Ejercicios;


public class SalarioFinal {
    public static void main(String[] args) {
       int salarioDiario, horasExtras, salarioFinal, renta;
       /*NumberFormat formato = new DecimalFormat("#0.00");*/
       salarioDiario = 10;
       horasExtras = 50;
       salarioFinal =  (int) Math.sqrt(salarioDiario + horasExtras);
       
        System.out.println("El salario del mes con el 10% de descuento de renta es " + salarioFinal);
    }
    
}
