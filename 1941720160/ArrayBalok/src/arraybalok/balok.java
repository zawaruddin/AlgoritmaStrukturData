package arraybalok;

/**
 *
 * @author khoirul
 */
public class balok {
    public int panjang;
    public int lebar;
    public int tinggi;
    
    public balok(int p, int l, int t)
    {
        panjang = p;
        lebar = l;
        tinggi = t;
    }
    public int hitungVolume()
    {
        return panjang*lebar*tinggi;
    }
    public static void main(String[] args){
        balok[] blArray = new balok[3];
        
        blArray[0] = new balok(100, 30, 12);
        blArray[1] = new balok(120, 40, 15);
        blArray[2] = new balok(210, 50, 25);
        
        for(int i=0; i<3; i++)
        {
            System.out.println("Volume Balok ke-"+i+": " + blArray[i].hitungVolume());
        }
    }
}
