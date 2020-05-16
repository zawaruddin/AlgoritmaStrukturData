
/**
 *
 * @author Aulafz
 */
public class DoubleLinkedList {

    Node head;
    int size;

    public DoubleLinkedList() {
        head = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(Buku_Aula data) {
        if (isEmpty()) {
            head = new Node(null, data, null);
        } else {
            Node newNode = new Node(null, data, head);
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    public void addLast(Buku_Aula data) {

        if (isEmpty()) {
            addFirst(data);
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            Node newNode = new Node(current, data, null);
            current.next = newNode;
            size++;
        }
    }

    public void add(Buku_Aula data, int index) throws Exception {
        if (isEmpty()) {
            addFirst(data);
        } else if (index < 0 || index > size) {
            throw new Exception("Nilai indeks di luar batas");
        } else {
            Node current = head;
            int i = 0;
            while (i < index) {
                current = current.next;
                i++;
            }
            if (current.prev == null) {
                Node newNode = new Node(null, data, current);
                current.prev = newNode;
                head = newNode;
            } else {
                Node newNode = new Node(current.prev, data, current);
                newNode.prev = current.prev;
                newNode.next = current;
                current.prev.next = newNode;
                current.prev = newNode;
            }
        }
        size++;
    }

    public void remove(int index) throws Exception {
        if (isEmpty() || index >= size) {
            throw new Exception("Nilai indeks di luar batas");
        } else {
            Node tmp = head;
            int i = 0;
            while (tmp != null) {
                if (index == i) {
                    tmp.data.stok -= 1;
                    break;
                }
                i++;
                tmp = tmp.next;
            }
        }
    }

    public void bukuRusak(int index, int jumlah) throws Exception {
        if (isEmpty() || index >= size) {
            throw new Exception("Nilai indeks di luar batas");
        } else {
            Node tmp = head;
            int i = 0;
            while (tmp != null) {
                if (index == i) {
                    tmp.data.rusak += jumlah;
                    break;
                }
                i++;
                tmp = tmp.next;
            }
        }
    }

    public void searchJudul(String judul) throws Exception {
        if (isEmpty()) {
            throw new Exception("Nilai indeks di luar batas.");
        }
        Node tmp = head;
        boolean found = false;
        int i = 0;
        while (tmp != null) {
            if (judul.equals(tmp.data.judul)) {
                found = true;
                break;
            }
            i++;
            tmp = tmp.next;
        }
        if (found) {
            System.out.println("Data buku " + judul + " ditemukan pada indeks ke-" + i);
        } else {
            System.out.println("Data buku " + judul + " tidak ditemukan");
        }
    }

    public void searchPenerbit(String penerbit) throws Exception {
        if (isEmpty()) {
            throw new Exception("Nilai indeks di luar batas.");
        }
        Node tmp = head;
        boolean found = false;
        int i = 0;
        while (tmp != null) {
            if (penerbit.equals(tmp.data.penerbit)) {
                found = true;
                break;
            }
            i++;
            tmp = tmp.next;
        }
        if (found) {
            System.out.println("Data buku dengan penerbit " + penerbit + " ditemukan pada indeks ke-" + i);
        } else {
            System.out.println("Data buku dengan penerbit " + penerbit + " tidak ditemukan");
        }
    }

    public int size() {
        return size;
    }

    public void clear() {
        head = null;
        size = 0;
    }

    public void sorting() throws Exception {
        Node tmp;
        int swap;
        do {
            swap = 0;
            tmp = head;

            while (tmp.next != null) {
                if (tmp.data.kode > tmp.next.data.kode) {
                    Buku_Aula temp = tmp.data;
                    tmp.data = tmp.next.data;
                    tmp.next.data = temp;
                    swap = 1;
                }
                tmp = tmp.next;
            }
            tmp = null;
        } while (swap != 0);
    }

    public void print() {
        if (!isEmpty()) {
            Node tmp = head;
            int i = 0;
            System.out.println("Indeks\tKode\tJudul\t\tPenerbit\tStok\tRusak");
            while (tmp != null) {
                System.out.println(i + "\t" + tmp.data.kode + "\t" + tmp.data.judul + "\t" + tmp.data.penerbit + "\t"
                        + tmp.data.stok + "\t" + tmp.data.rusak);
                i++;
                tmp = tmp.next;
            }

        } else {
            System.out.println("Linked Lists kosong");
        }
    }
}
