
public class UTS1 {
    public char[] data;
    public int banyakData;

    public UTS1(char[] Data, int jmlData){
        this.banyakData = jmlData;
        data = new char[jmlData];
        for (int i = 0; i < banyakData; i++) {
            data[i] = Data[i];
        }
    }
    public int FindSeqSearch(char cari) {
        int posisi = -1;
        for (int j = 0; j < banyakData; j++) {
            if (data[j] == cari) {
                posisi= j;
                break;
            }
        }
       return posisi; 
    }

    public void TampilData() {
        for (int i = 0; i < banyakData; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }

    public int FindBinarySearch(char cari, int left, int right) {
        int mid;
        mergeSort(data);
        for (int i = 0; i < data.length; i++) {
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
        }
        return -1;
    }

    public void TampilPosisi(char x, int pos) {
        if (pos != 0) {
            System.out.print("Huruf " + x + " ditemukan pada indeks ke- ");
            for (int i = 0; i < banyakData; i++) {
                if(data[i]==x){
                    System.out.print(""+i);
                    System.out.print(",");
                }
            }
        } else {
            System.out.print("Huruf " + x + " tidak ditemukan");
        }
    }

    public void mergeSort(char[] data) {
        sort(data, 0, data.length-1);
    }

    public void merge(char data[], int left, int middle, int right) {
        char [] temp = new char[data.length];
        for (int i = left; i <= right; i++) {
            temp[i] = data[i];
        }
        int a = left;
        int b = middle + 1;
        int c = left;

        while (a <= middle && b <= right) {
            if (temp[a] <= temp[b]) {
                data[c] = temp[a];
                a++;
            } else {
                data[c] = temp[b];
                b++;
            }
            c++;
        }

        int s = middle - a;
        for (int i = 0; i <= s; i++) {
            data[c + i] = temp[a + i];
        }

    }

    public void sort(char data[], int left, int right) {
        if (left < right) {
            int middle = (left + right) / 2;
            sort(data, left, middle);
            sort(data, middle + 1, right);
            merge(data, left, middle, right);
        }
    }

    public void printArray(char arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
    }
}
