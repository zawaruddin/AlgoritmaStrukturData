/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu8;

/**
 *
 * @author Rasyed
 */
public class Stack {
    int size;
    int top;
    int data[];
    
    public Stack(int size){
        this.size = size;
        data = new int [size];
        top = -1;
    }
    public boolean IsEmpty(){
        if (top == -1) {
            return true;
        }else{
            return false;
        }
    }
    public boolean IsFull(){
        if (top == size - 1) {
            return true;
        }else{
            return false;
        }
    }
    public void push(int dt){
        if (!IsFull()){
            top++;
            data[top] = dt;
        }else{
            System.out.println("Isi stack penuh");
        }
    }
    public void pop (){
        if (!IsEmpty()) {
            int x = data[top];
            top--;
            System.out.println("Data yang keluar: "+ x);
            
        }else{
            System.out.println("Stack masih kosong");
        }
        System.out.println("");
    }
    public void peek(){
        System.out.println("Elemen teratas: "+data[top]);
    }
    public void print(){
        System.out.println("Isi stack: ");
        for (int i = top; i >= 0; i--) {
            System.out.print(data[i]+" ");
        }
        System.out.println(" ");
    }
    public void clear(){
        if (!IsEmpty()) {
            for (int i = top; i >= 0; i--) {
               top--; 
            }
            System.out.println("Stack sudah dikosongkan");
        }else{
            System.out.println("Gagal! Stack masih kosong");
        }
    }
}
