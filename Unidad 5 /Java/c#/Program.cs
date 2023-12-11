using System;
using System.Text;

namespace U5_P10
{
    internal class U5_P10
    {
        static void Main(string[] args)
        {
            int longitud = 12;
            string contrasena = Aleatoria(longitud);
            Console.WriteLine("Contraseña: " + contrasena);
        }

        public static string Aleatoria(int longitud)
        {
            string caracteres = "ABCDEFGHIJKLMNÑOPQRSTUVWXYZ0123456789*-._abcdefghijklmnñopqrstuvwxyz";
            Random random = new Random();
            StringBuilder cadena = new StringBuilder(longitud);

            for (int i = 0; i < longitud; i++)
            {
                int indiceCaracteres = random.Next(caracteres.Length);
                cadena.Append(caracteres[indiceCaracteres]);
            }

            return cadena.ToString();
        }
    }
}
