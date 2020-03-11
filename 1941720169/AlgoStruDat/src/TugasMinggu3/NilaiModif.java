
package TugasMinggu3;

public class NilaiModif {
    public String namaMhs;
    public int nilaiTugas, nilaiKuis, nilaiUTS, nilaiUAS;
    
    public double HitungTotalNilaiDC(int n){
        if(n < 1){
            return 0;
        }else{
            double lsum = (nilaiTugas+nilaiUAS)*0.3;
            double rsum = (nilaiKuis+nilaiUTS)*0.2;
            return lsum+rsum;
        }
    }
}
