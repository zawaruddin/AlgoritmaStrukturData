/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugaspertemuan11;

/**
 *
 * @author Windows 10
 */
public class LinkedLists2 {
    Node2 head;
    int size;
    
    public LinkedLists2(){
        head = null;
        size = 0;
    }
    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(int no, String nama) {
        head = new Node2(no,nama, head);
        size++;
    }

    public void add(int no, String nama, int index) throws Exception {
        if (index < 0 || index > size){
            throw new Exception("Nilai index di luar batas");
        }
        if (isEmpty() || index == 0 ) {
            addFirst(no, nama);
        } else {
            Node2 tmp = head;
            for (int i = 1; i < index; i++){
                tmp = tmp.next; 
            }
            Node2 next = (tmp == null) ? null : tmp.next;
            tmp.next = new Node2(no,nama, next);
            size++;
        }
    }
    public void addLast(int no, String nama) {
        if (isEmpty()) {
            addFirst(no, nama);
        } else {
            Node2 tmp = head;
            while (tmp.next != null) {
                tmp = tmp.next;
            }
            tmp.next = new Node2(no,nama, null);
            size++;
        }
    }
    public void getFirst() throws Exception {
        if (isEmpty()) {
            throw new Exception("LinkedLists kosong");
        }
        head.print();
    }

    public void getLast() throws Exception {
        if (isEmpty()) {
            throw new Exception("LinkedLists kosong");
        }
        Node2 tmp = head;
        while (tmp.next != null) {
            tmp = tmp.next;
        }
        tmp.print();
    }

    public void get(int index) throws Exception {
        if (isEmpty() || index >= size) {
            throw new Exception("Nilai index diluar batas");
        }
        Node2 tmp = head;
        for (int i = 0; i < index; i++) {
            tmp = tmp.next;
        }
        tmp.print();
    }
    public void remove(int index) throws Exception {
        if (isEmpty() || index >= size) {
            throw new Exception("Nilai index diluar batas");
        }
        if (index == 0) {
            removeFirst();
        } else {
            Node2 prev = head;
            Node2 cur = head.next;
            for (int i = 1; i < index; i++) {
                prev = cur;
                cur = prev.next;
            }
            prev.next = cur.next;
            size--;
        }
    }
    public void removeFirst() throws Exception {
        head = head.next;
        size--;
    }
    public void clear(){
        head = null;
        size = 0;
    }
    public void print() {
        if (!isEmpty()) {
            Node2 tmp = head;
            while (tmp != null) {
                tmp.print();
                tmp = tmp.next;
            }
            System.out.println();
        } else {
            System.out.println("LinkedLists kosong");
        }
    }

    
}
