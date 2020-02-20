package jobsheet2tugas;

/**
 *
 * @author khoirul
 */
public class tugas3 {
        

    
    String Nama;
    int hrgSatuan, jml;
    
    int hitungHrgTot(){
        return hrgSatuan * jml;
    }
    
    int hitungDiskon(){
        int total = hitungHrgTot();
        int diskon = 0;
        if (total > 100000){
            return diskon = total * 10/100;
        }else if (total >= 50000 && total <= 100000){
            return diskon = total * 5/100;
        }else{
            return diskon;
        }
    }
    int hitungHargaBayar(){
        int diskon = hitungDiskon();
        return hitungHrgTot() - diskon;
    }
}