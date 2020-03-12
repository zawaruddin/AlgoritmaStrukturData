package quiz;
import java.util.Arrays;
/**
 *
 * @author khoirul
 */
public class kuis2 {
    public char minimum;
    public char maximum;

    public static void main(String[] args) {
        char[] nama = { 'M', 'U', 'H', 'A', 'M', 'M', 'A', 'D', 'K', 'H', 'O', 'I', 'R', 'U', 'L','W','A','H','Y','U','D','I','N'};     //O(1)
        int panjangNama = nama.length;                                                                                                 
        kuis2 hasil = new kuis2();                                                                                                      

        System.out.println("\nInput : MUHAMMAD KHOIRUL WAHYUDIN");

        System.out.println();
        Arrays.sort(nama);

        System.out.println("\nOutput : ");
        System.out.println("Algoritma Brute Force");
        abjadBF(nama, panjangNama);

        abjadDC(nama, 0, (panjangNama - 1), hasil);
        System.out.println("");
        System.out.println("Divide Conquer");
        System.out.println("Abjad Terkecil = " + hasil.minimum + "\nAbjad Terbesar = " + hasil.maximum);
        System.out.println("");
    }

    static void abjadBF(char[] nama, int n) {
        char min = nama[0];                                                                                                             //O(1)
        char max = nama[0];                                                                                                             
        for (int i = 0; i < n; i++) {                                                                                                   //O(n)
            if (nama[i] < min) {                                                                                                        //O(n)
                min = nama[i];
            } else if (nama[i] > max) {                                                                                                 //O(n)
                max = nama[i];
            }
        }

        System.out.println("Abjad Terkecil = " + min);
        System.out.println("Abjad Terbesar = " + max);
    }

    static void abjadDC(char[] nama, int index_awal, int index_akhir, kuis2 hasil) {
        int index_tengah;                                                                                                               //O(1)
        kuis2 hasil1 = new kuis2();                                                                                          
        kuis2 hasil2 = new kuis2();                                                                                                     

        if (index_awal == index_akhir) {                                                                                                //O(n)
            hasil.minimum = hasil.maximum = nama[index_awal];
        } else if (index_akhir - index_awal == 1) {                                                                                   
            
            if (nama[index_awal] > nama[index_akhir]) {                                                                                 // O(n)                                                                       
                hasil.minimum = nama[index_akhir];
                hasil.maximum = nama[index_awal];
            } else {                                                                                                               
                hasil.minimum = nama[index_awal];
                hasil.maximum = nama[index_akhir];
            }
        } else {                                                                                                                 
            index_tengah = (index_awal + index_akhir) / 2;                                                                              // O(n)
            abjadDC(nama, index_awal, index_tengah, hasil1);
            abjadDC(nama, index_tengah + 1, index_akhir, hasil2);

            hasil.minimum = (hasil1.minimum < hasil2.minimum) ? hasil1.minimum : hasil2.minimum;
            hasil.maximum = (hasil1.maximum > hasil2.maximum) ? hasil1.maximum : hasil2.maximum;
        }
    }
}