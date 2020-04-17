package minggu10;

public class Queue {

    int max, size, front, rear, Q[];

    Queue(int n) {
        max = n;
        Create();
    }

    public void Create() {
        Q = new int[max];
        size = 0;
        front = rear = -1;
    }

    public boolean isEmpty() {
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isFull() {
        if (size == max) {
            return true;
        } else {
            return false;
        }
    }

    public void peek() {
        if (!isEmpty()) {
            System.out.println("Elemen terdepan: " + Q[front]);
        } else {
            System.out.println("Antrian masih kosong");
        }
    }

    public void peekRear() {
        if (!isEmpty()) {
            System.out.println("Elemen paling belakang: " + Q[rear]);
        } else {
            System.out.println("Antrian masih kosong");
        }
    }

    public void peekPosition(int data) {
        int i = front;
        while (i != rear) {
            if (data == Q[i]) {
                if (front == 0) {
                    System.out.print("Posisi " + data + " berada di indeks ke-" + i + "\n");
                } else {
                    System.out.print("Posisi " + data + " berada di indeks ke-" + (i - 1) + "\n");
                }
            }else{
                System.out.println("Data tidak berada dalam antrian!!");
            }
            i = (i + 1) % max;
        }
    }

    public void peekAt(int position) {
        int i = front;
        while (i != rear) {
            if (front == 0) {
                if (position == i) {
                    System.out.print("Posisi " + position + " terdapat data: " + Q[i] + "\n");
                }
            } else if(front > 0){
                if (position == i) {
                    System.out.print("Posisi " + position + " terdapat data: " + Q[i-1] + "\n");
                }
            }else{
                System.out.println("Data tidak berada dalam antrian!!");
            }
            i = (i + 1) % max;
        }
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("Antrian masih kosong");
        } else {
            int i = front;
            while (i != rear) {
                System.out.print(Q[i] + " ");
                i = (i + 1) % max;
            }
            System.out.println(Q[i] + " ");
            System.out.println("Jumlah antrian = " + size);
        }
    }

    public void Enqueue(int data) {
        if (isFull()) {
            System.out.println("Antrian sudah penuh");
        } else {
            if (isEmpty()) {
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
        }
    }

    public int Dequeue() {
        int data = 0;
        if (isEmpty()) {
            System.out.println("Antrian masih kosong");
        } else {
            data = Q[front];
            size--;
            if (isEmpty()) {
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
}
