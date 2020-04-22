/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasLinkedLists;

/**
 *
 * @author Rasyedrenaldi
 */
public class Node {

    protected int data;
    protected Node link;

    /*  Konstruktor  */
    public Node() {
        link = null;
        data = 0;
    }

    /*  Konstruktor  */
    public Node(int d, Node n) {
        data = d;
        link = n;
    }

    /* Berfungsi untuk mengatur link ke Node berikutnya */
    public void setLink(Node n) {
        link = n;
    }

    /* Berfungsi untuk mengatur data ke Node saat ini */
    public void setData(int d) {
        data = d;
    }

    /* Berfungsi untuk mendapatkan tautan ke simpul berikutnya  */
    public Node getLink() {
        return link;
    }

    /*  Berfungsi untuk mendapatkan data dari Node saat ini  */
    public int getData() {
        return data;
    }
}
