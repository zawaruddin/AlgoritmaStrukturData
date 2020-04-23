public class LinkedListMahasiswa {
    Node head;
    int size;
    
    public LinkedListMahasiswa(){
        head = null;
        size = 0;
    }
    public boolean isEmpty(){
        return head == null;
    }
    public void addFirst(String nim,String nama,String alamat){
        head = new Node(nim,nama,alamat,head);
        size++;
    }
    public void add(String nim,String nama,String alamat,int index)throws Exception{
        if(index<0||index>size){
            throw new Exception("Nilai index diluar batas");
        }
        if(isEmpty()|| index == 0){
            addFirst(nim,nama,alamat);
        }else{
            Node tmp = head;
            for (int i = 1; i <index; i++) {
                tmp=tmp.next;
            }
            Node next = (tmp==null)?null:tmp.next;
            tmp.next = new Node (nim,nama,alamat,next);
            size++;
        }
    }
    public void addLast(String nim,String nama,String alamat){
        if (isEmpty()){
            addFirst(nim,nama,alamat);
        }else{
            Node tmp = head;
            while(tmp.next!=null){
                tmp=tmp.next;
            }
            tmp.next = new Node(nim,nama,alamat,null);
            size++;
        }
    }
    public void remove(int idx)throws Exception{
        if(isEmpty()||idx>=size){
            throw new Exception("Nilai index di luar batas");
        }
        if(head==null){
            removeFirst();
        }else{
            Node prev = head;
            Node cur = head.next;
            for (int i = 1; i < idx; i++) {
                prev=cur;
                cur=prev.next;
            }
            prev.next=cur.next;
            size--;
        }
    }
    public void removeFirst() throws Exception{
        head=head.next;
        size--;
    }
    public void clear(){
        head=null;
        size=0;
    }
    public void print(){
        if(!isEmpty()){
            Node tmp = head;
            System.out.println("--------------------------------");
            System.out.println("        DAFTAR MAHASISWA        ");
            System.out.println("--------------------------------");
            while (tmp!=null){
                System.out.println("NIM     :"+tmp.nim);
                System.out.println("Nama    :"+tmp.nama);
                System.out.println("Alamat  :"+tmp.alamat);
                tmp = tmp.next;
            }
            System.out.println();
        }else{
            System.out.println("LinkedList kosong");
        }
    }
    public void carikey(String key) {
         Node tmp = head;
         while (tmp.next !=null&& !tmp.nim.equals(key) ){
             tmp = tmp.next;
    }
    if (tmp.nim.equals(key)){
        System.out.println("Data yang anda cari :");
        System.out.println("NIM     : "+tmp.nim);
        System.out.println("Nama    : "+tmp.nama);
        System.out.println("Alamat  : "+tmp.alamat);
    }
    }
}
