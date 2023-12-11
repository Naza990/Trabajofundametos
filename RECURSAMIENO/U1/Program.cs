using System;

class Program
{
    static void Main()
    {

        Console.Write("Ingrese el número de días: ");
        int totalDias = Convert.ToInt32(Console.ReadLine());

        // Calcular años, meses, semanas y días
        int A = totalDias / 365;
        int B = totalDias % 365;
        int C = B / 30;
        B = B % 30;
        int semanas = B / 7;
        int dias = B % 7;

        // Mostrar el resultado
        Console.WriteLine($"Corresponden a: {A} años, {C} meses, {semanas} semanas y {dias} días.");
    }
}
