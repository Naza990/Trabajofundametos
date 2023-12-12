using System;

class Program
{
    static void Main()
    {
        int[] C = new int[10];

        for (int i = 0; i < 10; i++)
        {
            Console.Write($"Ingrese la calificación #{i + 1}: ");
            if (int.TryParse(Console.ReadLine(), out int calificacion))
            {
                C[i] = calificacion;
            }
            else
            {
            }
        }

        Console.WriteLine("\nCalificaciones Ordenadas por Letras:");

        for (int i = 0; i < 10; i++)
        {
            char letra = ObtenerLetraCalificacion(C[i]);
            Console.WriteLine($"Calificación #{i + 1}: {C[i]} - Letra: {letra}");
        }
    }
    static char ObtenerLetraCalificacion(int calificacion)
    {
        if (calificacion >= 100)
            return 'A';
        else if (calificacion >= 90)
            return 'B';
        else if (calificacion >= 80)
            return 'C';
        else if (calificacion >= 70)
            return 'D';
        else if (calificacion >= 60)
            return 'E';
        else
            return 'F';
    }
}
