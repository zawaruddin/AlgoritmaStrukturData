import java.util.Scanner;
public class arrayJajargenjang {
    static Scanner retno = new Scanner (System.in);
    
    public static void main(String[] args) {
        JajarGenjang[]arrJjrGj = new JajarGenjang [3];
        
        for (int i = 0; i < 3; i++) {
            arrJjrGj[i] = new JajarGenjang();
            System.out.println("-------------------");
            System.out.println("Jajar Genjang ke-"+i);
            System.out.println("-------------------");
            System.out.print("masukkan tinggi: ");
            arrJjrGj[i].tinggi = retno.nextInt();
            System.out.print("Masukkan panjang: ");
            arrJjrGj[i].panjang = retno.nextInt();
            System.out.print("Masukkan sisi: ");
            arrJjrGj[i].sisi = retno.nextInt();
        }
        System.out.println();
        
        for (int i = 0; i < 3; i++) {
            System.out.println("Jajar Genjang ke-"+i);
            System.out.println("Luas : "+ arrJjrGj[i].hitungLuas(arrJjrGj[i].sisi,arrJjrGj[i].tinggi));
            System.out.println("Keliling : "+ arrJjrGj[i].hitungKeliling(arrJjrGj[i].panjang,arrJjrGj[i].sisi));
            System.out.println("------------------------------------------");
        }
    }
}
