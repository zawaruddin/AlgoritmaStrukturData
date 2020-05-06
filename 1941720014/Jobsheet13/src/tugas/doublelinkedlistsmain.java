package tugas;

import java.util.Scanner;

/**
 *
 * @author Aulafz
 */
public class doublelinkedlistsmain {

    public static void menu() {
        System.out.println();
        System.out.println("DOUBLE LINK LIST DENGAN MENU");
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
        System.out.println("9. Sorting");
        System.out.println("10. Keluar");
        System.out.println("=============================");
    }

    public static void main(String[] args) {
        doublelinkedlists dll = new doublelinkedlists();
        int menu, submenu, data, indeks;
        Scanner aula = new Scanner(System.in);
        try {
            do {
                menu();
                System.out.print(">> ");
                menu = aula.nextInt();
                System.out.println("=============================");
                System.out.println();

                switch (menu) {
                    case 1:
                        System.out.print("Masukan data : ");
                        data = aula.nextInt();
                        dll.addFirst(data);
                        break;
                    case 2:
                        System.out.print("Masukan data : ");
                        data = aula.nextInt();
                        dll.addLast(data);
                        break;
                    case 3:
                        System.out.print("Masukan data : ");
                        data = aula.nextInt();
                        System.out.print("Masukkan Posisi indeks data : ");
                        indeks = aula.nextInt();
                        dll.add(data, indeks);
                        break;
                    case 4:
                        dll.removeFirst();
                        break;
                    case 5:
                        dll.removeLast();
                        break;
                    case 6:
                        System.out.print("Masukkan Posisi indeks data : ");
                        indeks = aula.nextInt();
                        dll.remove(indeks);
                        break;
                    case 7:
                        dll.print();
                        break;
                    case 8:
                        System.out.print("Masukan data yang ingin dicari : ");
                        data = aula.nextInt();
                        dll.cari(data);
                        break;
                    case 9:
                        System.out.println("1. Ascending");
                        System.out.println("2. Descending");
                        System.out.println("---------------");
                        System.out.print("Masukkan submenu (1/2) = ");
                        submenu = aula.nextInt();
                        switch (submenu) {
                            case 1:
                                dll.Ascending();
                                break;
                            case 2:
                                dll.Descending();
                                break;
                            default:
                                System.out.println("Pilihan yang anda masukkan tidak tersedia");
                        }
                        dll.print();
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
