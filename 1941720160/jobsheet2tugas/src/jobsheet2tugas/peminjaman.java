package jobsheet2tugas;

/**
 *
 * @author khoirul
 */
public class peminjaman {
    int id,lama_pinjam,harga_sewa,tot_harga;
    String nama_member, nama_game;
    
    void DataPeminjaman(){
        System.out.println("ID \t\t\t : " + id);
        System.out.println("Nama Member \t\t : " + nama_member);
        System.out.println("Lama Pinjam \t\t : " + lama_pinjam);
        System.out.println("Harga Sewa @hari \t : " + harga_sewa);
    }
    
    void hitungtotalHarga(){
        tot_harga = lama_pinjam * harga_sewa;
        System.out.println("Total Harga \t\t : " + tot_harga);
    }
}
