package percobaan;

/**
 *
 * @author Aulafz
 */
public class LinkedLists {
    Node head;
    int size;
    
    public LinkedLists() {
        head = null;
        size = 0;
    }
    
    public boolean isEmpty() {
        return head == null;
    }
    
    public void addFirst(int item) {
        head = new Node(item, head);
        size++;
    }
    
    public void add(int item, int index) throws Exception {
        if (index < 0 || index > size) {
            throw new Exception("Nilai index di luar batas");
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
            size++;
        }
    }
    
    public void AddLast(int item) {
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
    
    public int getFirst() throws Exception {
        if (isEmpty()) {
            throw new Exception("LinkedLists kosong");
        }
        return (int) head.data;
    }
    
    public int getLast() throws Exception {
        if (isEmpty()) {
            throw new Exception("LinkedLists kosong");
        }
        Node tmp = head;
        while (tmp.next != null) {
            tmp = tmp.next;
        }
        return (int) tmp.data;
    }
    
    public int get (int index) throws Exception {
        if (isEmpty() || index >= size) {
            throw new Exception("Nilai index di luar batas");
        }
        Node tmp = head;
        for (int i = 0; i< index; i++) {
            tmp = tmp.next;
        }
        return (int) tmp.data;
    }
    
    public void remove (int index) throws Exception {
        if (isEmpty() || index >= size) {
            throw new Exception("Nilai index di luar batas");
        } else if (index == 0) {
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
    
    public void removeFirst() throws Exception {
        head = head.next;
        size--;
    }
    
    public void clear() {
        head = null;
        size = 0;
    }
    
    public void print() {
        if (!isEmpty()) {
            Node tmp = head;
            while (tmp != null) {
                System.out.println(tmp.data + "\t");
                tmp = tmp.next;
            }
            System.out.println();
        } else {
            System.out.println("LinkedLists kosong");
        }
    }
    
    public void addByValue (int search, int item) throws Exception {
        int index = 0;
        boolean found = false;
        Node tmp = head;
        while (tmp.next != null) {
            tmp = tmp.next;
            index++;
            if ( (int) head.data == search) {
                found = true;
                break;
            } else if ( (int) tmp.data == search) {
                found = true;
                index++;
                break;
            }
        }
        if (found) {
            add(item,index);
        } else {
            throw new Exception("Data tidak ditemukan");
        }
        
    }
    
    public void removeByValue(int search) throws Exception {
        int index = 0;
        boolean found = false;
        Node tmp = head;
        while (tmp.next != null) {
            tmp = tmp.next;
            index++;
            if ((int) head.data == search) {
                removeFirst();
                break;
            }
        }
        if (found) {
            remove(index);
        } else {
            throw new Exception("Data tidak ditemukan");
        }
    }
    public void cari (int indeks) throws Exception {
        if (indeks < 0 || indeks > size) {
            throw new Exception("Nilai indeks melebihi batas");
        } else {
            Node tmp = head;
            int i = 1;
            while (i < indeks) {
                tmp = tmp.next;
                i++;
            }
            System.out.println("Data pada indeks ke- " + indeks + " adalah " + tmp.data);
        }
    }
    public void cariKey(int search) throws Exception {
        int indeks = 0;
        boolean found = false;
        Node tmp = head;
        if (isEmpty()){
            System.out.println("Linked Lists masih kosong");
        } else {
            while (tmp.next != null) {
                tmp = tmp.next;
                indeks++;
                if ((int)head.data == search) {
                    found = true;
                    break;
                } else if ((int)tmp.data == search) {
                    found = true;
                    indeks++;
                    break;
                }
            }
        }
        if (found) {
            System.out.println("Data " + search + " ditemukan di indeks ke- " + indeks);
        } else {
            throw new Exception("Data " + search + " tidak ditemukan");
        }
        
    }
}
