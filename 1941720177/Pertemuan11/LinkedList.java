/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu11;

/**
 *
 * @author Rasyedrenaldi
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

    public void addFirst(Object item) {
        head = new Node(item, head);
        size++;
    }

    public void add(Object item, int index) throws Exception {
        if (index >= 0 && index <= size) {
        } else {
            throw new Exception("Nilai indeks di luar batas");
        }
        if (!isEmpty() && index != 0) {
            Node tmp = head;
            for (int i = 1; i < index; i++) {
                tmp = tmp.next;
            }
            Node next = (tmp == null) ? null : tmp.next;
            tmp.next = new Node(item, next);
            size++;
        } else {
            addFirst(item);
        }
    }

    public void addByValue(String data, String search) throws Exception {
        if (isEmpty()) {
        } else {
            Node tmp = head;
            while (tmp != null && !tmp.data.equals(search)) {
                tmp = tmp.next;
            }

            if (tmp != null) {
                tmp.next = new Node(data, tmp.next);
            }
            size++;
        }
    }

    public void addLast(String item) {
        if (!isEmpty()) {
            Node tmp = head;
            while (tmp.next != null) {
                tmp = tmp.next;
            }
            tmp.next = new Node(item, null);
            size++;
        } else {
            addFirst(item);
        }
    }

    public int getFirst() throws Exception {
        if (!isEmpty()) {
        } else {
            throw new Exception("LinkedLists kosong");
        }
        return (int) head.data;
    }

    public int getLast() throws Exception {
        if (!isEmpty()) {
        } else {
            throw new Exception("LinkedLists kosong");
        }
        Node tmp = head;
        while (tmp.next != null) {
            tmp = tmp.next;
        }
        return (int) tmp.data;
    }

    public int get(int index) throws Exception {
        if (!isEmpty() && index < size) {
        } else {
            throw new Exception("Nilai index diluar batas");
        }
        Node tmp = head;
        for (int i = 0; i < index; i++) {
            tmp = tmp.next;
        }
        return (int) tmp.data;
    }

    public void remove(int index) throws Exception {
        if (!isEmpty() && index < size) {
        } else {
            throw new Exception("Nilai index diluar batas");
        }
        if (index != 0) {
            Node prev = head;
            Node cur = head.next;
            for (int i = 1; i < index; i++) {
                prev = cur;
                cur = prev.next;
            }
            prev.next = cur.next;
            size--;
        } else {
            removeFirst();
        }
    }

    public void removeByKey(String key) throws Exception {
        if (!isEmpty()) {
            if (head.data.equals(key) && head.next != null) {
                head = head.next;
            } else if (head.data.equals(key) && head.next == null) {
                clear();
            } else {
                Node temp = head;
                while (temp.next != null) {
                    if (temp.next.data.equals(key)) {
                        temp.next = temp.next.next;
                        break;
                    } else {
                        temp = temp.next;
                    }
                }
                size--;
            }
        } else {
            throw new Exception("LinkedLists kosong");
        }
    }

    public void removeFirst() throws Exception {
        head = head.next;
        size--;
    }

    public void clear() {
        head = null;
        size = 0;
    }
//------------------------------------------------------------------------------

    public void cari(String key) throws Exception {
        Node temp = head;
        Boolean search = false;
        int i = 0;
        if (head.data != key) {
            while (temp.next != null && i < size) {
                if (temp.data != key) {
                    temp = temp.next;
                } else {
                    search = true;
                    break;
                }
                i++;
            }
        } else {
            search = true;
        }
        if (!search) {
            throw new Exception("Key : " + key + " ketemu pada indeks ke-" + i);
        } else {
        }
    }

    public void cariByIndex(int x) {
        Node temp = head;
        if (x != 0) {
            for (int i = 1; temp.next != null && i < x; i++) {
                temp = temp.next;
            }
            System.out.println("Data pada index " + x + " adalah " + temp.next.data);
        } else {
            System.out.println("Data pada index " + x + " adalah " + temp.data);
        }
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("LinkedLists kosong");
        } else {
            Node tmp = head;
            while (tmp != null) {
                System.out.println(tmp.data + "\t");
                tmp = tmp.next;
            }
            System.out.println();
        }
    }

}
