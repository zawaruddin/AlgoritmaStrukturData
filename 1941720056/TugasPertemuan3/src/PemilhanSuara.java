public class PemilhanSuara {
    public String namaKandidat;
    public int suara,jumlahSuara,jumlahKandidat;
   public static int nilai = 1;
   
   public static int kontrol=0;
   public static int trm=0,trm2=0;
   public static int arr[] = new int [10000];
   
   
     public static int hitung(int js,int k1, int k2, int k3){
        if (nilai == 5) {
            nilai = 1;
        }
        if (nilai == 1 && k1 > 0) {
            arr [kontrol] = nilai;
            kontrol++;
            nilai++;
            return hitung(js,k1-1,k2,k3);
        }else if (nilai == 2 && k2 > 0) {
            arr [kontrol] = nilai;
            kontrol++;
            nilai++;
            return hitung(js,k1,k2-1,k3);
        }else if (nilai == 3 && k3 > 0){
            arr [kontrol] = nilai;
            kontrol++;
            nilai++;
            return hitung(js,k1,k2,k3-1);
        
        }else if(k1 == 0 && k2 == 0 && k3 == 0 ){
            if (arr [trm] == arr[trm+1] && trm+1 < js) {
                return arr [trm];
            }else if(trm+2 < js){
                trm += 2;
                return hitung(js,k1,k2,k3);
            }else{
                return 0;
            }
        }else{
            nilai++;
            return hitung(js,k1,k2,k3);
        }
    }
}
