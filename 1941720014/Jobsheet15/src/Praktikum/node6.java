package Praktikum;

/**
 *
 * @author Aulafz
 */
public class node6<T> {

    T data;
    node6<T> prev;
    node6<T> next;

    node6(node6 prev, T data, node6 next) {
        this.prev = prev;
        this.data = data;
        this.next = next;
    }
}
