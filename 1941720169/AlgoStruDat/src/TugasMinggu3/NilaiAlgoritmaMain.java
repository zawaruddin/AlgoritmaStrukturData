package TugasMinggu3;
import java.util.Scanner;
public class NilaiAlgoritmaMain {
    public static void main(String[] args) {
        Scanner dhimas = new Scanner (System.in);
        Scanner arbi = new Scanner(System.in);
        int total=0 ,jml;
        System.out.print("Masukkan jumlah Mahasiswa: ");
        jml = dhimas.nextInt();
        NilaiAlgoritma[] na = new NilaiAlgoritma[jml];
        
        for(int i =0;i<jml;i++){
            na[i] = new NilaiAlgoritma();
            System.out.println("=================================================");
            System.out.print("Masukkan nama mahasiswa ke-"+(i+1)+" : ");
            na[i].namaMhs = arbi.nextLine();
            System.out.print("Masukkan nilai tugas dari "+na[i].namaMhs+": ");
            na[i].nilaiTugas = dhimas.nextInt();
            System.out.print("Masukkan nilai kuis dari "+na[i].namaMhs+": ");
            na[i].nilaiKuis = dhimas.nextInt();
            System.out.print("Masukkan nilai UTS dari "+na[i].namaMhs+": ");
            na[i].nilaiUTS = dhimas.nextInt();
            System.out.print("Masukkan nilai UAS dari "+na[i].namaMhs+": ");
            na[i].nilaiUAS = dhimas.nextInt();
            System.out.println("=================================================");
        }
        for(int i=0;i<jml;i++){
            total += na[i].hitungTotalNilai(jml);
            System.out.printf("Nilai mahasiswa "+na[i].namaMhs+" adalah %.2f\n",na[i].hitungTotalNilai(jml));
        }
        System.out.printf("Rata-rata total : %.2f\n",(double)(total/jml));
    }
}
