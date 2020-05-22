/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasGraph.Weigthed;

/**
 *
 * @author rasyed
 */
public class Node {

    Edges data = new Edges();
    Node prev, next;

    Node(Node prev, Edges data, Node next) {
        this.prev = prev;
        this.data = data;
        this.next = next;
    }
}
