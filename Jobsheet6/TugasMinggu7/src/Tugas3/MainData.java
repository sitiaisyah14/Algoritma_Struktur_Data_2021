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
import java.util.Scanner;
public class MainData {
    public static void main (String [] args){
        Scanner sc = new Scanner (System.in);
        
        System.out.print("Masukkan jumlah baris : ");
        int baris = sc.nextInt();
        System.out.print("Masukkan jumlah kolom : ");
        int kolom = sc.nextInt();
        int array [][] = new int [baris] [kolom];

        System.out.println("======================================");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array [0].length; j++) {
                System.out.print("Isi indeks baris ke-" + i + " kolom ke-" + j + " : ");
                array[i][j] = sc.nextInt();
            }
        }
        
        System.out.println("======================================");
        DataAngka data = new DataAngka();
        data.tampil(array);
        System.out.println("======================================");
        System.out.print("Masukkan angka yang dicari : ");
        int cari = sc.nextInt();
        System.out.println("_______________________________________");
        data.FindSeqSearch(array, cari);
        data.TampilPosisi(cari);
    }
}
