public class Barang {
    public String nama;
    public int hargaSatuan, jumlah;
    
    int hitungHargaTotal(){
        return hargaSatuan * jumlah;
    }
    int hitungDiskon(int n){
        if(n>100000){
            return (n/10);
        }else if(n>=50000 && n<=100000){
            return (5*n)/100;
        }else{
            return 0;
        }
    }
    int hitungHargaBayar(int harga, int diskon){
        return harga-diskon;
    }
}
