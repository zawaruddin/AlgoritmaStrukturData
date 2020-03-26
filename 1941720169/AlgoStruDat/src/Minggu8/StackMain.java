package Minggu8;
import java.util.Scanner;
public class StackMain {
    public static void main(String[] args) {
        Scanner dhimas = new Scanner(System.in);
        Stack tumpukan = new Stack(4);
//        for(int i=0;i< tumpukan.size;i++){
//            System.out.print("Masukkan data: ");
//            int n = dhimas.nextInt();
//            tumpukan.push(n);
//        }
        tumpukan.push(15);
        tumpukan.push(31);
        tumpukan.push(9);
        tumpukan.push(12);

        tumpukan.print();
        tumpukan.pop();
// menambahkan data 17 dan 18  
        tumpukan.push(17);
        tumpukan.push(98);
        tumpukan.peek();
        tumpukan.print();
        
    }
}
