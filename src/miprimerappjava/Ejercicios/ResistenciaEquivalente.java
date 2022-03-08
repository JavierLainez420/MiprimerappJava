/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miprimerappjava.Ejercicios;

import java.text.DecimalFormat;
import java.text.NumberFormat;

/**
 *
 * @author ITCA
 */
public class ResistenciaEquivalente {
    public static void main(String[] args) {
        NumberFormat formato = new DecimalFormat("#0.00");
        double R1, R2, R3, R4, sudeno, Reg;
        R1 = 5.1;
        R2 = 68;
        R3 = 75;
        R4 = 82;
        
        sudeno = ((1/R1) + (1/R2) + (1/R3) + (1/R4));
        Reg = 1/sudeno;
        System.out.println(" La ressitencia equivalente es: " + formato.format(Reg));
        
    }
    
}
