package minggu4;

import java.util.Scanner;

public class FibonacciMain {

    public static void main(String[] args) {
        Scanner dhimas = new Scanner(System.in);
        Fibonacci fb = new Fibonacci();
        System.out.print("Masukkan angka: ");
        fb.angka = dhimas.nextInt();

        fb.hitungFiboBF(fb.angka);
        System.out.println("");
        for (int i = 0; i < fb.angka; i++) {
            System.out.print(fb.hitungFiboDC(i)+" ");
        }
    }
}
