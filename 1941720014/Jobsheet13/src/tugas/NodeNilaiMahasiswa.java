package tugas;

/**
 *
 * @author Aulafz
 */
public class NodeNilaiMahasiswa {

    NodeNilaiMahasiswa prev, next;
    String nama;
    int nilai;

    NodeNilaiMahasiswa(NodeNilaiMahasiswa prev, String nama, int nilai, NodeNilaiMahasiswa next) {
        this.prev = prev;
        this.nama = nama;
        this.nilai = nilai;
        this.next = next;
    }
}
