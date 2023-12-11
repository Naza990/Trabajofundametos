using System;

class Program
{
    static void Main()
    {
        int TC = 10;
        double SM = 0;

        Console.WriteLine("Ingrese las 10 calificaciones:");

        for (int i = 1; i <= TC; i++)
        {
            Console.Write($"Calificación {i}: ");
            double calificacion = Convert.ToDouble(Console.ReadLine());

            // Asegurarse de que la calificación esté en un rango válido (por ejemplo, 0-100)
            if (calificacion < 0 || calificacion > 100)
            {
                Console.WriteLine("Ingrese una calificación válida (entre 0 y 100).");
                i--; // Decrementar el índice para volver a solicitar la misma calificación.
            }
            else
            {
                SM += calificacion;
            }
        }

        double promedio = SM/ TC;

        Console.WriteLine($"El promedio de las {TC} calificaciones es: {promedio}");
    }
}

