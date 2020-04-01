/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas;

/**
 *
 * @author Daffa Cahyo
 */
import java.util.Scanner;
public class nomor2 {

    static Scanner daffa = new Scanner(System.in);
    
    public static void main(String[] args) {
        Scanner daffa = new Scanner(System.in);

        System.out.print("Masukkan kalimat\t: ");
        String kalimat = daffa.nextLine();
        String kata[] = kalimat.split("\\s+");
        nomor2 tumpukan = new nomor2(kata.length);

        for (int i = 0; i < kata.length; i++) {
            tumpukan.push(kata[i]);
        }

        tumpukan.print();
    }

    int size, top;
    String data[];

    public nomor2() {

    }

    public nomor2(int size) {
        this.size = size;
        data = new String[size];
        top = -1;
    }

    public boolean IsEmpty() {
        if (top == -1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean IsFull() {
        if (top == size - 1) {
            return true;
        } else {
            return false;
        }
    }

    public void push(String dt) {
        if (!IsFull()) {
            top++;
            data[top] = dt;
        } else {
            System.out.println("Isi stack penuh!");
        }
    }

    public void print() {
        System.out.print("\nKalimat Dibalik\t\t: ");
        for (int i = top; i >= 0; i--) {
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }
}