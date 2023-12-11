/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.u5_02;
import java.util.Scanner;

/**
 *
 * @author conej
 */
public class U5_02 {

    public static void main(String[] args) {
        Scanner L = new Scanner(System.in);
        int opcion;
        System.out.println("Elige el tipo de conversion a realizar");
        System.out.println("1. Temperatura °C a °F");
        System.out.println("2. Temperatura °F a °K");
        System.out.println("3. Medida pulagadas a metros");
        System.out.println("4. Tiempo horas a segundos");
        opcion = L.nextInt();
        switch (opcion){
            case 1:
                double c;
                System.out.println("Escribe los °C a convertir  ");
                c  = L.nextDouble();
                System.out.println("Tu resultado es: " + temperaturaCF(c));
                        break;
            case 2:
                System.out.println("Tu resultado es: " + temperaturaFK());
                break;
            case 3:
                medida();
                break;
            case 4:
                System.out.println(tiempo());
            default:
                System.out.println("La opcion es incorrecta");
                break;
        }
        
    }
    
    public static double temperaturaCF(double c){
        double resultado = (c*1.8)+32;
        return resultado;
    }
    public static double temperaturaFK(){
        Scanner L = new Scanner(System.in);
        double F, resultado;
        System.out.println("Escribe la termperatura °K a convertir: ");
        F = L.nextDouble();
        resultado = (F-32)*(5/9) + 273.15;
        return resultado;
        
    }
    public static void medida(){
        Scanner L = new Scanner(System.in);
        double p, resultado;
        System.out.print("Escribe la medida en pulgudas: ");
        p = L.nextDouble();
        resultado = p / 39.37;
        System.out.println("Tu resultado es: " + resultado);
    }
    public static double tiempo(){
        Scanner L = new Scanner(System.in);
        double h,resultado = 0;
        System.out.print("Escribe las horas a convertir: ");
        h = L.nextDouble();
        return resultado = h*3600;
    }
}


