/**
 *
 * @author farid
 */
public class ArraySegitiga {
    public static void main(String[] args) {
        Segitiga sgArray[] = new Segitiga[4];
        
        sgArray[0] = new Segitiga();
        sgArray[0].alas = 10;
        sgArray[0].tinggi = 4;
        
        sgArray[1] = new Segitiga();
        sgArray[1].alas = 20;
        sgArray[1].tinggi = 10;
        
        sgArray[2] = new Segitiga();
        sgArray[2].alas = 15;
        sgArray[2].tinggi = 6;
        
        sgArray[3] = new Segitiga();
        sgArray[3].alas = 25;
        sgArray[3].tinggi = 10;

        for (int i = 0; i < sgArray.length; i++) {
            System.out.println("Segitiga ke-" + i);
            System.out.println("Alas: " + sgArray[i].alas + ", tinggi: " + sgArray[i].tinggi);
            System.out.println("Luas segitiga ke-"+i+" : "+sgArray[i].hitungLuas(sgArray[i].alas,sgArray[i].tinggi));
            System.out.println("Keliling segitiga ke-"+i+" : "+sgArray[i].hitungKeliling(sgArray[i].alas));
            System.out.println();
        }
    }
}
