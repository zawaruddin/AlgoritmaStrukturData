/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas3;

/**
 *
 * @author Windows 10
 */
public class Bem {

    public int j1, j2, j3, j4, suara[], x;

    Bem(int x) {
        this.x = x;
        this.suara = new int[x];
    }

    int pemilihan(int a) {
        if (a == x) {
            return 0;
        } else {
            if (suara[a] == 1) {
                j1 += 1;
            } else if (suara[a] == 2) {
                j2 += 1;
            } else if (suara[a] == 3) {
                j3 += 1;
            } else if (suara[a] == 4) {
                j4++;
            }
            return pemilihan(a + 1);
        }
    }

}
