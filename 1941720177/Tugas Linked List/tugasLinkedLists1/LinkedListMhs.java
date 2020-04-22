/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasLinkedLists1;

/**
 *
 * @author WINDOWS 10
 */
public class LinkedListMhs {
    Node head;
    int size;

    public LinkedListMhs() {
        head = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addFrist(String nim, String nma, String almt) {
        head = new Node(nim, nma, almt, head);
        size++;
    }

    public void add(String nim, String nma, String almt) {
        if (isEmpty()) {
            addFrist(nim, nma, almt);
        } else {
            Node tmp = head;
            while (tmp.next != null) {
                tmp = tmp.next;
            }
            tmp.next = new Node(nim, nma, almt, null);
            size++;
        }
    }

    public void print() {
        if (!isEmpty()) {
            Node tmp = head;
            while (tmp != null) {

                System.out.print(tmp.NIM + "\t");
                System.out.print(tmp.nama + "\t");
                System.out.println(tmp.Alamat);

                tmp = tmp.next;
            }
            System.out.println("");
        } else {
            System.out.println("LinkedList kosong");
        }
    }

    public void removeValue(String nim) {

        Node prev = head;
        Node cur = head.next;
        for (int i = 1; i < size; i++) {
            if (nim == null ? prev.NIM != null : !nim.equals(prev.NIM)) {
                prev = prev;
                cur = prev.next;
            }
        }
        prev.next = cur.next;
        size--;
    }

    public void carikey(String key) {
        Node tmp = head;

        for (int i = 1; i < size; i++) {
            if (!key.equals(tmp.NIM)) {

                tmp = tmp.next;

            }
        }
        System.out.println("Data yang anda cari : ");
        System.out.print(tmp.NIM + "\t");
        System.out.print(tmp.nama + "\t");
        System.out.println(tmp.Alamat);
    }

    public void menu() {
        System.out.println("====================");
        System.out.println(" Daftar Mahasiswa\n");
        System.out.println("1.Tambah Mahasiswa");
        System.out.println("2.Hapus Mahasiswa");
        System.out.println("3.Cari Mahasiswa");
        System.out.println("4.keluar");
        System.out.println("====================");
    }
}
