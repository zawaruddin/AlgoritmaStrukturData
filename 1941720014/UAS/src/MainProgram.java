
import java.util.Scanner;

/**
 *
 * @author Aulafz
 */
public class MainProgram {

    public static void menu() {
        System.out.println("Pilih Menu : ");
        System.out.println("1. Buku Masuk");
        System.out.println("2. Buku Keluar");
        System.out.println("3. Buku Rusak");
        System.out.println("4. Tampilkan semua data");
        System.out.println("5. Cari Buku");
        System.out.println("6. Exit");
        System.out.println("=============================");
    }

    public static void main(String[] args) throws Exception {
        DoubleLinkedList dll = new DoubleLinkedList();
        int menu, index, kode, stok, rusak, submenu, jumlah;
        String judul, penerbit;
        Scanner aula = new Scanner(System.in);
        Scanner farida = new Scanner(System.in);
        do {
            Buku_Aula data = new Buku_Aula();
            menu();
            System.out.print("Masukkan pilihan menu : ");
            menu = aula.nextInt();
            System.out.println("=============================");
            switch (menu) {
                case 1:
                    System.out.print("Kode : ");
                    data.kode = aula.nextInt();
                    System.out.print("Judul : ");
                    data.judul = farida.nextLine();
                    System.out.print("Penerbit : ");
                    data.penerbit = farida.nextLine();
                    System.out.print("Jumlah Stok : ");
                    data.stok = aula.nextInt();
                    System.out.print("Jumlah Rusak : ");
                    data.rusak = aula.nextInt();
                    System.out.println("=============================");
                    dll.addFirst(data);
                    break;
                case 2:
                    System.out.print("Masukkan indeks buku : ");
                    index = aula.nextInt();
                    System.out.println("=============================");
                    dll.remove(index);
                    break;
                case 3:
                    System.out.print("Masukkan indeks buku rusak : ");
                    index = aula.nextInt();
                    System.out.print("Jumlah : ");
                    jumlah = aula.nextInt();
                    System.out.println("=============================");
                    dll.bukuRusak(index, jumlah);
                    break;
                case 4:
                    dll.sorting();
                    dll.print();
                    break;
                case 5:
                    System.out.println("SUBMENU : ");
                    System.out.println("1. Berdasarkan judul");
                    System.out.println("2. Berdasarkan penerbit");
                    System.out.println("=============================");
                    System.out.print("Masukkan pilihan Submenu (1/2) >> ");
                    submenu = aula.nextInt();
                    switch (submenu) {
                        case 1:
                            System.out.print("Masukkan judul buku : ");
                            judul = farida.nextLine();
                            dll.searchJudul(judul);
                            break;
                        case 2:
                            System.out.print("Masukkan penerbit : ");
                            penerbit = farida.nextLine();
                            dll.searchPenerbit(penerbit);
                            break;
                        default:
                            System.out.println("Submenu yang diinputkan tidak tersedia!");
                    }
                    break;
                case 6:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Menu yang anda inputkan tidak tersedia!");
            }
        } while (menu > 0 && menu < 7);

    }
}
