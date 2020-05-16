/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UAS;

/**
 *
 * @author WINDOWS 10
 */
public class Node<T> {

    Node<Buku> prev, next;
    Buku data;

    public Node(Node<Buku> prev, Buku data, Node<Buku> next) {
        this.prev = prev;
        this.next = next;
        this.data = data;
    }
}
