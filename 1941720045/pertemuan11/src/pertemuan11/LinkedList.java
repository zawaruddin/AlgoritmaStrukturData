/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan11;

/**
 *
 * @author HOSNOL ARIFIN
 */
public class LinkedList {
    Node head;
    int size;

    public LinkedList() {
        head=null;
        size=0;
    }
    
    public boolean isEmpty(){
        return head==null;
    }

    public void addFirst(int item){
        head =new Node(item,head);
        size++;
    }
    
    public void add(int item, int index)throws Exception{
        if (index<0||index>size){
            throw new Exception("Nilai index di luar batas");
        }
        if (isEmpty()||index==0){
            addFirst(item);
        }else{
            Node tmp=head;
            for (int i = 1; i < index; i++) {
                tmp=tmp.next;
            }
            Node next=(tmp==null)? null:tmp.next;
            tmp.next=new Node(item, next);
            size++;
        }
    }    
    
    public void addlast (int item){
        if(isEmpty()){
            addFirst(item);
        }else{
            Node tmp=head;
            while (tmp.next != null){
                tmp=tmp.next;
            }
            tmp.next=new Node(item,null);
            size++;
        }
    }
    
    public void addByValue(int value){
        if(isEmpty()){
            addFirst(value);
        }else{
            Node tmp=head;
            while (tmp.next != null){
                tmp=tmp.next;
            }
            Node next=(tmp==null)? null:tmp.next;
            tmp.next=new Node(value, next);
            size++;
        }
    }
    
    public int getFirst()throws Exception{
        if(isEmpty()){
            throw new Exception("LinkedLists kosong");
        }
      return head.data;
    }
    
    public int getLast () throws Exception{
        if(isEmpty()){
            throw new Exception("LinkedLists kosong");
        }
        Node tmp=head;
        while (tmp.next !=null){
            tmp=tmp.next;
        }
        return tmp.data;
    }
    
    public int get(int index)throws Exception{
        if(isEmpty()|| index>=size){
            throw new Exception("Nilai Index di luar batas");
        }
        Node tmp=head;
        for (int i = 0; i < index; i++) {
            tmp=tmp.next;
        }
        return tmp.data;
    }
    
    public void remove(int index)throws Exception{
        if(isEmpty()|| index>=size){
            throw new Exception("Nilai index di luar batas");
        }if(isEmpty()|| index==0){
            removeFirst();
        }else{
            Node prev=head;
            Node cur=head.next;
            for (int i = 0; i < index; i++) {
                prev=cur;
                cur=prev.next;
            }
            prev.next=cur.next;
            size--;
        }
    }
    
    public void removeByValue(int key)throws Exception{
        Node temp = head;
            if (!isEmpty()){
 		while (temp != null){
                    if (temp.next.data == key){	
 			temp.next = temp.next.next; 
 			break;	
                    }			
                    else if ((temp.data == key)&&(temp == head)){
 			this.removeFirst();
 			break;		
                    }
                    temp = temp.next;
 		}
 	} 
        else System.out.println("Data is empty!");
    }
    
    public void removeFirst()throws Exception{
        head=head.next;
        size--;
    }
    
    public void clear(){
        head=null;
        size=0;
    }
    
    public void print(){
        if(!isEmpty()){
            Node tmp=head;
            while (tmp !=null){
                System.out.println(tmp.data+"\t");
                tmp=tmp.next;
            }
            System.out.println();
        }else{
            System.out.println("LinkedList kosong");
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
   
   public void findIndex(int index)throws Exception{
       boolean found = false;
  	Node temp = head;
         for (int i = 0; i < index; i++){
             temp=temp.next;
             found=true;
         }
         if(found){
             System.out.println("Index "+index+" nilainya adalah: "+temp.data);
         }else{
             System.out.println("Data tidak ditemukan");
         }
   }
}
