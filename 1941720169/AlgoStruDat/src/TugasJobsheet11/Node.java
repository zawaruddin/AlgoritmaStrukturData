/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasJobsheet11;

/**
 *
 * @author dhimas
 */
public class Node<T> {

    Node next;
    MLinkedList data = new MLinkedList();

    public Node(MLinkedList data, Node<T> next) {
        this.data = data;
        this.next = next;
    }
}
