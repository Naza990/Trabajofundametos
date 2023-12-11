/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.actividad1u5;

/**
 *
 * @author conej
 */
public class Actividad1U5 {

    public static void main(String[] args) {

         System.out.println( "suma = " + suma (7,87) );
         System.out.println( "resta = " + resta (10,25));
         System.out.println( "multiplicación = " + multiplicacion (29,50));
         System.out.println( "división = " + division (39, 21));

    }
//Método o función 
    public static int suma(int a, int b){

        int s = a + b;
        return s;
    }
    public static int resta(int a, int b){
        int r = a - b;
        return r;
    }
    public static int multiplicacion(int a, int b){
        int m = a * b;
        return m;
    }
    public static int division(int a, int b){
        int d  = a / b;
        return d;
    }
}
    

