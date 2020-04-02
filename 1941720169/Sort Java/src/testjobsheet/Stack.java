package testjobsheet;

public class Stack {

    int size, top, count, posisi[];
    char data[];

    Stack(int size) {
        this.size = size;
        data = new char[size];
        top = -1;
    }

    public void tukar(char cari, int posisi) {
        for (int i = 0; i < size; i++) {
            if (i == posisi) {
                char temp = data[top];
                data[top] = data[i];
                data[i] = temp;
                break;
            }
        }
        pop();
    }
    
    public int[] FindSeqSearch(char cari) {
        jumlahHuruf(cari);
        posisi = new int[count];
        int k = 0;
        for (int j = 0; j < size; j++) {
            if (data[j] == cari) {
                posisi[k] = j;
                k++;
            }
        }
        return posisi;
    }
    
    public int FindBinarySearch(char cari, int left, int right) {
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

    public void jumlahHuruf(char cari) {
        for (int i = 0; i < size; i++) {
            if (cari == data[i]) {
                count++;
            }
        }
        posisi = new int[count];
    }

    public void mergeSort() {
        System.out.println("\nHasil Pengurutan data dengan Merge Sort:");
        sort(data, 0, data.length - 1);
    }

    private void merge(char Data[], int left, int middle, int right) {
        char temp[] = new char[Data.length];
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

    private void sort(char Data[], int left, int right) {
        if (left < right) {
            int middle = (left + right) / 2;
            sort(Data, left, middle);
            sort(Data, middle + 1, right);
            merge(Data, left, middle, right);
        }
    }

    public void tampilPosisi(char cari, int metode) {
        String method[] = {"Sequential", "Binary"};
        if (metode == 1) {
            FindSeqSearch(cari);
        }
        System.out.println("\nHasil Pencarian dengan " + method[metode - 1] + " Search");
        if (count > 1) {
            if (posisi[0] != -1) {
                System.out.print("Huruf " + cari + " ditemukan pada indeks ke-");
                for (int i = 0; i < posisi.length; i++) {
                    System.out.print(posisi[i]);
                    if (i < posisi.length - 1) {
                        System.out.print(", ");
                    } else {
                        System.out.print(".");
                    }
                }
                System.out.println("");
            } else {
                System.out.println("Data: tidak ditemukan");
            }
        } else {
            if (posisi[0] != -1) {
                System.out.println("Data terbesar: " + cari + " ditemukan pada indeks " + posisi[0]);
            } else {
                System.out.println("Data: tidak ditemukan");
            }
        }
    }
    public boolean isEmpty() {
        if (top == -1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isFull() {
        if (top == size - 1) {
            return true;
        } else {
            return false;
        }
    }

    public void push(char dt) {
        if (!isFull()) {
            top++;
            data[top] = dt;
        } else {
            System.out.println("Isi Stack penuh!");
        }
    }

    public void pop() {
        if (!isEmpty()) {
            char x = data[top];
            top--;
        } else {
            System.out.println("Stack masih kosong");
        }
    }

    public void peek() {
        System.out.println("Elemen teratas: " + data[top]);
    }

    public void tampilData() {
        for (int i = 0; i < size; i++) {
            System.out.print(data[i]);
            if (i < size - 1) {
                System.out.print(", ");
            } else {
                System.out.print("}\n");
            }
        }
    }

    public void clear() {
        if (!isEmpty()) {
            for (int i = top; i >= 0; i--) {
                top--;
            }
            System.out.println("Stack sudah dikosongkan");
        } else {
            System.out.println("Gagal! Stack masih kosong");
        }
    }
}
