using System;

namespace U5_P2
{
    internal class U5_P2
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Elige el tipo de conversion a realizar");
            Console.WriteLine("1. Temperatura °C a °F");
            Console.WriteLine("2. Temperatura °F a °K");
            Console.WriteLine("3. Medida pulgadas a metros");
            Console.WriteLine("4. Tiempo horas a segundos");

            int opcion = Convert.ToInt32(Console.ReadLine());

            switch (opcion)
            {
                case 1:
                    Console.WriteLine("Escribe los °C a convertir:");
                    double c = Convert.ToDouble(Console.ReadLine());
                    Console.WriteLine("Tu resultado es: " + TemperaturaCF(c));
                    break;
                case 2:
                    Console.WriteLine("Tu resultado es: " + TemperaturaFK());
                    break;
                case 3:
                    Medida();
                    break;
                case 4:
                    Console.WriteLine(Tiempo());
                    break;
                default:
                    Console.WriteLine("La opcion es incorrecta");
                    break;
            }
        }

        public static double TemperaturaCF(double c)
        {
            double resultado = (c * 1.8) + 32;
            return resultado;
        }

        public static double TemperaturaFK()
        {
            Console.WriteLine("Escribe la temperatura °K a convertir: ");
            double F = Convert.ToDouble(Console.ReadLine());
            double resultado = (F - 32) * (5.0 / 9) + 273.15;
            return resultado;
        }

        public static void Medida()
        {
            Console.Write("Escribe la medida en pulgadas: ");
            double p = Convert.ToDouble(Console.ReadLine());
            double resultado = p / 39.37;
            Console.WriteLine("Tu resultado es: " + resultado);
        }

        public static double Tiempo()
        {
            Console.Write("Escribe las horas a convertir: ");
            double h = Convert.ToDouble(Console.ReadLine());
            return h * 3600;
        }
    }
}
