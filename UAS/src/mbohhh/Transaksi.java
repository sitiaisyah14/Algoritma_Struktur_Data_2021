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
public class Transaksi {
    int idx;
    int kodeTr;
    int jmlBarang, hargaTtl;
    Transaksi[] abc =  new Transaksi [5];
    
    Transaksi (int a, int b, int c){
        kodeTr = a;
        jmlBarang = b;
        hargaTtl = c;
    }

    Transaksi() {
    
    }
    void tambah(Transaksi m){
        if(idx < abc.length){
            abc[idx] = m;
            idx++;
        }
        else{
            System.out.println("Data sudah penuh!!");
        }
    }
    void tampil(){
        System.out.println("Kode Transaksi      = " + kodeTr);
        System.out.println("Jumlah Barang       = " + jmlBarang);
        System.out.println("Harga Total         = " + hargaTtl);
    }
    
    void tampilAll(){
        for(Transaksi m : abc){
            m.tampil();
            System.out.println("-----------------------------");
        }
    }

    void selectionSort (){
        for (int i = 0; i < abc.length-1; i++) {
            int idxMin = i;
            for (int j = i+1; j < abc.length; j++) {
                if (abc[j].kodeTr < abc [idxMin].kodeTr) {
                    idxMin = j;
                }
            }
            // swap
            Transaksi tmp = abc [idxMin];
            abc [idxMin] = abc[i];
            abc[i] = tmp;
        }
    }
}
