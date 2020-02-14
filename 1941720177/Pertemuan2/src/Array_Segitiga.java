/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author RasyidPC
 */
public class Array_Segitiga {

    public static void main(String[] args) {
        Segitiga sgArray[] = new Segitiga[4];

        sgArray[0] = new Segitiga();
        sgArray[0].alas = 10;
        sgArray[0].tinggi = 4;

        sgArray[1] = new Segitiga();
        sgArray[1].alas = 20;
        sgArray[1].tinggi = 10;

        sgArray[2] = new Segitiga();
        sgArray[2].alas = 15;
        sgArray[2].tinggi = 6;

        sgArray[3] = new Segitiga();
        sgArray[3].alas = 25;
        sgArray[3].tinggi = 10;

        for (int t = 0; t < sgArray.length; t++) {
            System.out.println("Segitiga ke- " + (t + 1));
            System.out.println("Alas: " + sgArray[t].alas + ", tinggi: " + sgArray[t].tinggi);
            System.out.println("Luas segitiga ke-" + t + " : " + sgArray[t].hitungLuas(sgArray[t].alas, sgArray[t].tinggi));
            System.out.println("Keliling segitiga ke-" + t + " : " + sgArray[t].hitungKeliling(sgArray[t].alas, sgArray[t].alas, sgArray[t].alas));
            System.out.println();
        }
    }

}
