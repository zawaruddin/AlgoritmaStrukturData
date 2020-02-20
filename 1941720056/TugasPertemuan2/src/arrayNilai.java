import java.util.Scanner;
public class arrayNilai {
    public static void main(String[] args) {
        Scanner retno = new Scanner(System.in) ;
        
        System.out.print("Masukkan jumlah mahasiswa : ");
        int n = retno.nextInt();
        
        nilaiMahasiswa []arrNM = new nilaiMahasiswa[n];
        
        for (int i = 0; i < n; i++) {
            arrNM[i] = new nilaiMahasiswa();
            System.out.println("-------------------");
            System.out.println("Mahasiswa "+i);
            
            System.out.print("Masukkan nilai 1 : ");
            arrNM[i].nilai1 = retno.nextInt();
            System.out.print("Masukkan nilai 2 : ");
            arrNM[i].nilai2 = retno.nextInt();
            
        }
        
        System.out.println();
        
        for (int i = 0; i < n; i++) {
            
            System.out.println("Nilai terbaik mahasiswa "+i+" : " +arrNM[i].nilaiTerbaik(arrNM[i].nilai1, arrNM[i].nilai2));
        }
        
    }
}
