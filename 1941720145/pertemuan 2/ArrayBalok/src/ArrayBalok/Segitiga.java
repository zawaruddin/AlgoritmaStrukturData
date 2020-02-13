package ArrayBalok;
public class Segitiga {
    public int panjang;
    public int alas;
    
    public static void main(String args[]) {
        Segitiga [] sgt = new Segitiga[15];
        /*for (int i=0; i<sgt.length; i++) {
            sgt [i] = new Segitiga();
            sgt [i].panjang = i*2;
            sgt[i].alas = i*4;
        }*/
    }
    
    public Segitiga (int a, int p) {
        this.alas = a;
        this.panjang = p;
    }
}
