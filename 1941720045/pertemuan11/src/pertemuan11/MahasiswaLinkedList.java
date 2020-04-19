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
public class MahasiswaLinkedList {
    MahasiswaMain head,tail;

    public MahasiswaLinkedList() {
        head=null;
        tail=null;
    }
    
    public boolean isEmpty(){
        return head==null;
    }
    
    public void add(){
        MahasiswaMain baru=new MahasiswaMain();
        baru.input();
        if(head==null)
            head=baru;
        else
            tail.next=baru;
            tail=baru;
    }
    
    public void view(){
        if(isEmpty()){
            System.out.println("Linkedlist masih kosong");
            return;
        }
        System.out.println("|| NIM \t|| Nama \t|| Alamat \t\t|| ");
        MahasiswaMain ptr=head;
        while(ptr!=null){
            ptr.view();
            ptr=ptr.next;
        }
    }
    
    public void removeFirst(){
        if(isEmpty()){
            System.out.println("LinkedList masih kosong");
            return;
        }
        System.out.println("Data "+head.nama+" berhasil dihapus");
        head=head.next;
    }
    
    public void removeLast(){
        if(isEmpty()){
            System.out.println("LinkedList masih kosong");
        }else{
         MahasiswaMain ptr=head.next;
         MahasiswaMain prev=head;
        while(ptr!=tail){
            ptr=ptr.next;
            prev=prev.next;
        }
        prev.next=null;
        tail=prev;
        System.out.println("Data "+tail.nama+" berhasil dihapus");
        }
    }
    
    public void clear(){
        if(isEmpty()){
            System.out.println("LinkedList masih kosong");
        }else{
        head=null;
        tail=null;
        System.out.println("Data telah kosong!!");
        }
    }
    
}
