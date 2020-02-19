package TugasJobsheet2;

/**
 *
 * @author Faris Ikhlasul H
 */
public class TugasTanah2 {

    public double panjang;
    public double lebar;
    public double mana;

    TugasTanah2() {

    }
    public TugasTanah2(double p, double g) {
        panjang = p;
        lebar = g;
    }

    public double HitungLuas() {
        return panjang * lebar;
    }
}
