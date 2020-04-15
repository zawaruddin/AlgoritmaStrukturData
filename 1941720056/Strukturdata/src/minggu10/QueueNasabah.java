
package minggu10;
import java.util.Scanner;
public class QueueNasabah {
    int max;
    int front;
    int rear;
    int size;
    Nasabah[]Q;
    static Scanner retno = new Scanner(System.in);

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
            System.out.println("Duplikasi data " + data + " ditemukan ! >>");
            System.out.println("mohon gunakan yang lain");
        } else {
            String rek = Integer.toString(data);
            if (IsFull()) {
                System.out.println(" Antrian sudah penuh");
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
                retno.nextLine();
                System.out.print("Nama Nasabah: ");
                String nama = retno.nextLine();
                Q[rear] = new Nasabah(rek, nama);
                size++;
            }
        }
    }

    public int Dequeue() {
        int data = 0;
        if (IsEmpty()) {
            System.out.println("Antrian masih kosong");
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
            System.out.println("Antrian nasabah bank:");
            System.out.println("------------------------");
            int i = front;
            while (i != rear) {
                System.out.println("Data Nasabah : " + i);
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
            System.out.println("Hasil pencarian data " + nas + " : ");

            if (nas.equalsIgnoreCase(Q[rear].nama)) {
                System.out.println("Data nasabah");
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
            System.out.println( + position + " melebihi jumlah antrian )");
        } else {
            if (IsEmpty()) {
                System.out.println("Antrian masih kosong");
            } else {
                System.out.println("Hasil pencarian antrian: " + position + "\'");
                if (position == rear) {
                    System.out.println("Data nasabah:");
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
                System.out.println("Antrian " + position + "tidak tersedia.");
            }
        }
    }
}
