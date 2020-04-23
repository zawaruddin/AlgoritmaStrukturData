
public class LinkedListBank {
    Node2 head;
    int size; 
    public LinkedListBank() {
        head = null; 
        size = 0;
    }   
     public boolean isEmpty() {
         return head == null;
    } 
      public void addFirst(String noRek, String nama) {         
          head = new Node2(noRek, nama, head);
          size++;
    }   
     public void add(String noRek, String nama, int index) throws Exception {
         if (index < 0 || index > size) {
             throw new Exception("Nilai index di luar batas");
         }
         if (isEmpty() || index == 0) { 
addFirst(noRek, nama);
     }else {
             Node2 tmp = head;
             for (int i = 1; i < index; i++) {
                 tmp = tmp.next;
             }
             Node2 next = (tmp == null) ? null : tmp.next;
             tmp.next = new Node2(noRek, nama, next); 
             size++;
         }   
     } 
      public void addLast(String noRek, String nama) {
          if (isEmpty()) {
              addFirst(noRek, nama);
          }
           else {
            Node2 tmp = head;
            while (tmp.next != null) {
                tmp = tmp.next;
            }
            tmp.next = new Node2(noRek, nama, null);
            size++;
            }
        }
       public void getFirst() throws Exception {
           if (isEmpty()) {
               throw new Exception("LinkedLists kosong");
           }
           head.print();
       }
       public void getLast() throws Exception {
           if (isEmpty()) {
               throw new Exception("LinkedLists kosong");
           }
           Node2 tmp = head;
           while (tmp.next != null) {
               tmp = tmp.next;
           }
           tmp.print();
       } 
        public void get(int index) throws Exception {
            if (isEmpty() || index >= size) {
                throw new Exception("Nilai index di luar batas");
                 }         
        Node2 tmp = head; 
        for (int i = 0; i < index; i++) {
            tmp = tmp.next;
        }
        tmp.print();
        }   
         public void remove(int index) throws Exception {
             if (isEmpty() || index >= size) {
                 throw new Exception("Nilai index di luar batas");
                 
             }
             if (head == null) {
                 removeFirst();
                } else {
                 Node2 prev = head;
                 Node2 cur = head.next;
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
               Node2 tmp = head; 
               while (tmp != null) {
                   tmp.print();  
                   tmp = tmp.next;
               }
               System.out.println();
           } else {
               System.out.println("LinkedLists kosong");
           }
       }
       public void carikey(String key) {
         Node2 tmp = head;
         while (tmp.next !=null&& !tmp.noRekening.equals(key) ){
             tmp = tmp.next;
    }
    if (tmp.noRekening.equals(key)){
        System.out.println("Data yang anda cari :");
        System.out.println("Nama          : "+tmp.nama);
        System.out.println("No.Rekening   : "+tmp.noRekening);
        
    }
    }
       
}

