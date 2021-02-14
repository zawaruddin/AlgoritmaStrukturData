package Quiz2;

/**
 *
 * @author Aulafz
 */
public class node<T> {
    T no,nama,keluhan,waktu;
    node <T> next;
    
    public node (T no, T nama, T keluhan, T waktu, node<T> next) {
        this.no = no;
        this.nama = nama;
        this.keluhan = keluhan;
        this.waktu = waktu;
        this.next = next;
    }
}
