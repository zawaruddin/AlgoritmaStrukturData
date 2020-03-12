
public class ArraySegitiga {

    public static void main(String[] args) {
        segiitiga[] sgArray = new segiitiga[4];

        sgArray[0] = new segiitiga(10, 4, 10, 10);
        sgArray[1] = new segiitiga(20, 10, 20, 20);
        sgArray[2] = new segiitiga(15, 6, 15, 15);
        sgArray[3] = new segiitiga(25, 10, 25, 25);

        for (int i = 0; i < 4; i++) {
            System.out.println("Luas segitiga ke " + i + ": " + sgArray[i].hitungLuas());
        }
        for (int i = 0; i < 4; i++) {
            System.out.println("Keliling segitiga ke " + i + ": " + sgArray[i].hitungKeliling());
        }
    }
}
