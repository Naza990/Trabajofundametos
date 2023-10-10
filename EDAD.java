/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.edad;
import java. util.Scanner;
/**
 *
 * @author conej
 */
public class EDAD {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        
        System.out.print("Por favor, ingresa tu edad: ");
        int edad = Scanner.nextInt();
        
        if (edad >= 18) {
            System.out.println("Eres mayor de edad. ¡Bienvenido!");
        } else {
            System.out.println("Eres menor de edad. Lo siento.");
        }
        
    }
}

              
	