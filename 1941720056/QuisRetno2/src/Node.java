
public class Node<T> {
    DataPasien data;
    Node<DataPasien> next;

    public Node() {
        next = null;
        data = null;
    }

    public Node(DataPasien data, Node<DataPasien> next) {
        this.data = data;
        this.next = next;
    }

    public DataPasien getData() {
        return data;
    }

    public void setData(DataPasien data) {
        this.data = data;
    }

    public Node<DataPasien> getNext() {
        return next;
    }

    public void setNext(Node<DataPasien> next) {
        this.next = next;
    }  
}
