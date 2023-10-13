using System;

namespace MyApp // Note: actual namespace depends on the project name.
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int c1, c2 ,c3 ,c4 ,c5 ,c6 ;
            float promedio;
            Console.WriteLine("Escribe tu primera promedio ");
            c1= Convert.ToInt32(Console.ReadLine());

            Console.WriteLine("Escribe tu primera promedio ");
            c2 = Convert.ToInt32(Console.ReadLine());

            Console.WriteLine("Escribe tu primera promedio ");
            c3 = Convert.ToInt32(Console.ReadLine());

            Console.WriteLine("Escribe tu primera promedio ");
            c4= Convert.ToInt32(Console.ReadLine());

            Console.WriteLine("Escribe tu primera promedio ");
            c5 = Convert.ToInt32(Console.ReadLine());

            Console.WriteLine("Escribe tu primera promedio ");
            c6 = Convert.ToInt32(Console.ReadLine());
            promedio= c1 + c2+c3+c4+c5+c6/6:
                Console.WriteLine("Tu promedio es :" + promedio);
        }
    }
}