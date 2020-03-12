package TugasMinggu5;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner dhimas = new Scanner(System.in);
        Scanner arbi = new Scanner(System.in);
        String namaPesawat[] = {"Garuda", "Citilink", "Lion", "Batik", "Sriwijaya"};
        float hgSbyJkt[] = {1418000, 634000, 480000, 544000, 502000};
        //garuda, citi,lion, batik,sriwijaya, 
        float hgSbyYog[] = {1741000, 506000, 687000, 1023000, 587000};
        //garuda citi, lion, batik, sriwijaya, 
        float hgSbyBali[] = {796000, 452000, 303000, 376000, 969000};
        // garuda,citi, lion, batik, sriwijaya
        int stokTiket[] = {393, 215, 180, 180, 168};
        int stokTerjual[] = {150,90,50,75,80};
        int stokAda[] = {243,125,130,105,88};
        
        for (int i = 0;i<namaPesawat.length;i++) {
            //Tiket t = new Tiket(namaPesawat[i],0,0,0);
            stokAda[i]=stokTiket[i]-stokTerjual[i];
            System.out.println((i+1)+". "+namaPesawat[i]);
            System.out.println("Tiket "+(stokAda[i]+stokTerjual[i]));
            System.out.println("Tiket terjual "+stokTerjual[i]);
            System.out.println("Tiket tersedia "+stokAda[i]);
        }
        System.out.println("Tujuan\n1. Surabaya - Jakarta\n2. Surabaya - Yogyakarta\n3. Surabaya - Bali");
        
    }
}
