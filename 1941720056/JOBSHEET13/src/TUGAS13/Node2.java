package TUGAS13;

public class Node2 {   
    Mahasiswa mhs = new Mahasiswa(); 
    Node2 prev, next;      
    Node2(Node2 prev, Mahasiswa mhs, Node2 next){  
        this.prev = prev;        
        this.mhs = mhs;       
        this.next = next;  
    } 
} 
