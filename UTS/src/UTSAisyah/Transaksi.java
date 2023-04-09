/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UTSAisyah;

/**
 *
 * @author WINDOWS 10
 */
public class Transaksi {
    
    int idx;
    double saldo, saldoAwal, saldoAkhir;
    String tanggalTransaksi, type;
    Transaksi[] abc =  new Transaksi [5];
    
    Transaksi (double a, double b, double c, String d, String e){
        saldo = a;
        saldoAwal = b;
        saldoAkhir = c;
        tanggalTransaksi = d;
        type = e;
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
        System.out.println("Saldo               = " + saldo);
        System.out.println("Saldo Awal          = " + saldoAwal);
        System.out.println("Saldo Akhir         = " + saldoAkhir);
        System.out.println("Tanggal Transaksi   = " + tanggalTransaksi);
        System.out.println("Type                = " + type);
    }
    
    void tampilAll(){
        for(Transaksi m : abc){
            m.tampil();
            System.out.println("-----------------------------");
        }
    }
    
    public int FindSeqSearch (double cari) {
        int posisi = -1;
        for (int j = 0; j < abc.length; j++) {
            if (abc[j].saldo == cari){
                posisi = j;
                break;
            }
        }
        return posisi;
    }
    
    public void TampilPosisi (double x, int pos){
        if (pos != -1){
            System.out.println("Data : " + x + " ditemukan pada indeks " + pos);
        }
        else {
            System.out.println("Data : " + x + " tidak ditemukan");
        }
    }
    public void TampilData (double x, int pos){
        if (pos!= -1 ){
            System.out.println("Saldo\t : " + abc[pos].saldo);
            System.out.println("Saldo Awal\t : " + abc[pos].saldoAwal);
            System.out.println("Saldo Akhir\t : " + abc[pos].saldoAkhir);
            System.out.println("Tanggal Transaksi\t : " + abc[pos].tanggalTransaksi);
            System.out.println("Type\t : " + abc[pos].type);
        }
        else{
            System.out.println("Data : " + x + " tidak ditemukan");
        }
    }
    
    void selectionSort (){
        for (int i = 0; i < abc.length-1; i++) {
            int idxMin = i;
            for (int j = i+1; j < abc.length; j++) {
                if (abc[j].saldo < abc [idxMin].saldo) {
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
