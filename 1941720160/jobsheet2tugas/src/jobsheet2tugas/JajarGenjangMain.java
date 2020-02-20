package jobsheet2tugas;

import java.util.Scanner;

/**
 *
 * @author khoirul
 */
public class JajarGenjangMain {
    public static void main(String[] args){
        Scanner irul = new Scanner (System.in);
        JajarGenjang jg[] = new JajarGenjang[5];
        
        for (int i=0; i < jg.length; i++){
            System.out.println("Jajar Genjang ke - " + (i+1));
            jg[i] = new JajarGenjang();
            System.out.println("Panjang \t : ");
            jg[i].panjang = irul.nextInt();
            System.out.println("Tinggi \t\t : ");
            jg[i].tinggi = irul.nextInt();
            System.out.println("Sisi Miring \t : ");
            jg[i].sisi_miring = irul.nextInt();
        }
        System.out.println("====================================");
        for (int i = 0; i<jg.length; i++){
            System.out.println("jajar genjang ke- " + (i+1));
            System.out.println("Panjang \t: "+jg[i].panjang);
            System.out.println("Tinggi t\t : " + jg[i].tinggi);
            System.out.println("Sisi Miring \t : " + jg[i].sisi_miring);
            System.out.println("Luas \t\t : " + jg[i].hitungLuas());
            System.out.println("Keliling \t " + jg[i].hitungKeliling());
            System.out.println();
        }
    }
}
