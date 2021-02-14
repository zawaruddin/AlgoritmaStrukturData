package percobaan;
import java.util.Scanner;
/**
 *
 * @author Aulafz
 */
public class MainLinkedLists {
    public static void menu() {
        System.out.println("Pilihan menu :");
        System.out.println("1. Tambah");
        System.out.println("2. Hapus");
        System.out.println("3. Cari");
        System.out.println("4. Keluar");
        System.out.println("--------------------------");
    }
    public static void main(String[] args) {
        LinkedLists data = new LinkedLists ();
        int pilih, submenu, angka, indeks;
        Scanner aula = new Scanner (System.in);
        try {
            do {
            menu();
            System.out.print("Masukkan pilihan anda (1/2/3/4) : ");
            pilih = aula.nextInt();
            
            switch (pilih) {
                case 1 :
                    System.out.println("Submenu : ");
                    System.out.println("1. Tambah (First)");
                    System.out.println("2. Tambah (Index)");
                    System.out.println("3. Tambah (Last)");
                    System.out.print("Masukkan pilihan submenu (1/2/3) : ");
                    submenu = aula.nextInt();
                    switch (submenu) {
                        case 1 :
                            System.out.print("Masukkan data : ");
                            angka = aula.nextInt();
                            data.addFirst(angka);
                            break;
                        case 2 :
                            System.out.print("Masukkan data : ");
                            angka = aula.nextInt();
                            System.out.print("Masukkan index : ");
                            indeks = aula.nextInt();
                            data.add(angka, indeks);
                            break;
                        case 3 :
                            System.out.print("Masukkan data : ");
                            angka = aula.nextInt();
                            data.AddLast(angka);
                            break;
                    }
                    data.print();
                    break;
                case 2 :
                    System.out.println("Submenu : ");
                   System.out.println("1. Hapus (Indeks)");
                    System.out.println("2. Hapus (Key)");
                    System.out.println("3. Clear");
                    System.out.println("Masukkan pilihan submenu (1/2/3) : ");
                    submenu = aula.nextInt();
                    switch(submenu) {
                        case 1 :
                            System.out.print("Masukkan indeks : ");
                            indeks = aula.nextInt();
                            data.remove(indeks);
                            break;
                        case 2 :
                            System.out.print("Masukkan data : ");
                            angka = aula.nextInt();
                            data.removeByValue(angka);
                            break;
                        case 3 :
                            data.clear();
                            break;
                    }
                    data.print();
                    break;
                case 3 :
                    System.out.println("Submenu : ");
                    System.out.println("1. Cari (Index) ");
                    System.out.println("2. Cari (Key) ");
                    System.out.print("Masukkan pilihan submenu (1/2/3) :");
                    submenu = aula.nextInt();
                    switch(submenu) {
                        case 1 :
                            System.out.print("Masukkan indeks : ");
                            indeks = aula.nextInt();
                            data.cari(indeks);
                            break;
                        case 2 :
                            System.out.print("Masukkan data : ");
                            angka = aula.nextInt();
                            data.cariKey(angka);
                            break;
                    }
                    break;
                case 4 :
                    System.exit(0);
                    break;
                default :
                    System.out.println("Pilihan yang anda masukkan tidak tersedia");
               
            }
            } while(pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4 );
        
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
