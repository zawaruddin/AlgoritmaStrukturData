package TugasJobsheet14;

/**
 *
 * @author dhimas
 */
public class Node {
    int data;
    Node left;
    Node right;
    public Node(){
        
    }
    public Node(int data){
        this.left = this.right = null;
        this.data = data;
    }
}
