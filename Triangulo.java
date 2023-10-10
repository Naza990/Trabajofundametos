/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.triangulo;
import java.util.Scanner;
/**
 *
 * @author conej
 */
public class Triangulo {

	public static void main(String[] args) {
	    Scanner AP = new Scanner(System.in);
		float A, B,b,h,L1, L2;
		System.out.println("Ingresa el valor de la altura:");
		 h = AP.nextFloat();
		System.out.println("Ingresa el valor de la base:");
		 b = AP.nextFloat();
		System.out.println("Ingresa el valor del lado 1: ");
		 L1 = AP.nextFloat();
		System.out.println("Ingresa el valor del lado 2: ");
	         L2 = AP.nextFloat();
		A = (b * h) / 2;
		B = b + L1 + L2;
		System.out.println("El area es igual a: "+A);
		System.out.println("El perimetro es igual a: "+B);
	}
}
