public class Lingkaran {
    public double PHI,jari_jari;
    
    Lingkaran(){
    }
    
    Lingkaran(double phi,double r){
        PHI =phi;
        jari_jari =r;
    }
    
    double hitungLuas(double phi,double r){
        double luas = PHI * jari_jari;
        return luas;     
    }
    double hitungKeliling(double phi,double r){
        double keliling = 2 * PHI * jari_jari;
        return keliling;
    }
}

