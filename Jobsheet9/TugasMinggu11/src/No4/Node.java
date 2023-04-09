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
    Nasabah data;
    Node next;
    
    public Node(Nasabah nilai, Node berikutnya){
        this.data = nilai;
        this.next = berikutnya;
    }
    
    public void tampilNasabah(){
        System.out.println("Nama \t\t : "  + data.nama);
        System.out.println("Alamat \t\t : "+ data.alamat);
        System.out.println("No Rek \t\t : " + data.noRek);
    }
}
