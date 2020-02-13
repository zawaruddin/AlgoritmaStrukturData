package ArrayObjects;

/**
 *
 * @author Aulafz
 */
public class Segitiga {

    public int alas;
    public int tinggi;

    Segitiga(int a, int t) {
        alas = a;
        tinggi = t;
    }

    double hitungLuas(int a, int t) {
        return a * t / 2;

    }

    int hitungKeliling(int c) {
        return c * 3;

    }

    public static void main(String[] args) {
        Segitiga[] sgArray = new Segitiga[4];

        sgArray[0] = new Segitiga(10, 4);
        sgArray[1] = new Segitiga(20, 10);
        sgArray[2] = new Segitiga(15, 6);
        sgArray[3] = new Segitiga(25, 10);

        for (int i = 0; i < 4; i++) {
            System.out.println("Segitiga ke-" + (i + 1) + " dengan alas : " + sgArray[i].alas + " dan tinggi : " + sgArray[i].tinggi);
            System.out.println("memiliki luas : " + sgArray[i].hitungLuas(sgArray[i].alas, sgArray[i].tinggi));
            System.out.println("memiliki keliling : " + sgArray[i].hitungKeliling(sgArray[i].alas));
            System.out.println();
        }
    }

}
