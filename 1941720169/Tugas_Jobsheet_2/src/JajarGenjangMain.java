import java.util.Scanner;
public class JajarGenjangMain {
    public static void main(String[] args) {
        Scanner dhimas = new Scanner(System.in);
        JajarGenjang[] arrJg = new JajarGenjang[5];
        
        for(int i=0;i<arrJg.length;i++){
            arrJg[i] = new JajarGenjang();
            System.out.println("Jajar genjang ke-"+i);
            System.out.print("Masukkan tinggi: ");
            arrJg[i].tinggi = dhimas.nextInt();
            System.out.print("Masukkan panjang: ");
            arrJg[i].panjang = dhimas.nextInt();
            System.out.print("Masukkan sisi miring: ");
            arrJg[i].sisiMiring = dhimas.nextInt();
        }
        System.out.println("");
        for(int i=0;i<arrJg.length;i++){
            System.out.println("Luas jajar genjang ke-"+i+": "+arrJg[i].hitungLuas());
            System.out.println("Keliling jajar genjang ke-"+i+": "+arrJg[i].hitungKeliling());
        }
    }
}
