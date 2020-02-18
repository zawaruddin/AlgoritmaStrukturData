
import java.util.Scanner;

public class TanahTerluasMain {

    public static void main(String[] args) {
        Scanner dhimas = new Scanner(System.in);
        int terluas = 0, n,x=0;
        
        System.out.print("Masukkan Jumlah Tanah: ");
        n = dhimas.nextInt();
        TanahTerluas[] arrT = new TanahTerluas[n];
        System.out.println("");

        for (int i = 0; i < arrT.length; i++) {
            arrT[i] = new TanahTerluas();
            System.out.println("Tanah ke-" + (i + 1));
            System.out.print("Panjang: ");
            arrT[i].panjang = dhimas.nextInt();
            System.out.print("Lebar: ");
            arrT[i].lebar = dhimas.nextInt();
        }
        System.out.println("");
        for (int i = 0; i < arrT.length; i++) {
            System.out.println("Luas Tanah ke-" + (i + 1) + ": " + arrT[i].luasTanah());
        }
        for (int i = 0; i < arrT.length; i++) {
            if(arrT[i].luasTanah()>terluas){
                terluas = arrT[i].luasTanah();
                x=i;
            }
        }
        System.out.println("\nTanah Terluas: Tanah ke-"+(x+1));
    }
}
