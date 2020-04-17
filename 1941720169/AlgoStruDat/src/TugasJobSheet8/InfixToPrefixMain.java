package TugasJobSheet8;

import java.util.Scanner;

public class InfixToPrefixMain {

    public static void main(String[] args) {
        Scanner dhimas = new Scanner(System.in);
        String P, Q, ekspresi="";
        System.out.print("Masukkan ekspresi matematika: ");
        Q = dhimas.nextLine();
        for (int i = (Q.length() - 1); i >= 0; i--) {
            ekspresi = ekspresi + Q.charAt(i);
        }
        ekspresi = ekspresi.trim();
        ekspresi = ekspresi + "(";

        int total = ekspresi.length();

        InfixToPrefix pref = new InfixToPrefix(total);
        P = pref.konversi(ekspresi);
        System.out.println("Prefix: " + P);
    }
}
