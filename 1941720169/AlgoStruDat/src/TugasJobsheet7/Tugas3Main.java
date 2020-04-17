package TugasJobsheet7;

import java.util.Scanner;

public class Tugas3Main {

    public static void main(String[] args) {
        Scanner dhimas = new Scanner(System.in);
        int data[] = {12, 17, 2, 1, 70, 50, 90, 17, 2, 90};
        Tugas3 t = new Tugas3(data, data.length);
        int posisi;
        System.out.println("Isi Array sebelum sort: ");
        t.tampilData();
        t.insertionSort();
        System.out.println("Isi Array setelah sort: ");
        t.tampilData();
        posisi = t.FindBinarySearch(data[0], 0, t.data.length - 1);
        t.tampilPosisi(data[posisi]);
    }
}
