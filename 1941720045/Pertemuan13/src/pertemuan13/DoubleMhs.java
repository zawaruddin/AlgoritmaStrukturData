/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan13;

/**
 *
 * @author HOSNOL ARIFIN
 */
public class DoubleMhs {
    NodeMhs head;
    int size;

    public DoubleMhs() {
        this.head = null;
        this.size = 0;
    }
    
     public int size(){
        return size;
    }
    
     public boolean isEmpty(){
        return head==null;
    }
     
      public void addFirst(String nm,int nilai){
        if(isEmpty()){
            head=new NodeMhs(null,nm,nilai,null);
        }else{
            NodeMhs newNode=new NodeMhs(null,nm,nilai,head);
            head.prev=newNode;
            head=newNode;
        }
        size++;
    }
      
      public void tampilkan(){
        NodeMhs current = head;
        if(current == null){
            System.out.println("Kosong!");
        }else{
            System.out.println("\nData Saat Ini:");
            while(current != null){
                current.tampil();
                current = current.next;
            }
            System.out.println();
        }
    }
      
    public void addLast(String nm,int n){
        if(isEmpty()){
            addFirst(nm, n);
        }else{
            NodeMhs current=head;
            while(current.next!=null){
                current=current.next;
            }
            NodeMhs newNode=new NodeMhs(current,nm,n,null);
            current.next=newNode;
            size++;
        }
    }
    
    public void add(String nm,int n,int index)throws Exception{
        if(isEmpty()){
            addFirst(nm, n);
        }else if(index<0||index>size){
            throw new Exception("Nilai indeks di luar batas");
        }else{
            NodeMhs current=head;
            int i=0;
            while(i<index){
                current=current.next;
                i++;
            }
            if(current.prev==null){
                NodeMhs newNode=new NodeMhs(null,nm,n,current);
                current.next=newNode;
                head=newNode;
            }else{
                NodeMhs newNode=new NodeMhs(current.prev,nm,n,current);
                newNode.prev=current.prev;
                newNode.next=current;
                current.prev.next=newNode;
                current.prev=newNode;
            }
        }
        size++;
    }
    
    public void removeFirst()throws Exception{
        if(isEmpty()){
            throw new Exception("Linked List masih kosong. tidak dapat dihapus");
        }else if(size==1){
            removeLast();
        }else{
            head=head.next;
            head.prev=null;
            size--;
        }
    }
    
    public void removeLast()throws Exception{
        if(isEmpty()){
            throw new Exception("linked list masih kosong, tidak dapat dihapus");
        }else if(head.next==null){
            head=null;
            size--;
            return;
        }else{
           NodeMhs current=head;
           while(current.next.next!=null){
               current=current.next;
           }
           current.next=null;
           size--;
        }
    }
    
    public void remove(int index)throws Exception{
        if(isEmpty()){
            throw new Exception("Nilai index diluar batas");
        }else if(index==0){
            removeFirst();
        }else{
            NodeMhs current=head;
            int i=0;
            while(i<index){
                current=current.next;
                i++;
            }if(current.next==null){
                current.prev.next=null;
            }else if(current.prev==null){
                current=current.next;
                current.prev=null;
                head=current;
            }else{
                current.prev.next=current.next;
                current.next.prev=current.prev;
            }
            size--;
        } 
    }
    
    public void find(String nama){
        NodeMhs current = head;
        String nama_mahasiswa = "Tidak ditemukan";
        int n=0;
        if(current == null){
            System.out.println("Kosong!");
        }else{
            while(current != null){
                if(current.nama == null ? nama == null : current.nama.equals(nama)){
                    nama_mahasiswa = current.nama;
                    n = current.nilai;
                    break;
                }
                current = current.next;
            }
            System.out.println("\nNama\t: "+ nama_mahasiswa);
            System.out.println("Nilai\t: "+ n);
            System.out.println("");
        }
    }
}
