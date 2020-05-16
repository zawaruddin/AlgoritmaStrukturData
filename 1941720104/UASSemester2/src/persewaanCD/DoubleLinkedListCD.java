/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persewaanCD;

/**
 *
 * @author Daffa Cahyo
 */
public class DoubleLinkedListCD {

    NodeCD head;
    int size;

    public DoubleLinkedListCD() {
        head = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(int index, int kode, String judul, String penerbit, int stok, int rusak) {
        if (isEmpty()) {
            head = new NodeCD(null, index, kode, judul, penerbit, stok, rusak, null);
        } else {
            NodeCD newNode = new NodeCD(null, index, kode, judul, penerbit, stok, rusak, head);
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    public void addLast(int index, int kode, String judul, String penerbit, int stok, int rusak) {
        if (isEmpty()) {
            addFirst(index, kode, judul, penerbit, stok, rusak);
        } else {
            NodeCD current = head;
            while (current.next != null) {
                current = current.next;
            }
            NodeCD newNode = new NodeCD(current, index, kode, judul, penerbit, stok, rusak, null);
            current.next = newNode;
            size++;
        }
    }

    public void add(int index, int kode, String judul, String penerbit, int stok, int rusak) throws Exception {
        if (isEmpty())
            addFirst(index, kode, judul, penerbit, stok, rusak);
        if (index < 0 || index > size)
            throw new Exception("Nilai indeks di luar batas");
        else {
            NodeCD current = head;
            int i = 0;
            while (i < index) {
                current = current.next;
                i++;
            }
            if (current.prev == null) {
                NodeCD newNode = new NodeCD(null, index, kode, judul, penerbit, stok, rusak, current);
                current.prev = newNode;
                head = newNode;
            } else {
                NodeCD newNode = new NodeCD(current.prev, index, kode, judul, penerbit, stok, rusak, current);
                newNode.prev = current.prev;
                newNode.next = current;
                current.prev.next = newNode;
                current.prev = newNode;
            }
        }
        size++;
    }

    public int size() {
        return size;
    }

    public void clear() {
        head = null;
        size = 0;
    }

    public void print() {
        if (!isEmpty()) {
            NodeCD tmp = head;
            while (tmp != null) {
                tmp.cd.tampil();
                tmp = tmp.next;
            }
            System.out.println("\nberhasil diisi");
        } else {
            System.out.println("LinkedList Kosong");
        }
    }

    public void removeFirst() throws Exception {
        if (isEmpty())
            throw new Exception("Linked List masih kosong, tidak dapat di hapus");
        else if (size == 1) {
            removeLast();
        } else {
            head = head.next;
            head.prev = null;
            size--;
        }
    }

    public void removeLast() throws Exception {
        if (isEmpty())
            throw new Exception("Linked List masih kosong, tidak dapat di hapus");
        if (head.next == null) {
            head = null;
            size--;
            return;
        }
        NodeCD current = head;
        while (current.next.next != null) {
            current = current.next;
        }
        current.next = null;
        size--;
    }

    public void remove(int index) throws Exception {
        if (isEmpty() || index >= size)
            throw new Exception("Nilai index diluar batas");
        if (index == 0) {
            removeFirst();
        } else {
            NodeCD current = head;
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

    public void getFirst() throws Exception {
        if (isEmpty())
            throw new Exception("Linked List Kosong");
        head.cd.tampil();
    }

    public void getLast() throws Exception {
        if (isEmpty())
            throw new Exception("Linked List Kosong");
        NodeCD tmp = head;
        while (tmp.next != null) {
            tmp = tmp.next;
        }
        tmp.cd.tampil();
    }

    public void get(int index) throws Exception {
        if (isEmpty() || index >= size)
            throw new Exception("Nilai index diluar batas");
        NodeCD tmp = head;
        for (int i = 0; i < index; i++) {
            tmp = tmp.next;
        }
        tmp.cd.tampil();
    }

    public int cari(String kunci) {
        NodeCD tmp = head;
        int ada = 0;
        while (tmp.next != null) {
            if (tmp.cd.judul.equalsIgnoreCase(kunci)) {
                break;
            }
            ada++;
            tmp = tmp.next;
        }
        return ada;
    }

    public void bubbleShort() {
        NodeCD tmp = head;
        for (int i = 1; i < size - 1; i++) {
            for (int j = 1; j < size; j++) {
                if (tmp.cd.index > tmp.next.cd.index) {
                    CD_DaffaCahyoAlghifari n = tmp.cd;
                    tmp.cd = tmp.next.cd;
                    tmp.next.cd = n;
                }
                tmp = tmp.next;
            }
            tmp = head;
        }
    }   

    void addFirst(int index, int kode, String judul, String penerbit, int stok) {
      
    }
}
