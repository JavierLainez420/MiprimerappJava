
package miprimerappjava.Ejercicios;
import java.text.DecimalFormat;
import java.text.NumberFormat;
public class Ejercicio6 {
    public static void main(String[] args) {
        NumberFormat formato; formato = new DecimalFormat ("#0.00");
         
         double parcial1, parcial2, parcial3, parcial4, parcial5, promediofinal;
        
        parcial1 = 8.0;
        parcial2 = 7.5;
        parcial3 = 9.0;
        parcial4 = 8.0;
        parcial5 = 9.0;
        
        promediofinal = (parcial1 * 0.25) + (parcial2 * 0.15 )+ (parcial3 * 0.15 )+ (parcial4 * 0.20) + (parcial5 * 0.25); 
     System.out.println("El promedio final del ciclo del estudiante es :" + formato.format(promediofinal));
    }
}
