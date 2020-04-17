package TugasMinggu5;

public class KlasemenMain {
    public static void main(String[] args) {
        String[] tim = { "Arsenal", "Aston Villa", "Bournemouth", "Crystal Palace", "Everton", "Leicester City",
                "Liverpool", "Manchester City", "Manchester United", "Newcastle United", "Norwich City",
                "Sheffield United", "Southampton", "Tottenham Hotspur", "Watford", "West Ham United",
                "Wolverhampton Wanderers","Bumiety","Brighton & Hove Albion", "AFC Bournemouth" };
        int[] main = { 28, 27, 29, 29, 29, 29, 29, 28, 29, 27, 28, 29, 29, 28, 29, 29, 29, 29, 29, 29 };
        int[] selisihGol = { 4, -18, -18, -8, -6, 9, -6, -6, 26, 45, 39, 12, -16, -27, 5, -17, 7, -17, -15, 7 };
        int[] poin = { 40, 25, 27, 29, 39, 48, 39, 37, 50, 82, 57, 42, 35, 21, 43, 34, 41, 27, 27, 43 };
        Klasemen K = new Klasemen(tim[0],0,0,0);
        
        for (int i = 0; i < 20; i++) {
            K.kl[i] = new Klasemen(tim[i],main[i],selisihGol[i],poin[i]);
        }
        System.out.println("Data Sebelum Pengurutan");
        for(int i=0;i<5;i++){
            System.out.println("---------------------------");
            K.kl[i].tampil();
        }
        System.out.println("---------------------------------------------------");
        System.out.println("Setelah Sorting Metode Insertion Sort Ascending: ");
        K.kl[0].ascending = true;
        K.insertionSort();
        for (int i = 0; i < tim.length; i++) {
            K.kl[i].tampil();
        }
        System.out.println("=====================================");
        System.out.println("Setelah Sorting Metode Insertion Sort Descending: ");
        K.kl[0].ascending = false;
        K.insertionSort();
        for (int i = 0; i < tim.length; i++) {
            K.kl[i].tampil();
        }
    }
}
