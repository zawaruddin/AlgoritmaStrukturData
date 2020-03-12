package Minggu5;
import java.util.Locale;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner dhimas = new Scanner(System.in);
        Scanner arbi = new Scanner(System.in).useLocale(Locale.US);
        DaftarMahasiswaBerprestasi data = new DaftarMahasiswaBerprestasi();
        int juMhs = 5;
        
        for(int i=0;i<juMhs;i++){
            System.out.print("Nama = ");
            String nama = dhimas.nextLine();
            System.out.print("Tahun masuk = ");
            int thn = arbi.nextInt();
            System.out.print("Umur = ");
            int umur = arbi.nextInt();
            System.out.print("IPK = ");
            double ipk = arbi.nextDouble();
            
            Mahasiswa m = new Mahasiswa(nama,thn,umur,ipk);
            data.tambah(m);
        }
        System.out.println("");
        System.out.println("Data Mahasiswa Sebelum Sorting");
        data.tampil();
        System.out.println("Data mahasiswa setelah sorting desc berdasar ipk=");
        data.bubbleSort();
        data.tampil();
        System.out.println("");
        System.out.println("Data mahasiswa setelah sorting asc berdasar ipk=");
        data.selectionSort();
        data.tampil();
        System.out.println("");
        System.out.println("Data mahasiswa setelah sorting asc berdasar ipk=");
        data.insertionSort(true); // true untuk ascending
        data.tampil();
        System.out.println("Data mahasiswa setelah sorting desc berdasar ipk=");
        data.insertionSort(false); // false untuk descending
        data.tampil();
    }
}
