package TugasJobsheet11;

/**
 *
 * @author dhimas
 * @param <T>
 */
public class node<T> {
    node next;
    LLPembayaran data = new LLPembayaran();

    public node(LLPembayaran data, node<T> next) {
        this.data = data;
        this.next = next;
    }
}
