package Minggu8;
import java.util.Scanner;
public class StackMain {
    public static void main(String[] args) {
        Scanner dhimas = new Scanner(System.in);
        Scanner arbi = new Scanner(System.in);
        System.out.print("Masukkan size stack: ");
        int size = arbi.nextInt();
        Stack tumpukan = new Stack(size);
        for(int i=0;i< tumpukan.size;i++){
            System.out.print("Masukkan data: ");
            int n = dhimas.nextInt();
            tumpukan.push(n);
        }

        tumpukan.print();
        tumpukan.pop();
        tumpukan.peek();
        tumpukan.print();
        
    }
}
