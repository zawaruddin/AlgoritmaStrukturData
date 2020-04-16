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
public class Kampus {

    int nilai1, nilai2;

    int nilaiTerbaik() {
        int maks;
        if (nilai2 < nilai1) {
            maks = nilai1;
        } else {
            maks = nilai2;
        }
        return maks;
    }

}
