/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz1;

/**
 *
 * @author Windows 10
 */
public class Nomor2 {                                                           //~
    char min, maks, maksimal, minimal;

    void cekAbjadBF(char nama[]) {                                              //~
        min = nama[0];                                                          //O(1)
        maks = nama[0];                                                         //O(1)

        for (int a = 0; a < nama.length; a++) {                                 //O(n)=O(11)
            if (nama[a] != ' ') {                                               //O(1)
                if (nama[a] < min) {
                    min = nama[a];                                              //O(1)
                } else if (nama[a] > maks) {
                    maks = nama[a];                                             //O(1)
                }
            }

        }
    }

    char maks() {
        return maks;                                                            //O(1)
    }

    char min() {
        return min;                                                             //O(1)
    }

    void cekAbjadDC(char nama[], int indeks_awal, int indeks_akhir) {           //~
        int indeks_tengah;                                                      //~
        char mn, mx;                                                            //~
        
        if (indeks_awal == indeks_akhir) {
            minimal = nama[indeks_awal];                                        //O(1)
            maksimal = nama[indeks_akhir];                                      //O(1)
        } else{
            indeks_tengah = (indeks_awal + indeks_akhir)/2;                     //O(2^n)
            cekAbjadDC(nama, indeks_awal, indeks_tengah);
            mn = minimal;                                                       //O(1)
            mx = maksimal;                                                      //O(1)
            cekAbjadDC(nama, indeks_tengah + 1, indeks_akhir);
            if(mx != ' ' && mn != ' '){
                if(maksimal < mx)
                    maksimal = mx;                                              //O(1)
                else if(minimal > mn)                                           
                    minimal = mn;                                               //O(1)
            }         
        }    
    }
    public char minim(){
        return minimal;                                                         //O(1)
    }
    public char maxim(){
        return maksimal;                                                        //O(1)
    }
}
//Intruksi          = 1+1+(11*1)+1+1+1+1+(1*1)+((2^1)*1*1*1*1)+1+1
//                  = 2 + 11 + 4 + 1 + 2^n + 2
//                  = 19 + 2^n
//Notasi Big O      = 2^n. (operasi divide conquer memiliki kompleksitas terbesar)
