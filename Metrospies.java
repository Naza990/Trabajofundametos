/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.metrospies;
import java.util.Scanner;
/**
 *
 * @author conej
 */
public class Metrospies {

    public static void main(String[] args) {
        Scanner M = new Scanner(System.in);
		double A;
		
		System.out.println("Ingresa los metros a convertir: ");
		double m = M.nextDouble();
		A = m * 3.281;
		System.out.println(m+"m son iguales a: "+A+"ft");
	}
}
  
