package tugas;

/**
 *
 * @author Aulafz
 */
public class doublelinkedlists {

    Node head;
    int size;

    public doublelinkedlists() {
        head = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(int item) {
        if (isEmpty()) {
            head = new Node(null, item, null);
        } else {
            Node newNode = new Node(null, item, head);
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    public void addLast(int item) {

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

    public void add(int item, int index) throws Exception {
        if (isEmpty()) {
            addFirst(item);
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
            throw new Exception("Nilai indeks di luar batas");
        } else if (index == 0) {
            removeFirst();
        } else {
            Node current = head;
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

    public int getFirst() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked List kosong");
        }
        return head.data;
    }

    public int getLast() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked List kosong");
        }
        Node tmp = head;
        while (tmp.next != null) {
            tmp = tmp.next;
        }
        return tmp.data;
    }

    public int get(int index) throws Exception {
        if (isEmpty() || index >= size) {
            throw new Exception("Nilai indeks di luar batas.");
        }
        Node tmp = head;
        for (int i = 0; i < index; i++) {
            tmp = tmp.next;
        }
        return tmp.data;
    }

    public void cari(int search) throws Exception {
        int indeks = -1;
        boolean found = false;
        Node tmp = head;
        if (isEmpty()) {
            System.out.println("Linked Lists masih kosong");
        } else {
            while (tmp.next != null) {
                tmp = tmp.next;
                indeks++;
                if ((int) head.data == search) {
                    found = true;
                    break;
                } else if ((int) tmp.data == search) {
                    found = true;
                    indeks++;
                    break;
                }
            }
        }
        if (found) {
            System.out.println("Data : " + search + " ditemukan di indeks ke- " + indeks);
        } else {
            throw new Exception("Data " + search + " tidak ditemukan");
        }

    }

    public void Ascending() throws Exception {
        Node a = head;
        while (a != null) {
            for (Node b = a.next; b != null; b = b.next) {
                if (a.data > b.data) {
                    int tmp = b.data;
                    b.data = a.data;
                    a.data = tmp;
                }
            }
            a = a.next;
        }
    }

    public void Descending() throws Exception {
        Node a = head;
        while (a != null) {
            for (Node b = a.next; b != null; b = b.next) {
                if (a.data < b.data) {
                    int tmp = b.data;
                    b.data = a.data;
                    a.data = tmp;
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
            Node tmp = head;
            while (tmp != null) {
                System.out.print(tmp.data + "\n");
                tmp = tmp.next;
            }
        } else {
            System.out.println("Linked Lists kosong");
        }
    }
}
