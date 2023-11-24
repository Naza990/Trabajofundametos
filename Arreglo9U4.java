/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.arreglo9u4;
import java.util.Arrays;
/**
 *
 * @author conej
 */
public class Arreglo9U4 {

    public static void main(String[] args) {
     
        String[] nombres = {"Juan", "María", "Carlos"};
        String[] apellidos = {"Pérez", "Gómez", "López"};
        int n = nombres.length;
      

        String[] resultado = new String[n];

        for (int i = 0; i < n; i++) {
            resultado[i] = nombres[i] + " " + apellidos[i];
        }

        System.out.println("Arreglo resultado: " + Arrays.toString(resultado));
    }
}
