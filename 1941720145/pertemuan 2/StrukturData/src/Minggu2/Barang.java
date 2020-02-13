package Minggu2;
public class Barang {
    String namaBarang, jenisBarang;
    int stok, hargaSatuan;
    
    Barang() {
    }
    Barang (String nm, String jn, int st, int hs) {
        namaBarang = nm;
        jenisBarang = jn;
        stok = st;
        hargaSatuan = hs;
    }
    
    void tampilBarang() {
        System.out.println("Nama \t : " + namaBarang);
        System.out.println("Jenis \t :" + jenisBarang);
        System.out.println("Stok \t : " + stok);
        System.out.println("Harga Satuan \t : " + hargaSatuan);
    }
    
    void tambahStok(int n) {
        if (stok>0) {
            stok= stok+n;
        }
    }
    void kurangStok(int n) {
        stok = stok-n;
    }
    int hitungHargaTotal (int jumlah) {
        return jumlah*hargaSatuan;
    }
}
