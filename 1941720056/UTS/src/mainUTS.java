import java.util.Scanner;
public class mainUTS {
    public static void main(String[] args) {
        Scanner retno = new Scanner (System.in);
        Scanner fajar = new Scanner (System.in);
        char data[] = {'r','e','t','n','o','f','a','j','a','r','w','u','l','a','n','d','a','r','i'};
        UTS1 find = new UTS1 (data,data.length);
        int posisi=1;
        System.out.println("--------------------------------");
        System.out.println("*** UTS - Praktikum ASD ***");
        System.out.println("~~~ Program Pencarian Data ~~~");
        System.out.println();
        System.out.println("Nama\t : Retno Fajar Wulandari");
        System.out.println("NIM\t : 1941720056");
        System.out.println("--------------------------------");
        System.out.print("Data : ");
        find.TampilData();
        
        
        System.out.println("Pilih Metode Pencarian");
        System.out.println("1. Sequential Search");
        System.out.println("2. Binary Search");
        System.out.print("Saya Pilih Metode : ");
        int pilih = retno.nextInt();
        
        System.out.println("Data yang ingin dicari : ");
        char cari = fajar.next().charAt(0);
        if (pilih == 1 ){
            System.out.println("==============================");
            System.out.println("Menggunakan Sequintal Search ");
            System.out.println("==============================");
             posisi=find.FindSeqSearch(cari);
             find.TampilPosisi(cari, posisi);      
        }else if(pilih==2){
            System.out.println("==============================");
            System.out.println("Menggunakan Binary Search ");
            System.out.println("==============================");
            System.out.println("---Data diurutkan dengan Merge Sort--- ");
            System.out.println("");
            find.mergeSort(data);
            find.printArray(data);
            System.out.println("Setelah data diurutkan :");
            
            posisi=find.FindBinarySearch(cari, 0, data.length-1);
            find.TampilPosisi(cari, posisi);
        }else{
            System.out.println("Metode yang dipilih tidak ditemukan!!");
        }
        
    }
    
}
