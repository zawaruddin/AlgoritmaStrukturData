package arrayobjects;

/**
 *
 * @author khoirul
 */
public class PersegiPanjang {
    public int panjang;
    public int lebar;
    
    public static void main(String[] args){
        PersegiPanjang[] ppArray = new PersegiPanjang[3];
        
        ppArray[0] = new PersegiPanjang();
        ppArray[0].panjang = 110;
        ppArray[0].lebar = 30;
        
        ppArray[1] = new PersegiPanjang();
        ppArray[1].panjang = 80;
        ppArray[1].lebar = 40;
        
        ppArray[2] = new PersegiPanjang();
        ppArray[2].panjang = 100;
        ppArray[2].lebar = 20;
        
        System.out.println("Persegi panjang ke-0, panjang " + ppArray[0].panjang +", lebar; "+ ppArray[0].lebar);
        System.out.println("Persegi panjang ke-1, panjang " + ppArray[1].panjang +", lebar; "+ ppArray[1].lebar);
        System.out.println("Persegi panjang ke-2, panjang " + ppArray[2].panjang +", lebar; "+ ppArray[2].lebar);
    }
}

