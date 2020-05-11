
package TUGAS13;
import java.util.Scanner; 
public class Mahasiswa {
    String nama;  
    int nilai;     
    public Mahasiswa(String nm, int n){
        nama = nm;   
        nilai = n;    
    }     
    Mahasiswa(){ 
    }
    static void menu(){ 
        System.out.println("=================================");
        System.out.println("  DOUBLE LINK LIST DENGAN MENU");
        System.out.println("================================="); 
        System.out.println("Memilih menu");    
        System.out.println("1. Tambah Awal");    
        System.out.println("2. Tambah Akhir");  
        System.out.println("3. Tambah Data Indeks Tertentu");   
        System.out.println("4. Hapus Awal");      
        System.out.println("5. Hapus Akhir");  
        System.out.println("6. Hapus Indeks Tertentu");  
        System.out.println("7. Cetak Data");    
        System.out.println("8. Cari");     
        System.out.println("9.Pengurutan Data Descending");
        System.out.println("10.Keluar"); 
        System.out.println("---------------------------------");
    } 
    public static void main(String[] args) {
         Scanner retno = new Scanner(System.in);  
         DoubleLinkedLists2 data = new DoubleLinkedLists2(); 
         int menu;    
         int idx;
         try{ 
             do{ 
                  menu();      
                  System.out.print(">> "); 
                  menu = retno.nextInt();   
                  retno.nextLine();    
                  System.out.println("---------------------------------");
                  System.out.println(); 
                   if(menu==1){   
                     Mahasiswa addFirst = new Mahasiswa();
                     System.out.print("Masukkan Nama : ");  
                     addFirst.nama = retno.nextLine();            
                     System.out.print("Masukkan Nilai: ");    
                     addFirst.nilai = retno.nextInt();      
                    data.addFirst(addFirst); 
             }else if(menu==2){ 
                 Mahasiswa addLast = new Mahasiswa();        
                   System.out.print("Masukkan Nama : ");   
                   addLast.nama = retno.nextLine();     
                   System.out.print("Masukkan Nilai: ");
                   addLast.nilai = retno.nextInt(); 
                   data.addLast(addLast); 
             }else if(menu==3){ 
                 Mahasiswa addIdx = new Mahasiswa();
                 System.out.print("Masukkan Nama    : "); 
                 addIdx.nama = retno.nextLine();
                 System.out.print("Masukkan Nilai   : ");  
                 addIdx.nilai = retno.nextInt();
                 System.out.print("Masukkan Posisi indeks data: ");  
                 idx = retno.nextInt();  
                 data.add(addIdx, idx); 
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
                 Mahasiswa get = new Mahasiswa();
              System.out.print("Masukkan Nama : "); 
              get.nama = retno.nextLine();           
              System.out.print("Masukkan Nilai: "); 
              get.nilai = retno.nextInt();             
              System.out.println("Data" + "\nNama : " + get.nama+"\nNilai: "+ get.nilai);      
              System.out.println("=[ Ditemukan pada indeks ke: " + data.getKey(get)+" ]="); 
         }else if(menu==9){
             data.bubbleSortDescending();
             data.print();
         }else if(menu==10){
             System.exit (0);
         }
       
    }while(menu >=1 && menu <=10);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
