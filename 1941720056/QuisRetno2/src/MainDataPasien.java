import java.util.Scanner;
import java.util.ArrayList;
public class MainDataPasien {
    public static final ArrayList <KeluhanPasien> list = new ArrayList<KeluhanPasien>();

    public static void main(String[] args) {
        Scanner retno = new Scanner(System.in);
        retno.useDelimiter("\n");
        LinkedListPasien data = new LinkedListPasien();
        System.out.println("Nama\t:Retno Fajar Wulandari");
        System.out.println("NIM\t:1941720056");
        System.out.println();
        System.out.println("---------------------QUIS 2----------------------- ");
        int pilih;

        do {
            System.out.println("============================================");
            System.out.println("                Daftar Keluhan              ");
            System.out.println("============================================");
            add();
            System.out.println("============================================");
            System.out.println("\n");

            System.out.println("--------------------------------");
            System.out.println("              Menu             ");
            System.out.println("--------------------------------");
            menu();
            System.out.println("--------------------------------");
            System.out.print("Pili: ");
            pilih = retno.nextInt();
            System.out.println("--------------------------------");

            switch (pilih) {
                case 1:
                    System.out.print("Masukkan Nama\t\t: ");
                    String nama = retno.next();
                    System.out.print("Masukkan Keluhan [1-9]\t: ");
                    int keluhan = retno.nextInt();

                    if (keluhan < 1 || keluhan > 9) {
                        System.out.println("Masukkan input yang benar");
                    } else {
                        data.insert(new DataPasien(data.getLastNo() +1, nama, keluhan, list.get((keluhan - 1)).getWaktu()));

                        System.out.println("----------------------------------");
                        data.print();
                        System.out.println("----------------------------------");

                        System.out.println("\n");
                    }
                    list.clear();
                    break;
                case 2:
                    try {
                        System.out.println("Pasien tertangani: ");
                        data.remove();
                        System.out.println("--------------------------------");
                    } catch (Exception e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    list.clear();
                    break;
                case 3:
                    data.print();
                    System.out.println("Total antrian: " + data.getSize());
                    System.out.println("Total perkiraan waktu: " + data.getTotalWaktu()+ " Menit");
                    System.out.println("--------------------------------");
                    list.clear();
                    break;
                case 4:
                    System.out.print("Masukkan no antrian: ");
                    int no = retno.nextInt();
                    System.out.println("--------------------------------");
                    System.out.println("Total antrian: " + data.getAntri(no));
                    System.out.println("Total perkiraan waktu: " + data.getWaktuByNum(no)+" Menit");
                    list.clear();
                    break;
                case 5:
                    System.out.print("Masukkan no antrian: ");
                    no = retno.nextInt();
                    System.out.println("--------------------------------");
                    
                    System.out.println("Hasil Pencarian: \n--------------------------------");
                    System.out.println(data.getInfo(no)+"");
                    System.out.println("--------------------------------");
                    
                    list.clear();
                    break;
                case 6:
                    System.out.println("Rata-rata waktu penanganan : " + data.getRata()+ " Menit");
                    list.clear();
                    break;
                case 7:
                    data.infoKeluhan();
                    System.out.println("--------------------------------");
                    list.clear();
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Maaf inputan tidak sesuai");
            }

        } while (pilih >= 0 || pilih <= 7);
    }

    public static void add() {

        KeluhanPasien a = new KeluhanPasien(1, "Demam", 7);
        KeluhanPasien b = new KeluhanPasien(2, "Flu", 5);
        KeluhanPasien c = new KeluhanPasien(3, "Sakit Kepala", 8);
        KeluhanPasien d = new KeluhanPasien(4, "Asma", 4);
        KeluhanPasien e = new KeluhanPasien(5, "Diare", 3);
        KeluhanPasien f = new KeluhanPasien(6, "Sakit Gigi", 11);
        KeluhanPasien g = new KeluhanPasien(7, "Sakit Mata", 13);
        KeluhanPasien h = new KeluhanPasien(8, "Kesleo", 16);
        KeluhanPasien i = new KeluhanPasien(9, "Susah Tidur", 5);

        list.add(a);
        list.add(b);
        list.add(c);
        list.add(d);
        list.add(e);
        list.add(f);
        list.add(g);
        list.add(h);
        list.add(i);

        String format = "%1$-10s|%2$-20s|%3$-10s\n";
        System.out.format(format, "No Pilihan", "Keluhan", "Waktu(Menit)");

        list.forEach((l) -> {
            System.out.format(String.format(format, l.getNo_pilihan(), l.getKeluhan(), l.getWaktu()));
        });
    }

    public static void menu() {
        System.out.println("1. Enqueue");
        System.out.println("2. Dequeue");
        System.out.println("3. Cek Antrian");
        System.out.println("4. Cek Antrian (no)");
        System.out.println("5. Cek Pasien (no)");
        System.out.println("6. Rata-rata Waktu");
        System.out.println("7. Statistik Keluhan");
        System.out.println("0. Keluar");
    }
}
