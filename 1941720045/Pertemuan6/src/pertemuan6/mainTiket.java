/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan6;
import java.util.Scanner;
/**
 *
 * @author HOSNOL ARIFIN
 */
public class mainTiket {
    public static void main(String[] args) {
         Scanner arif=new Scanner(System.in);
        Scanner Hosnol=new Scanner(System.in);
        PengurutanTiket data=new PengurutanTiket();
        int jmlPesawat=5;
        
        for (int i = 0; i < jmlPesawat; i++) {
            System.out.println("\n------------------------------------");
            System.out.print("Nama Maskapai Penerbangan\t= ");
            String nama= Hosnol.nextLine();
            System.out.print("Harga Tiket\t\t\t= ");
            float harga=arif.nextFloat();
            System.out.print("Available Tiket\t\t= ");
            int available=arif.nextInt();
            System.out.print("Sold Tiket\t\t\t= ");
            int sold=arif.nextInt();
            
            Tiket m= new Tiket(nama,harga,available,sold);
            data.tambah(m);
        }
        System.out.println("\n<<<<<<Data sebelum sorting>>>>>>>");
        data.tampil();
        System.out.println("\n<<<<<<<Data setelah disorting decs Buble Sort berdassarkan harga>>>>>>>>");
        data.bubbleShort();
        data.tampil();
        System.out.println("\n<<<<<<<Data setelah sorting asc Selection Sort berdasarkan harga>>>>>>>");
        data.selectionSort();
        data.tampil();
    }
}