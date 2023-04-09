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
    
    public void addFirst (Nasabah input){
        Node ndInput = new Node (input, null);
        if (isEmpty()){
            head = ndInput;
            tail = ndInput;
        } else{
            ndInput.next = head;
            head = ndInput;
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
    
    public void insertAt(int index, Nasabah input){
        if (index < 0){
            System.out.println("indek salah");
        } else if (index == 0) {
            addFirst(input);
        } else {
            Node temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            temp.next = new Node (input, temp.next);
            if(temp.next.next == null) tail=temp.next;
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
    
    public void removeLast (){
        if (isEmpty()){
            System.out.println("Lingked List masih Kosong, tidak dapat dihapus1");
        } else if (head == tail){
            head = tail = null;
        } else {
            Node temp = head;
            while (temp.next != tail){
                temp = temp.next;
            }
            temp.next = null;
            tail = temp;
        }
    }
    
    public void removeAt (int index){
        if(index == 0){
            removeFirst();
        } else {
            Node temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            temp.next = temp.next.next;
            if (temp.next == null){
                tail = temp;
            }
        }
    }
}
