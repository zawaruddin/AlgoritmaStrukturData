
package TugasPertemuan7;
import java.util.Scanner;
public class mainTugas3 {
    public static void main(String[] args) {
        Scanner retno = new Scanner (System.in);
        int data[] ={12,17,2,1,70,50,90,17,2,90};
        Tugas3 search = new Tugas3(data,9);
        System.out.println("Isi array : ");
        search.tampildata();
        
        System.out.print("Masukkan elemen yang ingin dicari : ");
        int cari = retno.nextInt();
        
        
    }
}
