import java.util.Scanner;
public class NilaiMain {
    public static void main(String[] args) {
        Scanner dhimas = new Scanner (System.in);
        System.out.print("Masukkan jumlah Mahasiswa: ");
        int jml = dhimas.nextInt();
        Nilai[] arrN = new Nilai[jml];
        
        for(int i=0;i<arrN.length;i++){
            arrN[i] = new Nilai();
            System.out.println("Mahasiswa "+(i+1)+": ");
            System.out.print("Masukkan nilai 1: ");
            arrN[i].nilai1 = dhimas.nextInt();
            System.out.print("Masukkan nilai 2: ");
            arrN[i].nilai2 = dhimas.nextInt();
        }
        System.out.println("");
        for(int i=0;i<arrN.length;i++){
            System.out.print("Nilai terbaik Mahasiswa ke-"+(i+1)+": ");
            arrN[i].nilaiTerbaik();
        }
    }
}
