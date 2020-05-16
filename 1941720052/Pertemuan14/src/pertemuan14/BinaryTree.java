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
public class BinaryTree {

    Node root;

    boolean isEmpty() {
        return root == null;
    }

    void add(int data) {
        if (isEmpty()) {
            root = new Node(data);
        } else {
            Node current = root;
            while (true) {
                if (data < current.data) {
                    if (current.left != null) {
                        current = current.left;
                    } else {
                        current.left = new Node(data);
                        break;
                    }
                } else if (data > current.data) {
                    if (current.right != null) {
                        current = current.right;
                    } else {
                        current.right = new Node(data);
                        break;
                    }
                } else {
                    break;
                }
            }
        }
    }

    boolean find(int data) {
        boolean hasil = false;
        Node current = root;
        while (current != null) {
            if (current.data == data) {
                hasil = true;
                break;
            } else if (data < current.data) {
                current = current.left;
            } else {
                current = current.right;
            }
        }
        return hasil;
    }

    void traversePreOrder(Node node) {
        if (node != null) {
            System.out.print(" " + node.data);
            traversePreOrder(node.left);
            traversePreOrder(node.right);
        }
    }

    void traversePostOrder(Node node) {
        if (node != null) {
            traversePostOrder(node.left);
            traversePostOrder(node.right);
            System.out.print(" " + node.data);
        }
    }

    void traverseInOrder(Node node) {
        if (node != null) {
            traverseInOrder(node.left);
            System.out.print(" " + node.data);
            traverseInOrder(node.right);
        }
    }

    Node getSuccessor(Node del) {
        Node successor = del.right;
        Node successorParent = del;
        while (successor.left != null) {
            successorParent = successor;
            successor = successor.left;
        }
        if (successor != del.right) {
            successorParent.left = successor.right;
            successor.right = del.right;
        }
        return successor;
    }

    void delete(int data) {
        if (isEmpty()) {
            System.out.println("Tree is empty!");
            return;
        }
        Node parent = root;
        Node current = root;
        boolean isLeftChild = false;
        while (current != null) {
            if (current.data == data) {
                break;
            } else if (data < current.data) {
                parent = current;
                current = current.left;
                isLeftChild = true;
            } else if (data > current.data) {
                parent = current;
                current = current.right;
                isLeftChild = false;
            }
            //deletion
            if (current == null) {
                System.out.println("Couldn't find data!");
                return;
            } else {
                //if there is no child,simply delete it
                if (current.left == null && current.right == null) {
                    if (current == root) {
                        root = null;
                    } else {
                        if (isLeftChild) {
                            parent.left = null;
                        } else {
                            parent.right = null;
                        }
                    }
                } else if (current.left == null) {//if there is 1 child (right)
                    if (current == root) {
                        root = current.right;
                    } else {
                        if (isLeftChild) {
                            parent.left = current.right;
                        } else {
                            parent.right = current.right;
                        }
                    }
                } else if (current.right == null) {//if ther is 1 child (left)
                    if (current == root) {
                        root = current.left;
                    } else {
                        if (isLeftChild) {
                            parent.left = current.left;
                        } else {
                            parent.right = current.left;
                        }
                    }
                } else {//if there are 2 childs
                    Node successor = getSuccessor(current);
                    if (current == root) {
                        root = successor;
                    } else {
                        if (isLeftChild) {
                            parent.left = successor;
                        } else {
                            parent.right = successor;
                        }
                    }
                    successor.left = current.left;
                }
            }
        }
    }

    Node AddRekursif(Node current, int data) {
        if (current == null) {
            return new Node(data);
        }
        if (data < current.data) {
            current.left = AddRekursif(current.left, data);
        } else if (data > current.data) {
            current.right = AddRekursif(current.right, data);
        } else {
            return current;
        }
        return current;
    }

    int GetMin(Node node) {
        if (node == null) {
            System.out.println("Tree is Empty");
            return 0;
        }
        while (node.left != null) {
            node = node.left;
        }
        return node.data;
    }

    int GetMax(Node node) {
        if (node == null) {
            System.out.println("Tree is Empty");
            return 0;
        }
        while (node.right != null) {
            node = node.right;
        }
        return node.data;
    }

    void PrintMinMax(Node node) {
        System.out.println();
        int Min = GetMin(node);
        System.out.println("Nilai Terkecil : " + Min);
        int Max = GetMax(node);
        System.out.println("Nilai Terbesar : " + Max);
    }

    void leaf(Node node) {
        if (node == null) {
            return;
        }
        if(node.left == null && node.right == null){
            System.out.println("Leaf : " + node.data);
        } 
        else {
            if (node.left != null) {
                leaf(node.left);
            }
            if(node.right != null){
                leaf(node.right);
            }
        }
    }
    int hitungLeaf(Node node){
        if(node == null){
            return 0;
        }
        if(node.left == null && node.right == null){
            return 1;
        }
        else{
            return hitungLeaf(node.left) + hitungLeaf(node.right);
        }
    }
}
