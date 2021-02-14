/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan13;

/**
 *
 * @author Windows 10
 */
public class MainDoubleLinkedLists {
    public static void main(String[] args) throws Exception {
        DoubleLinkedLists dll = new DoubleLinkedLists();
        dll.print();
        System.out.println("Size : "+ dll.size());
        System.out.println("=====================================");
        dll.addFirst(3);
        dll.addLast(4);
        dll.addFirst(7);
        dll.print();
        System.out.println("Size : "+ dll.size());
        System.out.println("=====================================");
        dll.add(40, 1);
        dll.print();
        System.out.println("Size : "+ dll.size());
        System.out.println("=====================================");
        System.out.println("Data awal pada Linked Lists adalah : "+ dll.getFirst());
        System.out.println("Data akhir pada Linked Lists adalah : "+ dll.getLast());
        System.out.println("Data indeks ke-1 pada Linked Lists adalah : "+ dll.get(1));
        dll.clear();
        dll.print();
        System.out.println("Size : "+ dll.size());
        dll.addLast(50);
        dll.addLast(40);
        dll.addLast(10);
        dll.addLast(20);
        dll.print();
        System.out.println("Size : "+ dll.size());
        System.out.println("=====================================");
        dll.removeFirst();
        dll.print();
        System.out.println("Size : "+ dll.size());
        System.out.println("=====================================");
        dll.removeLast();
        dll.print();
        System.out.println("Size : "+ dll.size());
        System.out.println("=====================================");
        dll.remove(1);
        dll.print();
        System.out.println("Size : "+ dll.size());
    }
    
}
