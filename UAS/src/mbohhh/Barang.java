/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SitiAisyahUAS;

/**
 *
 * @author WINDOWS 10
 */
public class Barang {
    String kode, nama;
    int harga, stok;
    Barang[] abc = new Barang[5];
    
    public Barang(String kode, String nama, int harga, int stok){ 
        this.kode = kode;
        this.nama = nama;
        this.harga = harga;
        this.stok = stok;
    }

    Barang() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    void tampil(){
        System.out.println("Kode     = " + kode);
        System.out.println("Nama     = " + nama);
        System.out.println("Harga    = " + harga);
        System.out.println("Stok     = " + stok);
    }
    void tampilAll(){
        for(Barang m : abc){
            m.tampil();
            System.out.println("-----------------------------");
        }
    }
}
