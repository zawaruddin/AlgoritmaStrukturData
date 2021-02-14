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
public class BinaryTreeArray {
    int data[];
    int idxLast;
    
    public BinaryTreeArray(){
        data = new int[10];
    }
    void populateData(int data[], int idxLast){
        this.data = data;
        this.idxLast = idxLast;
    }
    public void add(int key){
        if (data[0] == 0) {
            data[0] = key;
            return;
        }       
        int index = 0;
        boolean insert = false;
        
        while (!insert) {            
            if (key < data[index]) {
                if (data[index * 2 + 1] == 0) {
                    data[index * 2 + 1] = key;
                    insert = true;
                } else {
                    index = index * 2 + 1;
                }
                
            } else {
                if (data[index * 2 + 2] == 0) {
                    data[index * 2 + 1] = key;
                    insert = true;
                } else {
                    index = index * 2 + 2;
                }
            }
        }
    }
    void traverseInOrder(int idxStart){
        if(idxStart <= idxLast){
            traverseInOrder(2 * idxStart + 1);
            System.out.print(data[idxStart]+ " ");
            traverseInOrder(2 * idxStart + 2);
        }
    }
    void traversePreOrder(int idxStart){
        if(idxStart <= idxLast){
            System.out.print(data[idxStart]+ " ");
            traverseInOrder(2 * idxStart + 1);
            traverseInOrder(2 * idxStart + 2);
        }
    }
    
    void traversePostOrder(int idxStart){
        if(idxStart <= idxLast){
            traverseInOrder(2 * idxStart + 1);
            traverseInOrder(2 * idxStart + 2);
            System.out.print(data[idxStart]+ " ");
        }
    }
}
