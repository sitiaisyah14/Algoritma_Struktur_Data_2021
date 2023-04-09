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
public class Node {
    Barang data;
    Transaksi data2;
    Node prev;
    Node next;
    
    Node (Node prev, Barang data, Transaksi data2, Node next){
        this.prev = prev;
        this.data = data;
        this.next = next;
    }

    
}
