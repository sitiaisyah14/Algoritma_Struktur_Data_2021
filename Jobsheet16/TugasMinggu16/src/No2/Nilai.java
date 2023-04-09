/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package No2;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author WINDOWS 10
 */
public class Nilai {

    String kodeNil;
    double nil;
    Mahasiswa m;
    MataKuliah mk;

    public Nilai(String kodeNil, double nil, Mahasiswa m, MataKuliah mk) {
        this.kodeNil = kodeNil;
        this.nil = nil;
        this.m = m;
        this.mk = mk;
    }

    List<Mahasiswa> mahasiswas = new ArrayList<>();
    List<MataKuliah> matkul = new ArrayList<>();

    public void tambahMhs(Mahasiswa... mahasiswa) {
        mahasiswas.addAll(Arrays.asList(mahasiswa));
    }

    public void tambahMatkul(MataKuliah... matkuls) {
        matkul.addAll(Arrays.asList(matkuls));
    }

    public void tampilMhs() {
        mahasiswas.stream().forEach(mhs -> {
            System.out.println("" + mhs.toString());
        });
    }

    public void tampilMatkul() {
        matkul.stream().forEach(mtk -> {
            System.out.println("" + mtk.toString());
        });
    }

    int linearSearchMhs(String nim) {
        for (int i = 0; i < mahasiswas.size(); i++) {
            if (nim.equals(mahasiswas.get(i).nim)) {
                return i;
            }
        }
        return -1;
    }

    int linearSearchMatkul(String matkuls) {
        for (int i = 0; i < matkul.size(); i++) {
            if (matkuls.equals(matkul.get(i).kode)) {
                return i;
            }
        }
        return -1;
    }

    Mahasiswa cariObjMhs(String nim) {
        for (int i = 0; i < mahasiswas.size(); i++) {
            if (nim.equals(mahasiswas.get(i).nim)) {
                return mahasiswas.get(i);
            }
        }
        return null;
    }

    MataKuliah cariObjMtkl(String matkuls) {
        for (int i = 0; i < matkul.size(); i++) {
            if (matkuls.equals(matkul.get(i).kode)) {
                return matkul.get(i);
            }
        }
        return null;
    }

    int getSKS(int idx) {
        return matkul.get(idx).sks;
    }

    public String toString(int idx1, int idx2) {
        return mahasiswas.get(idx1).nim + "\t"
                + mahasiswas.get(idx1).nama + "\t"
                + matkul.get(idx2).matkul + "\t" + matkul.get(idx2).sks
                + "\t";
    }

    static Comparator<Nilai> CompNilai = (n1, n2) -> {
        if (n1.nil < n2.nil) {
            return -1;
        } else if (n1.nil > (n2).nil) {
            return 1;
        } else {
            return 0;
        }
    };

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        List<Nilai> nilaiX = new ArrayList<>();
        Nilai n = new Nilai("", 0, null, null);
        Mahasiswa m = new Mahasiswa("20001", "Thalhah\t", "021xxx");
        Mahasiswa m1 = new Mahasiswa("20002", "Zubair\t", "021xxx");
        Mahasiswa m2 = new Mahasiswa("20003", "AbdurRahman", "021xxx");
        Mahasiswa m3 = new Mahasiswa("20004", "Sa'ad\t", "021xxx");
        Mahasiswa m4 = new Mahasiswa("20005", "Sa'id\t", "021xxx");
        Mahasiswa m5 = new Mahasiswa("20006", "Ubaidah\t", "021xxx");

        //menambahkan obj mahasiswa 
        n.tambahMhs(m, m1, m2, m3, m4, m5);
        MataKuliah mk = new MataKuliah("00001", "Internet of Things\t\t ", 3);
        MataKuliah mk1 = new MataKuliah("00002", "Algoritma dan Struktur Data\t ", 2);

        MataKuliah mk2 = new MataKuliah("00003", "Algoritma dan Pemrograman\t", 2);
        MataKuliah mk3 = new MataKuliah("00004", "Praktikum Algoritma dan Struktur Data", 3);
        MataKuliah mk4 = new MataKuliah("00005", "Praktikum Algoritma dan Pemrograman", 3);

        //menambahkan obj matakuliah
        n.tambahMatkul(mk, mk1, mk2, mk3, mk4);

        Nilai nl = null;
        String nimMhs, mkMhs;

        int pilih;
        do {
            System.out.println( "***********************************************");
            System.out.println("SISTEM PENGOLAHAN DATA NILAI MAHASISWA SEMESTER");
            System.out.println("***********************************************");
            System.out.println("1. Input Nilai\n2. Tampil Nilai \n3. Mencari Nilai Mahasiswa \n4. Urut Data Nilai\n5. Keluar");

            System.out.println("***********************************************");
            System.out.print("Pilih: ");
            pilih = sc.nextInt();
            System.out.println("");

            switch (pilih) {
                case 1:
                    System.out.println("Masukan data ");
                    System.out.print("Kode\t : ");
                    String kd = sc.next();
                    System.out.print("Nilai\t : ");
                    double nilMhs = sc.nextDouble();
                    System.out.println("");
                    System.out.println("DAFTAR MAHASISWA ");
                    System.out.println("***********************************************");

                    System.out.println("NIM\tNama\t\tTelf");
                    n.tampilMhs();
                    System.out.print("Pilih mahasiswa by nim : ");
                    nimMhs = sc.next();
                    Mahasiswa mahasis;
                    mahasis = n.cariObjMhs(nimMhs);
                    System.out.println("");
                    System.out.println("DAFTAR MATA KULIAH");
                    System.out.println("********************************** *************");
                    System.out.println("Kode\tMata Kuliah\t\t\t\tSKS");
                    n.tampilMatkul();
                    System.out.print("Pilih MK by kode : ");
                    mkMhs = sc.next();
                    MataKuliah mkl;
                    mkl = n.cariObjMtkl(mkMhs);
                    nl = new Nilai(kd, nilMhs, mahasis, mkl);
                    nilaiX.add(nl);
                    break;

                case 2:
                    System.out.println("DAFTAR NILAI MAHASISWA");
                    System.out.println("***********************************************");
                    System.out.println("NIM\tNama\t\tMata Kuliah\t\t\t\tSKS \tNilai");
                    for (int i = 0; i < nilaiX.size(); i++) {
                        n.linearSearchMhs(nilaiX.get(i).m.nim);
                        n.linearSearchMatkul(nilaiX.get(i).mk.kode);
                        System.out.println(n.toString(n.linearSearchMhs(nilaiX.get(i).m.nim), 
                                n.linearSearchMatkul(nilaiX.get(i).mk.kode)) + nilaiX.get(i).nil);
                    }
                    break;
                case 3:
                    System.out.println("DAFTAR NILAIMAHASISWA");
                    System.out.println("***********************************************");
                    System.out.println("NIM\tNama\t\tMata Kuliah\t\t\t\tSKS\tNilai");
                    int sks = 0;
                    for (int i = 0; i < nilaiX.size(); i++) {
                        n.linearSearchMhs(nilaiX.get(i).m.nim);
                        n.linearSearchMatkul(nilaiX.get(i).mk.kode);
                        System.out.println(n.toString(n.linearSearchMhs(nilaiX.get(i).m.nim), 
                                n.linearSearchMatkul(nilaiX.get(i).mk.kode)) + nilaiX.get(i).nil);
                    }

                    System.out.print("Masukkan data mahasiswa[nim] : ");
                    String masukan = sc.next();
                    for (int i = 0; i < nilaiX.size(); i++) {
                        if (masukan.equalsIgnoreCase(nilaiX.get(i).m.nim)) {
                            sks += n.matkul.get(i).sks;
                            n.linearSearchMhs(nilaiX.get(i).m.nim);
                            n.linearSearchMatkul(nilaiX.get(i).mk.kode);
                            System.out.println(n.toString(n.linearSearchMhs(nilaiX.get(i).m.nim), 
                                    n.linearSearchMatkul(nilaiX.get(i).mk.kode)) + nilaiX.get(i).nil);

                        }
                    }
                    System.out.println("Total SKS " + sks + " telah diambil");
                    break;
                case 4:
                    System.out.println("DAFTAR MAHASISWA ");
                    System.out.println("***********************************************");
                    System.out.println("NIM\tNama\t\tMata Kuliah\t\t\t\tSKS\tNilai");
                    nilaiX.sort(CompNilai);

                    for (int i = 0; i < nilaiX.size(); i++) {
                        n.linearSearchMhs(nilaiX.get(i).m.nim);
                        n.linearSearchMatkul(nilaiX.get(i).mk.kode);
                        System.out.println(n.toString(n.linearSearchMhs(nilaiX.get(i).m.nim), 
                                n.linearSearchMatkul(nilaiX.get(i).mk.kode)) + nilaiX.get(i).nil);
                    }
                    break;
            }

        } while (pilih < 5 && pilih > 0);

    }
}
