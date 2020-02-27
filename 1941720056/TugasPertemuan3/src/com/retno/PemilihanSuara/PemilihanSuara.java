package com.retno.PemilihanSuara;
import java.util.Arrays;
public class PemilihanSuara {
     public int[] suara;
    public int kandidat;

    public PemilihanSuara(int[] suara, int kandidat) {
        this.suara = suara;
        this.kandidat = kandidat;
        urutkan(this.suara, 0, this.suara.length - 1);
    }

    private int jumlahSuara(int r, int[] arr) {
        int length = arr.length;
        if (length == 0) {
            return 0;
        } else if (length == 1) {
            if (r == arr[0]) {
                return 1;
            } else {
                return 0;
            }
        }
        int mid = length / 2;
        return jumlahSuara(r, Arrays.copyOfRange(arr, 0, mid)) + jumlahSuara(r, Arrays.copyOfRange(arr, mid, arr.length));
    }

    private int pindah(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;

                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    private void urutkan(int[] arr, int low, int high) {
        if (low < high) {
            int pi = pindah(arr, low, high);

            urutkan(arr, low, pi - 1);
            urutkan(arr, pi + 1, high);
        }
    }

    public int nilaiTerbanyak(int n, int[] arr) {
        if (n == -1) {
            return 0;
        } else {
            return Math.max(jumlahSuara(n, arr), nilaiTerbanyak(n - 1, arr));
        }
    }

    public int pemenang(){
        int nilaiTerbanyak = nilaiTerbanyak(kandidat, suara);
        int jumlah = 0;
        int kandidatIndex = kandidat;

        for (int i = 0; i < kandidat; i++) {
            for (int j = 0; j < suara.length; j++) {
                if(suara[j] == kandidatIndex){
                    jumlah++;
                }
                if(jumlah == nilaiTerbanyak) break;
            }
            if(jumlah != nilaiTerbanyak){
                kandidatIndex--;
                jumlah = 0;
            }else{
                break;
            }
        }
        return kandidatIndex;
    }
}
