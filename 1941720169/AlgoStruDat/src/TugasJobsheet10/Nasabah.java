package TugasJobsheet10;

public class Nasabah {
    String noRekening, nama;
    
    Nasabah(String noRek, String nm){
        noRekening = noRek;
        nama = nm;
    }
    Nasabah(){
        
    }
    public void print(){
        System.out.println("Nama: "+nama);
        System.out.println("Nomor Rekening: "+noRekening);
    }
}
