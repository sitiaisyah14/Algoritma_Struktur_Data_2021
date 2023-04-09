/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas3.Barang;

/**
 *
 * @author WINDOWS 10
 */
public class BarangMain {
    public static void main (String [] args){
        Barang bm1 = new Barang();
        bm1.nama = "Kipas Angin";
        bm1.hargaSatuan = 80000;
        bm1.jumlah = 2;
        
        System.out.println("Nama Barang  : " + bm1.nama);
        System.out.println("Harga Satuan : Rp. " + bm1.hargaSatuan);
        System.out.println("Jumlah       : " + bm1.jumlah);
        int total = bm1.hitungHargaTotal();
        System.out.println("Total        : Rp. " + total);
        
        
        int diskon = bm1.hitungDiskon(total);
        System.out.println("Diskon       : Rp. " + diskon);
        
        int totalBayar= bm1.hitungHargaBayar(total, diskon);
        System.out.println("Total Bayar  : Rp. " + totalBayar);
    }
}
