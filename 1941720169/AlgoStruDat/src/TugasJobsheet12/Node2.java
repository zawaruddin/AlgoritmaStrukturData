/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasJobsheet12;

/**
 *
 * @author dhimas
 */
public class Node2 {
    MahasiswaDLL data = new MahasiswaDLL();
    Node2 prev, next;
    
    Node2(Node2 prev, MahasiswaDLL data, Node2 next){
        this.prev = prev;
        this.data = data;
        this.next = next;
    }
}
