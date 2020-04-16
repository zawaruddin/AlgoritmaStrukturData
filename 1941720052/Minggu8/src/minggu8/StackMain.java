/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu8;

/**
 *
 * @author Windows 10
 */
import java.util.Scanner;

public class StackMain {
    static int jumlah;
    static Scanner luluk = new Scanner(System.in);
    static Scanner mufida = new Scanner(System.in);
    static Stack tumpukan = new Stack(jumlah);

    public static void main(String[] args) {
        System.out.print("Masukkan jumlah elemen stack: ");
        jumlah = luluk.nextInt();
        

        for (int i = jumlah-1; i >= 0; i--) {
            System.out.print("Masukkan tumpukan indeks ke-" + i + " : ");
            tumpukan.data[i] = luluk.nextInt();
            tumpukan.push(tumpukan.data[i]);
        }
    }
    public void menu(){
        System.out.println("Pilihan Menu untuk Anda :");
        System.out.println("1. Lihat Isi Stack\n2. Lihat elemen teratas dari stack\n3. Menambahkan isi stack\n4. Mengeluarkan elemen teratas dari stack");
        System.out.println("=================================================");
        System.out.print("Masukkan pilihan anda(1/2/3/4): ");
        int pilihan = luluk.nextInt();
        switch(pilihan){
            case 1 :
                tumpukan.print();
                break;
            case 2 :
                tumpukan.peek();
                break;
            case 3 :
                tumpukan.push(jumlah);
                break;
            case 4 :
                tumpukan.pop();
                break;
            default :
                System.out.println("Pilihan menu yang Anda masukkan tidak tersedia");
                   
        }
    }
}
