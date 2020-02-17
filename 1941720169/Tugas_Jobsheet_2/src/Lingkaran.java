public class Lingkaran {
    public double PHI, r;
    
    public Lingkaran(){
        
    }
    public Lingkaran(double phi,double jari2){
        r=jari2;
        PHI = phi;
    }
    public double hitungLuas(){
        double luas;
        luas = PHI*r*r;
        return luas;
    }
    public double hitungKeliling(){
        double keliling;
        keliling = 2*PHI*r;
        return keliling;
    }

    
}
