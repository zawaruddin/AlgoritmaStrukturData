import java.util.Scanner;
public class ArrayNilaiAlgoritma {
    public static void main(String[] args) {
        Scanner retno = new Scanner(System.in);
        Scanner fajar = new Scanner (System.in);
        double rataRata = 0;
         System.out.println("Masukkan jumlah siswa : ");
         int n= fajar.nextInt();
         
         NilaiAlgoritma[]arrNA = new NilaiAlgoritma[n];
         
         for (int i = 0; i < n; i++) {
            arrNA[i] = new NilaiAlgoritma();
             System.out.println("===================");
             System.out.println("Siswa "+(i+1));
             System.out.println("===================");
             System.out.print("Masukkan Nama : ");
             arrNA[i].namaMhs=retno.nextLine();
             System.out.print("Masukkan Nilai Tugas : ");
             arrNA[i].nilaiTugas = fajar.nextInt();
             System.out.print("Masukkan Nilai Kuis : ");
             arrNA[i].nilaiKuis = fajar.nextInt();
             System.out.print("Masukkan Nilai UTS : ");
             arrNA[i].nilaiUTS = fajar.nextInt();
             System.out.print("Masukkan Nilai UAS : ");
             arrNA[i].nilaiUAS = fajar.nextInt();
             
             
        }
          System.out.println();
         for (int i = 0; i < n; i++) {
             System.out.println("Nama Siswa "+(i+1)+" : "+arrNA[i].namaMhs);
             System.out.println("Nilai : "  +arrNA[i].hitungTotalNilai(arrNA[i].nilaiTugas, arrNA[i].nilaiKuis, arrNA[i].nilaiUTS, arrNA[i].nilaiUAS));
             System.out.println("------------------------------------------");
        }
         for (int i = 0; i < n; i++) {
           rataRata += arrNA[i].hitungTotalNilai(arrNA[i].nilaiTugas, arrNA[i].nilaiKuis, arrNA[i].nilaiUTS, arrNA[i].nilaiUAS); 
        }
         rataRata /= n;
         System.out.println("Nilai Rata-Rata Seluruh Mahasiswa : "+rataRata);
    }
}
