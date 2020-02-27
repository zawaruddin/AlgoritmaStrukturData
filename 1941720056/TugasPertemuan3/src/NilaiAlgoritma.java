public class NilaiAlgoritma {
    public String namaMhs;
    public int nilaiTugas,nilaiKuis,nilaiUTS,nilaiUAS;
    
    NilaiAlgoritma(){
        
    }
    NilaiAlgoritma(String nm,int nt,int nk,int nut,int nua){
        namaMhs=nm;
        nilaiKuis=nk;
        nilaiUTS=nut;
        nilaiUAS=nua;
    }
    double hitungTotalNilai(int nt,int nk,int nut,int nua){
        int total = ((nt*30/100)+(nk*20/100)+(nut*20/100)+(nua*30/100));
       return total;
    }
    
    
}
