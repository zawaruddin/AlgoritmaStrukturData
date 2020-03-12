package quiz;

import java.util.Scanner;

/**
 *
 * @author khoirul
 */
public class mainquiz {
    public static void main(String[] args) {
        Scanner irul = new Scanner(System.in);
        kuis1 main1 = new kuis1();
        kuis2 main2 = new kuis2();

        System.out.println("Masukan Nama : ");
        main1.nama = irul.nextLine();
        System.out.println("===================================");
       
       main1.menghitungChar(main1.nama);
       main2.perbandinganBF(main1.nama);
       
        System.out.println("Brute Force");
        System.out.println("====================================");
        System.out.println("Abjad terkecil : "+ main2.getSmall());
        System.out.println("Abjad terbesar : "+ main2.getBig());
    }
}
