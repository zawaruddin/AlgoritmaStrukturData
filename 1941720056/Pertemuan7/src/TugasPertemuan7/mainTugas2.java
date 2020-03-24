
package TugasPertemuan7;
import java.util.Scanner;
public class mainTugas2 {
    public static void main(String[] args) {
        Scanner retno = new Scanner (System.in);
        int data[][]={
            {50,34,67,98,33,12},
            {22,32,66,93,26,46},
            {12,18,58,87,45,57}
        };
        
        Tugas2 search = new Tugas2(data,6);
        System.out.println("Isi Array : ");
        search.tampilData();
        
        System.out.print("Masukkan elemen yang ingin dicari : ");
        int cari = retno.nextInt();
        
        System.out.println("Pencarian data ");
        int posisis[] = search.FindSeqSearch(cari);
        search.tampilPosisi(cari, posisis);
        
        
    }
}
