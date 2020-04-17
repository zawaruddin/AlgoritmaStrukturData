package TugasJobsheet10;

import java.util.Scanner;

public class NasabahMain {

    public static void menu() {
        System.out.println("Masukkan operasi yang diinginkan:");
        System.out.println("1. Enqueue");
        System.out.println("2. Dequeue");
        System.out.println("3. Print");
        System.out.println("4. Peek Front");
        System.out.println("5. Peek Rear");
        System.out.println("6. Peek Position");
        System.out.println("7. Peek Nasabah");
        System.out.println("------------------");
    }

    public static void main(String[] args) {
        Scanner dhimas = new Scanner(System.in);
        Scanner arbi = new Scanner(System.in);

        System.out.print("Masukkan jumlah maksimal antrian: ");
        int n = dhimas.nextInt();

        Queue Q = new Queue(n);
        int pilih;
        do {
            menu();
            pilih = dhimas.nextInt();
            switch (pilih) {
                case 1:
                    System.out.print("Masukkan nama nasabah: ");
                    String dataNama = arbi.nextLine();
                    System.out.print("Masukkan no rekening : ");
                    String dataRek = arbi.nextLine();
                    Nasabah N = new Nasabah(dataRek, dataNama);
                    Q.Enqueue(N);
                    break;
                case 2:
                    String dataKeluar[] = Q.Dequeue();
                    if (dataKeluar != null) {
                        System.out.println("Data yang dikeluarkan: " + dataKeluar);
                        break;
                    }
                case 3:
                    Q.print();
                    break;
                case 4:
                    Q.peek();
                    break;
                case 5:
                    Q.peekRear();
                    break;
                case 6:
                    System.out.println("");
                    Q.print();
                    System.out.print("Masukkan nama nasabah: ");
                    dataNama = arbi.nextLine();
                    System.out.print("Masukkan no rekening : ");
                    dataRek = arbi.nextLine();
                    Nasabah nas = new Nasabah(dataRek, dataNama);
                    Q.peekPosition(nas);
                    break;
                case 7:
                    System.out.print("Tampilkan data pada antrian indeks ke-");
                    int position = dhimas.nextInt();
                    Q.printNasabah(position);
            }
        } while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4 || pilih == 5 || pilih == 6 || pilih == 7);
    }
}
