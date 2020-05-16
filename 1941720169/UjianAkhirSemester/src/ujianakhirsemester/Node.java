package ujianakhirsemester;

/**
 *
 * @author dhimas
 */
public class Node {
    CD_Dhimas data = new CD_Dhimas();
    Node prev, next;
    
    Node(Node prev, CD_Dhimas data, Node next){
        this.prev = prev;
        this.data = data;
        this.next = next;
    }
}
