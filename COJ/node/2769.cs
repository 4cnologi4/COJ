using System;
using System.Collections.Generic;
using System.Text;
namespace Cpav{
    class MainClass{
        public static void Main (string[] args){
         int n = int.Parse(Console.ReadLine());
         for(int i = 1; i <= n; i++){
            Console.WriteLine(i + ": I am participating in the Engineer's day.");
         }   
      }
   }
}