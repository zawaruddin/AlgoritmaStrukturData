
public class Tugas1 {
    int size,top;
    String data[];
    
    Tugas1(){
}
    public Tugas1(int size){
        this.size = size;
        data = new String[size];
        top =-1;
    }
    
    public boolean IsEmpty(){
     if(top==-1){
         return true;
     }else{
         return false;
     }   
    }
    
    public boolean IsFull(){
        if(top==size-1){
            return true;
        }
        else{
            return false;
        }
    }
    
    public void push (String dt){
        if(!IsFull()){
            top++;
            data[top]=dt;
        }else {
            System.out.println("Isi Stack Penuh !!");
        }
    }
    public void pop (){
        if (!IsEmpty()){
            String a =data[top];
            top--;
            System.out.println("Data yang keluar : "+a);
        }else {
            System.out.println("Stack masih kosong ");
        }
    }
    
    public void peek(){
        System.out.println("Elemen teratas "+data[top]);
    }
    
    public void print(){
        System.out.println("Isi stack: ");
        for (int i = top; i >= 0; i--) {
            System.out.println(data[i]);
        }
    }
    
    public void clear(){
        if (!IsEmpty()){
            for (int i = top; i >= 0; i--) {
                top--;
            }
            System.out.println("Stack sudah dikosongkan");
        }else{
            System.out.println("Gaga! Stack masih kosong");
        }
    }
}
