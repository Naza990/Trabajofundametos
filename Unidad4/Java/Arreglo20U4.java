/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.arreglo20u4;

/**
 *
 * @author conej
 */
public class Arreglo20U4 {

    public static void main(String[] args) {
   
        int[][] matrizOriginal = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] matrizElevada = new int[3][3];

        
        for (int i = 0; i < matrizOriginal.length; i++) {
            for (int j = 0; j < matrizOriginal[i].length; j++) {
                matrizElevada[i][j] = matrizOriginal[i][j] * matrizOriginal[i][j];
            }
        }

        System.out.println("Matriz original:");
        imprimirMatriz(matrizOriginal);

        System.out.println("Matriz elevada al cuadrado:");
        imprimirMatriz(matrizElevada);
    }

    // Método para imprimir la matriz
    public static void imprimirMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
