/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.u5_09;
import java.util.Scanner;

/**
 *
 * @author conej
 */
public class U5_09 {

    public static void main(String[] args) {
        Scanner L = new Scanner(System.in);
        double S, F;
        int T , a;
   
        System.out.print("Ingrese el sueldo diario del trabajador: ");
        S = L.nextDouble();

        
        System.out.print("Ingrese el tiempo laborado en días: ");
        T = L.nextInt();
      
       F= CalcularFiniquito(S, T);

        
        System.out.println("El finiquito del trabajador es: $" + F);
 
    }

    public static double CalcularFiniquito(double S, int T) {
       
        return S * T;
    }
}
 
