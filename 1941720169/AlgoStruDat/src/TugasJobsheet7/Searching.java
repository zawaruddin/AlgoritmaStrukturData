package TugasJobsheet7;

public class Searching {

    public int data[];
    public int jumData;

    public Searching(int Data[], int jmlData) {
        this.jumData = jmlData;
        data = new int[jmlData];
        for (int i = 0; i < jumData; i++) {
            data[i] = Data[i];
        }
    }

    public int FindSeqSearch(int cari) {
        int posisi = -1;
        for (int j = 0; j < jumData; j++) {
            if (data[j] == cari) {
                posisi = j;
                break;
            }
        }
        return posisi;
    }

    public void tampilData() {
        for (int i = 0; i < jumData; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println("");
    }

    public int FindBinarySearch(int cari, int left, int right) {
        int mid;
        if (right >= left) {
            mid = (left + right) / 2;
            if (cari == data[mid]) {
                return (mid);
            } else if (data[mid] > cari) {
                return FindBinarySearch(cari, left, mid - 1);
            } else {
                return FindBinarySearch(cari, mid + 1, right);
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
    
    public void mergeSort() {
        sort(data, 0, data.length - 1);
    }

    private void merge(int Data[], int left, int middle, int right) {
        int temp[] = new int[Data.length];
        for (int i = left; i <= right; i++) {
            temp[i] = Data[i];
        }
        int a = left;
        int b = middle + 1;
        int c = left;

        while (a <= middle && b <= right) {
            if (temp[a] < temp[b]) {
                Data[c] = temp[a];
                a++;
            } else {
                Data[c] = temp[b];
                b++;
            }
            c++;
        }
        while (a <= middle) {
            Data[c] = temp[a];
            c++;
            a++;
        }
    }

    private void sort(int Data[], int left, int right) {
        if (left < right) {
            int middle = (left + right) / 2;
            sort(Data, left, middle);
            sort(Data, middle + 1, right);
            merge(Data, left, middle, right);
        }
    }
}
