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
import java.util.Scanner;
public class MahasiswaMain {
    public static void main (String [] args){
        Scanner s = new Scanner (System.in);
        Scanner s1 = new Scanner (System.in);
        
        PencarianMhs data = new PencarianMhs();
        System.out.print("Masukkan Jumlah Mahasiswa : ");
        int jumMhs = s.nextInt();
        Mahasiswa [] mhs = new Mahasiswa [jumMhs];
        data.listMhs = mhs;

        
        System.out.println("------------------------------------------");
        System.out.println("         Masukkan Data Mahasiswa ");
        for (int i = 0; i < jumMhs; i++) {
            System.out.println("---------------------");
            System.out.print("NIM\t : ");
            int nim = s.nextInt();
            System.out.print("Nama\t : ");
            String nama = s1.nextLine();
            System.out.print("Umur\t : ");
            int umur = s.nextInt();
            System.out.print("IPK\t : ");
            double ipk = s.nextDouble();
            
            Mahasiswa m = new Mahasiswa (nim, nama, umur, ipk);
            data.tambah(m);
        }
        
        System.out.println("----------------------------------------------------");
        System.out.println("\tData seluruh Mahasiswa  ");
        data.tampil();
        
        System.out.println("____________________________________________________");
        System.out.println("____________________________________________________");
        System.out.println("\t Pencarian Data  ");
        System.out.println("   Masukkan Nama Mahasiswa yang dicari  ");
        System.out.print("Nama : ");
        String cari = s1.nextLine();
        System.out.println("========================================");
        System.out.println("     Menggunakan Squential Search");
        int posisi = data.FindSeqSearch(cari);
        data.TampilPosisi(cari, posisi);
        data.TampilData(cari, posisi);
        
    }
}
