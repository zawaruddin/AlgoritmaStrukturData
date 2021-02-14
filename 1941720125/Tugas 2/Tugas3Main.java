/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ananda
 */
public class Tugas3Main {
     public static void main(String[]args){
        Tugas3 bayar = new Tugas3();
        bayar.nama = "Albert Wesker";
        bayar.hargaSatuan = 5000 ;
        bayar.jumlah = 15;
        bayar.tampilkan();        
        int hargaTotal = bayar.hitungHargaTotal(1);
        System.out.println("Harga Totalnya = "+hargaTotal);
        if (hargaTotal >100000){
            int Diskon = bayar.hitungDiskon1(1);
            System.out.println("Total Yang Dibayarkan Setelah Diskon : "+(hargaTotal-Diskon));
        }else if(hargaTotal >50000 && hargaTotal<100000){
            int Diskon = bayar.hitungDiskon2(1);
            System.out.println("Total Yang Dibayarkan Setelah Diskon : "+(hargaTotal-Diskon));
        }else if(hargaTotal <50000){
            int Diskon = bayar.hitungDiskon3(1);
            System.out.println("Total Yang Dibayarkan Setelah Diskon : "+(hargaTotal-Diskon));
        }        
    }
}

