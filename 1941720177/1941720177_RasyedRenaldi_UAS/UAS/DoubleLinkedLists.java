/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UAS;

/**
 *
 * @author WINDOWS 10
 */
public class DoubleLinkedLists {

    Node<Buku> head;
    int size;

    public DoubleLinkedLists() {
        head = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(Buku data) {
        if (!isEmpty()) {
            Node newNode = new Node(null, data, head);
            head.prev = newNode;
            head = newNode;
        } else {
            head = new Node(null, data, null);
        }
        size++;
    }

    public void upStok(int key, String judul, int stok) {
        Node tmp = head;
        for (int i = 0; i < size; i++) {
            tmp = tmp.next;
        }
        tmp.data.setStok((tmp.data.getStok() + stok));
    }

    public void add(Buku data) throws Exception {
        if (!isEmpty()) {
            Node current = head;
            int i = 0;
            while (i < (size + 1)) {
                current = current.next;
                i++;
            }
            if (current.prev != null) {
                Node newNode = new Node(current.prev, data, current);
                newNode.prev = current.prev;
                newNode.next = current;
                current.prev.next = newNode;
                current.prev = newNode;
            } else {
                Node newNode = new Node(null, data, current);
                current.prev = newNode;
                head = newNode;
            }
        } else {
            addFirst(data);
        }
        size++;
    }

    public void removeFirst() throws Exception {
        if (!isEmpty()) {
            if (size == 1) {
                removeLast();
            } else {
                if (head.data.getStok() != 0) {
                    head = head.next;
                    head.prev.data.stok -= 1;
                } else {
                    System.out.println("Maaf stok tidak bisa dikurangi");
                }
            }
        } else {
            System.out.println("Linked List Kosong");
        }
    }

    public void removeLast() throws Exception {
        if (!isEmpty()) {
            if (head.next == null) {
                if (head.data.getStok() == 0) {
                    System.out.println("stok tidak bisa dikurangi");
                } else {
                    head.data.stok -= 1;
                    return;
                }
            }
        } else {
            throw new Exception("Linked Lists Kosong");
        }
        Node current = head;
        while (current.next.next != null) {
            current = current.next;
        }
        current.next.data.stok -= 1;
    }

    public void remove(int index) throws Exception {
        if (!isEmpty() && index < size) {
            if (index == 0) {
                removeFirst();
            } else {
                Node current = head;
                int i = 0;
                while (i < index) {
                    current = current.next;
                    i++;
                }
                if (current.next != null) {
                    if (current.prev == null) {
                        current = current.next;
                        current.prev.data.stok -= 1;
                        head = current;
                    } else {
                        current.prev.next = current.next;
                        current.next.prev = current.prev;
                    }
                } else {
                    current.prev.next.data.stok -= 1;
                }
            }
        } else {
            throw new Exception("Nilai index diluar batas");
        }
    }

    public Object getFind(Object data) throws Exception {
        if (!isEmpty()) {
        } else {
            throw new Exception("Data masih kosong");
        }
        Node tmp = head;
        Object hasil = null;

        for (int i = 0; i < size; i++) {
            if (data.equals(tmp.data.getJudul()) || data.equals(tmp.data.getKdBuku())) {
                hasil = tmp.data;
            }
            tmp = tmp.next;
        }
        return hasil;
    }

    public void addRusak(int index) throws Exception {
        if (!isEmpty() && index < size) {
        } else {
            throw new Exception("Index diluar batas");
        }
        Node tmp = head;

        for (int i = 0; i < index; i++) {
            tmp = tmp.next;
        }
        tmp.data.setKeadaan("Rusak");
    }

    public void sortList() {
        Node current = null, index = null;
        Buku temp;

        if (head != null) {

            for (current = head; current.next != null; current = current.next) {

                for (index = current.next; index != null; index = index.next) {

                    if (current.data.getJudul().compareTo(index.data.getJudul()) > 0) {
                        temp = current.data;
                        current.data = index.data;
                        index.data = temp;
                    }
                }
            }
        } else {
        }
    }

    public void print() {
        if (!isEmpty()) {
            Node tmp = head;

            String format = "%1$-5s|%2$-20s|%3$-8s|%4$-10s\n";
            System.out.format(format, "No", "Judul", "Stok", "Keadaan");

            while (tmp != null) {
                System.out.format(String.format(format, tmp.data.getKdBuku(),
                        tmp.data.getJudul(), tmp.data.getStok(), tmp.data.getKeadaan()));
                tmp = tmp.next;
            }
        } else {
            System.out.println("Linked Lists Kosong");
        }
    }
}
