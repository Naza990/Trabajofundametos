/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.u5_05;
import java.util.Scanner;

/**
 *
 * @author conej
 */
public class U5_05 {

    public static void main(String[] args) {
    Scanner L = new Scanner(System.in);

        System.out.print("Ingrese una cadena o palabras de texto: ");
        String t = L.nextLine();
       
        int CPalabras = Palabras(t);

        System.out.println("Número de palabras: " + CPalabras);

    
    }
  
    public static int Palabras(String texto) {
        if (texto == null || texto.isEmpty()) { //indica que si el texto esta vacio devuelva un valor a 0
            return 0;
        }

        String[] palabras = texto.split("\\s+");
            return palabras.length;
    }
}
    

