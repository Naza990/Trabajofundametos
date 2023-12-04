/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.arreglo19u4;

/**
 *
 * @author conej
 */
public class Arreglo19U4 {

    public static void main(String[] args) {
        int[][] matriz = {{1, 60, 3}, {10, 14, 6}, {12, 4, 9}}; 

        int pares = 0;
        int impares = 0;

         for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] % 2 == 0) {
                    pares++;
                } else {
                    impares++;
                }
            }
        }

        System.out.println("Cantidad de números pares: " + pares);
        System.out.println("Cantidad de números impares: " + impares);
    }
}
