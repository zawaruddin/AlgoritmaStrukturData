package TugasJobsheet7;

public class Tugas4 {

    String nama, alamat, jKel;
    int nik;
    Tugas4 listPenduduk[];

    Tugas4(int l) {
        listPenduduk = new Tugas4[l];
    }

    Tugas4(int nik, String n, String a, String j) {
        this.nik = nik;
        nama = n;
        alamat = a;
        jKel = j;
    }

    void insertionSort() {
        int i, j;
        for (i = 1; i < listPenduduk.length; i++) {
            Tugas4 temp[] = new Tugas4[listPenduduk.length];
            temp[i] = listPenduduk[i];
            j = i;
            while ((j > 0) && (listPenduduk[j - 1].nik > temp[i].nik)) {
                listPenduduk[j] = listPenduduk[j - 1];
                j--;
            }
            listPenduduk[j] = temp[i];
        }
    }

    public int FindBinarySearch(int cari, int left, int right) {
        int mid;
        if (right >= left) {
            mid = (left + right) / 2;
            if (listPenduduk[mid].nik == cari) {
                return (mid);
            } else if (listPenduduk[mid].nik > cari) {
                return FindBinarySearch(cari, left, mid - 1);
            } else {
                return FindBinarySearch(cari, mid + 1, right);
            }
        }
        return -1;
    }

    public void tampil(int x, int pos) {
        if (pos != -1) {
            System.out.println("data NIK: " + x + " ditemukan pada indeks " + pos);
            System.out.println("NIK : " + listPenduduk[pos].nik);
            System.out.println("Nama : " + listPenduduk[pos].nama);
            System.out.println("Alamat : " + listPenduduk[pos].alamat);
            System.out.println("Jenis Kelamin : " + listPenduduk[pos].jKel);
            System.out.println("-------------------");
        } else {
            System.out.println("data: " + x + " tidak ditemukan");
        }
    }
}
