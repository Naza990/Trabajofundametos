/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.u5_07;
import java.util.Scanner;

/**
 *
 * @author conej
 */
public class U5_07 {

    public static void main(String[] args) {

       Scanner L = new Scanner(System.in);
       double ST, T, I, M;
    
        System.out.print("Ingrese el monto a calcular: $");
        M = L.nextDouble();

        I = CalcularIVA(M);

        T = CalcularTotal(M, I);
        
        ST= CalcularSubTotal(T, I);

      
        
        System.out.println("IVA (16%) es: $" + I);
        System.out.println("Total es: $" + T);
        System.out.println("Subtotal es: $" + ST);

    }

    public static double CalcularIVA(double M) {
        double PorI = 0.16;
        return M * PorI;
    }

    public static double CalcularTotal(double M, double I) {
        return M + I;
    }
    public static double CalcularSubTotal(double T, double I) {
        return T - I;
    }
}
    

