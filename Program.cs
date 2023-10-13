using System;

namespace Codigo8
{
    internal class Program
    {
        static void Main(string[] args)
        {

            int Area, a, p;
            
            Console.Write("Introduce el valor de tu Apotema:");
            a = Console.ReadLine();

            Console.Write("introduce el valor de tu Perimetro:");
            p = Convert.ToInt32(Console.ReadLine());

            Area = (a * p) / 2;
            Console.Write($" El Area de su Hexagono {Area}");

        }
    }
}