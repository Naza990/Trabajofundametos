/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.u5_08;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author conej
 */
public class U5_08 {

    public static void main(String[] args) {
        Scanner L = new Scanner(System.in);

        
        System.out.print("Ingrese el número de lanzamientos: ");
        int NL = L.nextInt();

       
        for (int i = 0; i < NL; i++) {
            int RD1 = LanzarDado();
            int RD2 = LanzarDado();

            System.out.println("Lanzamiento " + (i + 1) + ": Dado 1 = " + RD1 + ", Dado 2 = " + RD2);
        }

      
    }

    public static int LanzarDado() {
        Random random = new Random();
        return random.nextInt(6) + 1;
    }
}
 
    

