/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Antrian;
import java.util.Scanner;
/**
 *
 * @author HOSNOL ARIFIN
 */
public class Klinik {
    public static void main(String[] args) {
        
        SingleLinkedList link = new SingleLinkedList();
        Scanner myObj = new Scanner(System.in);
        Boolean run = true;
        int no_urut = 1;
        
        System.out.println("Nama\t: Hosnol Arifin");
        System.out.println("NIM\t: 1941720045\n");
        
        System.out.println("Selamat datang di klnik dr. Watson\n");
        do {
          System.out.println("Apa yang akan anda lakukan?\n");
          System.out.println("1. Daftarkan pasien");
          System.out.println("2. Hapus pasien yang sudah ditangani");
          System.out.println("3. Melihat total antrian dan total waktu tunggu");
          System.out.println("4. Melihat antrian dan waktu tunggu pasien tertentu");
          System.out.println("5. Melihat data pasien tertentu");
          System.out.println("6. Melihat rata-rata waktu penanganan pasien");
          System.out.println("7. Statistik setiap keluhan pasien");
          System.out.println("8. Hapus pasien yang baru datang");
          System.out.println("9. Keluar\n");
          System.out.print("Pilihan anda: ");
          
          int opsi = myObj.nextInt();
          if(opsi == 1){
            
            myObj.nextLine();
            System.out.print("Masukan nama pasien: ");
            String nama = myObj.nextLine();
            
            System.out.print("\n\nJenis keluhan:\n1. Demam\n2. Flu\n3. Sakit Kepala\n4. Asma\n5. Diare\n6. Sakit Gigi\n7. Sakit Mata\n8. Keseleo\n9. Susah Tidur\n\nKeluhan yang dirasakan: ");
            int keluhan = myObj.nextInt();
            
            link.enqueue(no_urut, nama, keluhan);
            link.tampilkan();
            no_urut++;
            
          }else if(opsi == 2){
            
            link.dequeue();
            link.tampilkan();
            
          }else if(opsi == 3){
              
            link.cekAntrian();
            
          }else if(opsi == 4){
              
            myObj.nextLine();
            System.out.print("Masukan no urut pasien: ");
            int no = myObj.nextInt();
            
            link.cekAntrianByNo(no);
            
          }else if(opsi == 5){
              
            myObj.nextLine();
            System.out.print("Masukan no urut pasien: ");
            int no = myObj.nextInt();
            
            link.cekPasienByNo(no);
            
          }else if(opsi == 6){
              
            link.rataWaktu();
            
          }else if(opsi == 7){
              
            link.statistikKeluhan();
            
          }else if(opsi == 8){
              
            link.hapusPasienBaruDatang();
            link.tampilkan();
            no_urut--;
            
          }else if(opsi == 9){
            run = false;
          }
        }
        while (run == true);
        
        System.out.println("Terima kasih sudah berkunjung");
       
    }
}