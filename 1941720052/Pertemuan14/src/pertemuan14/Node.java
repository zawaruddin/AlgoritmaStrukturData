/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan14;

/**
 *
 * @author Windows 10
 */
public class Node {
    int data;
    Node left;
    Node right;
    
    public Node(){
    }
    public Node(int data){
        this.left = null;
        this.data = data;
        this.right = null;
    }
    
}
