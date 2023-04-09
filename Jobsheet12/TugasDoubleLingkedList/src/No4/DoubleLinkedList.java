/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package No4;

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
    
    public void addFirst(Mahasiswa item) {
        if (isEmpty()) {
            head = new Node(null, item, null);
        } else {
            Node newNode = new Node(null, item, head);
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    public void addLast(Mahasiswa item) {
        if (isEmpty()) {
            addFirst(item);
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
    
    public void add(Mahasiswa item, int index) throws Exception {
        if (isEmpty()) {
            addFirst(item);
        } else if (index < 0 || index > size) {
            throw new Exception("Nilai indeks di luar batas");
        } else {
            Node current = head;
            int i = 0;
            while (i < index) {
                current = current.next;
                i++;
            }
            if (current.prev == null) {
                Node newNode = new Node(null, item, current);
                current.prev = newNode;
                head = newNode;
            } else {
                Node newNode = new Node(current.prev, item, current);
                newNode.prev = current.prev;
                newNode.next = current;
                current.prev.next = newNode;
                current.prev = newNode;
            }
        }
        size++;
    }
    
    public void removeFirst() throws Exception {
        if (isEmpty()) {
            throw new Exception("Lingked List masih kosong, tidak dapat dihapus!");
        } else if (size == 1) {
            removeLast();
        } else {
            head = head.next;
            head.prev = null;
            size--;
        }
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

    public void remove(int index) throws Exception {
        if (isEmpty() || index >= size) {
            throw new Exception("Nilai indeks diluar batas");
        } else if (index == 0) {
            removeFirst();
        } else {
            Node current = head;
            int i = 0;
            while (i < index) {
                current = current.next;
                i++;
            }
            if (current.next == null) {
                current.prev.next = null;
            } else if (current.prev == null) {
                current = current.next;
                current.prev = null;
                head = current;
            } else {
                current.prev.next = current.next;
                current.next.prev = current.prev;
            }
            size--;
        }
    }
    
    public void print() {
        if (!isEmpty()) {
            Node tmp = head;
            while (tmp != null) {
                System.out.println(tmp.data.nim + " ");
                System.out.println(tmp.data.nama + " ");
                System.out.println(tmp.data.ipk + " ");
                tmp = tmp.next;
            }
        } else {
            System.out.println("Lingked List Kosong");
        }
    }
    
    public void seqSearch(String nims){
        int idx = -1;
        Node current = head;
        for (int i = 0; i < size; i++) {
            if (current.data.nim == nims) {
                idx = i;
            } else {
                current = current.next;
            }
        } 
        if (idx != -1){
            System.out.println("Data " + nims + " berada di node ke-" + idx);
            System.out.println("IDENTITAS");
            System.out.println("NIM : " + current.data.nim);
            System.out.println("Nama : " + current.data.nama);
            System.out.println("IPK : " + current.data.ipk);
        } else {
            System.out.println("Data yang Anda cari tidak ditemukan");
        }
        
    }

    public Node bubbleSort(){
        int swapped;
        Node p1;
        Node p2 = null;
        if (head == null)
            return null;
        do {
            swapped = 0;
            p1 = head;
            while (p1.next != p2){
                if (p1.data.ipk < p1.next.data.ipk)
                {
                    Mahasiswa t = p1.data;
                    p1.data = p1.next.data;
                    p1.next.data = t;
                    swapped = 1;
                }
                p1 = p1.next;
            }

            p2 = p1; 
        } 
        while (swapped != 0);
        return head; 
    }   
}
