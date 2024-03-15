/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package menufiguras;
import java .util.Scanner;

public class Vista  
{
    Scanner a = new Scanner(System.in);
    public int menu()
    {
        System.out.println("Elige una operacion");
        System.out.println("1.-Calcular la area de un cuadrado");
        System.out.println("2.-Calcular la area de un Rectangulo");
        System.out.println("3.-Calcular la area de un Triangulo");
        System.out.println("4.-Calcular la area de un Circulo ");
        System.out.println("5.-Salir");
        return a.nextInt();
        
    }
    
    public int Num1()
    {
        System.out.println("Ingresa el primer dato");
        return a.nextInt();       
    }
    
    public int Num2()
    {
        System.out.println("Ingresa el segundo dato");
        return a.nextInt();       
    }
    
    public void respuesta(double r)
    {
        System.out.println("Tu Area es; " + r);
        
    }
    public void Salida()
    {
        System.out.println("Gracias por visitarnos vuelve pronto owo ");
    }
    
}
