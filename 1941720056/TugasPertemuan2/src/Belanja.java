
public class Belanja {
 public String nama;
 public int hargaSatuan,jumlah,hargaTotal,diskon;
 
 Belanja(){    
 }
 Belanja(String nm , int hs , int ht,int jm){
     nama = nm;
     hargaSatuan = hs;
     hargaTotal = ht;
     jumlah = jm;
 }
 
 int hitungHargaTotal(int hs ,int jm){
     int bayar = hs * jm ;
     return bayar;
 }
 
 int cekHargaBarang(String a){
     int harga ;
     if (a.equalsIgnoreCase("Meja")){
         harga = 25000;
     }else if (a.equalsIgnoreCase("Kursi")){
         harga = 15000;
     }else if(a.equalsIgnoreCase("Lemari")){
         harga = 120000;
     }else if (a.equalsIgnoreCase("Lampu")){
         harga = 10000;
     }else {
         harga=0;
     }
     return harga;
 }
 
 
 int Diskon(int harga){
     int dskn;
     if (harga>100000){
         dskn=harga*10/100;
     }else if(harga>=50000 && harga<=100000){
        dskn =  harga* 5/100;
    } else{
        dskn = harga*0/100;
    }
     return dskn;
 }
 int hitungHargaBayar(int bayar, double diskon){
     int bayr = (int) (bayar - diskon);
     return bayr;
 }
 
}
