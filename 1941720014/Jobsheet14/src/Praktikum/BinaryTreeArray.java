package Praktikum;

/**
 *
 * @author Aulafz
 */
public class BinaryTreeArray {

    int[] data;
    int idxLast;

    public BinaryTreeArray() {
        data = new int[10];
    }

    void populateData(int data[], int idxLast) {
        this.data = data;
        this.idxLast = idxLast;
    }

    void traverseInOrder(int idxStart) {
        if (idxStart <= idxLast) {
            traverseInOrder(2 * idxStart + 1);
            System.out.print(data[idxStart] + " ");
            traverseInOrder(2 * idxStart + 2);
        }
    }

    void add(int dt) {
        if (data[0] == 0) {
            data[0] = dt;
            return;
        }
        boolean hasil = false;
        int idx = 0;
        while (!hasil) {
            if (dt < data[idx]) {
                if (data[idx * 2 + 1] == 0) {
                    data[idx * 2 + 1] = dt;
                    hasil = true;
                } else {
                    idx = idx * 2 + 1;
                }
            } else {
                if (data[idx * 2 + 2] == 0) {
                    data[idx * 2 + 2] = dt;
                    hasil = true;
                } else {
                    idx = idx * 2 + 2;
                }
            }
        }
    }

    void traversePreOrder(int idxStart) {
        if (idxStart <= idxLast) {
            System.out.print(data[idxStart] + " ");
            traversePreOrder(2 * idxStart + 1);
            traversePreOrder(2 * idxStart + 2);
        }
    }

    void traversePostOrder(int idxStart) {
        if (idxStart <= idxLast) {
            traversePostOrder(2 * idxStart + 1);
            traversePostOrder(2 * idxStart + 2);
            System.out.print(data[idxStart] + " ");
        }
    }
}
