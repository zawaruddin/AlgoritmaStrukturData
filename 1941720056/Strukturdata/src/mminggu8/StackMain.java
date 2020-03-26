
package mminggu8;
import java.util.Scanner;
public class StackMain {
    public static void main(String[] args) {
        Scanner retno = new Scanner (System.in);
        Stack tumpukan = new Stack (4);
        
        for (int i = 0; i <tumpukan.size ; i++) {
            System.out.print("Masukkan isi stack : ");
            int n = retno.nextInt();
            tumpukan.push(n);
        }
        
        tumpukan.print();
        
        tumpukan.pop();
        tumpukan.peek();
        tumpukan.print();
    }
    
}
