/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas4;

/**
 *
 * @author Daffa Cahyo
 */
import java.util.Scanner;
public class mainFibonacci {
    public static void main(String[] args) {
        Scanner daffa = new Scanner(System.in);
        System.out.print("Masukkan banyaknya angka: ");
        int n = daffa.nextInt();
        
        hitungBF fb = new hitungBF();
        System.out.println("Deret Fibonacci menggunakan Brute Force adalah: ");
        fb.DC(n);
        System.out.println();
        System.out.println("Deret Fibonacci menggunakan Devide and Conquer adalah: ");
        fb.DC(n);
    }
}
//Jumlah Operasi: 1 + 1 + 1 + 1 + 1 + 1 + 1 + 1 + 1
//              : 9 Operasi
//Notasi BigO   : 9 * O(1)
//              : O(1)