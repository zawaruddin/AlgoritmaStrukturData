package TugasJobsheet11;

/**
 *
 * @author dhimas
 * @param <T>
 */
public class Node<T> {

    Node next;
    MLinkedList data = new MLinkedList();

    public Node(MLinkedList data, Node<T> next) {
        this.data = data;
        this.next = next;
    }
}
