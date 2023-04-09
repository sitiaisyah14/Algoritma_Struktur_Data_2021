/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kuis2;

/**
 *
 * @author WINDOWS 10
 */
public class SingleLinkedList {

    Node head;  //posisi awal lingked list
    Node tail;  //posisi akhir lingked list

    public boolean isEmpty() {
        return head == null;
    }

    public void print() {
        if (!isEmpty()) {
            Node tmp = head;
            System.out.println("Isi Lingked List : \t");
            System.out.println(" ");
            while (tmp != null) {
                System.out.println("Judul \t\t : " + tmp.data.judul);
                System.out.println("Penerbit \t : " + tmp.data.penerbit);
                System.out.println("Tahun Terbit \t : " + tmp.data.tahunTerbit);
                System.out.println("Jumlah Halaman \t : " + tmp.data.jmlHal);
                System.out.println("==========================================================");
                tmp = tmp.next;
            }
            System.out.println("");
        } else {
            System.out.println("Lingked List Kosong");
        }
    }

    public void addFirst(Buku input) {
        Node ndInput = new Node(input, null);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
            ndInput.next = head;
            head = ndInput;
        }
    }

    public void removeFirst() {
        if (isEmpty()) {
            System.out.println("Lingked List masih Kosong, tidak dapat dihapus!");
        } else if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
        }
    }

    public void peek() {
        System.out.println("======= Elemen teratas  =====");
        System.out.println("Judul \t\t : " + head.data.judul);
        System.out.println("Penerbit \t : " + head.data.penerbit);
        System.out.println("Tahun Terbit \t : " + head.data.tahunTerbit);
        System.out.println("Jumlah Halaman \t : " + head.data.jmlHal);
        System.out.println("=================================================");
    }

    public int indexOf(String key) {
        Node tmp = head;
        int index = 0;
        while (tmp != null && tmp.data.judul.equals(key)) {
            tmp = tmp.next;
            index++;
        }
        if (tmp == null) {
            return -1;
        } else {
            return index;
        }
    }

    public void clear() {
        head = tail = null;
        System.out.println("  *** Lingked List Telah Dikosongkan  ***");
    }
}
