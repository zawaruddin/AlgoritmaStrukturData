/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan13;

/**
 *
 * @author HOSNOL ARIFIN
 */
public class Node {
    int data;
    Node prev,next;

    Node(Node prev,int data, Node next) {
        this.prev=prev;
        this.data=data;
        this.next=next;
    }
}
