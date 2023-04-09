/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SitiAisyah;

/**
 *
 * @author WINDOWS 10
 */
public class LinkedList {
    Node head;
    int size;
    Barang b;
    Transaksi t;

    public LinkedList() {
        head = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }
    
    public void addFirst(Barang b, Transaksi t) {
        if (isEmpty()) {
            head = new Node(null, b, t, null);
        } else {
            Node newNode = new Node(null, b, t, head);
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }
    
    public void removeLast() throws Exception {
        if (isEmpty()) {
            throw new Exception("Lingked List masih kosong, tidak dapat dihapus!");
        } else if (head.next == null) {
            head = null;
            size--;
            return;
        }
        Node current = head;
        while (current.next.next != null) {
            current = current.next;
        }
        current.next = null;
        size--;
    }

    
    
    public void print() {
        if (!isEmpty()) {
            Node tmp = head;
            while (tmp != null) {
//                System.out.println("Kode  : " + tmp.data.kode );
//                System.out.println("Nama  : " + tmp.data.nama );
//                System.out.println("Harga : " + tmp.data.harga );
//                System.out.println("Stok  : " + tmp.data.stok );
                tmp.data.tampil();
                System.out.println("==============================");
                System.out.println("Kode Transaksi  : " + tmp.data2.kodeTr );
                System.out.println("Jumlah Barang  : " + tmp.data2.jmlBarang );
                System.out.println("Harga Total : " + tmp.data2.hargaTtl );
                tmp = tmp.next;
            }
        } else {
            System.out.println("Lingked List Kosong");
        }
    }

//    public Node bubbleSort(){
//        int swapped;
//        Node p1;
//        Node p2 = null;
//        if (head == null)
//            return null;
//        do {
//            swapped = 0;
//            p1 = head;
//            while (p1.next != p2){
//                if (p1.data2.kodeTr < p1.next.data2.kodeTr)
//                {
//                    Transaksi t = p1.data;
//                    p1.data = p1.next.data;
//                    p1.next.data = t;
//                    swapped = 1;
//                }
//                p1 = p1.next;
//            }
//
//            p2 = p1; 
//        } 
//        while (swapped != 0);
//        return head; 
//    }   
}
