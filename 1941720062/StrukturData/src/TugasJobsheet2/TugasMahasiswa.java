package TugasJobsheet2;

/**
 *
 * @author Faris Ikhlasul H
 */
public class TugasMahasiswa {

    public double nilai1;
    public double nilai2;
    public double nilai;

    public TugasMahasiswa(double p, double g) {
        nilai1 = p;
        nilai2 = g;
    }

    public Double perbandingan() {
        if (nilai1 > nilai2) {
            nilai = nilai1;
        } else {
            nilai = nilai2;

        }
        return nilai;
    }
}
