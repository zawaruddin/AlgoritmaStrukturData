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

public class JajarGenjang {

    int tinggi, panjang, sisiMiring;

    int hitungLuas() {
        return panjang * tinggi;
    }

    int hitungKeliling() {
        return 2 * (panjang + sisiMiring);
    }
}
