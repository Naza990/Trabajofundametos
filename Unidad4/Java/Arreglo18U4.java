/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.arreglo18u4;

/**
 *
 * @author conej
 */
public class Arreglo18U4 {

    public static void main(String[] args) {
        int[][] matriz = {{1, 2, 3}, {4, 8, 6}, {3, 8, 10}};

        int SUMA1 = 0;
        int SUMA2 = 0;

        for (int i = 0; i < matriz.length; i++) {
            SUMA1 += matriz[i][i];
            SUMA2 += matriz[i][matriz.length - 1 - i];
        }

        System.out.println("Suma de la diagonal principal: " + SUMA1);
        System.out.println("Suma de la diagonal secundaria: " + SUMA2);
    }
  
    }
    
