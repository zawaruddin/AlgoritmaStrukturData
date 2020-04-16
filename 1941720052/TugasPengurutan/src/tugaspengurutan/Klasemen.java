/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugaspengurutan;

/**
 *
 * @author Windows 10
 */
public class Klasemen {
    String namaGrup;
    int main;
    int selisihGoal;
    int jmlPoin;

    Klasemen(String namaGrup, int main, int selisihGoal, int jmlPoin){
    this.namaGrup = namaGrup;
    this.main = main;
    this.selisihGoal = selisihGoal;
    this.jmlPoin = jmlPoin;
    }

    void tampil() {
        System.out.println("---------------------------------");
        System.out.println("Nama Tim : " + namaGrup);
        System.out.println("Main : " + main);
        System.out.println("Selisih Goal : " + selisihGoal);
        System.out.println("Jumlah Poin : " + jmlPoin);
    }

    public static void insertionSort(Klasemen[] arr, boolean ascending) {
        int a, b;
        for (a = 1; a < arr.length; a++) {
            Klasemen temp;
            temp = arr[a];
            b = a;
            if (ascending == true) {
                while ((b > 0) && (arr[b - 1].jmlPoin > temp.jmlPoin)) {
                    arr[b] = arr[b - 1];
                    b--;
                }
            } else {
                while ((b > 0) && (arr[b - 1].jmlPoin < temp.jmlPoin)) {
                    arr[b] = arr[b - 1];
                    b--;
                }
            }
            arr[b] = temp;
        }
    }

    
}
