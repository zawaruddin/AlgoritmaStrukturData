package Kuis1;

public class Abjad {
    public char nama[] = {'d', 'h', 'i', 'm', 'a', 's', 'a', 'r', 'b', 'i',     //  O(1)
        's', 'u', 'k', 'm', 'a', 'h', 'i', 'm', 'a', 'w', 'a', 'n'};            
    public char abjadTerkecil = nama[0], abjadTerbesar = nama[0];               //  O(1)
    Abjad() {

    }
    public void cariHurufBF() {
        for (int i = 0; i < nama.length; i++) {                                 //  O(n), n = 22
            if (nama[i] < abjadTerkecil) {                                      
                abjadTerkecil = nama[i];                                        //  O(1)
            } else if (nama[i] > abjadTerbesar) {                               
                abjadTerbesar = nama[i];                                        //  O(1)
            }
        }
    }
    public void cariHurufDC(char nama[], int awal, int akhir, Abjad hasil) {
        int tengah;                                                             //  O(1)
        Abjad hasil1 = new Abjad();                                             //  O(1)
        Abjad hasil2 = new Abjad();                                             //  O(1)
        if (awal == akhir) {
            hasil.abjadTerkecil = hasil.abjadTerbesar = nama[awal];             //  O(1)
        } else {
            tengah = (awal + akhir) / 2;                                        //  O(1)
            cariHurufDC(nama, awal, tengah, hasil1);                            //  O(n), n = 11
            cariHurufDC(nama, tengah + 1,akhir, hasil2);                        //  O(n), n = 11

            hasil.abjadTerkecil = (hasil1.abjadTerkecil < hasil2.abjadTerkecil) //  O(1)
                    ? hasil1.abjadTerkecil : hasil2.abjadTerkecil;
            hasil.abjadTerbesar = (hasil1.abjadTerbesar > hasil2.abjadTerbesar) //  O(1)
                    ? hasil1.abjadTerbesar : hasil2.abjadTerbesar;
        }                                                       // Total        : 9+22*1*1+11+11 = 54
    }                                                           
}