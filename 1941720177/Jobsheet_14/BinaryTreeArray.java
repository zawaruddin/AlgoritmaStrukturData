/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jobsheet_14;

/**
 *
 * @author rasyed
 */
public class BinaryTreeArray {

    int data[];
    int idxLast;
    int i;

    public BinaryTreeArray() {

    }

    void populateData(int idxLast) {
        this.idxLast = idxLast;
        data = new int[idxLast];
    }

    void add(int data) {
        if (i <= idxLast && this.data[i] == 0) {
            this.data[i] = data;
            i++;
        }
    }

    void traverseInOrder(int idxStart) {
        if (idxStart < idxLast) {
            traverseInOrder(2 * idxStart + 1);
            System.out.print(data[idxStart] + " ");
            traverseInOrder(2 * idxStart + 2);
        }
    }

    void traversepreOrder(int idxStart) {
        if (idxStart < idxLast) {
            System.out.print(data[idxStart] + " ");
            traversepreOrder(2 * idxStart + 1);
            traversepreOrder(2 * idxStart + 2);
        }
    }

    void traversepostOrder(int idxStart) {
        if (idxStart < idxLast) {
            traversepostOrder(2 * idxStart + 1);
            traversepostOrder(2 * idxStart + 2);
            System.out.print(data[idxStart] + " ");
        }
    }
}
