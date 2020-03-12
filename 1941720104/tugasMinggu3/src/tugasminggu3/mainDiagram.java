/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasminggu3;

/**
 *
 * @author Daffa Cahyo
 */
import java.util.Scanner;

public class mainDiagram {

    public static void main(String[] args) {
        Scanner daffa = new Scanner(System.in);
        diagram dg = new diagram();
        System.out.println("===============SYSTEM ON===============");
        diagram[] dig = new diagram[dg.jmlhKandidat];
        for (int i = 0; i < dg.jmlhKandidat; i++) {
            dig[i] = new diagram();
            System.out.print("Nama Kandidat ke - " + (i + 1) + ": ");
            dig[i].kandidat = daffa.nextLine();
        }
        System.out.println("===================================");
        for (int i = 0; i < dg.jmlhKandidat; i++) {
            System.out.print("Jumlah Suara Kandidat ke - " + (i + 1) + ": ");
            dig[i].suara = daffa.nextInt();
            dg.jmlhSuara += dig[i].suara;
        }
        int hasil = dg.hitung(dg.jmlhSuara, dig[0].suara, dig[1].suara, dig[2].suara, dig[3].suara);
        if (hasil == 0) {
            System.out.println("Setiap kandidat memiliki mayoritas yang hampir sama");
        } else {
            System.out.println("Ketua BEM yang terpilih adalah: " + dig[hasil - 1].kandidat);
        }
        System.out.println("===============SYSTEM OFF===============");
    }
}