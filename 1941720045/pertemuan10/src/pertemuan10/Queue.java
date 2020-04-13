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
public class Queue {
    int max, size, front, rear;
    int[] Q;

    public Queue (int n){
        max=n;
        Create();
    }
    
   public void Create(){
       Q=new int [max];
       size=0;
       front = rear =-1;
   } 
   
   public boolean IsEmpty(){
       if (size==0){
           return true;
       } else{
           return false;
       }
   }
   
   public boolean IsFull(){
       if(size == max ){
           return true;
       }else{
           return false;
       }
   }
    
   public void peek(){
       if (!IsEmpty()){
           System.out.println("Elemen terdepan: "+ Q[front]);
       } else{
           System.out.println("Antria masih kosong");
       }
   }
   
   public void print(){
       if (IsEmpty()){
           System.out.println("Antrian masiih kosong");
       }else{
           int i=front;
           while (i !=rear){
               System.out.print(Q[i]+" ");
               i=(i+1)% max;
           }
           System.out.println(Q[i]+" ");
           System.out.println("Jumlah antrian = "+ size);
       }
   }

    public void Enqueue (int data){
    if(IsFull()) {
        System.out.println("Antrian sudah penuh");
    }else {
        if (IsEmpty()){
            front=rear=0;
        }else{
            if(rear==max-1){
                rear=0;
            }else{
                rear++;
            }
        }
        Q[rear]=data;
        size++;
    }
} 
    public int Dequeue(){
        int data=0;
        if (IsEmpty()){
            System.out.println("Antrian masih kosong");
        }else {
            data=Q[front];
            size--;
            if(IsEmpty()){
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
    
    public static void menu(){
        System.out.println("Masukkan operasi yang diinginkan: ");
        System.out.println("1. Enqueue\n2. Dequeue\n3. Print\n4. Peek"
                + "\n5. Peek Rear\n6. Peek Position\n7. PeekAt ");
        System.out.println("---------------------------------");
    }
    
    public void peekRear(){
        if(!IsEmpty()){
            System.out.println("Elemen paling belakang: "+Q[rear]);
        }else{
            System.out.println("Antrian masih kosong !!");
        }
    }
    
    public void peekPosition(int data){
        if(IsEmpty()){
            System.out.println("Antrian masih kosong");
        }else{
        for (int i = 0; front < max-1; i++) {
            if(data==Q[i]){
                System.out.println("Posisi antrian berada pada index ke- "+i);
                break;
                }
            }    
        }
    }
  
    public void peekAt(int position){
        if(IsEmpty()){
            System.out.println("Antrian masih kosong");
        }else{
            int target = 0;
            for (int i = 0; front < max-1; i++) {
                target=Q[position];
                }
             System.out.println("Data adalah: "+target);
            }
        }
}