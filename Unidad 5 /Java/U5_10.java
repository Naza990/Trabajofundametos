/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.u5_10;
import java.util.Random;

/**
 *
 * @author conej
 */
public class U5_10 {

    public static void main(String[] args) {
        int  longitud = 12;
        String contrasena = aleatorio(longitud);
        System.out.println("password " + contrasena);
    }
    public static String aleatorio(int longitud){
        //Caracteres 
        String caracteres = "ABCDEFGHIJKLMNÑOPQRSTUVWXYZ0123456789*-._abcdefghijklmnñopqrstuvwxyz";
        Random random = new Random();
        StringBuilder cadena = new StringBuilder(longitud);
        for(int i=0; i< longitud; i++){
            int indiceCaracteres = random.nextInt(caracteres.length());
            cadena.append(caracteres.charAt(indiceCaracteres));
        }
        return cadena.toString();
        
    }
}
   

