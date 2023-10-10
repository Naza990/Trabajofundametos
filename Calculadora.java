/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculadora;
import java.util.Scanner;
/**
 *
 * @author conej
 */
public class Calculadora {
    
public static void main(String[] args) 
{
float A, B, C, D;
Scanner Op = new Scanner(System.in);
	
	System.out.println("Ingresa el primer numero: ");
	float N1 = Op.nextFloat();
	System.out.println("Ingresa el segundo numero: ");
	float N2 = Op.nextFloat();
	A = N1 + N2;
	B = N1 - N2;
	C = N1 * N2;
	D = N1 / N2;
	System.out.println("La suma de los numeros es: "+A);
	System.out.println("La resta de los numeros es: "+B);
	System.out.println("La multiplicación de los numeros es: "+C);
	System.out.println("La divición de los numeros es: "+D);
		
	}
}
