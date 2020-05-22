/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasGraph.Weigthed;

/**
 *
 * @author rasyed
 */
public class LinkedList {

    Node head;
    int size;

    public LinkedList() {
        head = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(Edges item) {
        if (isEmpty()) {
            head = new Node(null, item, null);
        } else {
            Node newNode = new Node(null, item, head);
            head.prev = newNode;
            head = newNode;
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

    public void removeFirst() throws Exception {
        if (!isEmpty()) if (size == 1) {
            removeLast();
        } else {
            head = head.next;
            head.prev = null;
            size--;
        } else {
            throw new Exception("Linked List masih kosong, tidak dapat dihapus!");
        }
    }

    public void removeLast() throws Exception {
        if (!isEmpty()) {
            if (head.next == null) {
                head = null;
                size--;
                return;
            }
        } else {
            throw new Exception("Linked List masih kosong, tidak dapat dihapus!");
        }
        Node current = head;
        while (current.next.next != null) {
            current = current.next;
        }
        current.next = null;
        size--;
    }

    public void remove(int index) throws Exception {
        if (!isEmpty() && index < size) if (index == 0) {
            removeFirst();
        } else {
            Node current = head;
            int i = 0;
            while (i < index) {
                current = current.next;
                i++;
            }
            if (current.next != null) if (current.prev == null) {
                current = current.next;
                current.prev = null;
                head = current;
            } else {
                current.prev.next = current.next;
                current.next.prev = current.prev;
            } else {
                current.prev.next = null;
            }
            size--;
        } else {
            throw new Exception("Nilai indeks diluar batas");
        }
    }

    public Edges getFirst() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked List kosong");
        }
        return head.data;
    }

    public Edges getLast() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked List kosong");
        }
        Node tmp = head;
        while (tmp.next != null) {
            tmp = tmp.next;
        }
        return tmp.data;
    }

    public Edges get(int index) throws Exception {
        if (!isEmpty() && index < size) {
        } else {
            throw new Exception("Nilai indeks di luar batas.");
        }
        Node tmp = head;
        for (int i = 0; i < index; i++) {
            tmp = tmp.next;
        }
        return tmp.data;
    }
}
