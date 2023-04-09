/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas2;

/**
 *
 * @author WINDOWS 10
 */
public class PencarianMhs {
    Mahasiswa listMhs [];
    int idx;

    void tambah(Mahasiswa m){
        if(idx < listMhs.length){
            listMhs[idx] = m;
            idx++;
        }
        else{
            System.out.println("Data sudah penuh!!");
        }
    }
    
    void tampil(){
        for(Mahasiswa m : listMhs){
            m.tampil();
            System.out.println("-----------------------------");
        }
    }
    
    public int FindSeqSearch (String cari) {
        int posisi = -1;
        for (int j = 0; j < listMhs.length; j++) {
            if (listMhs[j].nama.equalsIgnoreCase(cari)){
                posisi = j;
                break;
            }
        }
        return posisi;
    }
    
    public void TampilPosisi (String x, int pos){
        if (pos != -1){
            System.out.println("Data : " + x + " ditemukan pada indeks " + pos);
        }
        else {
            System.out.println("Data : " + x + " tidak ditemukan");
        }
    }
    public void TampilData (String x, int pos){
        if (pos!= -1 ){
            System.out.println("Nim\t : " + listMhs[pos].nim);
            System.out.println("Nama\t : " + listMhs[pos].nama);
            System.out.println("Umur\t : " + listMhs[pos].umur);
            System.out.println("IPK\t : " + listMhs[pos].ipk);
        }
        else{
            System.out.println("Data : " + x + " tidak ditemukan");
        }
    }
}
