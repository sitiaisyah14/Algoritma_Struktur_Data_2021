/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas2.Toko;

/**
 *
 * @author WINDOWS 10
 */
public class Toko {
    int id, lamaPinjam, harga;
    String namaMember, namaGame;
    
    
    
    void tampilData(){
        System.out.println("Id : " + id);
        System.out.println("Nama Mamber : " + namaMember);
        System.out.println("Nama Game : " + namaGame);
        System.out.println("Lama Peminjaman : " + lamaPinjam + " hari");
        System.out.println("Harga sewa per-hari : Rp. " + harga);
    }
    
    int hargaBayar(){
        return lamaPinjam*harga;
    }
}
