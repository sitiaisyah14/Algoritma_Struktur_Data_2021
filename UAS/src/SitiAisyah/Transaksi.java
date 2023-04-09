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
public class Transaksi {
    String kodeTr;
    int jmlBarang, hargaTtl;
    
    public Transaksi (String kodeTr, int jmlBarang, int hargaTtl){ 
        this.kodeTr = kodeTr;
        this.jmlBarang = jmlBarang;
        this.hargaTtl = hargaTtl;
    }
    
    void tampil(){
        System.out.println("Kode Transaksi     = " + kodeTr);
        System.out.println("Jumlah Barang      = " + jmlBarang);
        System.out.println("Harga Total        = " + hargaTtl);
    }
}
