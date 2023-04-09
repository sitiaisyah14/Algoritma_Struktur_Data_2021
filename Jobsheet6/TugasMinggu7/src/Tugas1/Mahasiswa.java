/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas1;

/**
 *
 * @author WINDOWS 10
 */
public class Mahasiswa {
    String nama;
    int nim, umur;
    double ipk;
    
    Mahasiswa (int ni, String n, int u, double i){
        nim = ni;
        nama = n;
        umur = u;
        ipk = i;
    }
    void tampil(){
        System.out.println("Nama        = " + nim);
        System.out.println("Tahun Masuk = " +  nama);
        System.out.println("Umur        = " + umur);
        System.out.println("IPK         = " + ipk);
    }
}
