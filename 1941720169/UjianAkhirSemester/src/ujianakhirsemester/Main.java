package ujianakhirsemester;

/**
 *
 * @author Dhimas
 */
import java.util.Scanner;

public class Main {

    public static void menu() {
        System.out.println("PERSEWAAN CD");
        System.out.println("==============================");
        System.out.println("Pilih Menu: ");
        System.out.println("1. CD Masuk");
        System.out.println("2. CD Keluar");
        System.out.println("3. CD Rusak");
        System.out.println("4. Tampilkan Semua Data");
        System.out.println("5. Cari CD");
        System.out.println("6. Exit");
        System.out.println("==============================");
    }

    public static void main(String[] args) throws Exception {
        Scanner dhimas = new Scanner(System.in);
        Scanner arbi = new Scanner(System.in);
        DoubleLinkedlist proses = new DoubleLinkedlist();

        int pilih, index, kode, i = 0, k=100;

        do {
            menu();
            System.out.print("Masukkan pilihan menu : ");
            pilih = dhimas.nextInt();

            CD_Dhimas data = new CD_Dhimas();

            switch (pilih) {
                case 1:
                    i++;
                    k++;
                    System.out.print("Masukkan judul CD: ");
                    data.judul = arbi.nextLine();
                    System.out.print("Masukkan Distributor : ");
                    data.distributor = arbi.nextLine();
                    data.index = i;
                    data.kode = k;
                    data.stok += 1;
                    data.rusak = 0;

                    proses.addLast(data);
                    break;
                case 2:
                    System.out.print("Masukkan urutan CD : ");
                    index = dhimas.nextInt();
                    proses.remove(index);
                    break;
                case 3:
                    System.out.print("Masukkan urutan CD : ");
                    index = dhimas.nextInt();
                    data = proses.get(index);
                    System.out.print("Masukkan jumlah CD Rusak : ");
                    data.rusak = dhimas.nextInt();
//                    Node temp = proses.head;
//                    int i=0;
//                    while(i<index){
//                        temp = temp.next;
//                        i++;
//                    }
                    proses.remove(index);
                    proses.add(data, index);
                    proses.print();
                    break;
                case 4:
                    Node tmp = proses.head;
                    if (tmp.next != null) {
                        proses.sort(tmp);
                    }
                    System.out.println("Index\tKode\tJudul\tDistributor\tStock\tRusak");
                    proses.print();
                    break;
                case 5:
                    System.out.print("Masukkan Kode CD : ");
                    kode = dhimas.nextInt();
                    proses.cari(kode);
                    break;
                case 6:
                    System.out.println("Aplikasi keluar");
                    System.exit(0);
            }
        } while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4 || pilih == 5);
    }
}
