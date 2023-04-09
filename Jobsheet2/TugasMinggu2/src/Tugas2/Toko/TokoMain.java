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

public class TokoMain {
    public static void main(String [] args){
        Toko t1 = new Toko();

        t1.id = 140102;
        t1.namaMember = "Siti Aisyah";
        t1.namaGame = "Mobile Legend";
        t1.lamaPinjam = 3;
        t1.harga = 12000;
        t1.tampilData();
        int total = t1.hargaBayar();
        System.out.println("Total yang harus dibayar : Rp. " + total);
        
    }
}
