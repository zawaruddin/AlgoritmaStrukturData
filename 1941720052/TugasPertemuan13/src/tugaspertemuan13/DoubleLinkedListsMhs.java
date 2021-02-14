/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugaspertemuan13;

/**
 *
 * @author Windows 10
 */
public class DoubleLinkedListsMhs {
    NodeMhs head;
    int size;

    public DoubleLinkedListsMhs() {
        head = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(String nama, int nilai) {
        if (isEmpty()) {
            head = new NodeMhs(null, nama, nilai, null);
        } else {
            NodeMhs newNode = new NodeMhs(null, nama, nilai, head);
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    public void addLast(String nama, int nilai) {
        if (isEmpty()) {
            addFirst(nama, nilai);
        } else {
            NodeMhs current = head;
            while (current.next != null) {
                current = current.next;
            }
            NodeMhs newNode = new NodeMhs(current, nama, nilai, null);
            current.next = newNode;
            size++;
        }
    }

    public void add(String nama, int nilai, int index) throws Exception {
        if (isEmpty()) {
            addFirst(nama, nilai);
        }
        if (index < 0 || index > size) {
            throw new Exception("Nilai indeks di luar batas");
        } else {
            NodeMhs current = head;
            int i = 0;
            while (i < index) {
                current = current.next;
                i++;
            }
            if (current.prev == null) {
                NodeMhs newNode = new NodeMhs(null, nama, nilai, current);
                current.prev = newNode;
                head = newNode;
            } else {
                NodeMhs newNode = new NodeMhs(current.prev, nama, nilai, current);
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
            NodeMhs tmp = head;
            while (tmp != null) {
                tmp.mhs.tampil();
                tmp = tmp.next;
            }
            System.out.println("\nberhasil diisi");
        } else {
            System.out.println("LinkedList Kosong");
        }
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
        NodeMhs current = head;
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
            NodeMhs current = head;
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
        if (isEmpty()) {
            throw new Exception("Linked List Kosong");
        }
        head.mhs.tampil();
    }

    public void getLast() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked List Kosong");
        }
        NodeMhs tmp = head;
        while (tmp.next != null) {
            tmp = tmp.next;
        }
        tmp.mhs.tampil();
    }

    public void get(int index) throws Exception {
        if (isEmpty() || index >= size) {
            throw new Exception("Nilai index diluar batas");
        }
        NodeMhs tmp = head;
        for (int i = 0; i < index; i++) {
            tmp = tmp.next;
        }
        tmp.mhs.tampil();
    }

    public int cari(String kunci) {
        NodeMhs tmp = head;
        int ada = 0;
        while (tmp.next != null) {
            if (tmp.mhs.nama.equalsIgnoreCase(kunci)) {
                break;
            }
            ada++;
            tmp = tmp.next;
        }
        return ada;
    }

    public void bubbleShort() {
        NodeMhs tmp = head;
        for (int i = 1; i < size - 1; i++) {
            for (int j = 1; j < size; j++) {
                if (tmp.mhs.nilai > tmp.next.mhs.nilai) {
                    Mahasiswa n = tmp.mhs;
                    tmp.mhs = tmp.next.mhs;
                    tmp.next.mhs = n;
                }
                tmp = tmp.next;
            }
            tmp = head;
        }
    }
}
