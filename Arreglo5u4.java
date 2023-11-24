/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.arreglo5u4;

/**
 *
 * @author conej
 */
public class Arreglo5u4 {

    public static void main(String[] args) {
   
        String[] frutas = {"manzana", "Platano ", "naranja", "sandia", "uva"};

        String[] frutasInvertidas = new String[frutas.length];
        for (int i = 0; i < frutas.length; i++) {
            frutasInvertidas[i] = frutas[frutas.length - 1 - i];
        }

        System.out.println("Frutas invertidas:");
        for (String fruta : frutasInvertidas) {
            System.out.println(fruta);
        }
    }
}
   

