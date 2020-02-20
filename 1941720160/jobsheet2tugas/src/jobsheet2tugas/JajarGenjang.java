package jobsheet2tugas;

/**
 *
 * @author khoirul
 */
public class JajarGenjang {
    int tinggi, panjang, sisi_miring;
    
    int hitungLuas(){
        return panjang * tinggi;
    }
    
    int hitungKeliling(){
        return 2*(panjang + sisi_miring);
    }
}
