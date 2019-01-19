using System;
using System.Collections.Generic;
using System.Text;

namespace ConsoleApplication33
{
    class Program
    {
        static void Main(string[] args)
        {
            string cadena = "";
            while ((cadena=Console.ReadLine())!=null)
            {
                int numero = int.Parse(cadena);
                double primero = 0;
                double segundo = 0;
                for (int i = 0; i <= numero; i++)
                {
                    primero += Math.Pow(i, 2);
                    segundo += Math.Pow(i, 3);
                }
                Console.WriteLine((int)primero+" "+(int)segundo);
               
            }
        }
    }
}