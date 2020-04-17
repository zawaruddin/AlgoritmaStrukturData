public class JajarGenjang {
    public int tinggi, panjang, sisiMiring;
    
    public JajarGenjang(){
        
    }
    public JajarGenjang(int t, int p, int sm){
        tinggi = t;
        panjang=p;
        sisiMiring = sm;
    }
    double hitungLuas(){
        return tinggi*sisiMiring;
    }
    double hitungKeliling(){
        return 2*(sisiMiring+panjang);
    }
}
