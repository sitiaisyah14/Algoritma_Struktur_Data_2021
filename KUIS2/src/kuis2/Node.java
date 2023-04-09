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
public class Node {
    Buku data;
    Node next;
    
    public Node(Buku nilai, Node berikutnya){
        this.data = nilai;
        this.next = berikutnya;
    }
    
    public void tampilBuku(){
        System.out.println("Judul Buku \t\t : "  + data.judul);
        System.out.println("Penerbit \t\t : "+ data.penerbit);
        System.out.println("Tahun Terbit \t\t : " + data.tahunTerbit);
        System.out.println("Jumlah Halaman \t\t : " + data.jmlHal);
    }
}
