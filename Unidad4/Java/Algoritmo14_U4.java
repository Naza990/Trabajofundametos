/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.algoritmo14_u4;

/**
 *
 * @author conej
 */
public class Algoritmo14_U4 {

    public static void main(String[] args) {
        int[][] matriz = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        
        int sumaTotal = 0;
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                sumaTotal += matriz[i][j];
            }
        }
        System.out.println("La suma de todos los elementos de la matriz es: " + sumaTotal);
    }
}
        
    

