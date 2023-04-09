/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author WINDOWS 10
 */
public class ListMahasiswa {

    List<Mahasiswa> mahasiswas = new ArrayList<>();

    public void tambah(Mahasiswa... mahasiswa) {
        mahasiswas.addAll(Arrays.asList(mahasiswa));
    }

    public void hapus(int index) {
        mahasiswas.remove(index);
    }

    public void update(int index, Mahasiswa mhs) {
        mahasiswas.set(index, mhs);
    }

    public void tampil() {
        mahasiswas.stream().forEach(mhs -> {
            System.out.println("" + mhs.toString());
        });
    }

    int linearSearch(String nim) {
        for (int i = 0; i < mahasiswas.size(); i++) {
            if (nim.equals(mahasiswas.get(i).nim)) {
                return i;
            }
        }
        return -1;
    }

    int binarySearch(String nim) {
        int index;
        Mahasiswa mahasiswaToSearch = new Mahasiswa(nim,
                "", "");
        index
                = Collections.binarySearch(this.mahasiswas,
                        mahasiswaToSearch, comparatorM);
        if (index >= 0) {
            return index;
        } else {
            return -1;
        }

    }

    Comparator<Mahasiswa> comparatorM = new Comparator<Mahasiswa>() {
        @Override
        public int compare(Mahasiswa m1, Mahasiswa m2) {
            return m1.nim.compareTo(m2.nim);
        }
    };

    void ascendingSort() {
        this.mahasiswas.sort((Mahasiswa m1, Mahasiswa m2) -> m1.nama.compareTo(m1.nama)
        );
    }

    void descendingSort() {
        this.mahasiswas.sort((Mahasiswa m1, Mahasiswa m2) -> m2.nama.compareTo(m1.nama));
    }

    //main
    public static void main(String[] args) {
        ListMahasiswa lm = new ListMahasiswa();
        Mahasiswa m = new Mahasiswa("201234", "Noureen", "021xx1");
        Mahasiswa m1 = new Mahasiswa("201235", "Akhleema", "021xx2");
        Mahasiswa m2 = new Mahasiswa("201236", "Shannum", "021xx3");

        //menambah objek mahasiswa
        lm.tambah(m, m1, m2);

        //menampilkan list mahasiswa
        lm.tampil();

        //update mahasiswa
//        lm.update(lm.linearSearch("201235"), new Mahasiswa("201235", "Akhleema Lela", "021xx2"));
//        System.out.println("");
        String searchNim = "201236";
        if (lm.binarySearch(searchNim) >= 0) {
            lm.update(lm.binarySearch(searchNim), new Mahasiswa("201235", "Akhmad Shannum", "021xx3"));
        } else {
            System.out.println("Nim tidak tersedia");
        }
        System.out.println("");
        lm.tampil();

        System.out.println("");
        System.out.println("Sort Ascending By Name");
        lm.ascendingSort();
        lm.tampil();
        
        System.out.println("");
        System.out.println("Sort Descending By Name");
        lm.descendingSort();
        lm.tampil();
    }
}
