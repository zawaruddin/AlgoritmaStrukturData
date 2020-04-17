package TugasJobsheet10;

public class Queue {

    int max, front, rear, size;
    Nasabah[] Q;

    Queue(int max) {
        this.max = max;
        Create();
    }

    public void Create() {
        Q = new Nasabah[max];
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
//------------------------------------------------------------------------------

    public void Enqueue(Nasabah data) {
        boolean cData = false;
        if (!isEmpty()) {
            int i = front;
            while (i != rear) {
                if (data.nama.equalsIgnoreCase(Q[i].nama) && data.noRekening.equalsIgnoreCase(Q[i].noRekening)) {
                    System.out.println("Data telah ada");
                    cData = true;
                }
                i = (i + 1) % max;
            }
        }
        if (!cData) {
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
    }

    public String[] Dequeue() {
        String data[] = new String[2];
        if (isEmpty()) {
            System.out.println("Antrian masih kosong");
        } else {
            data[0] = Q[front].nama;
            data[1] = Q[front].noRekening;
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
//------------------------------------------------------------------------------

    public void print() {
        if (isEmpty()) {
            System.out.println("Antrian masih kosong");
        } else {
            int i = front;
            while (i != rear) {
                System.out.print("Data Nasabah " + i + "\n");
                Q[i].print();
                System.out.println("");
                i = (i + 1) % max;
            }
            System.out.println("Data Nasabah " + i);
            Q[i].print();
            System.out.println("Jumlah antrian = " + size);
        }
    }
//------------------------------------------------------------------------------

    public void peekPosition(Nasabah nas) {
        int i = front;
        if (nas.nama.equalsIgnoreCase(Q[rear].nama) && nas.noRekening.equalsIgnoreCase(Q[rear].noRekening)) {
            System.out.print("Posisi " + nas.nama + " berada di indeks ke-" + rear + "\n");
        } else if (i != rear) {
            while (i != rear) {
                if (nas.nama.equalsIgnoreCase(Q[i].nama) && nas.noRekening.equalsIgnoreCase(Q[i].noRekening)) {
                    if (front == 0) {
                        System.out.print("Posisi " + nas.nama + " berada di indeks ke-" + i + "\n");
                    } else {
                        System.out.print("Posisi " + nas.nama + " berada di indeks ke-" + (i - 1) + "\n");
                    }
                }
                i = (i + 1) % max;
            }
        } else {
            System.out.println("Data tidak berada dalam antrian!!");
        }
    }

    public void printNasabah(int position) {
        int i = front;
        if (position == rear) {
            System.out.print("Posisi " + position + " terdapat data: " + Q[i].nama + "\n");
        } else if (i != rear) {
            while (i != rear) {
                if (front == 0) {
                    System.out.print("Posisi " + position + " terdapat data: " + Q[i].nama + "\n");
                } else {
                    System.out.print("Posisi " + position + " terdapat data: " + Q[i - 1].nama + "\n");
                }
                i = (i + 1) % max;
            }
        } else {
            System.out.println("Data tidak berada dalam antrian!!");
        }
    }

    public void peek() {
        if (!isEmpty()) {
            System.out.println("Elemen terdepan: " + Q[front].nama);
        } else {
            System.out.println("Antrian masih kosong");
        }
    }

    public void peekRear() {
        if (!isEmpty()) {
            System.out.println("Elemen paling belakang: " + Q[rear].nama);
        } else {
            System.out.println("Antrian masih kosong");
        }
    }
}
