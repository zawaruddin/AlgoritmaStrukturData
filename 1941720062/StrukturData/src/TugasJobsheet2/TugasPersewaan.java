package TugasJobsheet2;

/**
 *
 * @author Faris Ikhlasul H
 */
public class TugasPersewaan {
        public String namaGame;
        public int pinjamHari;
        public int sewaPerhari;
        
    
    public TugasPersewaan(String name, int HS, int count) {
        namaGame = name;
        pinjamHari = count;
        sewaPerhari = HS;
    }

    TugasPersewaan() {
    }
    void tampilBarang() {
        System.out.println("Nama = " + namaGame);
        System.out.println("Jumlah Hari = " + pinjamHari);
        System.out.println("Harga Sewa Perhari = " + sewaPerhari);
    }
    double perhitungan() {
        return sewaPerhari * pinjamHari;
    }
}
