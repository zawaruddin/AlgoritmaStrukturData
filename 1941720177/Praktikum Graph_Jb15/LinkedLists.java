/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jobsheet_15;

/**
 *
 * @author rasyed
 */
public class LinkedLists {

    int size;
    Node head;

    public LinkedLists() {
        size = 0;
        head = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(int data) {
        if (isEmpty()) {
            head = new Node(null, data, null);
        } else {
            Node newNode = new Node(null, data, head);
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

    public void add(int data, int index) {
        if (isEmpty()) {
            addFirst(data);
        } else {
            Node cur = head;
            int i = 0;
            while (i < index) {
                cur = cur.next;
                i++;
            }
            if (cur.prev == null) {
                Node newNode = new Node(null, data, cur);
                cur.prev = newNode;
                head = newNode;
            } else {
                Node newNode = new Node(cur.prev, data, cur);
                newNode.prev = cur.prev;
                newNode.next = cur;
                cur.prev.next = newNode;
                cur.prev = newNode;
            }
            size++;
        }
    }

    public int size() {
        return size;
    }

    public void clear() {
        head = null;
        size = 0;
    }

    public void print(String data) {
        if (!isEmpty()) {
            Node tmp = head;
            while (tmp != null) {
                System.out.print(data + "  ");
                tmp = tmp.next;
            }
            System.out.println("===================");
        } else {
            System.out.println("Data  kosong");
        }
    }

    public void removeFirst() throws Exception {
        if (isEmpty()) {
            throw new Exception("Data tidak ada yang dihapus");
        } else {
            head = head.next;
            head.prev = null;
            size--;
        }
    }

    public void removeLast() throws Exception {
        if (isEmpty()) {
            throw new Exception("Data  tidak  ada  yang  dihapus");
        } else if (head.next == null) {
            head = null;
            size--;
            return;
        }
        Node cur = head;
        while (cur.next.next != null) {
            cur = cur.next;
        }
        cur.next = null;
        size--;
    }

    public void remove(int index) throws Exception {
        if (isEmpty() || index < 0) {
            throw new Exception("Nilai  indeks  diluar  batas");
        } else if (index == 0) {
            removeFirst();
        } else {
            Node cur = head;
            int i = 0;
            while (i < index) {
                cur = cur.next;
                i++;
            }
            if (cur.next == null) {
                cur.prev.next = null;
            } else if (cur.prev == null) {
                cur = cur.next;
                cur.prev = null;
                head = cur;
            } else {
                cur.prev.next = cur.next;
                cur.next.prev = cur.prev;
            }
            size--;
        }
    }

    public int getFirst() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked  List  kosong");
        }
        return head.data;
    }

    public int getLast() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked  List  kosong");
        }
        Node tmp = head;
        while (tmp.next != null) {
            tmp = tmp.next;
        }
        return tmp.data;
    }

    public int get(int index) throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked  List  kosong");
        }
        Node tmp = head;
        for (int i = 0; i < index; i++) {
            tmp = tmp.next;
        }
        return tmp.data;
    }
}
