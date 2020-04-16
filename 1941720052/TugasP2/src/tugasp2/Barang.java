/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasp2;

/**
 *
 * @author Windows 10
 */
import java.util.Scanner;

public class Barang {

    String nama;
    int hargaSatuan, jumlah;

    int hitungHargaTotal() {
        return hargaSatuan * jumlah;
    }

    int hitungDiskon() {
        int diskon = 0;
        if (hitungHargaTotal() > 100000) {
            diskon = hitungHargaTotal() * 10 / 100;
        } else if (hitungHargaTotal() >= 50000 && hitungHargaTotal() <= 100000) {
            diskon = hitungHargaTotal() * 5 / 100;
        } else {
            diskon=0;
        }
        return diskon;

    }

    int hitungHargaBayar() {
        return hitungHargaTotal() - hitungDiskon();
    }
}
