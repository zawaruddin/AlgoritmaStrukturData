/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan13;
import java.util.Scanner;
/**
 *
 * @author HOSNOL ARIFIN
 */
public class MainDoubleList {
    public static void main(String[] args) {
        int nilai1 = 0,nilai2 = 0,nilai3,nilai4,index1,index2,menu;
        Scanner arif=new Scanner(System.in);
        DoubleLinkedList dll=new DoubleLinkedList();
        do{
        System.out.println("\nDOUBLE LINKED LIST DENGAN MENU");
        System.out.println("================================");
        System.out.println("Memilih menu\n1.Tambah awal\n2.Tambah akhir\n3.Tambah data index tertentu\n"
                + "4.Hapus awal\n5.Hapus akhir\n6.Hapus index tertentu\n7.Cari\n8.Catak data\n9.Urutkan data\n10.Keluar");
        System.out.print("Pilih 1-10: ");
        menu=arif.nextInt();
        try {
           switch(menu){
               case 1:
                   System.out.println("");
                   System.out.print("Masukkan nilai: ");
                   nilai1=arif.nextInt();
                   dll.addFirst(nilai1);
                   break;
               case 2:
                    System.out.println("");
                    System.out.print("Masukkan nilai: ");
                    nilai2=arif.nextInt();
                    dll.addLast(nilai2);
                    break;
               case 3:
                    System.out.println("");
                    System.out.print("Masukkan nilai: ");
                    nilai3=arif.nextInt();
                    System.out.print("Masukkan index: ");
                    index1=arif.nextInt();
                    dll.add(nilai3, index1);
                    break;
               case 4:
                   System.out.println("");
                   System.out.println("Hapus data awal");
                   dll.removeFirst();
                   System.out.println("data: "+dll.siize());
                   break;
               case 5:
                   System.out.println("");
                   System.out.println("Hapus data terbelakang");
                   dll.removeLast();
                   System.out.println("data: "+dll.siize());
                   break;
               case 6:
                   System.out.println("");
                   System.out.print("Masukkan index: ");
                   index2=arif.nextInt();
                   dll.remove(index2);
                   System.out.println("data: "+dll.siize());
                   break;
               case 7:
                   System.out.println("");
                   System.out.print("Masukkan data yang dicari: ");
                   nilai4=arif.nextInt();
                   dll.find(nilai4);
                   break;
               case 8:
                   System.out.println("");
                   System.out.println("Isi node: ");
                   dll.print();
                   break;
               case 9:
                   System.out.println("");
                   System.out.println("Data sebelum di sorting: ");
                   dll.print();
                   dll.sortList();
                   System.out.println("Data setelah di sorting: ");
                   dll.print();
                   break;
               case 10:
                   System.exit(0);
            }
        } catch (Exception e) {
           System.out.println(e.getMessage());
        }
    }while (menu==1||menu==2||menu==3||menu==4||menu==5||menu==6||menu==7||menu==8||menu==9||menu==10);
}
}
