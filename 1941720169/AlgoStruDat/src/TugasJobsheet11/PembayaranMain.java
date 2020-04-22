package TugasJobsheet11;

import java.util.Scanner;

/**
 *
 * @author dhimas
 */
public class PembayaranMain {

    public static void menu() {
        System.out.println("Antrian Pembayaran Obat");
        System.out.println("1. Enqueue");
        System.out.println("2. Dequeue");
        System.out.println("3. Print");
        System.out.println("4. Peek Front");
        System.out.println("5. Peek Rear");
        System.out.println("6. Peek Position");
        System.out.println("7. Peek At-");
        System.out.println("8. Reset antrian");
        System.out.println("------------------");
    }

    public static void main(String[] args) {
        Scanner dhimas = new Scanner(System.in);
        Scanner arbi = new Scanner(System.in);

        LLPembayaran LL = new LLPembayaran();

        int pilih;
        try {
            do {
                menu();
                pilih = dhimas.nextInt();
                LLPembayaran data = new LLPembayaran();
                switch (pilih) {
                    case 1:
                        System.out.print("Masukkan nama: ");
                        data.nama = arbi.nextLine();
                        System.out.print("Masukkan alamat: ");
                        data.alamat = arbi.nextLine();
                        if (LL.isEmpty()) {
                            LL.addFirst(data);
                        } else {
                            LL.addLast(data);
                        }
                        break;
                    case 2:
                        data = LL.Dequeue();
                        if (data != null) {
                            System.out.println("Data yang dikeluarkan: " + data.nama);
                            break;
                        }
                    case 3:
                        LL.print();
                        break;
                    case 4:
                        if (!LL.isEmpty()) {
                            System.out.println("Elemen terdepan: " + LL.getFirst().nama);
                        } else {
                            System.out.println("Antrian masih kosong");
                        }
                        break;
                    case 5:
                        if (!LL.isEmpty()) {
                            System.out.println("Elemen paling belakang: " + LL.getLast().nama);
                        } else {
                            System.out.println("Antrian masih kosong");
                        }
                        break;
                    case 6:
                        System.out.println("");
                        LL.print();
                        System.out.print("Masukkan nama: ");
                        String nama = arbi.nextLine();
                        LL.cari(nama);
                        break;
                    case 7:
                        System.out.print("Tampilkan data pada antrian indeks ke-");
                        int position = dhimas.nextInt();
                        LL.cariByIndex(position);
                        break;
                    case 8:
                        System.out.println("Mereset Antrian");
                        LL.clear();
                        System.out.println("Antrian Direset");
                }
            } while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4 || pilih == 5 || pilih == 6 || pilih == 7 ||pilih == 8);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
