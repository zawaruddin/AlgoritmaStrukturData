/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasJobsheet11;

/**
 *
 * @author dhimas
 */
public class LLPembayaran {

    node Head;
    int size, count = -1;
    String nama, alamat;

    public LLPembayaran() {
        Head = null;
        size = 0;
    }

    public boolean isEmpty() {
        return Head == null && size == 0;
    }
//------------------------------------------------------------------------------

    public void addFirst(LLPembayaran data) {
        Head = new node(data, Head);
        size++;
    }

    public void addLast(LLPembayaran item) {
        if (isEmpty()) {
            addFirst(item);
        } else {
            node tmp = Head;
            while (tmp.next != null) {
                tmp = tmp.next;
            }
            tmp.next = new node(item, null);
            size++;
        }
    }
//------------------------------------------------------------------------------

    public LLPembayaran getFirst() throws Exception {
        if (isEmpty()) {
            throw new Exception("Antrian masih kosong");
        }
        return Head.data;
    }

    public LLPembayaran getLast() throws Exception {
        if (isEmpty()) {
            throw new Exception("Antrian masih kosong");
        }
        node tmp = Head;
        while (tmp.next != null) {
            tmp = tmp.next;
        }
        return tmp.data;
    }

    public LLPembayaran get(int index) throws Exception {
        if (isEmpty() || index >= size) {
            throw new Exception("Nilai index diluar batas");
        }
        node tmp = Head;
        for (int i = 0; i < index; i++) {
            tmp = tmp.next;
        }
        return tmp.data;
    }
//------------------------------------------------------------------------------

    public void removeFirst() throws Exception {
        Head = Head.next;
        size--;
        count--;
    }

    public void clear() {
        Head = null;
        size = 0;
        count = -1;
    }
//------------------------------------------------------------------------------

    public void cari(Object key) throws Exception {
        node temp = Head;
        Boolean search = false;
        int i = 0;
        if (Head.data == key) {
            search = true;
        } else {
            while (temp.next != null && i < size) {
                if (temp.data.nama == key) {
                    search = true;
                    break;
                } else {
                    temp = temp.next;
                }
                i++;
            }
        }
        if (!search) {
            throw new Exception("Key : " + key + " ketemu pada indeks ke-" + i);
        }
    }

    public void cariByIndex(int x) {
        node temp = Head;
        if (x == 0) {
            System.out.println("Data pada index " + x + " adalah " + temp.data.nama);
        } else {
            if (temp != null) {
                for (int i = 1; temp.next != null && i < x; i++) {
                    temp = temp.next;
                }
                System.out.println("Data pada index " + x + " adalah " + temp.next.data.nama);
            } else {
                System.out.println("Antrian masih kosong");
            }
        }
    }

//------------------------------------------------------------------------------
    public void print() {
        if (!isEmpty()) {
            node tmp = Head;
            while (tmp != null) {
                System.out.println("Nama\t: " + tmp.data.nama);
                System.out.println("Alamat\t: " + tmp.data.alamat);
                tmp = tmp.next;
            }
            System.out.println();
        } else {
            System.out.println("LinkedLists kosong");
        }
    }

    public LLPembayaran Dequeue() throws Exception {
        node data = Head;
        if (isEmpty()) {
            System.out.println("Antrian masih kosong");
        } else {
            removeFirst();
        }
        return data.data;
    }

}
