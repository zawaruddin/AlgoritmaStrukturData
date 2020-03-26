/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum;

import java.util.Scanner;

/**
 *
 * @author Daffa Cahyo
 */
public class StackMain {

    static Scanner daffa = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Masukkan jumlah data: ");
        int input = daffa.nextInt();
        int a[] = {input};
        Stack tumpukan = new Stack(input);

        for (int i = 0; i < input; i++) {
            System.out.print("Masukkan angka ke-" +(i+1)+ ": ");
            int angka = daffa.nextInt();
            tumpukan.push(angka);
        }
        tumpukan.print();
        tumpukan.pop();
        tumpukan.peek();
        tumpukan.print();
    }
}
