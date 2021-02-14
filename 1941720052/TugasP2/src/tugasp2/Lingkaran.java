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
public class Lingkaran {

    double phi = 3.14;
    double r;

    double hitungLuas() {
        return phi * r * r;
    }

    double hitungKeliling() {
        return phi * 2 * r;
    }

}
