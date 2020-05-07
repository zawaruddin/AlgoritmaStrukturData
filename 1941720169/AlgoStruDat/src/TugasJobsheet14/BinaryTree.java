package TugasJobsheet14;

/**
 *
 * @author dhimas
 */
public class BinaryTree {

    Node root;

    public BinaryTree() {
        root = null;
    }

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
            System.out.println("Tree is Empty!");
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
        }
        if (current == null) {
            System.out.println("Couldn't find data!");
            return;
        } else {
            if (current.left == null && current.right == null) {
                if (current == root) {
                    parent.left = null;
                } else {
                    if (isLeftChild) {
                        parent.left = null;
                    } else {
                        parent.right = null;
                    }
                }
            } else if (current.left == null) {
                if (current == root) {
                    root = current.right;
                } else {
                    if (current == root) {
                        parent.left = current.right;
                    } else {
                        parent.right = current.right;
                    }
                }
            } else if (current.right == null) {
                if (current == root) {
                    root = current.left;
                } else {
                    if (isLeftChild) {
                        parent.left = current.left;
                    } else {
                        parent.right = current.left;
                    }
                }
            } else {
                Node successor = getSuccessor(current);
                if (current == root) {
                    root = successor;
                } else {
                    if (isLeftChild) {
                        parent.left = successor;
                    } else {
                        parent.right = successor;
                    }
                    successor.left = current.left;
                }
            }
        }
    }
//  1. Menambahkan node dengan cara rekursif
    void addRekursif(int data) {
        root = insertRekursif(root, data);
    }

    private Node insertRekursif(Node root, int data) {
        if (root == null) {
            root = new Node(data);
            return root;
        }
        if (data < root.data) {
            root.left = insertRekursif(root.left, data);
        } else if (data > root.data) {
            root.right = insertRekursif(root.right, data);
        }

        return root;
    }
//  2. menampilkan nilai paling kecil dan paling besar
    void TampilMinMax() {
        Node current = root;
        //mencari nilai min kemudian
        while (current.left != null) {
            current = current.left;
        }
        System.out.println("Nilai terkecil adalah " + current.data);
        current = root;
        while (current.right != null) {
            current = current.right;
        }
        System.out.println("Nilai terbesar adalah " + current.data);
    }
//  3. menampilkan data yang ada di leaf
    void tampilLeaf() {
        System.out.print("Leaf yang ada dalam tree : ");
        cariLeaf(root);
        System.out.println("");
    }

    private void cariLeaf(Node root) {
        boolean isLeaf = root.left == null ? root.right == null : false;
        if (isEmpty()) {
            System.out.println("Tree kosong");
        }
        if (isLeaf) {
            System.out.print(root.data + " ");
        } else if (!isLeaf && root.left != null && root.right != null) {
            cariLeaf(root.left);
            cariLeaf(root.right);
        }
    }
//  4. menampilkan jumlah leaf
    void tampilJumlahLeaf(){
        System.out.println("Jumlah leaf dalam tree : " +jumlahLeaf(root));
    }
    private int jumlahLeaf(Node root) {
        int count=0;
        boolean isLeaf = root.left == null ? root.right == null : false;
        if (isEmpty()) {
            System.out.println("Tree kosong");
        }
        if (isLeaf) {
            count++;
            return count;
        } else if (!isLeaf && root.left != null && root.right != null) {
             return jumlahLeaf(root.left) + jumlahLeaf(root.right);
        }
        return count;
    }
}
