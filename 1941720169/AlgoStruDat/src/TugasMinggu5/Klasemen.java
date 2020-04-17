package TugasMinggu5;

public class Klasemen {
    String namaTim;
    int main;
    int selisihGol;
    int poin;
    boolean ascending;
    Klasemen kl[]=new Klasemen[20];

    Klasemen(String n, int m, int s, int p){
    this.namaTim = n;
    this.main = m;
    this.selisihGol = s;
    this.poin = p;
    }

    void tampil() {
        System.out.println("Nama Tim        : " + namaTim);
        System.out.println("Main            : " + main);
        System.out.println("Selisih Goal    : " + selisihGol);
        System.out.println("Poin            : " + poin);
    }

    void insertionSort() {
        int i, j;
        for (i = 1; i < kl.length; i++) {
            Klasemen temp;
            temp = kl[i];
            j = i;
            if (ascending==true) {
                while ((j > 0) && (kl[j - 1].poin > temp.poin)) {
                    kl[j] = kl[j - 1];
                    j--;
                }
            } else {
                while ((j > 0) && (kl[j - 1].poin < temp.poin)) {
                    kl[j] = kl[j - 1];
                    j--;
                }
            }
            kl[j] = temp;
        }
    }
}
