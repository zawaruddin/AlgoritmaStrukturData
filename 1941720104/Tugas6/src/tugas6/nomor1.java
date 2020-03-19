/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas6;

/**
 *
 * @author Daffa Cahyo
 */
public class nomor1 {
    String tujuan;
    float bagasi;
    int durasi, harga;

    nomor1(String tujuan, float bagasi, int durasi, int harga) {
    this.tujuan = tujuan;
    this.bagasi = bagasi;
    this.durasi = durasi;
    this.harga = harga;
    }

    void tampil() {
        System.out.println("Tujuan penerbangan  : " + tujuan);
        System.out.println("Berat bagasi        : " + bagasi);
        System.out.println("Waktu penerbangan   : " + durasi);
        System.out.println("Harga nomor1        : " + harga);
    }

    public static void bubbleSort(nomor1[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j].harga < arr[j - 1].harga) {
                    nomor1 tmp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = tmp;
                }
            }
        }
    }

    public static void selectionSort(nomor1[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int idxMin = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j].harga < arr[idxMin].harga) {
                    idxMin = j;
                }
            }
            nomor1 tmp = arr[idxMin];
            arr[idxMin] = arr[i];
            arr[i] = tmp;
        }
    }
}