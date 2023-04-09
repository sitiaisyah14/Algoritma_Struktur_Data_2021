/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package No2;

/**
 *
 * @author WINDOWS 10
 */
public class DoubleLinkedList {
    Node head;
    int size;

    public DoubleLinkedList() {
        head = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }
    
    public void addLast(String item) {
        if (isEmpty()) {
            head = new Node (null, item, null);
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            Node newNode = new Node(current, item, null);
            current.next = newNode;
            size++;
        }
    }
    
    public void removeFirst() throws Exception {
        if (isEmpty()) {
            throw new Exception("Lingked List masih kosong, tidak dapat dihapus!");
        } else if (size == 1) {
            head = null;
            size = 0;
        } else {
            head = head.next;
            head.prev = null;
            size--;
        }
    }
    
    public String getFirst() throws Exception{
        if (isEmpty()){
            throw new Exception ("Lingked List Kosong");
        } 
        return head.data;
    }
    
    public void print() {
        if (!isEmpty()) {
            Node tmp = head;
            while (tmp != null) {
                System.out.println(tmp.data + "\t");
                tmp = tmp.next;
            }
            System.out.println("\n berhasil di isi");
        } else {
            System.out.println("Lingked List Kosong");
        }
    }
}
