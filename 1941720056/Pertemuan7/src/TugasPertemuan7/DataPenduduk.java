
package TugasPertemuan7;

public class DataPenduduk {
    public String nama,alamat,jenisKelamin;
    public int NIK;
    DataPenduduk DP[];
    
    DataPenduduk(int j){
        DP = new DataPenduduk[j];
    }
    
    DataPenduduk (int nik,String nm,String al, String jk){
        NIK=nik;
        nama = nm;
        alamat = al;
        jenisKelamin=jk;
    }
   
    public void insertionSort(){
        for (int i = 0; i < DP.length; i++) {
            DataPenduduk temp[] = new DataPenduduk[DP.length];
            temp[i] = DP[i];
            int j=i;
            while((j>0)&&(DP[j-1].NIK>temp[i].NIK)){
                DP[j]=DP[j-1];
                j--;
            }
            DP[j]=temp[i];
        }
    }
    
    public int FindBinarySearch(int cari,int left,int right){
        int mid ;
        if (right >= left) {
            mid = (left + right) / 2;
            if (DP[mid].NIK== cari) {
                return mid;
            } else if (DP[mid].NIK > cari) {
                return FindBinarySearch(cari,  left, mid - 1);
            } else {
                return FindBinarySearch(cari, mid + 1, right);
            }
        }
        return -1;
    }
    
    public void Tampilposisi(int x,int pos){
    if(pos!=-1){
        System.out.println("data NIK : "+x+" ditemukan pada indeks ke-"+pos);
        System.out.println("NIK : "+DP[pos].NIK);
        System.out.println("Nama : "+DP[pos].nama);
        System.out.println("Alamat : "+DP[pos].alamat);
         System.out.println("JenisKelamin : "+DP[pos].jenisKelamin);
    }else {
         System.out.println("data "+x+" tidak ditemukan");
    }
}
    
    
}
