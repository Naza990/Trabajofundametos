/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.arreglo15u4;

/**
 *
 * @author conej
 */
public class Arreglo15U4 {

    public static void main(String[] args) {
        int[][] matriz = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        for (int i = 0; i < matriz.length; i++) {
            int suma = 0;
            for (int j = 0; j < matriz[i].length; j++) {
                suma += matriz[i][j];
            }
            double media = (double) suma / matriz[i].length;
            System.out.println("La media de la fila " + (i + 1) + " es: " + media);
        }
    }
}

