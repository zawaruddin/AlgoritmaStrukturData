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
public class nomor1 {
    
    static Scanner daffa = new Scanner(System.in);
    
    public static void main(String[] args) {
        Scanner daffa = new Scanner(System.in);

        System.out.print("Masukkan kalimat\t: ");
        String kalimat = daffa.nextLine();
        String kata[] = kalimat.split("\\s+");
        nomor1 tumpukan = new nomor1(kata.length);

        for (int i = 0; i < kata.length; i++) {
            tumpukan.push(kata[i]);
        }

        tumpukan.print();

        tumpukan.pop();
        tumpukan.peek();
        tumpukan.print();
    }

    int size, top;
    String data[];

    public nomor1() {

    }

    public nomor1(int size) {
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
            System.out.println("Stack penuh!");
        }
    }

    public void pop() {
        if (!IsEmpty()) {
            String x = data[top];
            top--;
            System.out.println("\nData yang keluar: " + x);
        } else {
            System.out.println("Stack masih kosong");
        }
    }

    public void peek() {
        System.out.println("\nElemen teratas " + data[top]);
    }

    public void print() {
        System.out.println("\nIsi stack: ");
        for (int i = top; i >= 0; i--) {
            System.out.println(data[i]);
        }
    }

    public void clear() {
        if (!IsEmpty()) {
            for (int i = top; i >= 0; i--) {
                top--;
            }
            System.out.println("Stack telah dikosongkan");
        } else {
            System.out.println("Gagal! Stack kosong");
        }
    }
}
