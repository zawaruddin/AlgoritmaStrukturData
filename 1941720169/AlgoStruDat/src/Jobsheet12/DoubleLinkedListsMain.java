package Jobsheet12;

/**
 *
 * @author dhimas
 */
public class DoubleLinkedListsMain {

    public static void main(String[] args) throws Exception {
        DoubleLinkedLists dll = new DoubleLinkedLists();
        dll.print();
        System.out.println("Size : " + dll.size());
        System.out.println("=========================");
        dll.addFirst(3);
        dll.addLast(4);
        dll.addFirst(7);
        dll.print();
        System.out.println("Size : " + dll.size());
        System.out.println("=========================");
        dll.add(40, 2);
        dll.print();
        System.out.println("Size : " + dll.size());
        System.out.println("=========================");
        System.out.println("Data awal: "+dll.getFirst());
        System.out.println("Data akhir: "+dll.getLast());
        System.out.println("data indeks ke-1: "+dll.get(1));
    }
}
