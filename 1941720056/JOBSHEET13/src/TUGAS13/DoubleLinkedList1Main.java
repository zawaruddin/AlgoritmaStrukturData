package TUGAS13;
import java.util.Scanner;
public class DoubleLinkedList1Main {
    static void menu(){
        System.out.println(" DOUBLE LINK LIST DENGAN MENU");
        System.out.println("=================================");
        System.out.println("Memilih menu");
        System.out.println("1. Tambah awal");
        System.out.println("2. Tambah Akhir");
        System.out.println("3. Tambah Data Indeks Tertentu");
        System.out.println("4. Hapus Awal");
        System.out.println("5. Hapus Akhir");
        System.out.println("6. Hapus Indeks Tertentu");
        System.out.println("7. Cetak Data");
        System.out.println("8. Cari");
        System.out.println("9. Pengurutan Data Ascending");         
        System.out.println("10. Keluar");
        System.out.println("=================================");
    }
    public static void main(String[] args) {
        Scanner retno = new Scanner(System.in);
        DoubleLinkedLists1 data = new DoubleLinkedLists1();
        int menu,angka,idx;
        try{
            do{
            menu();
            System.out.print(">> ");
            menu = retno.nextInt();
            System.out.println("=================================");
            System.out.println();
            if(menu==1){
                System.out.print("Masukkan data: ");
                angka = retno.nextInt();
                data.addFirst(angka);
            }else if(menu==2){
                System.out.print("Masukkan data: ");
                angka = retno.nextInt();
                data.addLast(angka);
            }else if(menu==3){
                System.out.print("Masukkan data : ");
                angka = retno.nextInt();
                System.out.print("Masukkan Posisi indeks data: ");
                idx = retno.nextInt();
                data.add(angka, idx);
            }else if(menu==4){
                data.removeFirst();
            }else if(menu==5){
                data.removeLast();
            }else if(menu==6){
                System.out.print("Masukkan Posisi indeks data: ");
                idx = retno.nextInt();
                data.remove(idx);
            }else if(menu==7){
                data.print();
            }else if(menu==8){
                System.out.print("Masukkan data yang dicari: ");
                angka = retno.nextInt();
                System.out.println("Data " + angka + " ditemukan pada indeks ke:"
               + data.getKey(angka));
            }else if(menu==9){
                data.bubbleSortAscending();
                data.print();
            } 
            else if(menu==10){
                System.exit(0);
            }
                System.out.println();
            }while(menu >=1 && menu <=10);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
