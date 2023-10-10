/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.conversor;

import java.util.Scanner;

public class Conversor
{
	public static void main(String[] args) {
		Scanner G = new Scanner(System.in);
		double V;
		
		System.out.println("Ingresa los grados celcius a convertir: ");
		double A = G.nextFloat();
		V = (A * 1.8) + 32;
                System.out.println("los grados celcius " + A+"°C son iguales a: " +V+"°F") ;
	}
}