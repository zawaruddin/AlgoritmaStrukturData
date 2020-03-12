package pertemuan5;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner irul=new Scanner(System.in);
        Scanner udin=new Scanner(System.in);
        DaftarMahasiswaBerprestasi data = new DaftarMahasiswaBerprestasi();
        int jumMhs=5;
        
        for (int i=0; i<jumMhs; i++){
            System.out.print("Nama = ");
            String nama = udin.nextLine();
            System.out.print("Thn masuk = ");
            int thn = irul.nextInt();
            System.out.print("Umur = ");
            int umur = irul.nextInt();
            System.out.print("IPK = ");
            double ipk = irul.nextDouble();
            
            Mahasiswa m = new Mahasiswa(nama, thn, umur, ipk);
            data.tambah(m);
        }
        
        System.out.println("Data mahasiswa sebelum sorting = ");
        data.tampil();
        
        System.out.println("Data mahasiswa setelah sorting asc berdasarkan ipk = ");
        data.selectionSort();
        data.tampil();
        
        System.out.println("Data setelah di Insertion Sort = ");
        data.insertionSort(true);
        data.tampil();
    }
}
