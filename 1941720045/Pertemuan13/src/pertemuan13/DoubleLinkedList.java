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
public class DoubleLinkedList {
    Node head;
    int size;

    public DoubleLinkedList() {
        head=null;
        size=0;
    }
    
    public boolean isEmpty(){
        return head==null;
    }
    
    public void addFirst(int item){
        if(isEmpty()){
            head=new Node(null,item,null);
        }else{
            Node newNode=new Node(null,item,head);
            head.prev=newNode;
            head=newNode;
        }
        size++;
    }
    
    public void addLast(int item){
        if(isEmpty()){
            addFirst(item);
        }else{
            Node current=head;
            while(current.next!=null){
                current=current.next;
            }
            Node newNode=new Node(current,item,null);
            current.next=newNode;
            size++;
        }
    }
    
    public void add(int item,int index)throws Exception{
        if(isEmpty()){
            addFirst(item);
        }else if(index<0||index>size){
            throw new Exception("Nilai indeks di luar batas");
        }else{
            Node current=head;
            int i=0;
            while(i<index){
                current=current.next;
                i++;
            }
            if(current.prev==null){
                Node newNode=new Node(null,item,current);
                current.next=newNode;
                head=newNode;
            }else{
                Node newNode=new Node(current.prev,item,current);
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
           Node current=head;
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
            Node current=head;
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
    
    public int getFirst()throws Exception{
        if(isEmpty()){
            throw new Exception("Linked list kosong");
        }
        return head.data;
    }
    
    public int getLast()throws Exception{
        if(isEmpty()){
            throw new Exception("Linked list kosong");
        }
        Node tmp=head;
        while (tmp.next!=null){
            tmp=tmp.next;
        }
        return tmp.data;
    }
    
    public int get(int index)throws Exception{
        if(isEmpty() || index>=size){
            throw new Exception("Nilai index diluar batas");
        }
        Node tmp=head;
        for(int i=0;i<index;i++){
            tmp=tmp.next;
        }
        return tmp.data;
    }
    
    public int siize(){
        return size;
    }
    
    public void clear(){
        head=null;
        size=0;
    }
    
    public void print(){
        if(!isEmpty()){
            Node tmp=head;
            while(tmp!=null){
                System.out.print(tmp.data+"\t");
                tmp=tmp.next;
            }
            System.out.println("");
        }else{
            System.out.println("Linked list kosong");
        }
    }
    
    public void find (int key) throws Exception{
  	int i = 0;
  	boolean found = false;
  	Node temp = head;
            while (temp != null){
                if (temp.data == key){
                    found = true;
                    break;
   		}
                    i++;
                    temp = temp.next;
  		}if (found){
                    System.out.println(key+" ditemukan pada index "+i);
  		}else 
                    System.out.println("Data tidak ditemukan");
        }
    
      public void sortList() {  
        Node current = null, index = null;  
        int temp;  
        if(head == null) {  
            return;  
        }  
        else {  
            for(current = head; current.next != null; current = current.next) { 
                for(index = current.next; index != null; index = index.next) {  
                    if(current.data > index.data) {  
                        temp = current.data;  
                        current.data = index.data;  
                        index.data = temp;  
                    }  
                }  
            }  
        }  
    }  
}
