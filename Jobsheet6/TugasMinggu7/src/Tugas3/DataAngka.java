/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas3;

/**
 *
 * @author WINDOWS 10
 */
public class DataAngka {
    public int baris, kolom, hasil = 0;

    public void tampil(int array [][]){
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                System.out.print(array [i][j] + "  ||  ");
            }
            System.out.println("");
        }
    }
    
    public int FindSeqSearch (int [][] array, int cari) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                if (array [i][j] == cari){
                hasil = array [i][j];
                baris = i;
                kolom = j;
                return hasil;
                }
            } 
        }
        return hasil;
    }
    
    public void TampilPosisi (int cari){
        if (hasil != -1){
            System.out.println("Data : " + cari + " => ditemukan pada indeks baris ke-" + baris + ", kolom ke-" + kolom);
        }
        else {
            System.out.println("Data : " + cari + " tidak ditemukan");
        }
    }
}
