package ujianakhirsemester;

/**
 *
 * @author dhimas
 */
public class DoubleLinkedlist {

    Node head;
    int size, a;
    CD_Dhimas cd = new CD_Dhimas();

    public DoubleLinkedlist() {
        head = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(CD_Dhimas item) {
        if (isEmpty()) {
            head = new Node(null, item, null);
        } else {
            Node newNode = new Node(null, item, head);
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    public void addLast(CD_Dhimas item) {
        if (isEmpty()) {
            addFirst(item);
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            Node newNode = new Node(current, item, null);
            current.next = newNode;
            size++;
        }
    }

    public void add(CD_Dhimas item, int index) throws Exception {
        if (isEmpty()) {
            addFirst(item);
        } else if (index < 0 || index > size) {
            throw new Exception("Nilai indek di luar batas");
        } else {
            Node current = head;
            int i = 0;
            while (i < index) {
                current = current.next;
                i++;
            }
            if (current.prev == null) {
                Node newNode = new Node(null, item, current);
                current.prev = newNode;
                head = newNode;
            } else {
                Node newNode = new Node(current.prev, item, current);
                newNode.prev = current.prev;
                newNode.next = current;
                current.prev.next = newNode;
                current.prev = newNode;
            }
        }
        size++;
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
            Node tmp = head;
            while (tmp != null) {
                System.out.println(tmp.data.index + "\t" + tmp.data.kode + "\t" + tmp.data.judul + "\t" + tmp.data.distributor + "\t\t" + tmp.data.stok + "\t" + tmp.data.rusak);
                tmp = tmp.next;
            }
        } else {
            System.out.println("Linked lists Kosong");
        }
    }

    Node sort(Node start) {
        int swap, i;
        Node a;
        Node b = null;
        if (start == null) {
            return null;
        }
        do {
            swap = 0;
            a = start;
            while (a.next != b) {
                if (a.data.judul.charAt(0) > a.next.data.judul.charAt(0)) {
                    CD_Dhimas t = a.data;
                    a.data = a.next.data;
                    a.next.data = t;
                    swap = 1;
                }
                a = a.next;
            }
            b = a;
        } while (swap != 0);
        return start;
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
        Node current = head;
        while (current.next.next != null) {
            current = current.next;
        }
        current.next = null;
        size--;
    }

    public void remove(int index) throws Exception {
        if (isEmpty() || index >= size) {
            throw new Exception("Nilai indeks diluar batas");
        } else if (index == 0) {
            removeFirst();
        } else {
            Node current = head;
            int i = 0;
            while (i < index) {
                current = current.next;
                i++;
            }
            System.out.println(current.data);
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

    public CD_Dhimas getFirst() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked List kosong");
        }
        return head.data;
    }

    public CD_Dhimas getLast() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked List kosong");
        }
        Node tmp = head;
        while (tmp.next != null) {
            tmp = tmp.next;
        }
        return tmp.data;
    }

    public CD_Dhimas get(int index) throws Exception {
        if (isEmpty() || index >= size) {
            throw new Exception("Nilai indeks di luar batas.");
        }
        Node tmp = head;
        for (int i = 0; i < index; i++) {
            tmp = tmp.next;
        }
        return tmp.data;
    }

    public void cari(int kode) {
        Node tmp = head;
        Boolean search = false;
        int i = 0;
        if (tmp != null) {
            if (tmp.data.kode == kode) {
                search = true;
            } else if (tmp.next != null) {
                while (tmp != null) {
                    if (tmp.data.kode == kode) {
                        search = true;
                        break;
                    } else {
                        tmp = tmp.next;
                    }
                    i++;
                }
            }
            if (search) {
                System.out.println("Index\tKode\tJudul\tDistributor\tStock\tRusak");
                System.out.println(tmp.data.index + "\t" + tmp.data.kode + "\t" + tmp.data.judul + "\t" + tmp.data.distributor + "\t\t" + tmp.data.stok + "\t" + tmp.data.rusak);
            } else {
                System.out.println("CD tidak ditemukan");
            }
        } else {
            System.out.println("Daftar masih kosong kosong");
        }
    }
}
