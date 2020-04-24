/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Quiz2ASD;

/**
 *
 * @author Rasyed
 */
public class AntrianKlinik {

    Node Head;
    int size, no, waktu;
    String nama, keluhan;

    public AntrianKlinik() {
        Head = null;
        size = 0;
    }

    public boolean isEmpty() {
        return Head == null && size == 0;
    }

    private int[] hitung() {
        int total[] = new int[2];
        Node tmp = Head;
        while (tmp != null) {
            total[0]++;
            total[1] += tmp.data.waktu;
            tmp = tmp.next;
        }
        return total;
    }

    private void cekSucces(AntrianKlinik data) {
        Node tmp = Head;
        boolean cek = false;
        while (tmp.next != null) {
            if (!tmp.data.equals(data)) {
            } else {
                cek = true;
                break;
            }
            tmp = tmp.next;
        }
        if (cek) {
            System.out.println("Data Belum di antrikan");
        } else {
            System.out.println("\nData Berada Dalam Antrian");
            print(tmp);
            rataWaktu();
            System.out.println("");
        }
    }

    private void print(Node target) {
        if (!isEmpty()) {
            Node tmp = target;
            System.out.println("Nomor Antrian Pasien: " + tmp.data.no);
            System.out.println("Nama Pasien: " + tmp.data.nama);
            System.out.println("Keluhan Pasien: " + tmp.data.keluhan);
            System.out.println("Perkiraan waktu penanganan: " + tmp.data.waktu + " menit");
        } else {
            System.out.println("Antrian kosong\n");
        }
    }

    public void Enqueue(AntrianKlinik data) {
        if (isEmpty()) {
            Head = new Node(data, Head);
            size++;
        } else {
            Node tmp = Head;
            while (tmp.next != null) {
                tmp = tmp.next;
            }
            tmp.next = new Node(data, null);
            size++;
        }
        cekSucces(data);
    }

    public void Dequeue() {
        Node tmp = Head;
        if (isEmpty()) {
            System.out.println("Antrian masih kosong\n");
        } else {
            System.out.println("\nData Antrian Dihapus");
            if (tmp == null) {
                System.out.println("Antrian masih kosong\n");
            } else {
                print(tmp);
                System.out.println("");
            }
            Head = Head.next;
            size--;
        }
    }

    public void cekAntrian() {
        int total[] = new int[2];
        total = hitung();
        Node tmp = Head;
        if (total[0] <= 0 || tmp.next == null) {
        } else {
            while (tmp.next != null) {
                tmp = tmp.next;
            }
        }
        if (total[0] <= 0) {
            System.out.println("Antrian masih kosong\n");
        } else {
            System.out.println("\nData Antrian Saat ini\n------------------");
            System.out.println("Total antrian: " + total[0]);
            System.out.println("Total waktu antrian:" + total[1] + " menit");
            System.out.println("Antrian terdepan adalah pasien no: " + Head.data.no);
            System.out.println("Antrian paling belakang adalah pasien no: " + tmp.data.no);
            System.out.println("");
        }
    }

    public void cekAntrianByNo(int no) {
        int totalAntrian = 0, totalWaktu = 0, i = 2;
        Node tmp = Head;

        if (tmp == null || no >= tmp.data.no) if (no >= tmp.data.no) {
            while (tmp != null && i < no) {
                totalAntrian++;
                totalWaktu += tmp.data.waktu;
                tmp = tmp.next;
                i++;
            }
            System.out.println("Data Antrian");
            System.out.println("Antrian didepan pasien saat ini: " + totalAntrian);
            System.out.println("Jumlah Waktu tunggu pasien no " + no + ": " + totalWaktu + " menit");
            rataWaktu();
            System.out.println("");
        } else {
            System.out.println("Antrian kosong");
        } else {
            System.out.println("\nData sudah tidak berada dalam antrian\n");
        }
    }

    public void cekPasienByNo(int no) {
        Node temp = Head;
        if (temp == null || no < temp.data.no) if (temp != null && no < temp.data.no) {
            System.out.println("\nData sudah tidak berada dalam antrian\n");
        } else {
            System.out.println("\nAntrian masih kosong\n");
        } else {
            if (no > 1 && Head.data.no != no) {
                temp = temp.next;
                for (int i = 2; temp != null && i < no; i++) {
                    if (no > i && temp.next != null && temp.data.no != no) {
                        temp = temp.next;
                    }
                }
            }
            System.out.println("Data Pasien No. Antrian " + no);
            print(temp);
            System.out.println("");
        }
    }

    public void rataWaktu() {
        double rataWaktu;
        int total[] = new int[2];
        total = hitung();
        if (total[0] <= 1) {
        } else {
            rataWaktu = total[1] / total[0];
            System.out.println("Rata-rata Waktu Penanganan Pasien: " + rataWaktu + " menit");
        }
    }

    public void statistikKeluhan() {
        Node tmp = Head;
        int count[] = new int[9];
        String daftarKeluhan[] = {"Demam", "Flu", "Sakit Kepala", "Asma", "Diare", "Sakit Gigi", "Sakit Mata", "Keseleo", "Susah Tidur"};

        for (int i = 0; i < daftarKeluhan.length; i++) {
            tmp = Head;
            while (tmp != null) {
                if (!tmp.data.keluhan.equals(daftarKeluhan[i])) {
                } else {
                    count[i] += 1;
                }
                tmp = tmp.next;
            }
            if (count[i] <= 0) {
            } else {
                System.out.println(daftarKeluhan[i] + ": " + count[i]);
            }
        }
        System.out.println("");
    }
}
