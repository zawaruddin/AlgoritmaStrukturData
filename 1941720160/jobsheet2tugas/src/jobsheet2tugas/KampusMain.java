package jobsheet2tugas;

import java.util.Scanner;

/**
 *
 * @author khoirul
 */
public class KampusMain {
    public static void main(String[] args) {
        Scanner irul = new Scanner(System.in);
        System.out.print("Jumlah Mahasiswa: ");
        int jml = irul.nextInt();
        Kampus kmps[] = new Kampus[jml];
        
        for(int a=0; a<kmps.length; a++){
            System.out.print("Mhs "+(a+1));
            kmps[a] = new Kampus();
            System.out.print("Nilai 1: ");
            kmps[a].nilai1 = irul.nextInt();
            System.out.print("Nilai 2: ");
            kmps[a].nilai2 = irul.nextInt();
        }
        System.out.println();
        for(int a=0; a<kmps.length; a++){
            System.out.println("Mhs "+(a+1));
            System.out.println("Nilai 1: "+kmps[a].nilai1);
            System.out.println("Nilai 2: "+kmps[a].nilai2);
            
        }
        System.out.println();
        for(int a=0; a<kmps.length; a++){
            System.out.println("Nilai Terbaik Mhs "+(a+1)+" : "+kmps[a].nilaiTerbaik());
            
        }
    }
}
