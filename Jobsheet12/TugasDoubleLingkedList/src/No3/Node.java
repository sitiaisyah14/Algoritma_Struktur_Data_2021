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
public class Node {
    PenerimaVaksin data;
    Node prev;
    Node next;
    
    Node (Node prev, PenerimaVaksin data, Node next){
        this.prev = prev;
        this.data = data;
        this.next = next;
    }
    
}
