package strukturdata;

/**
 *
 * @author Faris Ikhlasul H
 */
public class Barang {

    /**
     * @param args the command line arguments
     */
    String namaBarang,jenisBarang;
    int stok,hargaSatuan;
    Barang(){    
    }
    Barang(String nm,String jn,int st,int hs){
        namaBarang =nm;
        jenisBarang = jn;
        stok = st;
        hargaSatuan = hs;
    }
    void tampilBarang() {
        System.out.println("Nama = "+namaBarang);
        System.out.println("Jenis = "+jenisBarang);
        System.out.println("Strok = "+stok);
        System.out.println("Harga Satuan = "+hargaSatuan);
    }
    void tambahStok(int n){
        stok = stok+n;
    }
    void kurangiStok(int n){
        if(stok > 0){
        stok = stok-n;
        }
    }
    int hitungHargaTotal(int jumlah){
        return jumlah*hargaSatuan;
    }
    
}