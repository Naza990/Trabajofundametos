﻿using System;

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

            if (calificacion < 0 || calificacion > 100)
            {
                Console.WriteLine("Ingrese una calificación válida (entre 0 y 100).");
                i--;
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

