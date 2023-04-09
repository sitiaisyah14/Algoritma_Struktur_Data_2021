/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UASAisyah;

/**
 *
 * @author WINDOWS 10
 */
public class Barang {
    String kode, nama;
    int harga, stok;
    
    public Barang(){
        
    }
    
    public Barang(String kode, String nama, int harga, int stok){
        this.kode = kode;
        this.nama = nama;
        this.harga = harga;
        this.stok = stok;
    }
    
    @Override
    public String toString(){
        return kode + "\t" + nama + "\t" + harga + "\t" + stok;
    }
}
