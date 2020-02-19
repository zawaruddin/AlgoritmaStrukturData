package TugasJobsheet2;
/**
 *
 * @author Faris Ikhlasul H
 */
public class TugasLingkaran {
    public double PHI = 3.14;
    public double r;
    TugasLingkaran() {
    }
    public TugasLingkaran(double a, double t, double b) {
        PHI = a;
        r = t;
        r = b;
    }
    public double HitungLuas() {
        return PHI * r * r;
    }
    public double HitungKeliling() {
        return 2 * PHI * 2*r ;
    }
}