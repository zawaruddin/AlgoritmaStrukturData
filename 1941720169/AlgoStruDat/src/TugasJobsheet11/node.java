/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasJobsheet11;

/**
 *
 * @author dhimas
 */
public class node<T> {
    node next;
    LLPembayaran data = new LLPembayaran();

    public node(LLPembayaran data, node<T> next) {
        this.data = data;
        this.next = next;
    }
}
