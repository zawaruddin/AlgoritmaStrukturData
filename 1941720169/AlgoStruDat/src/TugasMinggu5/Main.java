package TugasMinggu5;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner dhimas = new Scanner(System.in);
        String namaPesawat[] = {"Garuda", "Citilink", "Lion", "Batik", "Sriwijaya"};
        float hgSbyJkt[] = {1418000, 634000, 480000, 544000, 502000};
        float hgSbyYog[] = {1741000, 506000, 687000, 1023000, 587000};
        float hgSbyBali[] = {796000, 452000, 303000, 376000, 969000};
        int stokTiket[] = {393, 215, 180, 180, 168};
        int stokTerjual[] = {350, 90, 50, 65, 80};
        int stokAda[] = new int[stokTiket.length];
        Tiket sj = new Tiket(namaPesawat[0], 0, 0, 0), sy = new Tiket(namaPesawat[0], 0, 0, 0), sb = new Tiket(namaPesawat[0], 0, 0, 0);

        for (int i = 0; i < namaPesawat.length; i++) {
            stokAda[i] = stokTiket[i] - stokTerjual[i];
            sj.t[i] = new Tiket(namaPesawat[i], hgSbyJkt[i], stokAda[i], stokTerjual[i]);
            sy.t[i] = new Tiket(namaPesawat[i], hgSbyYog[i], stokAda[i], stokTerjual[i]);
            sb.t[i] = new Tiket(namaPesawat[i], hgSbyBali[i], stokAda[i], stokTerjual[i]);
        }
        System.out.println("Data Sebelum Pengurutan");
        for(int i=0;i<5;i++){
            sj.t[i].tampil();
            System.out.println("---------------------------");
        }
        System.out.print("Fitur urutan\n1. Jumlah Tiket Tersedia\n2. Harga\nPilihan |> ");
        int pilihan = dhimas.nextInt();
        switch (pilihan) {
            case 1:
                sj.urut = pilihan;
                System.out.print("1. Sedikit ke Banyak\n2. Banyak ke Sedikit\nPilihan |> ");
                sj.pilihan = dhimas.nextInt();
                System.out.println("\nData Setelah BubbleSort");
                fungsiBubble(sj);
                System.out.println("\nData Setelah SelectionSort");
                fungsiSelection(sj);
                break;
            case 2:
                sj.urut = pilihan;
                System.out.print("Pilih Tujuan\n1. Surabaya - Jakarta\n2. Surabaya - Yogyakarta\n3. Surabaya - Bali\nPilihan |> ");
                pilihan = dhimas.nextInt();
                System.out.print("Pilih Urutan\n1. Termurah ke Termahal\n2. Termahal ke Termurah\nPilihan |> ");
                if (pilihan == 1) {
                    sj.pilihan = dhimas.nextInt();
                    System.out.println("\nData Setelah BubbleSort");
                    fungsiBubble(sj);
                    System.out.println("\nData Setelah SelectionSort");
                    fungsiSelection(sj);
                } else if (pilihan == 2) {
                    sy.pilihan = dhimas.nextInt();
                    System.out.println("\nData Setelah BubbleSort");
                    fungsiBubble(sy);
                    System.out.println("\nData Setelah SelectionSort");
                    fungsiSelection(sy);
                } else if (pilihan == 3) {
                    sb.pilihan = dhimas.nextInt();
                    System.out.println("\nData Setelah BubbleSort");
                    fungsiBubble(sb);
                    System.out.println("\nData Setelah SelectionSort");
                    fungsiSelection(sb);
                } else {
                    System.out.println("Input salah!!");
                }
                break;
        }
    }

    static void fungsiBubble(Tiket m) {
        m.bubbleSort();
        for (int i = 0; i < 5; i++) {
            m.t[i].tampil();
            System.out.println("---------------------------");
        }
        
    }

    static void fungsiSelection(Tiket m) {
        m.selectionSort();
        for (int i = 0; i < 5; i++) {
            m.t[i].tampil();
            System.out.println("---------------------------");
        }
    }
}
