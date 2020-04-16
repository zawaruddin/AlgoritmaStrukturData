/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan10;

import java.util.Scanner;

/**
 *
 * @author Windows 10
 */
public class QueueNasabah {
    int max, front, rear, size;
    Nasabah[] Q;
    static Scanner sc = new Scanner(System.in);

    public QueueNasabah(int max) {
        this.max = max;
        Create();
    }
    public void Create() {
        Q = new Nasabah[max];
        size = 0;
        front = rear = -1;
    }

    public boolean IsEmpty() {
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean IsFull() {
        if (size == max) {
            return true;
        } else {
            return false;
        }
    }

    public void Enqueue(int data) {
        boolean cekCopy = false;
        if (!IsEmpty()) {
            if (data != Integer.parseInt(Q[rear].noRekening)) {
                for (int i = front; i != rear; i = (i + 1) % max) {
                    if (data == Integer.parseInt(Q[i].noRekening)) {
                        cekCopy = true;
                    }
                }
            } else {
                cekCopy = true;
            }
        }
        if (cekCopy == true) {
            System.out.println("\n<< Duplikasi data \'" + data + "\' ditemukan ! >>");
            System.out.println("mohon gunakan yang lain");
        } else {
            String rek = Integer.toString(data);
            if (IsFull()) {
                System.out.println("\n<< Antrian sudah penuh >>");
            } else {
                if (IsEmpty()) {
                    front = rear = 0;
                } else {
                    if (rear == max - 1) {
                        rear = 0;
                    } else {
                        rear++;
                    }
                }
                sc.nextLine();
                System.out.print("Nama Nasabah: ");
                String name = sc.nextLine();
                Q[rear] = new Nasabah(rek, name);
                size++;
            }
        }
    }

    public int Dequeue() {
        int data = 0;
        if (IsEmpty()) {
            System.out.println("\n<< Antrian masih kosong >>");
        } else {
            data = Integer.parseInt(Q[front].noRekening);
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
        }
        return data;
    }

    public void print() {
        if (IsEmpty()) {
            System.out.println("Antrian masih kosong");
        } else {
            System.out.println("\nAntrian Nasabah bank:");
            System.out.println("------------------------");
            int i = front;
            while (i != rear) {
                System.out.print("Data Nasabah : " + i);
                Q[i].print();
                System.out.println();
                i = (i + 1) % max;
            }
            System.out.println("Data Nasabah : " + i);
            Q[i].print();
        }
    }

    public void peek() {
        if (!IsEmpty()) {
            System.out.println("Data Nasabah terdepan : " + Q[front]);
        } else {
            System.out.println("Antrian masih kosong");
        }
    }

    public void peekRear() {
        if (!IsEmpty()) {
            System.out.println("Data Nasabah ter-belakang : " + Q[rear]);
        } else {
            System.out.println("Antrian masih kosong");
        }
    }

    public void peekPosition(String nas) {
        boolean findIt = false;

        if (IsEmpty()) {
            System.out.println("Antrian masih kosong");
        } else {
            System.out.println("\nHasil pencarian data \"" + nas + "\":");

            if (nas.equalsIgnoreCase(Q[rear].nama)) {
                System.out.println("Data Nasabah");
                Q[rear].print();
                System.out.println(Q[rear] + "Posisi: " + rear);
                findIt = true;
            } else {
                for (int i = front; i != rear; i = (i + 1) % max) {
                    if (nas.equalsIgnoreCase(Q[i].nama)) {
                        System.out.println(Q[i] + " Posisi: " + i);
                        findIt = true;
                    }
                }
            }
        }

        if (findIt == false) {
            System.out.println("\n( Data \"" + nas + "\" tidak ditemukan. )");
        }
    }

    public void printNasabah(int position) {
        boolean findIt = false;
        if (position == max) {
            System.out.println("( \"" + position + "\" melebihi jumlah antrian )");
        } else {
            if (IsEmpty()) {
                System.out.println("Antrian masih kosong");
            } else {
                System.out.println("\nHasil pencarian antrian: \'" + position + "\'");
                if (position == rear) {
                    System.out.println("\nData Nasabah:");
                    Q[rear].print();
                    findIt = true;
                } else {
                    for (int i = front; i != rear; i = (i + 1) % max) {
                        if (position == i) {
                            Q[i].print();
                            findIt = true;
                        }
                    }
                }
            }
            if (findIt == false) {
                System.out.println("\n<< Antrian \'" + position + "\'tidak tersedia. >>");
            }
        }
    }
    
}
