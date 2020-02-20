package jobsheet2tugas;
import java.util.Scanner;
/**
 *
 * @author khoirul
 */
public class TanahMain {
    public static void main(String[] args) {
        Scanner irul = new Scanner(System.in);
        System.out.println("Masukkan jumlah tanah: ");
        int jmlh = irul.nextInt();
        Tanah tn[] = new Tanah[jmlh];
        
        for(int a=0; a<tn.length; a++){
            System.out.print("Tanah ke-"+(a+1));
            tn[a] = new Tanah();
            System.out.print("Panjang: ");
            tn[a].panjang = irul.nextInt();
            System.out.print("Lebar: ");
            tn[a].lebar = irul.nextInt();
        }
        System.out.println();
        for(int a=0; a<tn.length; a++){
            System.out.println("Tanah ke-"+(a+1));
            System.out.println("Panjang: "+tn[a].panjang);
            System.out.println("Lebar: "+tn[a].lebar);
            System.out.println();
        }
        System.out.println();
        for(int a=0; a<tn.length; a++){
            System.out.println("Luas Tanah "+(a+1)+" : "+tn[a].hitungLuasTanah());
        }
        System.out.println();
        for(int a=0; a<tn.length; a++){
            int temp=0,tanah=0;
            System.out.println("Luas Tanah "+(a+1)+" : "+tn[a].hitungLuasTanah());
            if(tn[a].hitungLuasTanah() > temp){
                temp = tn[a].hitungLuasTanah();
                tanah = a + 1;
            }
            System.out.println();
            System.out.println("Tanah Terluas: Tanah "+tanah);
        }
    }
}