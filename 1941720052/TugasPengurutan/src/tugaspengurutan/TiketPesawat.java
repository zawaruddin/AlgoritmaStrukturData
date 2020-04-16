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
public class TiketPesawat {

    String TempatTuju;
    float bagasi;
    int waktu, harga;

    TiketPesawat(String TempatTuju, float bagasi, int waktu, int harga) {
    this.TempatTuju = TempatTuju;
    this.bagasi = bagasi;
    this.waktu = waktu;
    this.harga = harga;
    }

    void tampil() {
        System.out.println("TempatTuju Penerbangan : " + TempatTuju);
        System.out.println("Berat bagasi : " + bagasi);
        System.out.println("waktu Penerbangan : " + waktu);
        System.out.println("Harga TiketPesawat : " + harga);
    }

    public static void bubbleSort(TiketPesawat[] arr) {
        for (int a = 0; a < arr.length - 1; a++) {
            for (int b = 1; b < arr.length - a; b++) {
                if (arr[b].harga < arr[b - 1].harga) {
                    TiketPesawat tmp = arr[b];
                    arr[b] = arr[b - 1];
                    arr[b - 1] = tmp;
                }
            }
        }
    }

    public static void selectionSort(TiketPesawat[] arr) {
        for (int a = 0; a < arr.length; a++) {
            int idxMin = a;
            for (int b = a + 1; b < arr.length; b++) {
                if (arr[b].harga < arr[idxMin].harga) {
                    idxMin = b;
                }
            }
            TiketPesawat tmp = arr[idxMin];
            arr[idxMin] = arr[a];
            arr[a] = tmp;
        }
    }
    
}
