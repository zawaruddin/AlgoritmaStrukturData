package Kuis1;
public class AbjadMain {

    public static void main(String[] args) {
        Abjad abj = new Abjad();                                                //  O(1)
        abj.cariHurufBF();                                                      //  O(1)
        System.out.println("Mencari Abjad Terbesar dan Terkecil");              //  O(1)
        System.out.println("Nama: dhimasarbisukmahimawan\n");                   //  O(1)
        System.out.println("Menggunakan metode Brute Force");                   //  O(1)
        System.out.println("Abjad terkecil: " + abj.abjadTerkecil);             //  O(1)
        System.out.println("Abjad terbesar: " + abj.abjadTerbesar);             //  O(1)
        System.out.println("\nMenggunakan metode Divide and Conquer");          //  O(1)
        abj.cariHurufDC(abj.nama,0,(abj.nama.length-1), abj);                   //  O(1)
        System.out.println("Abjad terkecil: " + abj.abjadTerkecil);             //  O(1)
        System.out.println("Abjad terbesar: " + abj.abjadTerbesar);             //  O(1)
    }                                                            // Total      : O(1)*11 = 11
}
