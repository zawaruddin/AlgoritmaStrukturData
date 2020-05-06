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
public class BukuLinkedList {
    BukuMain top;

    public BukuLinkedList() {
        top = null;
    }
    
    public void push(BukuMain a){
        if(top==null)
            top=a;
        else{
            a.next=top;
            top=a;
        }
    }
    
    public void pop(){
        if(top==null)
            System.out.println("Data masih kosong");
        else{
            System.out.println("Poping Data...");
            top.view();
            top=top.next;
        }
    }
    
        public void view(){
        if(top==null) System.out.println("kosong");
        else{
            BukuMain ptr=top;
            while(ptr!=null){
                System.out.println("- - - - -");
                ptr.view();
                ptr=ptr.next;
            }
        }
    }
}