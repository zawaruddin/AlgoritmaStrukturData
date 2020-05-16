/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz2;

/**
 *
 * @author Windows 10
 */
public class Pasien {

    Node head;
    int size;

    public Pasien() {
        head = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(int no, String nm, int k, int w) {
        head = new Node(no, nm, k, w, head);
        size++;
    }

    public void print() {
        if (!isEmpty()) {
            Node tmp = head;
            while (tmp != null) {
                System.out.println("No Antrian       : " + tmp.no);
                System.out.println("Nama             : " + tmp.nama);
                System.out.println("Pilihan Keluhan  : " + tmp.keluhan);
                System.out.println("Waktu Penanganan : " + tmp.waktu + " menit");
                System.out.println();
                tmp = tmp.next;
            }
            System.out.println();
        } else {
            System.out.println("LinkedList kosong");
        }
    }

    public void Enqueue(int no, String nm, int k, int w) {
        if (isEmpty()) {
            addFirst(no, nm, k, w);
        } else {
            Node tmp = head;
            while (tmp.next != null) {
                tmp = tmp.next;
            }
            tmp.next = new Node(no, nm, k, w, null);
            size++;
        }
    }

    public void Dequeue() throws Exception {
        head = head.next;
        size--;
    }

    public void cekAntrian() {
        int i = 0, x, time = 0;
        if (!isEmpty()) {
            Node tmp = head;
            while (tmp != null) {
                i++;
                x = (int) tmp.waktu;
                time += x;
                tmp = tmp.next;
            }
            System.out.println("total Antrian      = " + i);
            System.out.println("total waktu tunggu = " + time + " menit");
        } else {
            System.out.println("LinkedList kosong");
        }
    }

    public void cekAntrianByNo(int cek) {
        int i = 0, x = 0, time = 0, nom;
        Node tmp = head;
        while (tmp != null) {
            ++i;
            nom = (int) tmp.no;
            if (cek < nom) {
                System.out.println("tidak ditemukan");
                break;
            }
            x = (int) tmp.waktu;
            time += x;
            tmp = tmp.next;
            if (nom == cek) {
                System.out.println("Jumlah Antrian Tunggu   = " + (i - 1));
                System.out.println("Jumlah Waktu tunggu = " + (time - x) + " menit");
                break;
            }
        }
    }

    public void cekPasienByNo(int no) throws Exception {
        if (no < 0) {
            throw new Exception("Nilai indeks melebihi batas");
        } else {
            int nom;
            Node tmp = head;
            int i = 1;
            while (i <= no) {
                i++;
                nom = (int) tmp.no;
                if (nom == no) {
                    break;
                }
                tmp = tmp.next;
            }
            System.out.println("Data pada nomor urut ke- " + no);
            System.out.println("Nama = " + tmp.nama);
            System.out.println("Pilihan Keluhan = " + tmp.keluhan);
            System.out.println("Waktu Penanganan = " + tmp.waktu + " menit");
        }
    }

    public void cari(int indeks) throws Exception {
        if (indeks < 0) {
            throw new Exception("Nilai indeks melebihi batas");
        } else {
            int nom;
            Node tmp = head;
            int i = 1;
            while (i <= indeks) {
                i++;
                nom = (int) tmp.no;
                if (nom == indeks) {
                    break;
                }
                tmp = tmp.next;
            }
            System.out.println("Data pada nomor urut ke- " + indeks);
            System.out.println("Nama = " + tmp.nama);
            System.out.println("Pilihan Keluhan = " + tmp.keluhan);
            System.out.println("Waktu Penanganan = " + tmp.waktu + " menit");
        }
    }

    public void rataWaktu() {
        if (!isEmpty()) {
            int x, i = 0, time = 0;
            Node tmp = head;
            while (tmp != null) {
                i++;
                x = (int) tmp.waktu;
                time += x;
                tmp = tmp.next;
            }
            int rata = time / i;
            System.out.println("rata-rata waktu penanganan = " + rata + " menit");
        } else {
            System.out.println("LinkedList kosong");
        }
    }

    public void stastikKeluhan() {
        if (!isEmpty()) {
            for (int a = 1; a <= 9; a++) {
                int jumlah = 0;
                Node tmp = head;
                while (tmp != null) {
                    int keluh = (int) tmp.keluhan;
                    if (a == keluh) {
                        jumlah++;
                    }
                    tmp = tmp.next;
                }
                String namaKeluhan = namaKeluhan(a);
                System.out.println(a + ". " + namaKeluhan + " = " + jumlah + " pasien");
            }
        } else {
            System.out.println("LinkedList kosong");
        }
    }

    public String namaKeluhan(int pilih) {
        String nama = null;
        switch (pilih) {
            case 1:
                nama = "Demam";
                break;
            case 2:
                nama = "Flu";
                break;
            case 3:
                nama = "Sakit Kepala";
                break;
            case 4:
                nama = "Asma";
                break;
            case 5:
                nama = "Diare";
                break;
            case 6:
                nama = "Sakit Gigi";
                break;
            case 7:
                nama = "Sakit Mata";
                break;
            case 8:
                nama = "keseleo";
                break;
            case 9:
                nama = "Susah tidur";
                break;
        }
        return nama;
    }

    public static int waktuPenanganan(int pilih) {
        int waktu = 0;
        switch (pilih) {
            case 1:
                waktu = 7;
                break;
            case 2:
                waktu = 5;
                break;
            case 3:
                waktu = 8;
                break;
            case 4:
                waktu = 4;
                break;
            case 5:
                waktu = 3;
                break;
            case 6:
                waktu = 11;
                break;
            case 7:
                waktu = 13;
                break;
            case 8:
                waktu = 6;
                break;
            case 9:
                waktu = 5;
                break;
        }
        return waktu;
    }
     public void clear(){
        head = null;
        size = 0;
    }
    public void remove(int index) throws Exception {
        if (isEmpty() || index >= size) {
            throw new Exception("Nilai index diluar batas");
        }
        if (index == 0) {
            removeFirst();
        } else {
            Node prev = head;
            Node cur = head.next;
            for (int i = 1; i < index; i++) {
                prev = cur;
                cur = prev.next;
            }
            prev.next = cur.next;
            size--;
        }
    }
    public void removeFirst() throws Exception {
        head = head.next;
        size--;
    }
    public void getFirst() throws Exception {
        if (isEmpty()) {
            throw new Exception("LinkedLists kosong");
        }
        head.cetak();
    }

    public void getLast() throws Exception {
        if (isEmpty()) {
            throw new Exception("LinkedLists kosong");
        }
        Node tmp = head;
        while (tmp.next != null) {
            tmp = tmp.next;
        }
        tmp.cetak();
    }
}
