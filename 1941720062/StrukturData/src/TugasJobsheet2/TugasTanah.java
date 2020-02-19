package TugasJobsheet2;

/**
 *
 * @author Faris Ikhlasul H
 */
public class TugasTanah {

    public double panjang;
    public double lebar;

    public TugasTanah(double p, double g) {
        panjang = p;
        lebar = g;
    }

    public double HitungLuas() {
        return panjang * lebar;
    }
}
