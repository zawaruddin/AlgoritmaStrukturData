/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan10;

/**
 *
 * @author HOSNOL ARIFIN
 */
public class QueueNasabah {
    int max,front,rear,size;
    Nasabah[] q;

    public QueueNasabah(int n) {
        max=n;
        create();
    }
    
    public void create(){
        q=new Nasabah[max];
        size=0;
        front=rear=-1;
    }

    public boolean isEmpty(){
      if(size==0){
        return true;  
      }else{
          return false;
      }
    }
    
    public boolean isFull(){
        if(size==max){
            return true;
        }else{
            return false;
        }
    }
    
    public void enqueue(Nasabah data){
        if(isFull()){
            System.out.println("Antrian penuh!!");
        }else{
            if(isEmpty()){
                front=rear=0;
            }else{
                if(rear==max-1){
                    rear=0;
                }else{
                    rear++;
                }
        }
            q[rear]=data;
            size++;
        }
    }
    
    public Nasabah dequeue(){
        Nasabah data=null;
        if(isEmpty()){
            System.out.println("Antrian masih kosong!!");
        }else{
            data=q[front];
            size--;
            if(isEmpty()){
                front=rear=-1;
            }else{
                if(front==max-1){
                    front=0;
                }else{
                    front++;
                }
            }
        }
        return data;
    }
    
    public void print(){
        if(isEmpty()){
            System.out.println("Antrian masih kosong");
        }else{
            int i=front;
            while(i !=rear){
                q[i].print();
                i=i+1%max;
            }
            q[i].print();
            System.out.println("jumlah Antrian: "+size);
        }
    }
    
    public void peek(){
        if(isEmpty()){
            System.out.println("Antrian masih kosong");
        }else{
            System.out.println("Antrian pertama adalah: ");
            System.out.println("||\tNama Nasabah\t||\tNo Rekening\t||");
            q[front].print();
        }
    }
    
    public void peekRear(){
       if(isEmpty()){
           System.out.println("Antrian masih kosong");
       }else{
           System.out.println("Antrian paling belakang adalah:");
           System.out.println("||\tNama Nasabah\t||\tNo Rekening\t||");
           q[rear].print();
       }
    }
    
    public void peekPosition(Nasabah n){
        if(isEmpty()){
            System.out.println("Antrian masih kosong");
        }else{
            for (int i = front; i < max-1; i++) {
            if(n==q[i]){
                q[i].print();
                System.out.println("Posisi antrian berada pada index ke- "+i);
                break;
                }else{
                if(i==max-1){
                    System.out.println("Data tidak ditemukan!!");
                    }
                }
            }
        }
    }
    
    public void printNasabah(int posisi){
        if (isEmpty()) {
            System.out.println("Antrian Masih Kosong !! ");
        } else {
            for (int i = front; i < max - 1; i++) {
                if (posisi == i) {
                    System.out.println("Nasabah pada posisi " + i+ " Berisi Data Nasabah ");
                    System.out.println("||\tNama Nasabah\t||\tNo Rekening\t||");
                    q[i].print();
                    break;
                } else {
                    if (i == max - 1) {
                        System.out.println("Data tidak ditemukan");
                    }
                }
            }
        }
    }
}
