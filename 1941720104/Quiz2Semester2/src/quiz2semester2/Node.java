/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz2semester2;

/**
 *
 * @author Daffa Cahyo
 */
public class Node<T>{
    dataPasien data;
    Node<dataPasien> next;

    public Node() {
        next = null;
        data = null;
    }

    public Node(dataPasien data, Node<dataPasien> next) {
        this.data = data;
        this.next = next;
    }

    public dataPasien getData() {
        return data;
    }

    public void setData(dataPasien data) {
        this.data = data;
    }

    public Node<dataPasien> getNext() {
        return next;
    }

    public void setNext(Node<dataPasien> next) {
        this.next = next;
    }    
}