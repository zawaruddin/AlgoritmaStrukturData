package arraybalok;

/**
 *
 * @author Faris Ikhlasul H
 */
public class ArraySegitiga {

    public static void main(String[] Args) {
        segitiga[] sgArray = new segitiga[4];

        sgArray[0] = new segitiga(10, 4, 10, 10);
        sgArray[1] = new segitiga(20, 10, 20, 20);
        sgArray[2] = new segitiga(15, 6, 15, 15);
        sgArray[3] = new segitiga(15, 6, 15, 15);

        for (int i = 0; i < sgArray.length; i++) {
            System.out.println("Luas Segitiga ke " + i + ": " + sgArray[i].HitungLuas());
        }
         for (int i = 0; i < sgArray.length; i++) {
            System.out.println("Keliling Segitiga ke " + i + ": " + sgArray[i].HitungKeliling());
        }

    }
}
