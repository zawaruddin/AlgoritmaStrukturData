/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu8;
import java.util.Scanner;
/**
 *
 * @author Rasyed
 */
public class StackMain {
    public static void main(String[] args) {
        int pilihan;
        int data;
        
        Stack tumpukan = new Stack(4);
        do {
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Lihat elemen teratas");
            System.out.println("4. Lihat Isi Data");
            System.out.println("0. Stack kosong");
            Scanner src = new Scanner(System.in);
            System.out.print("Masukkan Pilihan: ");
            pilihan = src.nextInt();
            System.out.println(" ");
            
            if (pilihan==1) {
                System.out.print("Masukkan Data yang ditambahkan : ");
                data = src.nextInt();
                tumpukan.push(data);
            }
            else if (pilihan==2) {
                tumpukan.pop();
            }
            else if (pilihan==3) {
                tumpukan.peek();
            }
            else if (pilihan==4) {
                tumpukan.print();
            }
            else if (pilihan==0) {
                tumpukan.clear();
            }
            else{
                System.out.println("Pilihan Tidak Ada");
            }
        } while (pilihan!=0);         
    }
}