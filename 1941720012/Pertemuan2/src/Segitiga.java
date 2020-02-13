
/**
 *
 * @author farid
 */
public class Segitiga {

    public int alas;
    public int tinggi;
    
    Segitiga(){
    }

    Segitiga(int a, int t){
        alas = a;
        tinggi = t;
    }
    double hitungLuas(int a, int t) {
        return a * t / 2;
    }

    double hitungKeliling(int a) {
        return a + a + a;
    }
}
