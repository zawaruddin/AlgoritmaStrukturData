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
public class DoubleLinkedLists {
    Node head;
    int size;

    public DoubleLinkedLists() {
        head = null;
        size = 0;
    }

    public Boolean isEmpty() {
        return head == null;
    }

    public void addFirst(int item) {
        if (isEmpty()) {
            head = new Node(null, item, null);
        } else {
            Node newNode = new Node(null, item, head);
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    public void addLast(int item) {
        if (isEmpty()) {
            addFirst(item);
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            Node newNode = new Node(current, item, null);
            current.next = newNode;
            size++;
        }
    }

    public void add(int item, int index) throws Exception {
        if (isEmpty()) {
            addFirst(item);
        } else if (index < 0 || index > size) {
            throw new Exception("Nilai indeks diluar batas");
        } else {
            Node current = head;
            int i = 0;
            while (i < index) {
                current = current.next;
                i++;
            }
            if (current.prev == null) {
                Node newNode = new Node(null, item, current);
                current.prev = newNode;
                head = newNode;
            } else {
                Node newNode = new Node(current.prev, item, current);
                newNode.prev = current.prev;
                newNode.prev = current;
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
            Node tmp = head;
            int i = 1;
            while (tmp != null) {
                System.out.println(i + ". " + tmp.data + "\t");
                tmp = tmp.next;
                i++;
            }
            System.out.println("\nberhasil diisi");
        } else {
            System.out.println("Linked Lists Kosong");
        }
    }

    public void removeFirst() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked List masih kosong, tidak dapat dihapus");
        } else if (size == 1) {
            removeLast();
            return;
        } else {
            head = head.next;
            head.prev = null;
            size--;
        }
    }

    public void removeLast() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked List masih kosong, tidak dapat dihapus");
        } else if (head.next == null) {
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
            throw new Exception("Nilai indeks di luar batas");
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

    public int getFirst() throws Exception {
        if (isEmpty()) {
            throw new Exception("LinkedList Kosong");
        }
        return head.data;
    }

    public int getLast() throws Exception {
        if (isEmpty()) {
            throw new Exception("LinkedList Kosong");
        }
        Node tmp = head;
        while (tmp.next != null) {
            tmp = tmp.next;
        }
        return tmp.data;
    }

    public int get(int index) throws Exception {
        if (isEmpty() || index >= size) {
            throw new Exception("Index diluar batas");
        }
        Node tmp = head;
        for (int i = 0; i < index; i++) {
            tmp = tmp.next;
        }
        return tmp.data;
    }

    public void getByData(int item) throws Exception {
        if (isEmpty()) {
            throw new Exception("LinkedList kosong");
        }
        Node tmp = head;
        int i = 0;
        while (tmp.next != null) {
            if (tmp.data == item) {
                break;
            } else {
                tmp = tmp.next;
                i++;
            }
        }
        if (tmp.next != null) {
            System.out.println("Data " + item + " ditemukan pada indeks ke: " + (i + 1));
        } else {
            System.out.println("Data tidak ditemukan");
        }
    }
    public void sortingData(char asc) throws Exception {
        if (isEmpty()) {
            throw new Exception("Data kosong");
        }

        if (asc == 'y' || asc == 'Y') {
            for (int i = 0; i < size; i++) {
                Node tmp = head;
                for (int j = 0; j < size; j++) {
                    if (tmp.next != null) {
                        int tmp1 = tmp.data;
                        tmp = tmp.next;
                        if (tmp1 > tmp.data) {
                            int tmp2 = tmp.data;
                            tmp.data = tmp1;
                            tmp = tmp.prev;
                            tmp.data = tmp2;
                            tmp = tmp.next;
                        }
                    }
                }
            }
        } else {
            for (int i = 0; i < size(); i++) {
                Node tmp = head;
                for (int j = 0; j < size; j++) {
                    if (tmp.next != null) {
                        int tmp1 = tmp.data;
                        tmp = tmp.next;
                        if (tmp1 < tmp.data) {
                            int tmp2 = tmp.data;
                            tmp.data = tmp1;
                            tmp = tmp.prev;
                            tmp.data = tmp2;
                            tmp = tmp.next;
                        }
                    }
                }
            }
        }
    }
}
