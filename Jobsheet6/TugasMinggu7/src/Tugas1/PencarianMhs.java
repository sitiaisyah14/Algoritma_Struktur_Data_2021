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
    
    public int FindSeqSearch (int cari) {
        int posisi = -1;
        for (int j = 0; j < listMhs.length; j++) {
            if (listMhs[j].nim == cari){
                posisi = j;
                break;
            }
        }
        return posisi;
    }
    
    public void TampilPosisi (int x, int pos){
        if (pos != -1){
            System.out.println("Data : " + x + " ditemukan pada indeks " + pos);
        }
        else {
            System.out.println("Data : " + x + " tidak ditemukan");
        }
    }
    
    public void TampilData (int x, int pos){
        if (pos!= -1 ){
            System.out.println("Nim\t : " + x);
            System.out.println("Nama\t : " + listMhs[pos].nama);
            System.out.println("Umur\t : " + listMhs[pos].umur);
            System.out.println("IPK\t : " + listMhs[pos].ipk);
        }
        else{
            System.out.println("Data : " + x + " tidak ditemukan");
        }
    }
    
    public int FindBinarySearch (int cari, int left, int right){
        int mid;
        if (right >= left ) {
            mid = (left + right) / 2;
            if(cari == listMhs[mid].nim){
                return (mid);
            }
            else if(listMhs[mid].nim < cari){
                return FindBinarySearch (cari, left, mid - 1);
            }
            else{
                return FindBinarySearch (cari, mid + 1, right);
            }
        }
        return -1;
    }
    
    void bubleSort (){
        for (int i = 0; i < listMhs.length; i++) {
            for (int j = 1; j < listMhs.length - i ; j++) {
                if (listMhs[j].nim < listMhs [j-1].nim){
                    //proses swap atau penukaran
                    Mahasiswa tmp = listMhs[j];
                    listMhs [j]= listMhs[j-1];
                    listMhs[j-1] =  tmp;
                }
            }
        }
    } 
}
