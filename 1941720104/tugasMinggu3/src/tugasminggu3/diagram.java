/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasminggu3;

/**
 *
 * @author Daffa Cahyo
 */
public class diagram {

    public int suara;
    public int jmlhSuara = 0;
    public int jmlhKandidat = 4;
    public String kandidat;
    public static int hitung1 = 0;
    public static int nilai = 1;
    public static int terima1 = 0;
    public static int terima2 = 0;

    public static int array[] = new int[10000];

    public static int hitung(int js, int kl, int k2, int k3, int k4) {
        if (nilai == 5) {
            nilai = 1;
        }
        if (nilai == 1 && kl > 0) {
            array[hitung1] = nilai;
            hitung1++;
            nilai++;
            return hitung(js, kl - 1, k2, k3, k4);
        } else if (nilai == 2 && k2 > 0) {
            array[hitung1] = nilai;
            hitung1++;
            nilai++;
            return hitung(js, kl, k2 - 1, k3, k4);
        } else if (nilai == 3 && k3 > 0) {
            array[hitung1] = nilai;
            hitung1++;
            nilai++;
            return hitung(js, kl, k2, k3 - 1, k4);
        } else if (nilai == 4 && k4 > 0) {
            array[hitung1] = nilai;
            hitung1++;
            nilai++;
            return hitung(js, kl, k2, k3, k4 - 1);
        } else if (kl == 0 && k2 == 0 && k3 == 0 && k4 == 0) {
            if (array[terima1] == array[terima1 + 1] && terima1 + 1 < js) {
                return array[terima1];
            } else if (terima1 + 2 < js) {
                terima1 += 2;
                return hitung(js, kl, k2, k3, k4);
            } else {
                return 0;
            }
        } else {
            nilai++;
            return hitung(js, kl, k2, k3, k4);
        }
    }
}
