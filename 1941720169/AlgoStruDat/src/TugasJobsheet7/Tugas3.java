package TugasJobsheet7;

public class Tugas3 {

    public int data[], jmlData, maks;

    Tugas3(int d[], int n) {
        this.jmlData = n;
        data = d;
    }

    void insertionSort() {
        int i, j;
        for (i = 1; i < jmlData; i++) {
            int temp;
            temp = data[i];
            j = i;
            while ((j > 0) && (data[j - 1] > temp)) {
                data[j] = data[j - 1];
                j--;
            }
            data[j] = temp;
        }
    }

    public void tampilData() {
        for (int i = 0; i < jmlData; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println("");
    }

    public int FindBinarySearch(int cari,int left, int right) {
        int mid;
        if (right >= left) {
            mid = (left + right) / 2;
            if (data[mid] == cari) {
                maks = data[mid];
                return (mid);
            } else if (data[mid] < cari) {
                return FindBinarySearch(cari, left, mid - 1);
            } else {
                return FindBinarySearch(data[mid], mid + 1, right);
            }
        }
        return -1;
    }

    public void TampilPosisi(int x, int pos) {
        if (pos != -1) {
            System.out.println("data: " + x + " ditemukan pada indeks " + pos);
        } else {
            System.out.println("data: " + x + " tidak ditemukan");
        }
    }
}
