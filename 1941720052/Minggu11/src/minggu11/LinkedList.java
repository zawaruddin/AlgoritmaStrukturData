/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu11;

/**
 *
 * @author Windows 10
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
        if (index < 0 || index > size) {
            throw new Exception("Nilai indeks di luar batas");
        }
        if (isEmpty() || index == 0) {
            addFirst(item);
        } else {
            Node tmp = head;
            for (int i = 1; i < index; i++) {
                tmp = tmp.next;
            }
            Node next = (tmp == null) ? null : tmp.next;
            tmp.next = new Node(item, next);
            size++;
        }
    }

    public void addByValue(String data, String cari) throws Exception {
        if (!isEmpty()) {
            Node tmp = head;
            while (tmp != null && !tmp.data.equals(cari)) {
                tmp = tmp.next;
            }

            if (tmp != null) {
                tmp.next = new Node(data, tmp.next);
            }
            size++;
        }
    }

    public void addLast(String item) {
        if (isEmpty()) {
            addFirst(item);
        } else {
            Node tmp = head;
            while (tmp.next != null) {
                tmp = tmp.next;
            }
            tmp.next = new Node(item, null);
            size++;
        }
    }


    public int getFirst() throws Exception {
        if (isEmpty()) {
            throw new Exception("LinkedLists kosong");
        }
        return (int) head.data;
    }

    public int getLast() throws Exception {
        if (isEmpty()) {
            throw new Exception("LinkedLists kosong");
        }
        Node tmp = head;
        while (tmp.next != null) {
            tmp = tmp.next;
        }
        return (int) tmp.data;
    }

    public int get(int index) throws Exception {
        if (isEmpty() || index >= size) {
            throw new Exception("Nilai index diluar batas");
        }
        Node tmp = head;
        for (int i = 0; i < index; i++) {
            tmp = tmp.next;
        }
        return (int) tmp.data;
    }

    public void remove(int index) throws Exception {
        if (isEmpty() || index >= size) {
            throw new Exception("Nilai index diluar batas");
        }
        if (index == 0) {
            removeFirst();
        } else {
            Node prev = head;
            Node cur = head.next;
            for (int i = 1; i < index; i++) {
                prev = cur;
                cur = prev.next;
            }
            prev.next = cur.next;
            size--;
        }
    }

    public void removeByValue(String data) throws Exception {
        if (isEmpty()) {
            throw new Exception("LinkedLists kosong");
        } else {
            if (head.data.equals(data) && head.next != null) {
                head = head.next;
            } else if (head.data.equals(data)&& head.next == null) {
                clear();
            } else {
                Node temp = head;
                while (temp.next != null) {
                    if (temp.next.data.equals(data)) {
                        temp.next = temp.next.next;
                        break;
                    } else {
                        temp = temp.next;
                    }
                }
                size--;
            }
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

    public void cari(String data) throws Exception {
        Node temp = head;
        Boolean cari = false;
        int i=0;
        if (head.data == data) {
            cari = true;
        } else {
            while (temp.next != null && i<size) {
                if (temp.data == data) {
                    cari = true;
                    break;
                } else {
                    temp = temp.next;
                }
                i++;
            }
        }
        if (!cari) {
            throw new Exception("Key : " + data + " berada di pada indeks ke-"+i);
        }
    }
    public void cariByIndex(int x) {
        Node temp = head;
        if (x == 0) {
            System.out.println("Data pada index " + x + " adalah " + temp.data);
        } else {
            for (int i = 1; temp.next != null && i < x; i++) {
                temp = temp.next;
            }
            System.out.println("Data pada index " + x + " adalah " + temp.next.data);
        }
   }
    
    
    public void print() {
        if (!isEmpty()) {
            Node tmp = head;
            while (tmp != null) {
                System.out.println(tmp.data + "\t");
                tmp = tmp.next;
            }
            System.out.println();
        } else {
            System.out.println("LinkedLists kosong");
        }
    }




    public void removeByIndex(int index) {
        if (head == null) {
            clear();
        }
        Node temp = head;
        if (index == 0) {
            head = temp.next;
            return;
        }

        for (int i = 0; temp != null && i < index - 1; i++) {
            temp = temp.next;
        }

        if (temp == null || temp.next == null) {
            return;
        }
        Node next = temp.next.next;

        temp.next = next;
    }
   
}