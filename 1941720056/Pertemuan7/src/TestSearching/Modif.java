
package TestSearching;
import java.util.Scanner;
public class Modif {
    public static void main(String[] args) {
        Scanner retno = new Scanner (System.in);
        System.out.println("Masukkan jumlah elemen : ");
        int jmlelmn = retno.nextInt();
        int data[] = new int [jmlelmn];
        
        for (int i = 0; i < jmlelmn; i++) {
            System.out.print("Masukkan data pada indeks ke-"+i+" : ");
            data[i]=retno.nextInt();
        }
        Searching src = new Searching(data,jmlelmn);
        System.out.println("Array data : ");
        src.TampilData();
        System.out.println("Masukkan data yang akan dicari : ");
        int cari = retno.nextInt();
        System.out.println("Sequential search");
        int posisi=src.FindSeqSearch(cari);
        src.Tampilposisi(cari, posisi);
        System.out.println("=============================");
        System.out.println("Binary Search ");
        System.out.println("setelah data urut :");
        src.Sort();
        src.TampilData();
        posisi=src.FindBinarySearch(cari, 0, data.length-1);
        src.Tampilposisi(cari, posisi);
    }
}
