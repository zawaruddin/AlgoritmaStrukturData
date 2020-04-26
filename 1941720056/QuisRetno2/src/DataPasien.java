
public class DataPasien {
int no;
    String nama;
    int keluhan;
    int waktu;

    public DataPasien() {
    }

    public DataPasien(int no, String nama, int keluhan, int waktu) {
        this.no = no;
        this.nama = nama;
        this.keluhan = keluhan;
        this.waktu = waktu;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getKeluhan() {
        return keluhan;
    }

    public void setKeluhan(int keluhan) {
        this.keluhan = keluhan;
    }

    public int getWaktu() {
        return waktu;
    }

    public void setWaktu(int waktu) {
        this.waktu = waktu;
    }

    @Override
    public String toString() {
        return no+"\t"+nama+"\t"+keluhan+"\t"+waktu;
    }   
}
