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
import java.util.Scanner;
public class Main {
    public static void main (String [] args){
        Scanner sc = new Scanner (System.in);
        
        DaftarMahasiswaBerprestasi list = new DaftarMahasiswaBerprestasi();
        Mahasiswa m1 = new Mahasiswa ("Nusa", 2017, 25, 3);
        Mahasiswa m2 = new Mahasiswa ("Rara", 2012, 19, 4);
        Mahasiswa m3 = new Mahasiswa ("Dompu", 2018, 19, 3.5);
        Mahasiswa m4 = new Mahasiswa ("Abdul", 2017, 23, 4);
        Mahasiswa m5 = new Mahasiswa ("Ummi", 2019, 21, 3.75);
        
        list.tambah(m1);
        list.tambah(m2);
        list.tambah(m3);
        list.tambah(m4);
        list.tambah(m5);
        
        System.out.println("Data mahasiswa sebelum sorting  ");
        list.tampil();
        
        System.out.println("Data mahasiswa setelah sorting desc berdasarkan ipk");
        list.bubleSort();
        list.tampil();
        
        System.out.println("Data mahasiswa setelah sorting asc berdasarkan ipk");
        list.selectionSort();
        list.tampil();
        
        System.out.println("Data mahasiswa setelah sorting asc berdasarkan ipk");
        boolean asc = true;
        list.insertionSort(asc);
        list.tampil();
    }
}
