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
public class Node {
    Mahasiswa data;
    Node prev;
    Node next;
    
    Node (Node prev, Mahasiswa data, Node next){
        this.prev = prev;
        this.data = data;
        this.next = next;
    }
}
