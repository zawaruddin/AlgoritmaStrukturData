public class JajarGenjang {
    public int tinggi,panjang,sisi;
    
    JajarGenjang(){
        
    }

    JajarGenjang (int t , int p , int s){
        tinggi = t;
        panjang = p;
        sisi = s;
    }
    
    int hitungLuas(int t,int s){
        int luas = t * s;
        return luas;
    }
    
    int hitungKeliling(int s , int p){
    int keliling = 2*(s + p);
    return keliling;
}
}
