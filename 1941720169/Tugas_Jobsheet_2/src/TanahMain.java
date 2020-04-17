import java.util.Scanner;
public class TanahMain {
    public static void main(String[] args) {
        Scanner dhimas = new Scanner(System.in);
        System.out.print("Masukkan Jumlah Tanah: ");
        int n = dhimas.nextInt();
        Tanah[] arrT = new Tanah[n];
        System.out.println("");
        
        for(int i=0;i<arrT.length;i++){
            arrT[i] = new Tanah();
            System.out.println("Tanah ke-"+(i+1));
            System.out.print("Panjang: ");
            arrT[i].panjang = dhimas.nextInt();
            System.out.print("Lebar: ");
            arrT[i].lebar = dhimas.nextInt();
        }
        System.out.println("");
        for(int i=0;i<arrT.length;i++){
            System.out.println("Luas Tanah ke-"+(i+1)+": "+arrT[i].luasTanah());
        }
    }
}
