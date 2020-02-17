public class Lingkaran {
    public double PHI, r;
    
    public Lingkaran(){
        
    }
    public Lingkaran(double phi,double jari2){
        r=jari2;
        PHI = phi;
    }
    public double hitungLuas(double phi, double r){
        double luas;
        luas = phi*r*r;
        return luas;
    }
    public double hitungKeliling(double phi, double r){
        double keliling;
        keliling = 2*phi*r;
        return keliling;
    }

    
}
