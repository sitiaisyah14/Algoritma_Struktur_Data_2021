/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package No5;

/**
 *
 * @author WINDOWS 10
 */
public class SingleLingkedList {
    Node head;  //posisi awal lingked list
    Node tail;  //posisi akhir lingked list
    
    public boolean isEmpty(){
        return head == null;
    }
    
    public void print(){
        if (!isEmpty()){
            Node tmp = head;
            System.out.println("Isi Lingked List : \t");
            while (tmp != null){
                tmp.tampilNasabah();
                tmp = tmp.next;
            }
            System.out.println("");
        }else{
            System.out.println("Lingked List Kosong");
        }
    }
    
    public void addLast(Nasabah input){
        Node ndInput = new Node (input, null);
        if (isEmpty()){
            head = ndInput;
            tail = ndInput;
        } else {
            tail.next = ndInput;
            tail = ndInput;
        }
    }
    
    public void removeFirst(){
        if (isEmpty()){
            System.out.println("Lingked List masih Kosong, tidak dapat dihapus!");
        } else if (head == tail){
            head = tail = null;
        } else {
            head = head.next;
        }
    }
    
    public void peek() {
        System.out.println("Elemen teratas : " );
        head.tampilNasabah();
    }
    
    public void clear (){
        head = tail = null;
        System.out.println("Lingked List Telah Dikosongkan");
    }
}
