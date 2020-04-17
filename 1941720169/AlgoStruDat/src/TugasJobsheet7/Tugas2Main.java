package TugasJobsheet7;
import java.util.Scanner;
public class Tugas2Main {

    public static void main(String[] args) {
        Scanner dhimas = new Scanner(System.in);
        int data[][] = {{45, 78, 7, 200, 80}, 
                        {90, 1, 17, 100, 50}, 
                        {21, 2, 40, 18, 65}};
        Tugas2 cari = new Tugas2(data);
        System.out.println("Isi Array: ");
        cari.tampilData();
        System.out.print("Masukkan angka yang dicari: ");
        int x = dhimas.nextInt();
        System.out.println("Menggunakan Sequential Search");
        int posisi[] = cari.FindSeqSearch(x);
        if (posisi[0] != -1 && posisi[1] != -1) {
            System.out.println("data: " + x + " ditemukan pada baris ke-" + (posisi[0]+1)+" dan kolom ke-"+(posisi[1]+1));
        } else {
            System.out.println("data: " + x + " tidak ditemukan");
        }
    }
}
