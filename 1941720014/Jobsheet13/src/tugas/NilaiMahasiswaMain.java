package tugas;

import java.util.Scanner;

/**
 *
 * @author Aulafz
 */
public class NilaiMahasiswaMain {

    public static void menu() {
        System.out.println();
        System.out.println("DOUBLE LINK LIST DENGAN MENU");
        System.out.println("\tNILAI MAHASISWA");
        System.out.println("=============================");
        System.out.println("Memilih menu");
        System.out.println("1. Tambah Awal");
        System.out.println("2. Tambah Akhir");
        System.out.println("3. Tambah Data Indeks Tertentu");
        System.out.println("4. Hapus Awal");
        System.out.println("5. Hapus Akhir");
        System.out.println("6. Hapus Indeks Tertentu");
        System.out.println("7. Cetak Data");
        System.out.println("8. Cari");
        System.out.println("9. Sorting Descending");
        System.out.println("10. Keluar");
        System.out.println("=============================");
    }

    public static void main(String[] args) {
        NilaiMahasiswa nm = new NilaiMahasiswa();
        int menu, nilai, indeks;
        String nama;
        Scanner aula = new Scanner(System.in);
        Scanner farida = new Scanner(System.in);
        try {
            do {
                menu();
                System.out.print(">> ");
                menu = aula.nextInt();
                System.out.println("=============================");
                System.out.println();

                switch (menu) {
                    case 1:
                        System.out.print("Masukan nama : ");
                        nama = farida.nextLine();
                        System.out.print("Masukan nilai : ");
                        nilai = aula.nextInt();
                        nm.addFirst(nama, nilai);
                        break;
                    case 2:
                        System.out.print("Masukan nama : ");
                        nama = farida.nextLine();
                        System.out.print("Masukan nilai : ");
                        nilai = aula.nextInt();
                        nm.addLast(nama, nilai);
                        break;
                    case 3:
                        System.out.print("Masukan nama : ");
                        nama = farida.nextLine();
                        System.out.print("Masukan nilai : ");
                        nilai = aula.nextInt();
                        System.out.print("Masukkan Posisi indeks data : ");
                        indeks = aula.nextInt();
                        nm.add(nama, nilai, indeks);
                        break;
                    case 4:
                        nm.removeFirst();
                        break;
                    case 5:
                        nm.removeLast();
                        break;
                    case 6:
                        System.out.print("Masukkan Posisi indeks data : ");
                        indeks = aula.nextInt();
                        nm.remove(indeks);
                        break;
                    case 7:
                        nm.print();
                        break;
                    case 8:
                        System.out.print("Masukan nama yang ingin dicari : ");
                        nama = farida.nextLine();
                        nm.cari(nama);
                        break;
                    case 9:
                        nm.Descending();
                        nm.print();
                        break;
                    case 10:
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Pilihan yang anda masukkan tidak tersedia");
                }
            } while (menu == 1 || menu == 2 || menu == 3 || menu == 4 || menu == 5 || menu == 6 || menu == 7 || menu == 8 || menu == 9 || menu == 10);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
