/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasLinkedLists;

import java.util.NoSuchElementException;

/**
 *
 * @author Rasyedrenaldi
 */
public class linkedQueue {

    protected Node front, rear;
    public int size;

    /* Konstruktor */
    public linkedQueue() {
        front = null;
        rear = null;
        size = 0;
    }

    /* Berfungsi untuk memeriksa apakah antrian kosong */
    public boolean isEmpty() {
        return front == null;
    }

    /* Berfungsi untuk mendapatkan ukuran antrian */
    public int getSize() {
        return size;
    }

    /* Berfungsi untuk memasukkan elemen ke antrian */
    public void insert(int data) {
        Node nptr = new Node(data, null);
        if (rear == null) {
            front = nptr;
            rear = nptr;
        } else {
            rear.setLink(nptr);
            rear = rear.getLink();
        }
        size++;
    }

    /* Berfungsi untuk menghapus elemen depan dari antrian */
    public int remove() {
        if (isEmpty()) {
            throw new NoSuchElementException("Underflow Exception");
        }
        Node ptr = front;
        front = ptr.getLink();
        if (front == null) {
            rear = null;
        }
        size--;
        return ptr.getData();
    }

    /* Berfungsi untuk memeriksa elemen depan antrian */
    public int peek() {
        if (isEmpty()) {
            throw new NoSuchElementException("Underflow Exception");
        }
        return front.getData();
    }

    /* Berfungsi untuk menampilkan status antrian */
    public void display() {
        System.out.print("\nQueue = ");
        if (size == 0) {
            System.out.print("Empty\n");
            return;
        }
        Node ptr = front;
        while (ptr != rear.getLink()) {
            System.out.print(ptr.getData() + " ");
            ptr = ptr.getLink();
        }
        System.out.println();
    }
}
