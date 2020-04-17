package Minggu2.Balok;


public class segiitiga {
    public int alas;
    public int tinggi;
    public int c;
    public int b;
    
    public segiitiga(int a, int t, int x, int y){
        alas = a;
        tinggi = t;
        b = x;
        c = y;
    }
    
    public double hitungLuas(){
        return 0.5*alas*tinggi;
    } 
    public int hitungKeliling(){
        return alas+b+c;
    }
}
