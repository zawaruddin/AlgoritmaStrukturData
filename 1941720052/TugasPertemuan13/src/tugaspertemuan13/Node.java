/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugaspertemuan13;

/**
 *
 * @author Windows 10
 */
public class Node {
    int data;
    Node next;
    Node prev;

    public Node(Node prev, int data, Node next) {
        this.data = data;
        this.next = next;
        this.prev = prev;
    }
    
}
