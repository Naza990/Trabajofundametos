using System;

namespace MyApp // Note: actual namespace depends on the project name.
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Console.Write("Ingresa la longitud en metros: ");

            // Lee la entrada del usuario y la convierte a un valor decimal
            if (decimal.TryParse(Console.ReadLine(), out decimal metros))
            {
                // Realiza la conversión de metros a pies
                decimal pies = metros * 3.28084m;

                // Muestra el resultado
                Console.WriteLine($"{metros} metros equivalen a {pies} pies.");
            }
        }
    }
}