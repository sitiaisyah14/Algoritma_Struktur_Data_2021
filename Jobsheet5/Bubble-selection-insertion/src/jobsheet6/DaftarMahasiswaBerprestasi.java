/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheet6;

/**
 *
 * @author WINDOWS 10
 */
public class DaftarMahasiswaBerprestasi {
    Mahasiswa listMhs [] = new Mahasiswa [5];
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
    
    void bubleSort (){
        for (int i = 0; i < listMhs.length; i++) {
            for (int j = 1; j < listMhs.length - i ; j++) {
                if (listMhs[j].ipk > listMhs [j-1].ipk){
                    //proses swap atau penukaran
                    Mahasiswa tmp = listMhs[j];
                    listMhs [j]= listMhs[j-1];
                    listMhs[j-1] =  tmp;
                }
            }
        }
    } 
    
    void selectionSort (){
        for (int i = 0; i < listMhs.length-1; i++) {
            int idxMin = i;
            for (int j = i+1; j < listMhs.length; j++) {
                if (listMhs[j].ipk < listMhs [idxMin].ipk) {
                    idxMin = j;
                }
            }
            // swap
            Mahasiswa tmp = listMhs [idxMin];
            listMhs [idxMin] = listMhs[i];
            listMhs[i] = tmp;
        }
    }
    
    void insertionSort (boolean asc){
        for (int i = 1; i < listMhs.length; i++) {
            Mahasiswa temp = listMhs [i];
            int j = i;
            
            if (asc){
                while (j > 0 && listMhs [j-1].ipk > temp.ipk){
                    listMhs [j] =  listMhs[j - 1];
                    j--;
                }
            }else{
                
            }
            listMhs [j] =  temp;
        }
    }
}
