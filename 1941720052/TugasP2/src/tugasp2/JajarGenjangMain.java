/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasp2;

import java.util.Scanner;

/**
 *
 * @author Windows 10
 */
public class JajarGenjangMain {
        public static void main(String[] args) {
        Scanner luluk = new Scanner(System.in);
        JajarGenjang jg[] = new JajarGenjang[5];
        for(int a=0; a<jg.length; a++){
            System.out.println("Masukkan jajar genjang ke-"+(a+1));
            jg[a] = new JajarGenjang();
            System.out.print("Masukkan tinggi: ");
            jg[a].tinggi = luluk.nextInt();
            System.out.print("Masukkan panjang:");
            jg[a].panjang = luluk.nextInt();
            System.out.print("Masukkan sisi miring: ");
            jg[a].sisiMiring = luluk.nextInt();
        }
            System.out.println();
            for(int a=0; a<jg.length; a++){
                System.out.println("jajar Genjang ke-"+(a+1));
                System.out.println("Tinggi jajar genjang: "+jg[a].tinggi);
                System.out.println("Panjang jajar genjang: "+jg[a].panjang);
                System.out.println("Sisi miring jajar genjang: "+jg[a].sisiMiring);
                System.out.println("Luas jajar genjang: "+ jg[a].hitungLuas());
                System.out.println("Keliling jajar genjang: "+ jg[a].hitungKeliling());
                System.out.println();
            }
    }
    
}
