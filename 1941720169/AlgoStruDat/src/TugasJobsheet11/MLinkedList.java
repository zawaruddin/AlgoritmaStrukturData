package TugasJobsheet11;

/**
 *
 * @author dhimas
 */
public class MLinkedList {

    Node head;
    int size;
    String nama,nim,alamat;

    public MLinkedList() {
        head = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }
//------------------------------------------------------------------------------

    public void addFirst(MLinkedList data) {
        head = new Node(data, head);
        size++;
    }

    public void add(MLinkedList item, int index) throws Exception {
        if (index < 0 || index > size) {
            throw new Exception("Nilai indeks di luar batas");
        }
        if (isEmpty() || index == 0) {
            addFirst(item);
        } else {
            Node tmp = head;
            for (int i = 1; i < index; i++) {
                tmp = tmp.next;
            }
            Node next = (tmp == null) ? null : tmp.next;
            tmp.next = new Node(item, next);
        }
        size++;
    }
    public void addByValue(MLinkedList data, String search) throws Exception {
        if (!isEmpty()) {
            Node tmp = head;
            while (tmp != null && !tmp.data.nim.equals(search)) {
                tmp = tmp.next;
            }

            if (tmp != null) {
                tmp.next = new Node(data, tmp.next);
            }
            size++;
        }
    }

    public void addLast(MLinkedList item) {
        if (isEmpty()) {
            addFirst(item);
        } else {
            Node tmp = head;
            while (tmp.next != null) {
                tmp = tmp.next;
            }
            tmp.next = new Node(item, null);
            size++;
        }
    }
//------------------------------------------------------------------------------

    public MLinkedList getFirst() throws Exception {
        if (isEmpty()) {
            throw new Exception("LinkedLists kosong");
        }
        return head.data;
    }

    public MLinkedList getLast() throws Exception {
        if (isEmpty()) {
            throw new Exception("LinkedLists kosong");
        }
        Node tmp = head;
        while (tmp.next != null) {
            tmp = tmp.next;
        }
        return tmp.data;
    }

    public MLinkedList get(int index) throws Exception {
        if (isEmpty() || index >= size) {
            throw new Exception("Nilai index diluar batas");
        }
        Node tmp = head;
        for (int i = 0; i < index; i++) {
            tmp = tmp.next;
        }
        return tmp.data;
    }
//------------------------------------------------------------------------------

    public void remove(int index) throws Exception {
        if (isEmpty() || index >= size) {
            throw new Exception("Nilai index diluar batas");
        }
        if (index == 0) {
            removeFirst();
        } else {
            Node prev = head;
            Node cur = head.next;
            for (int i = 1; i < index; i++) {
                prev = cur;
                cur = prev.next;
            }
            prev.next = cur.next;
            size--;
        }
    }
    
    public void removeByKey(String key) throws Exception {
        if (isEmpty()) {
            throw new Exception("LinkedLists kosong");
        } else {
            if (head.data.nim.equals(key) && head.next != null) {
                removeFirst();
            } else if (head.data.nim.equals(key)&& head.next == null) {
                clear();
            } else {
                Node temp = head;
                while (temp.next != null) {
                    if (temp.next.data.nim.equals(key)) {
                        temp.next = temp.next.next;
                        break;
                    } else {
                        temp = temp.next;
                    }
                }
                size--;
            }
        }
    }
    
    public void removeFirst() throws Exception {
        head = head.next;
        size--;
    }

    public void clear() {
        head = null;
        size = 0;
    }
//------------------------------------------------------------------------------

    public void cari(MLinkedList key) throws Exception {
        Node temp = head;
        Boolean search = false;
        int i = 0;
        if (head.data == key) {
            search = true;
        } else {
            while (temp.next != null && i < size) {
                if (temp.data == key) {
                    search = true;
                    break;
                } else {
                    temp = temp.next;
                }
                i++;
            }
        }
        if (!search) {
            throw new Exception("Key : " + key + " ketemu pada indeks ke-" + i);
        }
    }

    public void cariByIndex(int x) {
        Node temp = head;
        if (x == 0) {
            System.out.println("Data pada index " + x + " adalah " + temp.data.nama);
        } else {
            for (int i = 1; temp.next != null && i < x; i++) {
                temp = temp.next;
            }
            System.out.println("Data pada index " + x + " adalah " + temp.next.data.nama);
        }
    }

//------------------------------------------------------------------------------
    public void print() {
        if (!isEmpty()) {
            Node tmp = head;
            while (tmp != null) {
                System.out.println("Nim\t: "+tmp.data.nim);
                System.out.println("Nama\t: "+tmp.data.nama);
                System.out.println("Alamat\t: "+tmp.data.alamat);
                tmp = tmp.next;
            }
            System.out.println();
        } else {
            System.out.println("LinkedLists kosong");
        }
    }
}
