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
public class LinkedListMahasiswa {
    Node head;
    int size;

    public LinkedListMahasiswa() {
        head = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(String nim, String nam, String alam) {
        head = new Node(nim, nam, alam, head);
        size++;
    }

    public void add(String nim, String nam, String alam, int index) throws Exception {
        if (index < 0 || index > size){
            throw new Exception("Nilai index di luar batas");
        }
        if (isEmpty() || index == 0 ) {
            addFirst(nim, nam, alam);
        } else {
            Node tmp = head;
            for (int i = 1; i < index; i++){
                tmp = tmp.next; 
            }
            Node next = (tmp == null) ? null : tmp.next;
            tmp.next = new Node(nim, nam, alam, next);
            size++;
        }
    }
    public void addLast(String nim, String nama, String alamat) {
        if (isEmpty()) {
            addFirst(nim, nama, alamat);
        } else {
            Node tmp = head;
            while (tmp.next != null) {
                tmp = tmp.next;
            }
            tmp.next = new Node(nim,nama, alamat, null);
            size++;
        }
    }
    public void remove(int index) throws Exception{
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
    public void removeFirst() throws Exception{
        head = head.next;
        size = 0;
    }
    public void clear(){
        head = null;
        size = 0;
    }

    public void print() {
        if (!isEmpty()) {
            Node tmp = head;
            System.out.println("==============================");
            System.out.println("        Daftar Mahasisw       ");
            System.out.println("==============================");
            while (tmp != null){
                System.out.println("NIM     : "+ tmp.NIM);
                System.out.println("Nama    : "+ tmp.nama);
                System.out.println("Alamat  : "+ tmp.Alamat);
                tmp = tmp.next;
            }
            System.out.println();
        }else{
            System.out.println("LinkedLists Kosong");
        }
    }
}
