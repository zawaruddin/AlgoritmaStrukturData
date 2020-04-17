/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jobsheet11;

public class Node<T> {
    T data;
    Node next;
    
    public Node(T data, Node next){
        this.data = data;
        this.next = next;
    }
}
