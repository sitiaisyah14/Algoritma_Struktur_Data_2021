/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package No3;

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
    
    public void addFirst(PenerimaVaksin item){
        if (isEmpty()){
            head = new Node (null, item, null);
        } else {
            Node newNode = new Node (null, item, head);
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }
    
    public void removeFirst() throws Exception {
        if (isEmpty()) {
            throw new Exception("Lingked List masih kosong, tidak dapat dihapus!");
        } else if (size == 1) {
            head = null;
            size = 0;
        } else {
            System.out.println(head.data.nama + " Telah selesai divaksinasi");
            head = head.next;
            head.prev = null;
            size--;
        }
    }
    
    public void print() {
        if (!isEmpty()) {
            System.out.println("|No.\t|Nama\t|");
            Node tmp = head;
            while (tmp != null) {
                System.out.print("|" + tmp.data.noAntrian + "\t|" + tmp.data.nama + "\t|");
                tmp = tmp.next;
                System.out.println("");
            }
            System.out.println("Sisa Antrian : " + size);
        } else {
            System.out.println("Lingked List Kosong");
        }
    }
}
