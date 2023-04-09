/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UASAisyah;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author WINDOWS 10
 */
public class Main {
    String kodeTran;
    int nil;
    Barang b;
    Transaksi t;

    public Main(String KodeTran, int nil, Barang b, Transaksi t) {
        this.kodeTran = kodeTran;
        this.nil = nil;
        this.b = b;
        this.t = t;
    }

    List<Barang> barangs = new ArrayList<>();
    List<Transaksi> trans = new ArrayList<>();

    public void tambahBrg(Barang... barang) {
       barangs.addAll(Arrays.asList(barang));
    }

    public void tambahTran(Transaksi... transaksis) {
        trans.addAll(Arrays.asList(transaksis));
    }

    public void tampilBrg() {
        barangs.stream().forEach(mhs -> {
            System.out.println("" + mhs.toString());
        });
    }

    public void tampilTran() {
        trans.stream().forEach(mtk -> {
            System.out.println("" + mtk.toString());
        });
    }

    int linearSearchMhs(String nim) {
        for (int i = 0; i < barangs.size(); i++) {
            if (nim.equals(barangs.get(i).kode)) {
                return i;
            }
        }
        return -1;
    }

    int linearSearchMatkul(String matkuls) {
        for (int i = 0; i < trans.size(); i++) {
            if (matkuls.equals(trans.get(i).kode)) {
                return i;
            }
        }
        return -1;
    }

    Barang cariObjMhs(String kode) {
        for (int i = 0; i < barangs.size(); i++) {
            if (kode.equals(barangs.get(i).kode)) {
                return barangs.get(i);
            }
        }
        return null;
    }

    Transaksi cariObjMtkl(String kode) {
        for (int i = 0; i < trans.size(); i++) {
            if (trans.equals(trans.get(i).kode)) {
                return trans.get(i);
            }
        }
        return null;
    }

    int getSKS(int idx) {
        return trans.get(idx).total;
    }

    public String toString(int idx1, int idx2) {
        return barangs.get(idx1).kode + "\t"
                + barangs.get(idx1).nama + "\t"
                + trans.get(idx2).jml + "\t" + trans.get(idx2).total
                + "\t";
    }

    static Comparator<Main> CompNilai = (n1, n2) -> {
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
        List<Main> nilaiX = new ArrayList<>();
        Main n = new Main("", 0, null, null);
        Barang m = new Barang("20001", "Sepatu Adidas", 200000, 5);
        Barang m1 = new Barang("20002", "Sepatu PVN", 150000, 4);
        

        //menambahkan obj mahasiswa 
        n.tambahBrg(m, m1);
        Transaksi mk = new Transaksi("00001", 1, 150000);
        Transaksi mk1 = new Transaksi("00002", 1, 200000);

        //menambahkan obj matakuliah
        n.tambahTran(mk, mk1);

        Main nl = null;
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
                    int jml = sc.nextInt();
                    System.out.println("");
                    System.out.println("DAFTAR MAHASISWA ");
                    System.out.println("***********************************************");

                    System.out.println("NIM\tNama\t\tTelf");
                    n.tampilBrg();
                    System.out.print("Pilih mahasiswa by nim : ");
                    nimMhs = sc.next();
                    Barang barangs;
                    barangs = n.cariObjMhs(nimMhs);
                    System.out.println("");
                    System.out.println("DAFTAR MATA KULIAH");
                    System.out.println("********************************** *************");
                    System.out.println("Kode\tMata Kuliah\t\t\t\tSKS");
                    n.tampilTran();
                    System.out.print("Pilih MK by kode : ");
                    mkMhs = sc.next();
                    Transaksi mkl;
                    mkl = n.cariObjMtkl(mkMhs);
                    nl = new Main(kd, jml, barangs, mkl);
                    nilaiX.add(nl);
                    break;

                case 2:
                    System.out.println("DAFTAR NILAI MAHASISWA");
                    System.out.println("***********************************************");
                    System.out.println("NIM\tNama\t\tMata Kuliah\t\t\t\tSKS \tNilai");
                    for (int i = 0; i < nilaiX.size(); i++) {
                        n.linearSearchMhs(nilaiX.get(i).b.kode);
                        n.linearSearchMatkul(nilaiX.get(i).t.kode);
                        System.out.println(n.toString(n.linearSearchMhs(nilaiX.get(i).b.kode), 
                                n.linearSearchMatkul(nilaiX.get(i).t.kode)) + nilaiX.get(i).nil);
                    }
                    break;
                case 3:
                    System.out.println("DAFTAR NILAIMAHASISWA");
                    System.out.println("***********************************************");
                    System.out.println("NIM\tNama\t\tMata Kuliah\t\t\t\tSKS\tNilai");
                    int sks = 0;
                    for (int i = 0; i < nilaiX.size(); i++) {
                        n.linearSearchMhs(nilaiX.get(i).b.kode);
                        n.linearSearchMatkul(nilaiX.get(i).t.kode);
                        System.out.println(n.toString(n.linearSearchMhs(nilaiX.get(i).b.kode), 
                                n.linearSearchMatkul(nilaiX.get(i).t.kode)) + nilaiX.get(i).nil);
                    }

                    System.out.print("Masukkan data mahasiswa[nim] : ");
                    String masukan = sc.next();
                    for (int i = 0; i < nilaiX.size(); i++) {
                        if (masukan.equalsIgnoreCase(nilaiX.get(i).b.kode)) {
                            sks += n.trans.get(i).jml;
                            n.linearSearchMhs(nilaiX.get(i).b.kode);
                            n.linearSearchMatkul(nilaiX.get(i).t.kode);
                            System.out.println(n.toString(n.linearSearchMhs(nilaiX.get(i).b.kode), 
                                    n.linearSearchMatkul(nilaiX.get(i).t.kode)) + nilaiX.get(i).nil);

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
                        n.linearSearchMhs(nilaiX.get(i).b.kode);
                        n.linearSearchMatkul(nilaiX.get(i).t.kode);
                        System.out.println(n.toString(n.linearSearchMhs(nilaiX.get(i).b.kode), 
                                n.linearSearchMatkul(nilaiX.get(i).t.kode)) + nilaiX.get(i).nil);
                    }
                    break;
            }

        } while (pilih < 5 && pilih > 0);

    }
}
