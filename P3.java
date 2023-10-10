/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.p3;
import java.util.Scanner;
/**
 *
 * @author perla
 */
public class P3 {

    public static void main(String[] args) {
    Scanner it= new Scanner(System.in );
    double p1, p2, p3, subtotal, total,iva;
    final double IVA= 0.16; // constante 
     System.out.print("Escribe el precio");//3 
     p1= it.nextDouble();//4 
    System.out.print("Escribe el precio");//2 
     p2= it.nextDouble();//4 
     System.out.print("Escribe el precio");//2 
     p3= it.nextDouble();//4 
     total=p1 +p2 + p3;
     subtotal= total + IVA; 
     System.out.println("total:"+ total);
     System.out.println("iva:"+ IVA);
     System.out.println("subtotal: "+ subtotal);
    }}
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     