package TugasMinggu3;

public class NilaiAlgoritma {
    public String namaMhs;
    public int nilaiTugas, nilaiKuis, nilaiUTS, nilaiUAS;

    public double hitungTotalNilai(int a) {
        double nilaiTotal=0;
        for (int i = 0; i < a; i++) {
            nilaiTotal = (nilaiTugas*0.3) +(nilaiKuis*0.2) + (nilaiUTS*0.2) + (nilaiUAS*0.3);
        }
        return nilaiTotal;
    }
}
