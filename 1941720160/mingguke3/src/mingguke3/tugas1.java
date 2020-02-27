package mingguke3;

/**
 *
 * @author khoirul
 */
public class tugas1 {
   public String namaMhs;
    public int nilaiTugas;
    public int nilaiKuis;
    public int nilaiUTS;
    public int nilaiUAS;
    public int banyakElemen;

    public double hitungTotal(){
        double total;
        total = (nilaiTugas*30/100)+(nilaiKuis*20/100)+(nilaiUTS*20/100)+(nilaiUAS*30/100);
        return total;
    }
}
