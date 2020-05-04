package TugasJobsheet12;

import java.util.Scanner;

/**
 *
 * @author dhimas
 */
public class SortDLLMain {
    public static void menu() {
        System.out.println("Memilih Menu");
        System.out.println("1. Tambah Awal");
        System.out.println("2. Tambah Akhir");
        System.out.println("3. Tambah Data Indeks Tertentu");
        System.out.println("4. Hapus Awal");
        System.out.println("5. Hapus Akhir");
        System.out.println("6. Hapus Index Tertentu");
        System.out.println("7. Cetak Data");
        System.out.println("8. Cari");
        System.out.println("9. Sort Data");
        System.out.println("10. Keluar");
        System.out.println("==============================");
    }
    
    public static void main(String[] args) {
        Scanner dhimas = new Scanner(System.in);
        SortDLL dll = new SortDLL();
        int pilih, index, item;
        try {
            do {
                System.out.println("DOUBLE LINKED LIST DENGAN MENU");
                System.out.println("==============================");
                menu();
                System.out.print(">> ");
                pilih = dhimas.nextInt();
                System.out.println("==============================");
                switch (pilih) {
                    case 1:
                        System.out.print("Masukkan data : ");
                        item = dhimas.nextInt();
                        dll.addFirst(item);
                        break;
                    case 2:
                        System.out.print("Masukkan data : ");
                        item = dhimas.nextInt();
                        dll.addLast(item);
                        break;
                    case 3:
                        System.out.print("Masukkan data : ");
                        item = dhimas.nextInt();
                        System.out.print("Masukkan posisi indeks data : ");
                        index = dhimas.nextInt();
                        dll.add(item, index);
                        break;
                    case 4:
                        dll.removeFirst();
                        break;
                    case 5:
                        dll.removeLast();
                        break;
                    case 6:
                        System.out.print("Masukkan posisi indeks data : ");
                        index = dhimas.nextInt();
                        dll.remove(index);
                        break;
                    case 7:
                        dll.print();
                        break;
                    case 8:
                        System.out.print("Masukkan data : ");
                        item = dhimas.nextInt();
                        dll.cari(item);
                        break;
                    case 9:
                        Node1 tmp = dll.head;
                        System.out.println("Data belum terurut:");
                        dll.print();
                        dll.bubbleSort(tmp);
                        System.out.println("\n===================");
                        System.out.println("Data setelah terurut(ASC):");
                        dll.print();
                        System.out.println("");
                        break;
                    case 10:
                        System.out.println("Aplikasi keluar");
                        System.exit(0);
                }
            } while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4 || pilih == 5 || pilih == 6 || pilih == 7 || pilih == 8||pilih==9);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
