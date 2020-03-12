/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu5;

/**
 *
 * @author WINDOWS 10
 */
public class DaftarMahasiwaBerprestasi {

    Mahasiswa listMhs[] = new Mahasiswa[5];
    int idx;

//    setelah ini tuliskan method tambah()
    void tambah(Mahasiswa m) {
        if (idx < listMhs.length) {
            listMhs[idx] = m;
            idx++;
        } else {
            System.out.println("Data sudah penuh!!");
        }
    }
//    setelah ini tuliskan method tampil()

    void tampil() {
        for (Mahasiswa m : listMhs) {
            m.tampil();
            System.out.println(" ------------------------");
        }
    }
//      setelah ini tuliskam method bubbleSort()

    void bubbleSort() {
        for (int i = 0; i < listMhs.length - 1; i++) {
            for (int j = 1; j < listMhs.length - i; j++) {
                if (listMhs[j].ipk > listMhs[j - 1].ipk) {
                    //di bawah ini proses swap atau penukaran
                    Mahasiswa tmp = listMhs[j];
                    listMhs[j] = listMhs[j - 1];
                    listMhs[j - 1] = tmp;
                }
            }
        }
    }

    void insertionSort(boolean ascending) {
        int i, j;
        for (i = 1; i < listMhs.length; i++) {
            Mahasiswa temp = new Mahasiswa();
            temp = listMhs[i];
            j = i;

            if (ascending) {
                while ((j > 0) && (listMhs[j - 1].ipk > temp.ipk)) {
                    listMhs[j] = listMhs[j - 1];
                    j--;
                }
            } else {
                while ((j < 0) && (listMhs[j - 1].ipk < temp.ipk)) {
                    listMhs[j] = listMhs[j - 1];
                    j--;
                }
                listMhs[j] = temp;
            }
        }
    }
}
