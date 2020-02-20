import java.util.Scanner;
public class arrayTanah {
    public static void main(String[] args) {
        Scanner retno = new Scanner (System.in);
        
        System.out.print("Masukkan jumlah tanah : ");
        int n = retno.nextInt();
        
        Tanah[]arrTn = new Tanah[n];
        
        for (int i = 0; i < n; i++) {
            arrTn[i]=new Tanah();
            System.out.println("-----------------");
            System.out.println("Tanah ke-"+i);
            System.out.println("-----------------");
            System.out.print("Masukkan Panjang : ");
            arrTn[i].panjang = retno.nextInt();
            System.out.print("Masukkan lebar : ");
            arrTn[i].lebar = retno.nextInt();
            
        }
        System.out.println();
        
        for (int i = 0; i < n; i++) {
            
            System.out.println("Luas Tanah : "+i+" :"+arrTn[i].luasTanah(arrTn[i].panjang, arrTn[i].lebar));
            
        }
    }
}
