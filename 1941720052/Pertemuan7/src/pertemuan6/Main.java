/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan6;

/**
 *
 * @author Windows 10
 */
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner luluk = new Scanner(System.in);
        Scanner mufida = new Scanner(System.in);
        DaftarMahasiswaBerprestasi data = new DaftarMahasiswaBerprestasi();
        int jumMhs = 5;

        for (int i = 0; i < jumMhs; i++) {
            System.out.print("Nama : ");
            String nama = mufida.nextLine();
            System.out.print("Tahun Masuk : ");
            int thn = luluk.nextInt();
            System.out.print("Umur : ");
            int umur = luluk.nextInt();
            System.out.print("IPK : ");
            double ipk = luluk.nextDouble();

            Mahasiswa m = new Mahasiswa(nama, thn, umur, ipk);
            data.tambah(m);

        }
        System.out.println("Data mahasiswa sebelum sorting : ");
        data.tampil();

        System.out.println("Data mahasiswa setelah sorting descending berdasarkan ipk : ");
        data.bubbleSort();
        data.tampil();
        
        System.out.println("Data Mahasiswa setelah sorting ascending berdasarkan ipk : ");
        data.selectionSort();
        data.tampil();
        
        System.out.println("Data setelah Di Insertion Sort : ");
        data.insertSort();
        data.tampil();
    }

}
