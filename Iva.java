/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.iva;
import java.util.Scanner;
/**
 *
 * @author conej
 */
public class Iva {

    public static void main(String[] args)
    
    {   
        double A = 0, B = 0;
	final double IVA = 0.16;
	Scanner P = new Scanner(System.in);
		
	System.out.println("Ingresa el valor del primer producto: ");
	double P1 = P.nextDouble();
	System.out.println("Ingresa el valor del segundo numero: ");
	double P2 = P.nextDouble();
	System.out.println("Ingresa el valor del tercer numero: ");
	double P3 = P.nextDouble();
	A = P1 + P2 + P3;
	B = A - (A * IVA);
	System.out.println("El precio total es: "+A);
	System.out.println("El subtotal es: "+ B );
    }
}

