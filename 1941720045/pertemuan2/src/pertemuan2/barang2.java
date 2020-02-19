/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan2;
import java.util.Scanner;
/**
 *
 * @author HOSNOL ARIFIN
 */
public class barang2 {
    public String Nama;
    public int hargaSatuan,jumlah;
    
    public int hitungHargaTotal(int hargaTotal){
        hargaTotal=hargaSatuan*jumlah;
        return hargaTotal;
    }
    public int hitungDiskon(int hargaTotal){
          if(hitungHargaTotal(hargaTotal)>1000000){
            int diskon=(int) (hitungHargaTotal(hargaTotal)*0.1);
            return diskon;
          }
          else if (hitungHargaTotal(hargaTotal)>=50000&&hitungHargaTotal(hargaTotal)<=100000){
            int diskon = (int) (hitungHargaTotal(hargaTotal)*0.05);
            return diskon;
          }
          else {
             return 0;
          }
    }
    public int hitungHargaBayar(int hargaTotal){
        return hitungHargaTotal(hargaTotal)-hitungDiskon(hargaTotal);
    }
    public static void main(String[] args) {
        Scanner arif=new Scanner(System.in);
        barang2 br2=new barang2();
        System.out.print("Masukkan nama barang\t: " );
        br2.Nama=arif.nextLine();
        System.out.print("Masukkan harga satuan\t: ");
        br2.hargaSatuan=arif.nextInt();
        System.out.print("Masukkan jumlah\t: ");
        br2.jumlah=arif.nextInt();
        int total1=br2.hitungHargaTotal(0);
        int total2=br2.hitungDiskon(0);
        int total3=br2.hitungHargaBayar(0);
        System.out.println("Nama barang "+br2.Nama);
        System.out.println("Harga satuan Rp "+br2.hargaSatuan);
        System.out.println("Jumlah "+br2.jumlah);
        System.out.println("Harga total Rp "+total1);
        System.out.println("Diskon Rp "+total2);
        System.out.println("Total pembayaran Rp "+total3);
    }
}
