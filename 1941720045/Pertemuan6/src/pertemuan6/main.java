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
public class main {
    public static void main(String[] args) {
        Scanner arif=new Scanner(System.in);
        Scanner Hosnol=new Scanner(System.in);
        DaftarMahasiswaBerprestasi data=new DaftarMahasiswaBerprestasi();
        int jumlMhs=5;
        
        for (int i = 0; i < jumlMhs; i++) {
            System.out.print("\nNama = ");
            String nama= Hosnol.nextLine();
            System.out.print("Thn masuk = ");
            int thn=arif.nextInt();
            System.out.print("Umur = ");
            int umur=arif.nextInt();
            System.out.print("IPK = ");
            double ipk=arif.nextDouble();
            
            Mahasiswa m= new Mahasiswa(nama,thn,umur,ipk);
            data.tambah(m);
        }
        System.out.println("\nData mahasiswa sebelum sorting = ");
        data.tampil();
        System.out.println("Data mahasiswa setelah disorting decs berdassarkan ipk = ");
        data.bumbleSort();
        data.tampil();
        System.out.println("Data mahasiswa setelah sorting asc berdasarkan ipk = ");
        data.selectionSort();
        data.tampil();
        System.out.println("Data setelah di Insertion sort = ");
        data.InsertionSort();
        data.tampil();
    }
}
