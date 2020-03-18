package TugasPertemuan6;

public class LigaInggris {
String namaKlub;
int pertandingan;
int agregat;
int poin;

LigaInggris (String nk,int p, int a, int pnt){
    namaKlub = nk;
    pertandingan = p;
    agregat = a;
    poin = pnt;
}

void tampil (){
    
    System.out.println("---------------------------------------");
    System.out.println("Nama Klub : "+namaKlub);
    System.out.println("Jumlah Pertandingan : "+ pertandingan);
    System.out.println("Jumlah Grade : "+ agregat);
    System.out.println("Poin yang diperoleh : " + poin);
}
        
}
