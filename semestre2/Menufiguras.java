/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package menufiguras;

/**
 *
 * @author LaboratorioLTI3
 */
public class Menufiguras {
           
    public static void main(String[] args) 
    {
        Vista v = new Vista ();
        modelo b = new modelo ();
        int a = v.menu(), x, y;       
        double R;
        
        switch(a)
        {
                case 1:
                    x = v.Num1();
                    y = v.Num2();
                    R = b.Cuadrado (x, y);
                    v.respuesta(R);
                    
                break;
                    
                case 2:
                    x = v.Num1();
                    y = v.Num2();
                    R = b.rectangulo(x, y);
                    v.respuesta(R);
                    
                break;
                
                case 3:
                    x = v.Num1();
                    y = v.Num2();
                    R = b.triangulo(x, y);
                    v.respuesta(R);
                    
                break;
                
                case 4:
                    x = v.Num1();
                    R = b.circulo(x);
                    v.respuesta(R);
                    
                break;
                
                case 5:            
                     v.Salida();
                break;
               
                        
               default:
               System.out.println("Opcion no invalida favor de escoger una opcion valida .");

        }
    }
}

   

 