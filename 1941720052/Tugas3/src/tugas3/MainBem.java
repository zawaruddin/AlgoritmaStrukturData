/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas3;

import java.util.Scanner;

/**
 *
 * @author Windows 10
 */
public class MainBem {

    public static void main(String[] args) {
        Scanner luluk = new Scanner(System.in);
        System.out.println("Pemilihan Presiden BEM Tahun 2020");
        System.out.println();
        System.out.println("Kandidat Calon Presiden BEM");
        System.out.println("1.Haris\n2.Dian\n3.Rani\n4.Bisma");
        System.out.println();

        System.out.print("Masukkan suara yang terkumpul: ");
        int jml = luluk.nextInt();
        Bem bm = new Bem(jml);

        for (int a = 0; a < jml; a++) {
            System.out.print("Hasil suara ke-" + (a + 1) + " : ");
            bm.suara[a] = luluk.nextInt();
        }
        bm.pemilihan(0);
        System.out.print("Presiden BEM yang terpilih adalah : ");
        if (bm.j1 > bm.j2 && bm.j1 > bm.j3 && bm.j1 > bm.j4) {
            System.out.println("Haris");
        } else if (bm.j2 > bm.j1 && bm.j2 > bm.j3 && bm.j2 > bm.j4) {
            System.out.println("Bisma");
        } else if (bm.j3 > bm.j1 && bm.j3 > bm.j1 && bm.j3 > bm.j4) {
            System.out.println("Dian");
        } else if (bm.j4 > bm.j1 && bm.j4 > bm.j2 && bm.j4 > bm.j1) {
            System.out.println("Rani");
        }
    }

}
