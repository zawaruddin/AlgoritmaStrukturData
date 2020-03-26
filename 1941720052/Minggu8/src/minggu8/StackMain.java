/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu8;

/**
 *
 * @author Windows 10
 */
import java.util.Scanner;

public class StackMain {

    public static void main(String[] args) {
        Scanner luluk = new Scanner(System.in);
        Stack tumpukan = new Stack(4);

        for (int i = 3; i >= 0; i--) {
            System.out.print("Masukkan tumpukan indeks ke-" + i + " : ");
            tumpukan.data[i] = luluk.nextInt();
            tumpukan.push(tumpukan.data[i]);
        }
        tumpukan.print();
        tumpukan.pop();
        tumpukan.peek();
        tumpukan.print();
    }

}
