using System;

namespace U5_P5
{
    internal class U5_P5
    {
        static void Main(string[] args)
        {
            Console.Write("Ingrese una cadena o palabras de texto: ");
            string texto = Console.ReadLine();

            int cantidadPalabras = ContarPalabras(texto);

            Console.WriteLine("Número de palabras: " + cantidadPalabras);
        }

        public static int ContarPalabras(string texto)
        {
            if (string.IsNullOrEmpty(texto))
            {
                return 0;
            }

            string[] palabras = texto.Split(new char[] { ' ', '\t', '\n', '\r' }, StringSplitOptions.RemoveEmptyEntries);
            return palabras.Length;
        }
    }

}