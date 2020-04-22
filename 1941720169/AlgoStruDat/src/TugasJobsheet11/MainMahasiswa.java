package TugasJobsheet11;

import java.util.Scanner;

public class MainMahasiswa {

    static Scanner dhimas = new Scanner(System.in);
    static Scanner arbi = new Scanner(System.in);

    public static void menu() {
        System.out.println("Masukkan Operasi yang diinginkan");
        System.out.println("1. Tambah");
        System.out.println("2. Hapus");
        System.out.println("3. Cari");
        System.out.println("4. Tampilkan data");
        System.out.println("5. Keluar");
    }

    public static void subMenu(int menu) {
        System.out.println("Pilih SubMenu: ");
        switch (menu) {
            case 1:
                System.out.println("1. Tambah First");
                System.out.println("2. Tambah(item,index)");
                System.out.println("3. Tambah Last");
                System.out.println("4. Add by value");
                break;
            case 2:
                System.out.println("1. Hapus(index)");
                System.out.println("2. Hapus (key)");
                System.out.println("3. Clear");
                break;
            case 3:
                System.out.println("1. Cari(index)");
                System.out.println("2. Cari(key)");
                break;
            case 4:
                System.out.println("List Mahasiswa");
                break;
            case 5:
                System.out.println("Aplikasi keluar");
                System.exit(0);
                break;
        }
    }

    public static void main(String[] args) {
        MLinkedList data = new MLinkedList();
        int pilih, index,opr=0;
        String item;
        try {
            do {
                menu();
                System.out.print("Masukkan Pilihan -|>");
                pilih = dhimas.nextInt();
                if(pilih == 1||pilih==2||pilih==3||pilih==5){
                    subMenu(pilih);
                    System.out.print("Pilih Operasi: ");
                    opr = dhimas.nextInt();
                }
                MLinkedList newData = new MLinkedList();
                switch (pilih) {
                    case 1:
                        if (opr == 1) {
                            System.out.println("\n~~Masukkan data Pertama~~");
                            System.out.print("Masukkan Nim: ");
                            newData.nim = arbi.nextLine();
                            System.out.print("Masukkan Nama: ");
                            newData.nama = arbi.nextLine();
                            System.out.print("Masukkan Alamat: ");
                            newData.alamat = arbi.nextLine();
                            data.addFirst(newData);
                        } else if (opr == 2) {
                            System.out.print("Masukkan Nim: ");
                            newData.nim = arbi.nextLine();
                            System.out.print("Masukkan Nama: ");
                            newData.nama = arbi.nextLine();
                            System.out.print("Masukkan Alamat: ");
                            newData.alamat = arbi.nextLine();
                            System.out.print("Masukkan index: ");
                            index = dhimas.nextInt();
                            data.add(newData, index);
                        } else if (opr == 3) {
                            System.out.print("Masukkan Nim: ");
                            newData.nim = arbi.nextLine();
                            System.out.print("Masukkan Nama: ");
                            newData.nama = arbi.nextLine();
                            System.out.print("Masukkan Alamat: ");
                            newData.alamat = arbi.nextLine();
                            data.addLast(newData);
                        }else if(opr==4){
                            data.print();
                            System.out.print("Masukkan Nim: ");
                            newData.nim = arbi.nextLine();
                            System.out.print("Masukkan Nama: ");
                            newData.nama = arbi.nextLine();
                            System.out.print("Masukkan Alamat: ");
                            newData.alamat = arbi.nextLine();
                            System.out.print("Posisi setelah data nim: ");
                            String index1 = arbi.nextLine();
                            data.addByValue(newData, index1);
                            data.print();
                        }
                        break;
                    case 2:
                        if (opr == 1) {
                            System.out.print("Hapus data index ke-");
                            index = dhimas.nextInt();
                            data.remove(index);
                        }else if(opr==2){
                            data.print();
                            System.out.print("Masukkan Nim dari data yang akan dihapus: : ");
                            String nim = arbi.nextLine();
                            data.removeByKey(nim);
                            data.print();
                        } else if (opr == 3) {
                            System.out.print("Menjalankan Penghapusan");
                            data.clear();
                        } else {
                        }
                        break;
                    case 3:
                        if (opr == 1) {
                            System.out.print("Cari data pada indeks ke-");
                            index = dhimas.nextInt();
                            data.cariByIndex(index);
                        } else if (opr == 2) {
                            System.out.print("Masukkan Nim: ");
                            newData.nim = arbi.nextLine();
                            System.out.print("Masukkan Nama: ");
                            newData.nama = arbi.nextLine();
                            System.out.print("Masukkan Alamat: ");
                            newData.alamat = arbi.nextLine();
                            data.cari(newData);
                        } else {
                        }
                        break;
                    case 4:
                        data.print();
                    default:
                }
            } while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
