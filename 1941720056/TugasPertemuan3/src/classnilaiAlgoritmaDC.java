
public class classnilaiAlgoritmaDC {
     public String namaMhs;
    public int nilaiTugas,nilaiKuis,nilaiUTS,nilaiUAS;
    
    
    double hitungTotalNilai(){
        int total = ((nilaiTugas*30/100)+(nilaiKuis*20/100)+(nilaiUTS*20/100)+(nilaiUAS*30/100));
       return total;
    }
    
}
