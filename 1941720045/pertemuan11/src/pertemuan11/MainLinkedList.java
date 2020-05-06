/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan11;
import java.util.Scanner;
/**
 *
 * @author HOSNOL ARIFIN
 */
public class MainLinkedList {
    public static void main(String[] args) {
        Scanner arif=new Scanner(System.in);
        LinkedList data=new LinkedList();
        int pilih;
        do{
        System.out.println("=========<<<  MENU  >>>=========");
        System.out.println("1.Tambah\n2.Hapus\n3.Cari\n4.Keluar");
        System.out.println("--------------------------------");
        System.out.print("Pilih 1/2/3/4: ");
        pilih=arif.nextInt();
        try {
            switch(pilih){
                case 1:
                    System.out.println("--------------------------------");
                    System.out.println("a.Tambah(First)\nb.Tambah(Index)\nc.Tambah(Last)");
                    System.out.println("--------------------------------");
                    System.out.print("Pilih a/b/c: ");
                    String a=arif.next();
                    if(a.equalsIgnoreCase("a")){
                        System.out.print("Masukkan penambahan node awal: ");
                        int awal=arif.nextInt();
                        data.addFirst(awal);
                       
                    }else if(a.equalsIgnoreCase("b")){
                        System.out.print("Masukkan penambahan node: ");
                        int node=arif.nextInt();
                        System.out.print("Masukkan index: ");
                        int index=arif.nextInt();
                        data.add(node, index);
                       
                    }else if(a.equalsIgnoreCase("c")){
                        System.out.print("Masukkan penambahan node akhir: ");
                        int akhir=arif.nextInt();
                        data.addlast(akhir);
                     
                    }else{
                        System.out.println("Maaf inputan anda salah!!!");
                    }
                    break;
                case 2:
                    System.out.println("--------------------------------");
                    System.out.println("a.Hapus(Index)\nb.Hapus(Key)\nc.Clear");
                    System.out.println("--------------------------------");
                    System.out.print("Pilih a/b/c: ");
                    String b=arif.next();
                    if(b.equalsIgnoreCase("a")){
                        System.out.print("Masukkan nilai Index yang akan dihapus: ");
                        int hapus=arif.nextInt();
                        data.remove(hapus);
                        
                    }else if(b.equalsIgnoreCase("b")){
                        System.out.print("Masukkan Nilai yang akan dihapus: ");
                        int hapus2=arif.nextInt();
                        data.removeByValue(hapus2);
                        
                    }else if(b.equalsIgnoreCase("c")){
                        System.out.println("Data telah kosong");
                        data.clear();
                        
                    }else{
                        System.out.println("Maaf inputan anda salah!!!");
                    }
                    break;
                case 3:
                    System.out.println("--------------------------------");
                    System.out.println("a.Cari(Index)\nb.Cari(Key)");
                    System.out.println("--------------------------------");
                    System.out.print("Pilih a/b: ");
                    String c=arif.next();
                    if(c.equalsIgnoreCase("a")){
                        System.out.print("Masukkan index yang dicari: ");
                        int cari=arif.nextInt();
                        data.findIndex(cari);
                        
                    }else if(c.equalsIgnoreCase("b")){
                        System.out.print("Masukkan nilai yang dicari: ");
                        int cari2=arif.nextInt();
                        data.find(cari2);
                        
                    }else{ 
                        System.out.println("Maaf inputan anda salah");
                    }
                    break;
                case 4:
                    System.exit(0);
                    break;
                    
            }
//            data.addFirst(7);
//            data.print();
//            data.add(8, 1);
//            data.print();
//            data.addFirst(1);
//            data.print();
//            data.remove(1);
//            data.print();
//            data.clear();
//            data.print();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        }while (pilih==1||pilih==2||pilih==3||pilih==4);
    }
}