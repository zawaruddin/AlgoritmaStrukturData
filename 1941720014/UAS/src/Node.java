
/**
 *
 * @author Aulafz
 */
public class Node {

    Buku_Aula data = new Buku_Aula();
    Node prev, next;

    Node(Node prev, Buku_Aula data, Node next) {
        this.prev = prev;
        this.data = data;
        this.next = next;
    }
}
