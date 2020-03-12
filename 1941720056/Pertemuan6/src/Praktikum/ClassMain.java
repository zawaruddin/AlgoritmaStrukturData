package Praktikum;
import java.util.Scanner;
public class ClassMain {
    public static void main(String[] args) {
        Scanner retno = new Scanner(System.in);
        Scanner fajar = new Scanner (System.in);
        DaftarMahasiswaBerprestasi data = new DaftarMahasiswaBerprestasi();
        int jumMhs=5;
        
        for (int i = 0; i < jumMhs; i++) {
            System.out.print("Nama : ");
            String nama = fajar.nextLine();
            System.out.print("Tahun Masuk : ");
            int thn = retno.nextInt();
            System.out.print("Umur : ");
            int umur = retno.nextInt();
            System.out.print("IPK : ");
            double ipk = retno.nextDouble();
            
            Mahasiswa m = new Mahasiswa (nama,thn,umur,ipk);
            data.tambah(m);
        }
        
        System.out.println("Data Mahasiswa sebelum sorting : ");
        data.tampil();
        System.out.println("Data Mahasiswa setelah sorting desc berdasar ipk : ");
        data.bubbleSort();
        data.tampil();
        System.out.println("Data Mahasiswa setelah sorting asc berdasar ipk : ");
        data.selectionSort();
        data.tampil();
        System.out.println("Data Setelah insertion sort :");
        data.insertionSort(true);
        data.tampil();
    }
}
