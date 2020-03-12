/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author HOSNOL ARIFIN
 */
public class fibonacci {
    
      static int fiboDC(int n){
        if(n == 0 || n == 1){
          return n;
        } else {
          return (fiboDC(n-1) + fiboDC(n-2));
        }
      }
      public static void main(String[]args){
        int j = 0;
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan jumlah deret bilangan fibonacci: ");
        int n = scan.nextInt();
        System.out.print("Hasil bilangan fibonacci: ");
        System.out.println("\n>>Brute Force");
        long fib[] = new long[n];
         
        fib[0] = 0;
        fib[1] = 1;
         
        for(int i = 2; i < n; i++) {
            fib[i] = fib[i-1] + fib[i-2];
        }
        for (int k = 0; k < n; k++) {
         System.out.print(fib[k]+", ");
        }
        System.out.println("\n>>Devite and Conquer");
        for (int i = 0; i < n; i++){
          System.out.print(fiboDC(j)+", ");
          j++;
        }
        System.out.println();
   }
}