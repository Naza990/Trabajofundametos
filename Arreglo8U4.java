
package com.mycompany.arreglo8u4;
import java.util.Arrays;
/**
 *
 * @author conej
 */
public class Arreglo8U4 {

    public static void main(String[] args) {
       
   
        int[] arr = {5, 2, 10, 4, 8, 7};
        int n = arr.length;

        int[] pares = new int[n];
        int[] impares = new int[n];
        int CP = 0;
        int CI = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                pares[CP] = arr[i];
                CP++;
            } else {
                impares[CI] = arr[i];
                CI++;
            }
        }
        
        System.out.println("Pares: " + Arrays.toString(pares));
        System.out.println("Impares: " + Arrays.toString(impares));
    }
}
