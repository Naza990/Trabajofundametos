/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.empleados;
import java.util.Scanner;
/**
 *
 * @author perla
 */
public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int c=1, hrs,pago, sueldo;
        while (c<=20){
            System.out.println("horas que trabajas  ");
           hrs= sc.nextInt();
            System.out.println("Cuanto te pagan por hora ");
            pago=sc.nextInt();
             
            sueldo= pago* hrs ;
            System.out.println("Tu sueldo es" + sueldo  );
            c++;
        }
       
    }
}
