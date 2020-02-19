public class Peminjaman {
    public String ID,namaMember,namaGame;
    public int lamaPinjam, hargaSewa;
    
    public Peminjaman(){
        
    }
    public Peminjaman(String id, String nM, String nG, int lmSewa, int hSewa){
        ID = id;
        namaMember = nM;
        namaGame = nG;
        lamaPinjam = lmSewa;
        hargaSewa = hSewa;
    }
    void tampil(){
        System.out.println("ID member   = " + ID);
        System.out.println("Nama member = " + namaMember);
        System.out.println("Nama Game   = " + namaGame);
        System.out.println("Lama pinjam = " + lamaPinjam);
        System.out.println("Harga Sewa  = Rp." + (lamaPinjam*hargaSewa));
    }

}
