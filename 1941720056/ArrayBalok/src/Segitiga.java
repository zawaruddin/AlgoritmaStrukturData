public class Segitiga {
    public int alas;
    public int tinggi;    
    
    
    Segitiga (int a,int t){
        alas = a;
        tinggi = t;
    }

    Segitiga() {
    }
    int hitungLuas(int a,int t) {
        int luas = a*t/2;
        return luas;
    }
    int hitungKeliling(int x){
        int keliling = x + x + x;
        return keliling;
    }
    public static void main(String[] args) {
    Segitiga[]sgArray = new Segitiga[15];
}
    
}

