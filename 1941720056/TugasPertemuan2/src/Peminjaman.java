
public class Peminjaman {
    public int ID ;
    public String namaMember;
    public String namaGame;
    public int lamaPinjam;
    public int hargaSewa;
    
    Peminjaman(){
        
    }
    Peminjaman(int id,String nm, String nG,int lp,int hs){
        ID = id ;
        namaMember = nm;
        namaGame = nG;
        lamaPinjam = lp;
        hargaSewa = hs;
        
    }
    
    int hargaBayar(int lp,int hs){
     return lp * hs;
}
}
