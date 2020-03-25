package TugasPertemuan7;

public class Tugas3 {
    
    public int data[], jumData, terbesar, tambah, posisi[];

    Tugas3(int dt[], int jd) {
        this.jumData = jd;
        data = dt;
    }

    void insertionSort() {
        int i, j;
        for (i = 1; i < jumData; i++) {
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
        for (int i = 0; i < jumData; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println("");
    }

    public int FindBinarySearch(int cari, int left, int right) {
        int mid;
        if (right >= left) {
            mid = (left + right) / 2;
            terbesar = cari;
            if (data[mid] == cari) {
                jumlahTerbesar(data[mid]);
                return (mid);
            } else if (data[mid - 1] > data[mid]) {
                return FindBinarySearch(data[mid - 1], left, mid - 1);
            } else {
                return FindBinarySearch(data[mid], mid + 1, right);
            }
        }
        return -1;
    }

    public void tampilPosisi(int cari) {
        posisi = new int[tambah];
        int j=0;
        for (int i = 0; i < jumData; i++) {
            if (cari == data[i]) {
                posisi[j] = i;
                j++;
            }
        }
        System.out.println("Data terbesar ditemukan sebanyak " + tambah);
        if (tambah > 1) {
            for (int i = 0; i < posisi.length; i++) {
                if (posisi[i] != -1) {
                    System.out.println("Data terbesar: " + terbesar + " ditemukan pada indeks ke-[" + posisi[i]+"]");
                } else {
                    System.out.println("Data: tidak ditemukan");
                }
            }
        }else{
            if (posisi[0] != -1) {
                    System.out.println("Data terbesar: " + terbesar + " ditemukan pada indeks ke-[" + posisi[0]+"]");
                } else {
                    System.out.println("Data: tidak ditemukan");
                }
        }
    }

    public void jumlahTerbesar(int cari) {
        for (int i = 0; i < jumData; i++) {
            if (cari == data[i]) {
                tambah++;
            }
        }
    }
}
