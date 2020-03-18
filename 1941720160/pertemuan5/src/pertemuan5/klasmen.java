package pertemuan5;

/**
 *
 * @author khoirul
 */
public class klasmen {
    String namaTim;
    int main;
    int selisihGoal;
    int poin;

    klasmen(String namaTim, int main, int selisihGoal, int poin){
    this.namaTim = namaTim;
    this.main = main;
    this.selisihGoal = selisihGoal;
    this.poin = poin;
    }

    void tampil() {
        System.out.println("---------------------------------");
        System.out.println("Nama Tim : " + namaTim);
        System.out.println("Main : " + main);
        System.out.println("Selisih Goal : " + selisihGoal);
        System.out.println("Poin : " + poin);
    }

    public static void insertionSort(klasmen[] arr, boolean ascending) {
        int i, j;
        for (i = 1; i < arr.length; i++) {
            klasmen temp;
            temp = arr[i];
            j = i;
            if (ascending == true) {
                while ((j > 0) && (arr[j - 1].poin > temp.poin)) {
                    arr[j] = arr[j - 1];
                    j--;
                }
            } else {
                while ((j > 0) && (arr[j - 1].poin < temp.poin)) {
                    arr[j] = arr[j - 1];
                    j--;
                }
            }
            arr[j] = temp;
        }
    }

}
