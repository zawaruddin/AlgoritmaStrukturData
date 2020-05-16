/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package retno;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Cd_Fajar {

    public static void main(String[] args) throws Exception {
        DoubleLinkedList dll = new DoubleLinkedList();
        Scanner fajar = new Scanner(System.in);
        fajar.useDelimiter("\n");
        int pilihan = 0;
        
        do{
            menu();
            System.out.print("Masukkan Pilihan: ");
            pilihan = fajar.nextInt();
            switch(pilihan){
                case 1:
                    System.out.print("Masukkan Kode CD: ");
                    int kdBuku = fajar.nextInt();
                    System.out.print("Masukkan Judul : ");
                    String judul = fajar.next();
                    System.out.print("Masukkan Stok: ");
                    int stok = fajar.nextInt();
                    String keadaan = "Baik";
                    CdObject data = new CdObject(kdBuku, judul, stok, keadaan);
                    dll.addFirst(data);

                    break;
                case 2:
                    System.out.print("Masukkan index: ");
                    int idx = fajar.nextInt();
                    dll.remove(idx);
                    break;
                case 3:
                    System.out.print("Masukkan index: ");
                    idx = fajar.nextInt();
                    dll.addRusak(idx);
                    break;
                case 4:
                    dll.sortList();
                    dll.print();
                    break;
                case 5:
                    System.out.print("Masukkan Kode CD atau Judul");
                    Object key = fajar.next();
                    dll.getFind(key);
                    break;
                case 6:
                    System.exit(0);
                    break;
            }
        }while(pilihan >0 && pilihan < 7);
    }

    public static void menu(){
        System.out.println("1. CD Masuk");
        System.out.println("2. CD Keluar");
        System.out.println("3. CD Rusak");
        System.out.println("4. Tampil data");
        System.out.println("5. Pencarian CD");
        System.out.println("6. Keluar");
    }
}
