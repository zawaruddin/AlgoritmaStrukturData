/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas3_DLL;

/**
 *
 * @author rasyed
 */
public class Node {
    
    int nilai;
    String nama;
    Node prev, next;

    public Node(Node prev, String nama, int nilai, Node next) {
        this.prev = prev;
        this.next = next;
        this.nama = nama;
        this.nilai = nilai;
    }
}
