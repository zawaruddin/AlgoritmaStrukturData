/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package retno;

/**
 *
 * @author USER
 */
public class Node <T>{
    Node<CdObject> prev;
    Node <CdObject> next;
    CdObject data;

    public Node(Node<CdObject> prev, CdObject data, Node<CdObject> next) {
        this.prev = prev;
        this.next = next;
        this.data = data;
    }
    
   
}
