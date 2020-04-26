/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz2semester2;

/**
 *
 * @author Daffa Cahyo
 */
import java.util.HashMap;
public class linkedQueue {
protected Node<dataPasien> front, rear;
    public int size;

    public linkedQueue() {
        front = rear = null;
        size = 0;
    }

    public boolean isEmpty() {
        return front == null;
    }

    public int getSize() {
        return size;
    }

    public int getLastNo() {
        if (isEmpty()) {
            return 0;
        }
        return rear.getData().getNo();
    }

    public int getTotalWaktu() {
        if (isEmpty()) {
            return 0;
        } else {
            Node<dataPasien> tmp = front;
            int ttl = 0;
            int i = 0;
            while (tmp != null && i < size) {
                ttl = ttl + tmp.data.getWaktu();
                tmp = tmp.getNext();
                i++;
            }
            return ttl;
        }
    }

    public int getWaktuByNum(int no) {
        if (isEmpty() && no == 0 || no >= size) {
            return 0;
        } else {
            Node tmp = front;
            int i = 0;
            int ttl = 0;
            while (tmp != null && i < (no - 1)) {
                ttl += tmp.getData().getWaktu();
                i++;
                tmp = tmp.getNext();
            }
            return ttl;
        }
    }

    public int getAntri(int no) {
        if (isEmpty() && no == 0 || no >= size) {
            return 0;
        } else {
            Node tmp = front;
            int i = 0;
            int ttl = 0;
            while (i < size) {
                if (no == tmp.getData().getNo()) {
                    ttl = no - 1;
                    break;
                }
                tmp = tmp.getNext();
                i++;
            }
            return ttl;
        }
    }

    public int getRata() {
        if (isEmpty()) {
            return 0;
        } else {
            Node tmp = front;
            int i = 0;
            int ttl = 0;
            while (tmp != null && i < size) {
                ttl += tmp.getData().getWaktu();
                i++;
                tmp.getNext();
            }
            return (ttl / size);
        }
    }

    public Object getInfo(int no) {
        if (isEmpty()) {
            return "Antrian masih kosong";
        } else {
            Node tmp = front;
            Object data = null;
            while (tmp != null) {
                if (no == tmp.getData().getNo()) {
                    data = tmp.getData();
                } else {
                    data = "Inputan tidak valid";
                    break;
                }
                tmp = tmp.getNext();
            }
            return data;
        }
    }

    public void infoKeluhan() {
        Node head = front;
        if (isEmpty()) {
            System.out.println("kosong");
        }

        HashMap<Integer, Integer> s = new HashMap<>();
        s.put(head.data.getKeluhan(), 1);

        for (Node curr = head.next; curr != null; curr = curr.next) {
            if (s.containsKey(curr.data.getKeluhan())) {
                s.replace(curr.data.getKeluhan(), s.get(curr.getData().getKeluhan()) + 1);
            } else {
                s.put(curr.data.getKeluhan(), 0);
                s.replace(curr.data.getKeluhan(), s.get(curr.getData().getKeluhan()) + 1);
            }
        }

        s.entrySet().forEach((mapElement) -> {
            int marks = ((int) mapElement.getValue());
            String keluhan = "";

            switch (mapElement.getKey()) {
                case 1:
                    keluhan = "Demam";
                    break;
                case 2:
                    keluhan = "Flu";
                    break;
                case 3:
                    keluhan = "Sakit Kepala";
                    break;
                case 4:
                    keluhan = "Asma";
                    break;
                case 5:
                    keluhan = "Diare";
                    break;
                case 6:
                    keluhan = "Sakit Gigi";
                    break;
                case 7:
                    keluhan = "Sakit Mata";
                    break;
                case 8:
                    keluhan = "Kesleo";
                    break;
                case 9:
                    keluhan = "Susah Tidur";
                    break;
            }

            System.out.println(keluhan + "\t\t: " + marks);
        });
    }

    public void insert(dataPasien data) {
        Node tmp = new Node(data, null);
        if (rear == null) {
            front = rear = tmp;
        } else {
            rear.setNext(tmp);
            rear = rear.getNext();
        }
        size++;
    }

    public void remove() {
        if (isEmpty()) {
            System.out.println("Antrian masih kosong");
        }
        Node<dataPasien> tmp = front;
        front = tmp.getNext();
        if (front == null) {
            rear = null;
        }
        size--;
        System.out.println("" + tmp.getData());
    }

    public void print() {
        System.out.println("Data antrian");
        System.out.println("----------------------------------");
        if (size == 0) {
            System.out.print("Antrian masih kosong\n");
            return;
        }
        Node<dataPasien> ptr = front;
        
        String format = "%1$-5s|%2$-20s|%3$-8s|%4$-10s\n";
        System.out.format(format, "No", "Nama", "Keluhan", "Waktu");
        
        while (ptr != rear.getNext()) {
            System.out.format(String.format(format, ptr.getData().getNo(), 
                    ptr.getData().getNama(), ptr.getData().getKeluhan(), ptr.getData().getWaktu()+" menit"));
            ptr = ptr.getNext();
        }
        System.out.println();
    }
}
