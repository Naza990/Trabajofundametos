/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.arreglo16u4;

/**
 *
 * @author conej
 */
public class Arreglo16U4 {

    public static void main(String[] args) {
        char[][] matriz = {{'z', 'g', 'f'}, {'d', 'e', 'i'}, {'p', 'o', 'i'}};

        for (int i = matriz.length - 1; i >= 0; i--) {
            for (int j = matriz[i].length - 1; j >= 0; j--) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
