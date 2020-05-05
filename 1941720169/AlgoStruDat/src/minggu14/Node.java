/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu14;

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
