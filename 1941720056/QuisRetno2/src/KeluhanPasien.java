
public class KeluhanPasien {
    int no_pilihan;
    String keluhan;
    int waktu;

    public KeluhanPasien(int no_pilihan, String keluhan, int waktu) {
        this.no_pilihan = no_pilihan;
        this.keluhan = keluhan;
        this.waktu = waktu;
    }

    public int getNo_pilihan() {
        return no_pilihan;
    }

    public void setNo_pilihan(int no_pilihan) {
        this.no_pilihan = no_pilihan;
    }

    public String getKeluhan() {
        return keluhan;
    }

    public void setKeluhan(String keluhan) {
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
        return no_pilihan+"\t"+keluhan+"\t"+waktu;
    }
}
