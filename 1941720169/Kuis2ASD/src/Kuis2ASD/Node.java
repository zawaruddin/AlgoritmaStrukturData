/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kuis2ASD;

/**
 *
 * @author dhimas
 * @param <T>
 */
public class Node<T> {

    Node next;
    AntrianKlinik data = new AntrianKlinik();

    public Node(AntrianKlinik data, Node<T> next) {
        this.data = data;
        this.next = next;
    }
}
