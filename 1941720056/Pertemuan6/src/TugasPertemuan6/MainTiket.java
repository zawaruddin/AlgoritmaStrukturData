
package TugasPertemuan6;
import java.util.Scanner;
public class MainTiket {
    public static void main(String[] args) {
    Scanner retno = new Scanner (System.in);
    SortTiket data = new SortTiket();
    Tiket[] tkt = new Tiket[4];
    String urut;
    
        System.out.println("Tiket Pesawat MEDAN - SURABAYA");
        System.out.print("Pilih tampilan tiket(ascending / descending): ");
        urut = retno.nextLine();
        
        tkt[0] = new Tiket ("Lion Air",880000,30,877,"JT");
        tkt[1] = new Tiket ("Citilink",1077400,130,694,"QG");
        tkt[2] = new Tiket ("Garuda",3570220,67,212,"GA");
        tkt[3] = new Tiket ("Batik",950000,90,564,"ID");
        
        for (int i = 0; i < tkt.length; i++) {
            data.tambah(tkt);
        }
        
        if(urut.equalsIgnoreCase("Ascending")){
            data.bubbleSort();
            data.tampilkan();
        }else if(urut.equalsIgnoreCase("Descending")){
            data.selectionSort();
            data.tampilkan();
        }else{
            System.out.println("Maaf pilihan yang anda input tidak ada!");
        }
    }    
}
