package tugas;

/**
 *
 * @author Aulafz
 */
public class NilaiMahasiswa {

    NodeNilaiMahasiswa head;
    int size;

    public NilaiMahasiswa() {
        head = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(String nama, int nilai) {
        if (isEmpty()) {
            head = new NodeNilaiMahasiswa(null, nama, nilai, null);
        } else {
            NodeNilaiMahasiswa newNode = new NodeNilaiMahasiswa(null, nama, nilai, head);
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    public void addLast(String nama, int nilai) {

        if (isEmpty()) {
            addFirst(nama, nilai);
        } else {
            NodeNilaiMahasiswa current = head;
            while (current.next != null) {
                current = current.next;
            }
            NodeNilaiMahasiswa newNode = new NodeNilaiMahasiswa(current, nama, nilai, null);
            current.next = newNode;
            size++;
        }
    }

    public void add(String nama, int nilai, int index) throws Exception {
        if (isEmpty()) {
            addFirst(nama, nilai);
        } else if (index < 0 || index > size) {
            throw new Exception("Nilai indeks di luar batas");
        } else {
            NodeNilaiMahasiswa current = head;
            int i = 0;
            while (i < index) {
                current = current.next;
                i++;
            }
            if (current.prev == null) {
                NodeNilaiMahasiswa newNode = new NodeNilaiMahasiswa(null, nama, nilai, current);
                current.prev = newNode;
                head = newNode;
            } else {
                NodeNilaiMahasiswa newNode = new NodeNilaiMahasiswa(current.prev, nama, nilai, current);
                newNode.prev = current.prev;
                newNode.next = current;
                current.prev.next = newNode;
                current.prev = newNode;
            }
        }
        size++;
    }

    public void removeFirst() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked List masih kosong, tidak dapat dihapus!");
        } else if (size == 1) {
            removeLast();
        } else {
            head = head.next;
            head.prev = null;
            size--;
        }
    }

    public void removeLast() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked List masih kosong, tidak dapat dihapus!");
        } else if (head.next == null) {
            head = null;
            size--;
            return;
        }
        NodeNilaiMahasiswa current = head;
        while (current.next.next != null) {
            current = current.next;
        }
        current.next = null;
        size--;
    }

    public void remove(int index) throws Exception {
        if (isEmpty() || index >= size) {
            throw new Exception("Nilai indeks di luar batas");
        } else if (index == 0) {
            removeFirst();
        } else {
            NodeNilaiMahasiswa current = head;
            int i = 0;
            while (i < index) {
                current = current.next;
                i++;
            }
            if (current.next == null) {
                current.prev.next = null;
            } else if (current.prev == null) {
                current = current.next;
                current.prev = null;
                head = current;
            } else {
                current.prev.next = current.next;
                current.next.prev = current.prev;
            }
            size--;
        }
    }

    public void getFirst() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked List kosong");
        } else {
            System.out.println(head.nama + "\t" + head.nilai);
        }
    }

    public void getLast() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked List kosong");
        } else {
            NodeNilaiMahasiswa tmp = head;
            while (tmp.next != null) {
                tmp = tmp.next;
            }
            System.out.println(tmp.nama + "\t" + tmp.nilai);
        }
    }

    public void get(int index) throws Exception {
        if (isEmpty() || index >= size) {
            throw new Exception("Nilai indeks di luar batas.");
        } else {
            NodeNilaiMahasiswa tmp = head;
            for (int i = 0; i < index; i++) {
                tmp = tmp.next;
            }
            System.out.println(tmp.nama + "\t" + tmp.nilai);
        }
    }

    public void cari(String search) throws Exception {
        int indeks = -1;
        boolean found = false;
        NodeNilaiMahasiswa tmp = head;
        if (isEmpty()) {
            System.out.println("Linked Lists masih kosong");
        } else {
            while (tmp.next != null) {
                tmp = tmp.next;
                indeks++;
                if (search.equalsIgnoreCase(head.nama)) {
                    found = true;
                    break;
                } else if (search.equalsIgnoreCase(tmp.nama)) {
                    found = true;
                    indeks++;
                    break;
                }
            }
        }
        if (found) {
            System.out.println("Nama " + search + " ditemukan di indeks ke- " + indeks);
        } else {
            throw new Exception("Nama " + search + " tidak ditemukan");
        }

    }

    public void Descending() throws Exception {
        NodeNilaiMahasiswa a = head;
        String nama = "";
        while (a != null) {
            for (NodeNilaiMahasiswa b = a.next; b != null; b = b.next) {
                if (a.nilai < b.nilai) {
                    int tmp = a.nilai;
                    nama = a.nama;
                    a.nilai = b.nilai;
                    a.nama = b.nama;
                    b.nilai = tmp;
                    b.nama = nama;
                }
            }
            a = a.next;
        }
    }

    public int size() {
        return size;
    }

    public void clear() {
        head = null;
        size = 0;
    }

    public void print() {
        if (!isEmpty()) {
            NodeNilaiMahasiswa tmp = head;
            while (tmp != null) {
                System.out.println(tmp.nama + "\t" + tmp.nilai);
                tmp = tmp.next;
            }
        } else {
            System.out.println("Linked Lists kosong");
        }
    }
}
