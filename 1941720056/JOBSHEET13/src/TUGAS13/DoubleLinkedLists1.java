package TUGAS13;

public class DoubleLinkedLists1 {
    Node1 head;
 int size;

    public DoubleLinkedLists1(){
    head = null;
    size = 0;
    }
    
    public boolean isEmpty(){
    return head == null;
    }
    
    public void addFirst(int item){
        if(isEmpty()){
         head = new Node1(null,item,null);
        }else{
        Node1 newNode = new Node1(null, item, head);
        head.prev = newNode;
        head = newNode;
        }
        size++;
    }
    
    public void addLast(int item){
        if(isEmpty()){
        addFirst(item);
        }else{
            Node1 current = head;
        while (current.next != null){
            current = current.next;
     }
        Node1 newNode = new Node1(current, item, null);
        current.next = newNode;
        size++;
        }
    }
    public void add(int item,int index) throws Exception{
        if(isEmpty()){
        addFirst(item);
        }else if (index < 0 || index > size){
            throw new Exception("Nilai index di luar batas");
        }else{
               Node1 current = head;
        int i = 0;
        while (i<index){
            current = current.next;
            i++;
        }
        if(current.prev == null){
            Node1 newNode = new Node1(null, item, current);
            current.prev = newNode;
            head = newNode;
        }else{
            Node1 newNode = new Node1 (current.prev, item, current);
            newNode.prev = current.prev;
            newNode.next = current;
            current.prev.next = newNode;
            current.prev = newNode;
        }
       }
        size++;
    }
    public int size(){
       return size;
    }
    public void clear(){
        head = null;
        size = 0;
    }
    public void print(){
        if(!isEmpty()){
            Node1 tmp = head;
        while(tmp!=null){
            System.out.println(tmp.data);
            tmp = tmp.next;
            }
        }else{
        System.out.println("Linked Lists Kosong");
        }
    }
    
    public void removeFirst() throws Exception{
        if(isEmpty()){
            throw new Exception("Linked List masih kosong, tidak dapat dihapus");
        }else if(size==1){
            removeLast();
        }else{
            head = head.next;
            head.prev = null;
            size--;
        }
    }
    public void removeLast() throws Exception{
        if(isEmpty()){
            throw new Exception("Linked List masih kosong, tidak dapat dihapus");
        }else if(head.next == null){
            head = null;
            size--;
            return;
        }
        Node1 current = head;
        while (current.next.next != null){
            current = current.next;
        }
        current.next = null;
        size--;
    }
    public void remove(int index) throws Exception{
        if (isEmpty() || index >= size){
            throw new Exception("Nilai indeks di luar batas");
        }else if (index == 0){
            removeFirst();
        }else{
            Node1 current = head;
            int i = 0;
            while (i<index){
                current = current.next;
                i++;
            }
            if(current.next == null){
                current.prev.next = null;
            }else if(current.prev == null){
                current = current.next;
                current.prev = null;
            }else{
                current.prev.next = current.next;
                current.next.prev = current.prev;
            }
            size--;
        }
    }
    public int getFirst() throws Exception{
        if(isEmpty()){
            throw new Exception("Linked List kosong");
        }
        return head.data;
    }  
    public int getLast() throws Exception{
        if(isEmpty()){
            throw new Exception("Linked List kosong");
        }
        Node1 tmp = head;
        while (tmp.next != null){
            tmp = tmp.next;
        }
        return tmp.data;
    }
    public int get(int index)throws Exception{
        if(isEmpty() || index>=size){
            throw new Exception("Nilai indeks di luar batas");
        }
        Node1 tmp = head;
        for(int i=0; i<index; i++){
            tmp = tmp.next;
        }
        return tmp.data;
    }
    public int getKey(int item) throws Exception{
        Node1 tmp = head;
        int i=0,idx=0;
        while(tmp != null){
            if (item==tmp.data){
            idx=i;
        }
        tmp = tmp.next;
        i++;
    }
        return idx;
    }
     public void bubbleSortAscending() throws Exception{
         Node1 current;
         for(int i=0; i<size; i++){
             current = head;
             while(current.next != null){
                 if(current.data > current.next.data){
                     int item = current.data;
                     current.data = current.next.data;
                     current.next.data = item;
                 }
                 current = current.next;
             }
             current = current.prev;
         }
     }
     
 }
