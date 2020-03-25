
package TugasPertemuan7;
import java.util.Scanner;
public class mainTugas3 {
    public static void main(String[] args) {
        Scanner retno = new Scanner (System.in);
        int data[] ={12,17,2,1,70,50,90,17,2,90};
        Tugas3 search = new Tugas3(data,data.length);

        int posisi;
        System.out.println("Isi Array: ");
        search.tampilData();
        search.insertionSort();
        System.out.println("Setelah: ");
        search.tampilData();
        posisi = search.FindBinarySearch(data[0], 0, search.data.length - 1);
        search.tampilPosisi(data[posisi]);
}
}