
package TugasPertemuan6;
import java.util.Scanner;
public class MainLigaInggris {
    public static void main(String[] args) {
        Scanner retno = new Scanner(System.in);
        DaftarLiga data = new DaftarLiga();
        LigaInggris LI [] = new LigaInggris [20];
        
        System.out.println("DAFTAR LIGA INGGRIS ");
        System.out.print("Tampilkan berdasarkan Ascending / Descending : ");
        String pilih = retno.nextLine();
        
        LI [0] = new LigaInggris("Chelsea",29,9,48);
        LI [1] = new LigaInggris("Liverpool",29,45,82);
        LI [2] = new LigaInggris("Arsenal",28,4,40);
        LI [3] = new LigaInggris("Mancheser United",28,12,42);
        LI [4] = new LigaInggris("Everton",29,-6,37);
        LI [5] = new LigaInggris("Manchester City",27,39,57);
        LI [6] = new LigaInggris("Leicestar",28,26,50);
        LI [7] = new LigaInggris("West Ham United",29,-15,27);
        LI [8] = new LigaInggris("Bumley",29,-6,39);
        LI [9] = new LigaInggris("Crystal Palace",29,-6,39);
        LI [10] = new LigaInggris("Bighton & Hove Albion",29,-8,29);
        LI [11] = new LigaInggris("Sheffield United",28,5,43);
        LI [12] = new LigaInggris("New Castel United ",29,-16,35);
        LI [13] = new LigaInggris("Tottenham Hotspur",29,7,41);
        LI [14] = new LigaInggris("Norwich City ",29,-27,21);
        LI [15] = new LigaInggris("Aston Villa ",27,-18,25);
        LI [16] = new LigaInggris("Watford ",29,-17,27);
        LI [17] = new LigaInggris("Southampton ",29,-17,34);
        LI [18] = new LigaInggris("AFC Bournemouth",29,-18,27);
        LI [19] = new LigaInggris("Wolverhampton Wanderers",29,7,43);
        
        for (int i = 0; i < LI.length; i++) {
            data.tambah(LI[i]);
        }
        
        if (pilih.equalsIgnoreCase("ascending") ){
        data.insertionSortAscending();
        data.tampil();
        }else if (pilih.equalsIgnoreCase("Descending")){
            data.insertionSortDescending();
        data.tampil();
        }else{
            System.out.println("Maaf pilihan anda tidak ada!");
        }
        
        
    }
}
