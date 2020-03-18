
package pertemuan5;

/**
 *
 * @author khoirul
 */
public class tugas1 {

  String tujuan;
    float bagasi;
    int durasi, harga;

    tugas1(String tujuan, float bagasi, int durasi, int harga) {
    this.tujuan = tujuan;
    this.bagasi = bagasi;
    this.durasi = durasi;
    this.harga = harga;
    }

    void tampil() {
        System.out.println("Tujuan Penerbangan : " + tujuan);
        System.out.println("Berat bagasi : " + bagasi);
        System.out.println("Durasi Penerbangan : " + durasi);
        System.out.println("Harga Tugas1 : " + harga);
    }

    public static void bubbleSort(tugas1[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j].harga < arr[j - 1].harga) {
                    tugas1 tmp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = tmp;
                }
            }
        }
    }

    public static void selectionSort(tugas1[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int idxMin = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j].harga < arr[idxMin].harga) {
                    idxMin = j;
                }
            }
            tugas1 tmp = arr[idxMin];
            arr[idxMin] = arr[i];
            arr[i] = tmp;
        }
    }
}