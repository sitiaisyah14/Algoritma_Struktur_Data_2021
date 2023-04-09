/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package No1sampai4;

/**
 *
 * @author WINDOWS 10
 */
public class BinaryTree {
    Node root;
    int leaf;
    
    public BinaryTree() {
        root = null;
    }

    boolean isEmpty() {
        return root == null;
    }
    
    void insert(int data){
        root = insertRec(root, data);
    }

    Node insertRec (Node root, int data){
        Node current = root;
        if (current == null){
            current = new Node (data);
            return current;
        }
        if (data < current.data){
            current.left = insertRec (current.left, data);
        } else if (data > current.data ){
            current.right = insertRec (current.right, data);
        }
        return current;
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
    
    void findTerbesar (){
        if (isEmpty()){
            System.out.println("Data Kosong");
        } else {
            Node current = root;
            do {
                current = current.right;
            } while (current.right != null);
            System.out.println("Nilai terbesar adalah " + current.data);
        }
    }
    
    void findTerkecil (){
        if (isEmpty()){
            System.out.println("Data Kosong");
        } else {
            Node current = root;
            do {
                current = current.left;
            } while (current.left != null);
            System.out.println("Nilai terkecil adalah " + current.data);
        }
    }
    
    void findLeaf (Node node){
        if (node != null){
            if (node.left == null && node.right == null){
                System.out.println(" " + node.data);
                leaf = leaf + 1;
            }
            findLeaf (node.left);
            findLeaf (node.right);
        }
    }
    
    int countLeaf(){
        return leaf;
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
            traversePreOrder(node.left);
            traversePreOrder(node.right);
            System.out.print(" " + node.data);
        }
    }

    void traverseInOrder(Node node) {
        if (node != null) {
            traversePreOrder(node.left);
            System.out.print(" " + node.data);
            traversePreOrder(node.right);
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
            successorParent = successor;
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
        }

       
        if (current == null) {
            System.out.println("Couldn't find data!");
            return;
        } else {
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
            } else if (current.left == null) {
                if (current == root) {
                    root = current.right;
                } else {
                    if (isLeftChild) {
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
                Node sucessor = getSuccessor(current);
                if (current == root) {
                    root = sucessor;
                } else {
                    if (isLeftChild) {
                        parent.left = sucessor;
                    } else {
                        parent.right = sucessor;
                    }
                    sucessor.left = current.left;
                }
            }
        }
    }
}
