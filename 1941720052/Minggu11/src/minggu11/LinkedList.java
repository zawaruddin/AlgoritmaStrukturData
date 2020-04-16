/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu11;

/**
 *
 * @author Windows 10
 */
public class LinkedList {

   Node head;
    int size;
    public LinkedList(){
        head=null;
        size=0;
    }
    public boolean isEmpty(){
        return head==null;
    }
    public void addFirst(int item){
        head = new Node(item,head);
        size++;
    }
    public void add(int item,int index)throws Exception{
        if(index<0||index>size){
            throw new Exception("Nilai Indexs diluar batas");
        }
        if (isEmpty()||index==0){
        addFirst(item);
    }else {
            Node tmp = head;
            for (int i = 1; i < index; i++) {
                tmp=tmp.next;
            }
            Node next = (tmp==null)?null:tmp.next;
            tmp.next= new Node(item,next);
            size++;
        }
    }
    public void addLast(int item){
        if (isEmpty()){
            Node tmp = head;
            while(tmp.next!=null){
                tmp=tmp.next;
            }
            tmp.next=new Node(item,null);
        }
        size++;
    }
    public int getFirst() throws Exception{
        if(isEmpty()){
            throw new Exception("LinkedList kosong");
        }
        return (int) head.data;
    }
    public int getLast() throws Exception{
        if (isEmpty()){
            throw new Exception ("LinkedList kosong");
        }
        Node tmp =head;
        while (tmp.next!=null){
            tmp=tmp.next;
        }
        return (int) tmp.data;
    }
    public void remove (int index ) throws Exception{
        if(isEmpty()|| index>=size){
            throw new Exception("Nilai index diluar batas");
        }else if(index==0){
            removeFirst();
        }else{
            Node prev = head;
            Node cur=head.next;
            for (int i = 1; i < index; i++) {
                prev=cur;
                cur=prev.next;
            }
            prev.next=cur.next;
            size--;
        }
    }
    public void removeFirst()throws Exception{
        head=head.next;
        size--;
    }
    public void clear (){
        head=null;
        size=0;
    }
    public void print (){
        if (!isEmpty()){
            Node tmp = head;
            while (tmp!=null){
                System.out.println(tmp.data+"\t");
                tmp=tmp.next;
            }
            System.out.println();
        }else {
            System.out.println("LinkedList Kosong");
        }
    }
}
