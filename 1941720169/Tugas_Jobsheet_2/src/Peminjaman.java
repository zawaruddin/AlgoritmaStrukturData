public class Peminjaman {
    public String id,namaMember,namaGame;
    public int lamaPinjam, hargaSewa;
    public Peminjaman(){
        
    }
    public Peminjaman(String i,String nmM, String nmG, int lp, int hs){
        id = i;
        namaMember = nmM;
        namaGame = nmG;
        lamaPinjam = lp;
        hargaSewa = hs;
    }
    void tampil(){
        System.out.println("Nama member = " + namaMember);
        System.out.println("Nama Game   = " + namaGame);
        System.out.println("Lama pinjam = " + lamaPinjam);
        System.out.println("Harga Sewa  = " + hargaSewa);
    }
}
