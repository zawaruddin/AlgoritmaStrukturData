package Jobsheet12;

/**
 *
 * @author dhimas
 */
public class Node {
    int data;
    Node prev, next;
    
    Node(Node prev, int data, Node next){
        this.prev = prev;
        this.data = data;
        this.next = next;
    }
}
