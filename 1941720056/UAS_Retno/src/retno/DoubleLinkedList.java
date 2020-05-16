/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package retno;

/**
 *
 * @author USER
 */
public class DoubleLinkedList {

    Node<CdObject> head;
    int size;

    public DoubleLinkedList() {
        head = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(CdObject data) {
        if (isEmpty()) {
            head = new Node(null, data, null);
        } else {
            Node newNode = new Node(null, data, head);
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    public void add(CdObject data) throws Exception {
        if (isEmpty()) {
            addFirst(data);
        } else {
            Node current = head;
            int i = 0;
            while (i < (size + 1)) {
                current = current.next;
                i++;
            }
            if (current.prev == null) {
                Node newNode = new Node(null, data, current);
                current.prev = newNode;
                head = newNode;
            } else {
                Node newNode = new Node(current.prev, data, current);
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
            System.out.println("Linked List Kosong");
        } else if (size == 1) {
            removeLast();
        } else {
            if (head.data.getStok() == 0) {
                System.out.println("Maaf stok tidak bisa dikurangi");
            } else {
                head = head.next;
                head.prev.data.stok -= 1;
            }
        }
    }

    public void removeLast() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked Lists Kosong");
        } else if (head.next == null) {
            if (head.data.getStok() == 0) {
                System.out.println("Maaf stok tidak bisa dikurangi");
            } else {
                head.data.stok -= 1;
                return;
            }
        }
        Node current = head;
        while (current.next.next != null) {
            current = current.next;
        }
        current.next.data.stok -= 1;
    }

    public void remove(int index) throws Exception {
        if (isEmpty() || index >= size) {
            throw new Exception("Nilai index diluar batas");
        } else if (index == 0) {
            removeFirst();
        } else {
            Node current = head;
            int i = 0;
            while (i < index) {
                current = current.next;
                i++;
            }
            if (current.next == null) {
                current.prev.next.data.stok -= 1;
            } else if (current.prev == null) {
                current = current.next;
                current.prev.data.stok -= 1;
                head = current;
            } else {
                current.prev.next = current.next;
                current.next.prev = current.prev;
            }
        }
    }

    public Object getFind(Object data) throws Exception {
        if (isEmpty()) {
            throw new Exception("Data masih kosong");
        }
        Node tmp = head;
        Object hasil = null;

        for (int i = 0; i < size; i++) {
            if (data.equals(tmp.data.getJudul()) || data.equals(tmp.data.getKdCD())) {
                hasil = tmp.data;
            }
            tmp = tmp.next;
        }
        return hasil;
    }

    public void addRusak(int index) throws Exception {
        if (isEmpty() || index >= size) {
            throw new Exception("Index diluar batas");
        }
        Node tmp = head;
        Object hasil = null;

        for (int i = 0; i < index; i++) {
            tmp = tmp.next;
        }
        tmp.data.setKeadaan("Rusak");
    }

    public void sortList() {
        Node current = null, index = null;
        CdObject temp;

        //Check whether list is empty  
        if (head == null) {
            return;
        } else {
            //Current will point to head  
            for (current = head; current.next != null; current = current.next) {
                //Index will point to node next to current  
                for (index = current.next; index != null; index = index.next) {
                    //If current's data is greater than index's data, swap the data of current and index  
                    if (current.data.getJudul().compareTo(index.data.getJudul()) > 0) {
                        temp = current.data;
                        current.data = index.data;
                        index.data = temp;
                    }
                }
            }
        }
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("Linked Lists Kosong");
        } else {
            Node tmp = head;

            String format = "%1$-5s|%2$-20s|%3$-8s|%4$-10s\n";
            System.out.format(format, "No", "Judul", "Stok", "Keadaan");

            while (tmp != null) {
                System.out.format(String.format(format, tmp.data.getKdCD(),
                        tmp.data.getJudul(), tmp.data.getStok(), tmp.data.getKeadaan()));
                tmp = tmp.next;
            }
        }
    }
}
