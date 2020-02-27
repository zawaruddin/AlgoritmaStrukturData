import java.util.Scanner;
public class nilaiAlgoritmaDC {
    public static void main(String[] args) {
   Scanner retno = new Scanner(System.in);
   Scanner fajar = new Scanner(System.in);
   int jumlah;
   double total,rataRata=0,jumlahRatarata=0;
   
        System.out.print("Masukkan jumlah mahasiswa : ");
        jumlah = fajar.nextInt();
        
        classnilaiAlgoritmaDC [] arrDC = new classnilaiAlgoritmaDC[jumlah];
        
        for (int i = 0; i < jumlah; i++) {
            arrDC[i] = new classnilaiAlgoritmaDC();
            System.out.println("===================");
             System.out.println("Siswa "+(i+1));
             System.out.println("===================");
             System.out.print("Masukkan Nama : ");
             arrDC[i].namaMhs=retno.nextLine();
             System.out.print("Masukkan Nilai Tugas : ");
             arrDC[i].nilaiTugas = fajar.nextInt();
             System.out.print("Masukkan Nilai Kuis : ");
             arrDC[i].nilaiKuis = fajar.nextInt();
             System.out.print("Masukkan Nilai UTS : ");
             arrDC[i].nilaiUTS = fajar.nextInt();
             System.out.print("Masukkan Nilai UAS : ");
             arrDC[i].nilaiUAS = fajar.nextInt();
        }
        
        for (int i = 0; i < jumlah; i++) {
            System.out.println("Nama Siswa "+(i+1)+" : "+arrDC[i].namaMhs);
             System.out.println("Nilai : "  +arrDC[i].hitungTotalNilai());
             System.out.println("------------------------------------------");
        }
        
        jumlahRatarata = jumlahratarata(jumlah-1,arrDC);
        rataRata = jumlahRatarata/jumlah;
        
        System.out.println("--------------------------------------------------");
        System.out.println("Rata Rata seluruh Mahasiswa : "+ rataRata);
}
        static double jumlahratarata(int n,classnilaiAlgoritmaDC[] nilai){
            if (n<0){
                return 0;
            }
            return nilai[n].hitungTotalNilai()+jumlahratarata(n-1,nilai);
        }
}

