/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasQueue;

/**
 *
 * @author Rasyedrenaldi
 */
public class Queue {

    int max, size, front, rear, top;
    int[] Q;
    int[] data;

    public Queue(int n) {
        max = n;
        Create();
    }

    private void Create() {
        Q = new int[max];
        size = 0;
        front = rear = -1;
    }

    public boolean IsEmpty() {
        return size == 0;
    }

    public boolean IsFull() {
        return size == max;
    }

    public void peek() {
        if (IsEmpty()) {
            System.out.println("Antrian masih kosong");
        } else {
            System.out.println("Elemen terdepan : " + Q[front]);
        }
    }

    public void peekRear() {
        if (IsEmpty()) {
            System.out.println("Antrian masih kosong");
        } else {
            System.out.println("Elemen ter-belakang : " + Q[rear]);
        }
    }

    public void peekPosition(int data) {
        boolean findIt = false;

        if (!IsEmpty()) {
            System.out.println("\nHasil pencarian data \"" + data + "\":");

            if (data == rear) {
                System.out.println(Q[rear] + "Posisi: " + rear);
                findIt = true;
            } else {
                for (int i = front; i != rear; i = (i + 1) % max) {
                    if (data == Q[i]) {
                        System.out.println(Q[i] + " Posisi: " + i);
                        findIt = true;
                    }
                }
            }
        } else {
            System.out.println("Antrian masih kosong");
        }

        if (findIt == false) {
            System.out.println("\n( Data \"" + data + "\" tidak ditemukan. )");
        }
    }

    public void peekAt(int position) {
        boolean findIt = false;
        if (position <= max) {
            if (!IsEmpty()) {
                System.out.println("\nHasil pencarian antrian " + position + " ");
                if (position == rear) {
                    System.out.println(Q[rear]);
                    findIt = true;
                } else {
                    for (int i = front; i != rear; i = (i + 1) % max) {
                        if (position != i) {
                        } else {
                            System.out.println(Q[i]);
                            findIt = true;
                        }
                    }
                }
            } else {
                System.out.println("Antrian masih kosong");
            }
        } else {
            System.out.println("( " + position + " melebihi jumlah antrian )");
        }
        if (findIt == false) {
            System.out.println("Antrian " + position + " tidak tersedia.");
        } else {
        }

    }

    public void print() {
        if (!IsEmpty()) {
            System.out.println("Isi stack : ");
            int i = front;
            while (i != rear) {
                System.out.print(Q[i] + " ");
                i = (i + 1) % max;
            }
            System.out.println(Q[i] + " ");
            System.out.println("Jumlah antrian = " + size);
        } else {
            System.out.println("Antrian masih kosong");
        }
        System.out.println("");
    }

    public void Enqueue(int data) {
        if (!IsFull()) {
            if (IsEmpty()) {
                front = rear = 0;
            } else {
                if (rear == max - 1) {
                    rear = 0;
                } else {
                    rear++;
                }
            }
            Q[rear] = data;
            size++;
        } else {
            System.out.println("Antrian sudah penuh");
        }
    }

    public int Dequeue() {
        int data = 0;
        if (!IsEmpty()) {
            data = Q[front];
            size--;
            if (IsEmpty()) {
                front = rear = -1;
            } else {
                if (front == max - 1) {
                    front = 0;
                } else {
                    front++;
                }
            }
        } else {
            System.out.println("Antrian masih kosong");
        }
        return data;
    }

}
