package TugasJobSheet8;

import java.util.Scanner;

public class InfixToPrefixMain {

    public static void main(String[] args) {
        Scanner dhimas = new Scanner(System.in);
        String P, Q;
        System.out.print("Masukkan ekspresi matematika: ");
        Q = dhimas.nextLine();
        Q = Q.trim();
        Q = Q + ")";

        int total = Q.length();

        InfixToPrefix post = new InfixToPrefix(total);
        P = post.konversi(Q);
        System.out.println("Postfix: " + P);
    }
}
