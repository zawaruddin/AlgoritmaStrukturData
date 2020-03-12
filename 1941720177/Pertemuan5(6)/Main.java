/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu5;
import java.util.Scanner;
/**
 *
 * @author WINDOWS 10
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        DaftarMahasiwaBerprestasi data = new DaftarMahasiwaBerprestasi();
        int jumMhs = 5;
        for (int i = 0; i < jumMhs; i++) {
            System.out.print("Nama = ");
            String nama = sc1.nextLine();
            System.out.print("Thn masuk = ");
            int thn = sc.nextInt();
            System.out.print("Umur = ");
            int umur = sc.nextInt();
            System.out.print("IPK = ");
            double ipk = sc.nextDouble();
            
            Mahasiswa m = new Mahasiswa(nama,thn,umur,ipk);
            data.tambah(m);
        }
        System.out.println("=======================================");
        System.out.println("Data mahasiswa sebelum sorting = ");
        data.tampil();
        System.out.println("=======================================");
        System.out.println("Data Mahasiswa setelah sorting desc berdasar ipk = ");
        data.bubbleSort();
        data.tampil();
        System.out.println("=======================================");
        System.out.println("Data Setelah di Insertion Sort");
        data.insertionSort(true);
        data.tampil();
    }
}
