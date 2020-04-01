import java.util.Scanner;
public class mainTugas3 {
    public static void main(String[] args) {
        Scanner retno = new Scanner (System.in);
        String a,b,ubah ="";
        System.out.print("masukkan notasi infix: ");
        b = retno.nextLine();
        for (int i = (b.length()-1); i >=0; i--) {
           ubah = ubah + b.charAt(i);
        }
        ubah = ubah.trim();
        ubah = ubah + "(";
        
        int jumlah = ubah.length();
        
        Tugas3InfixsPrefix px = new Tugas3InfixsPrefix (jumlah);
        a = px.konversi(ubah);
        System.out.println("Prefix : "+ new StringBuffer(a).reverse());
    }
    
}
