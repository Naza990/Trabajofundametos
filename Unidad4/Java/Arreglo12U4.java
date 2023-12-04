/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.arreglo12u4;

/**
 *
 * @author conej
 */
public class Arreglo12U4 {

    public static void main(String[] args) {
        int[][] calificaciones = {{80, 90, 75}, {95, 85, 70}, {60, 88, 77}};

        for (int i = 0; i < 3; i++) {
            System.out.print("Las calificaciones del estudiante " + (i + 1) + " son: ");
            for (int j = 0; j < 3; j++) {
                System.out.print(calificaciones[i][j] + " ");
            }
            System.out.println();
        }
    }
}
    

