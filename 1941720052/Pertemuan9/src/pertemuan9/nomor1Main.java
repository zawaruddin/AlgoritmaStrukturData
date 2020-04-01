/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan9;

/**
 *
 * @author Windows 10
 */
import java.util.Scanner;
public class nomor1Main {
    public static void main(String[] args) {
        Scanner luluk = new Scanner(System.in);

        System.out.print("Masukkan kalimat\t: ");
        String kalimat = luluk.nextLine();
        String kata[] = kalimat.split("\\s+");
        nomor1 tumpukan = new nomor1(kata.length);

        for (int i = 0; i < kata.length; i++) {
            tumpukan.push(kata[i]);
        }

        tumpukan.print();

        tumpukan.pop();
        tumpukan.peek();
        tumpukan.print();
    }
    
}
