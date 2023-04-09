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
public class Buku {
    String judul, penerbit, tahunTerbit;
    int jmlHal;
    
    public Buku(String judul, String penerbit, String tahunTerbit, int jmlHal){
        this.judul = judul;
        this.penerbit = penerbit;
        this.tahunTerbit = tahunTerbit;
        this.jmlHal = jmlHal;
    }
}
