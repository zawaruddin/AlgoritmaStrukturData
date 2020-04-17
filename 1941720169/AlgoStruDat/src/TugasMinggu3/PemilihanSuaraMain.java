package TugasMinggu3;

import java.util.Arrays;
import java.util.Scanner;

public class PemilihanSuaraMain {

    public static void main(String[] args) {
        Scanner dhimas = new Scanner(System.in);
        Scanner arbi = new Scanner (System.in);
        System.out.print("Masukkan jumlah kandidat: ");
        int jml = dhimas.nextInt();
        System.out.print("Masukkan jumlah pemilih: ");
        int jmlPemilih = dhimas.nextInt();
        PemilihanSuara ps = new PemilihanSuara(jml,jmlPemilih);
        for (int i = 0; i < jml; i++) {
            System.out.print("Masukkan nama kandidat-" + (i + 1)+": ");
            ps.nama[i] = arbi.nextLine();
            ps.noUrut[i] = (i+1);
        }
        for(int i=0;i<jmlPemilih;i++){
            System.out.print("Masukkan pilihan (1-"+jml+"): ");
            ps.suara[i] = dhimas.nextInt();
        }
        for (int i = 0; i < jml; i++) {
            //System.out.println(ps.suara[i]);
            System.out.println("Perhitungan total suara kandidat " + ps.nama[i] + " : " + Arrays.toString(ps.hitungPemilihan(ps.suara[i], 0, ps.jmlKandidat-1)));
        }
    }
}
