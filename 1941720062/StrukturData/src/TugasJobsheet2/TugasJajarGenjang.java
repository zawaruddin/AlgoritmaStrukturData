package TugasJobsheet2;

/**
 *
 * @author Faris Ikhlasul H
 */
public class TugasJajarGenjang {

    public double tinggi;
    public double panjang;
    public double SisiMiring;
    public double Tinggi;
    TugasJajarGenjang(){ 
    }
    public TugasJajarGenjang(double a, double t, double b) {
        tinggi = a;
        panjang = t;
        SisiMiring= b;
    }
    public double HitungLuas() {
        return panjang * tinggi /2;
    }
    public double HitungKeliling() {
        return 2 * (panjang+tinggi);
    }
    
    
}
