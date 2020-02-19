package TugasJobsheet2;

/**
 *
 * @author Faris Ikhlasul H
 */
public class TugasBarang {

    public String nama;
    public int HargaSatuan;
    public int jumlah;
    public double berhitung;

    TugasBarang() {
    }
    public TugasBarang(String name, int HS, int count) {
        nama = name;
        jumlah = count;
        HargaSatuan = HS;
    }
    void tampilBarang() {
        System.out.println("Nama = " + nama);
        System.out.println("Jumlah = " + jumlah);
        System.out.println("Harga Satuan = " + HargaSatuan);
    }
    double hitungHargatotal() {
        return HargaSatuan * jumlah;
    }
    double hitungDiskon() {
        if (hitungHargatotal() > 100000) {
            System.out.println("Mendapat Diskon 10%");
            berhitung = hitungHargatotal() * 0.1;
        } else if (hitungHargatotal() >= 50000 && hitungHargatotal() <= 100000) {
            System.out.println("Mendapat Diskon 5%");
            berhitung = hitungHargatotal() * 0.05;
        } else {
            System.out.println("Tidak Mendapat Diskon");
             berhitung = hitungHargatotal();
        }
        return berhitung;
    }
    double hitungHargaBayar() {
        return hitungHargatotal() - hitungDiskon();
    }
}