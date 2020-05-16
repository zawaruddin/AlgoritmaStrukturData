/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uas;

/**
 *
 * @author Windows 10
 */
public class DoubleLinkedLists {
    Node head;
    int size;
    
    public DoubleLinkedLists(){
        head = null;
        size = 0;
    }
    public boolean isEmpty() {
        return head == null;
    }
    public void addFirst(int kode, char judul, String distributor, int jml_stok, int jml_rusak) {
        if (isEmpty()) {
            head = new Node(null, kode, judul, distributor, jml_stok, jml_rusak, null);
        } else {
            Node newNode = new Node(null, kode, judul, distributor, jml_stok, jml_rusak, head);
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }
    public void CD_Masuk(int kode, char judul, String distributor, int jml_stok, int jml_rusak) throws Exception {
        if (isEmpty()) {
            addFirst(kode, judul, distributor, jml_stok, jml_rusak);
        }
        else {
            Node current = head;
            int i = 0;
            while (i < size) {
                current = current.next;
                i++;
            }
            if (current.prev == null) {
                Node newNode = new Node(null, kode, judul, distributor, jml_stok, jml_rusak, current);
                current.prev = newNode;
                head = newNode;
            } else {
                Node newNode = new Node(current.prev, kode, judul, distributor, jml_stok, jml_rusak, current);
                newNode.prev = current.prev;
                newNode.next = current;
                current.prev.next = newNode;
                current.prev = newNode;
            }
        }
        size++;
    }
    public void removeFirst() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked List masih kosong, tidak dapat di hapus");
        } else if (size == 1) {
            removeLast();
        } else {
            head = head.next;
            head.prev = null;
            size--;
        }
    }
    public void removeLast() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked List masih kosong, tidak dapat di hapus");
        }
        if (head.next == null) {
            head = null;
            size--;
            return;
        }
        Node current = head;
        while (current.next.next != null) {
            current = current.next;
        }
        current.next = null;
        size--;
    }
    public void remove(int index) throws Exception {
        if (isEmpty() || index >= size) {
            throw new Exception("Nilai index diluar batas");
        }
        if (index == 0) {
            removeFirst();
        } else {
            Node current = head;
            int i = 0;
            while (i < index) {
                current = current.next;
                i++;
            }
            if (current.next == null) {
                current.prev.next = null;
            } else if (current.prev == null) {
                current = current.next;
                current.prev = null;
                head = current;
            } else {
                current.prev.next = current.next;
                current.next.prev = current.prev;
            }
            size--;
        }
    }
    public void print() {
        if (!isEmpty()) {
            Node tmp = head;
            while (tmp != null) {
                tmp.cd.tampil();
                tmp = tmp.next;
            }
            System.out.println("\nberhasil diisi");
        } else {
            System.out.println("LinkedList Kosong");
        }
    }
    public int cari(String kunci) {
        Node tmp = head;
        int ada = 0;
        while (tmp.next != null) {
            if (tmp.cd.distributor.equalsIgnoreCase(kunci)) {
                break;
            }
            ada++;
            tmp = tmp.next;
        }
        return ada;
    }
    public void bubbleShort() {
        Node tmp = head;
        for (int i = 1; i < size - 1; i++) {
            for (int j = 1; j < size; j++) {
                if (tmp.cd.judul > tmp.next.cd.judul) {
                    CD_Luluk n = tmp.cd;
                    tmp.cd = tmp.next.cd;
                    tmp.next.cd = n;
                }
                tmp = tmp.next;
            }
            tmp = head;
        }
    }
}
