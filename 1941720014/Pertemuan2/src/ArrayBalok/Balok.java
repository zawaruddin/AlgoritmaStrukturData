package ArrayBalok;

/**
 *
 * @author Aulafz
 */
public class Balok {
    public int panjang;
    public int lebar;
    public int tinggi;
    
    public Balok (int p, int l, int t){
        panjang =p;
        lebar = l;
        tinggi = t;
    }
    
    public int hitungVolume(){
        return panjang*lebar*tinggi;
    }
    public static void main (String[]args){
        Balok[] b1Array = new Balok [3];
        
        b1Array[0] = new Balok (100, 30, 12);
        b1Array[1] = new Balok (120, 40, 15);
        b1Array[2] = new Balok (210, 50, 25);
    
        for (int i=0;i<3;i++){
            System.out.println("Volume balok ke-"+i+": "+b1Array[i].hitungVolume());
        }
    }
}
