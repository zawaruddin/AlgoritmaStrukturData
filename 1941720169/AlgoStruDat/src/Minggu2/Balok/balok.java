package Minggu2.Balok;


public class balok {
    public int panjang;
    public int lebar;
    public int tinggi;
    
    public balok(int p, int l, int t){
        panjang = p;
        lebar = l;
        tinggi = t;
    }
    
    public int hitungVolume(){
        return panjang*lebar*tinggi;
    }
    
}
