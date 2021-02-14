package Praktikum;

/**
 *
 * @author Aulafz
 */
public class node5 {
    int data, weight;
    node5 prev;
    node5 next;

    node5(node5 prev, int data, int weight, node5 next) {
        this.prev = prev;
        this.data = data;
        this.weight = weight;
        this.next = next;
    }
}
