/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan8;
import java.util.Scanner;
/**
 *
 * @author HOSNOL ARIFIN
 */
public class Stack {
    int size,top;
    String data[];

    public Stack(int size) {
        this.size = size;
        data=new String[size];
        top=-1;
    }
    
    public boolean isEmpty(){
        if (top==-1){
            return true;
        }else {
            return false;
        }
    }
    
    public boolean isFull(){
        if(top==size-1){
            return true;
        }else {
            return false;
        }
    }
    
    public void push(String dt){
        if (!isFull()){
            top++;
            data[top]=dt;
        }else{
            System.out.println("Isi stack Penuh!");
        }
    }
    
    public void pop(){
        if(!isEmpty()){
            String x=data[top];
            top--;
            System.out.println("Data yang keluar: "+ x);
        }else{
            System.out.println("Stack masih kosong");
        }
    }
    
    public void peek(){
        System.out.println("Elemen teratas: "+ data[top]);
    }
    
    public void print (){
        System.out.println("isi stack: ");
        for (int i = top; i >= 0; i--) {
            System.out.println(data[i]+ " ");
        }
        System.out.println("");
    }
    
    public void clear(){
        if (!isEmpty()){
            for (int i = top; i >= 0; i--) {
                top--;
            }
            System.out.println("Stack sudah dikosongkan");
        }else{
            System.out.println("Gagal! Stack masih kosong");
        }
    }
    public static void main(String[] args) {
    Scanner Arif=new Scanner(System.in);
    Stack tumpukan=new Stack(4);
    while(true){
        System.out.println("<<Silahkan Pilih menu>>");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Tampilkan data");
            System.out.println("4. Exit");

            try{
                System.out.print("pilihan anda no :");
                int pilih = Arif.nextInt();

                if(pilih==1){
                    System.out.print("Masukkan data :");
                    String data = Arif.next();
                    tumpukan.push(data);
                }else if(pilih==2){
                    tumpukan.pop();
                }else if(pilih==3){
                    tumpukan.print();
                }else{
                    System.exit(0);
                }
            }catch(Exception e){

            }
        }
    
//        for (int i = 0; i < 4; i++) {
//            System.out.print("Masukkan isi Stack ke-"+(i+1)+" : "); 
//            int nilai=Arif.nextInt();
//           tumpukan.push(nilai);
//        }
////     tumpukan.push(15);
////     tumpukan.push(31);
////     tumpukan.push(9);
////     tumpukan.push(12);
////     tumpukan.push(17);
////     tumpukan.push(98);
//     tumpukan.print();
//     tumpukan.pop();
//     tumpukan.peek();
//     tumpukan.print();
    }
}