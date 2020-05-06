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
public class MainMhs {
    public static void main(String[] args) {
        int m;
        Scanner arif=new Scanner(System.in);
        DoubleMhs mhs=new DoubleMhs();
        
        System.out.println("===============<< MENU >>===============");
        do{
        System.out.println("1. Tambah awal\n2. Tambah akhir\n3. Tambah data index tertentu\n"
                + "4. Hapus awal\n5. Hapus akhir\n6. Hapus index tertentu\n7. Cari\n8. Keluar\n");
        System.out.print("Pilih 1-8: ");
        
        m=arif.nextInt();
        try{
        switch(m){
            case 1:
                System.out.println("");
                arif.nextLine();
                System.out.print("Masukkan nama\t: ");
                String nama=arif.nextLine();
                System.out.print("Nilai ujian\t: ");
                int n=arif.nextInt();
                
                mhs.addFirst(nama, n);
                mhs.tampilkan();
                break;
            case 2:
                System.out.println("");
                arif.nextLine();
                System.out.print("Masukkan nama\t: ");
                String nama2=arif.nextLine();
                System.out.print("Nilai ujian\t: ");
                int n2=arif.nextInt();
                
                mhs.addLast(nama2, n2);
                mhs.tampilkan();
                break;
            case 3:
                System.out.println("");
                System.out.print("Masukkan index\t: ");
                int indeks=arif.nextInt();
                arif.nextLine();
                System.out.print("Masukkan nama\t: ");
                String nama3=arif.nextLine();
                System.out.print("Nilai ujian\t: ");
                int n3=arif.nextInt();
                
                mhs.add(nama3, n3, indeks);
                mhs.tampilkan();
                break;
            case 4:
                System.out.println("");
                System.out.println("Hapus data pertama");
                mhs.removeFirst();
                mhs.tampilkan();
                System.out.println("Size "+mhs.size());
                break;
            case 5:
                System.out.println("");
                System.out.println("Hapus data terakhir");
                mhs.removeLast();
                mhs.tampilkan();
                System.out.println("Size "+mhs.size());
                break;
            case 6:
                System.out.println("");
                System.out.print("Masukkan indeks  : ");
                int index=arif.nextInt();
                mhs.remove(index);
                mhs.tampilkan();
                System.out.println("Size "+mhs.size());
                break;
            case 7:
                System.out.println("");
                arif.nextLine();
                System.out.print("Masukkan nama  : ");
                String nm=arif.nextLine();
                mhs.find(nm);
                break;
            case 8:
                System.exit(0);
        }
        }catch (Exception e) {
           System.out.println(e.getMessage());
        }
        }while(m==1||m==2||m==3||m==4||m==5||m==6||m==7||m==8);
    }
}
