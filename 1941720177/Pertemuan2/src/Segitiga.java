/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author RasyidPC
 */
public class Segitiga {

    public int alas;
    public int tinggi;
    
    Segitiga(){}

    Segitiga(int a, int t) {
        alas = a;
        tinggi = t;
        

    }

    double hitungLuas(int a, int t) {
        return a * t / 2;
    }

    double hitungKeliling(int a, int b, int c) {
        return a + b + c;
    }
}
