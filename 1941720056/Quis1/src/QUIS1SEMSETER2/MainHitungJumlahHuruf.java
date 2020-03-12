
package QUIS1SEMSETER2;
import java.util.Scanner;
public class MainHitungJumlahHuruf {
    public static void main(String[] args) {
        Scanner retno = new Scanner (System.in);                                // O(1)
        HitungJumlahHuruf htgjml = new HitungJumlahHuruf();                     // O(1)
        AbjadTerbesarTerkecil att = new  AbjadTerbesarTerkecil();               // O(1)
       
        System.out.print("Masukkan nama : ");                                   // O(1)
        htgjml.nama = retno.nextLine();                                         // O(1)
        
        htgjml.HitungNilai(htgjml.nama);                                        // O(1)
        att.minmax(htgjml.nama);                                                // O(1)
        att.max_min(htgjml.nama,0,htgjml.nama.length()-1);                      // O(1)
        
        System.out.println("==================================");               // O(1)
        System.out.println("BRUTE FORCE");                                      // O(1)
        System.out.println("==================================");               // O(1)
        System.out.println("Abjad terbesar : "+att.max);                        // O(1)
        System.out.println("Abjad terkecil : "+att.min);                        // O(1)
        System.out.println("===================================");              // O(1)
        System.out.println("DIVIDE CONQUER");                                   // O(1)
        System.out.println("===================================");               // O(1)
        System.out.println("Abjad terbesar : "+att.hasilmax());                 // O(1)
        System.out.println("Abjad terkecil : "+att.hasilmin());                 // O(1)
    }
}
// maka banyak operasi tersebut 
// = 1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1
// = 18 operasi
// jadi notasi bigO = O(1)