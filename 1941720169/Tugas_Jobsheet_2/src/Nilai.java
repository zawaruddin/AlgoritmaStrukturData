
public class Nilai {

    public int nilai1, nilai2, jumlah;

    public Nilai() {

    }

    public Nilai(int n1, int n2, int jml) {
        nilai1 = n1;
        nilai2 = n2;
        jumlah = jml;
    }

    void nilaiTerbaik() {
        if (nilai1 > nilai2) {
            System.out.println("Nilai : " + nilai1);
        } else {
            System.out.println("Nilai : " + nilai2);
        }
    }
}
