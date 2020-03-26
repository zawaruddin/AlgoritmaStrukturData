
package mminggu8;
import java.util.Scanner;
public class PostfixMain {
    public static void main(String[] args) {
         Scanner retno = new Scanner (System.in);
         String P,Q;
         System.out.println("Masukkan ekspresi matematika: ");
         Q = retno.nextLine();
         Q = Q.trim();
         Q = Q+ ")";
         
         int total =Q.length();
         Postfix post = new Postfix(total);
         P = post.konversi(Q);
         System.out.println("Postfix: "+P);
    } 
}
