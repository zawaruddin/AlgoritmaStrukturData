
package TugasPertemuan7;
import java.util.Locale;
import java.util.Scanner;
public class mainDataPenduduk {
    public static void main(String[] args) {
        Scanner retno = new Scanner (System.in);
        Scanner fajar = new Scanner (System.in).useLocale(Locale.US);
        System.out.print("Masukkan jumlah data : ");
        int jumlah = fajar.nextInt();
        
        DataPenduduk data = new DataPenduduk(jumlah);
        System.out.println(data.DP.length);
        for (int i = 0; i < jumlah; i++) {
            System.out.println("Penduduk ke-"+(i+1));
            System.out.print("NIK : ");
            int nik = fajar.nextInt();
            System.out.print("Nama : ");
            String nama = retno.nextLine();
            System.out.print("Alamat : ");
            String alamat = retno.nextLine();
            System.out.print("Jenis Kelamin : ");
            String jenisKelamin = retno.nextLine();
            System.out.println("");
            data.DP[i]=new DataPenduduk(nik,nama,alamat,jenisKelamin);
        }
        System.out.println("");
        data.insertionSort();
        System.out.print("Masukkan NIK untuk mencari data : ");
        int cari =fajar.nextInt();
        int posisi = data.FindBinarySearch(cari, 0, jumlah-1);
        data.Tampilposisi(cari, posisi);
    }
}
