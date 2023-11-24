/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.arreglo4u4;

/**
 *
 * @author conej
 */
public class Arreglo4U4 {
    public static void main(String[] args) {
        int[] arreglo= {5, -2, -9, 0, -3, 7, -1};
        int CN = 0;

        for 
                (int i = 0; i<arreglo.length; i++) {
        
            if (arreglo[i] < 0) {
                CN ++;
            }
        }

        System.out.println("El total de números negativos en el arreglo es: " + CN);
    }
}
