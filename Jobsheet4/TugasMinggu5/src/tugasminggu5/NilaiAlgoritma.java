/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasminggu5;

/**
 *
 * @author WINDOWS 10
 */
import java.util.Scanner;
public class NilaiAlgoritma {
    public String namaMhs;
    public int nilaiTugas, nilaiKuis, nilaiUTS, nilaiUAS;
    
    public NilaiAlgoritma (String nm, int tgs, int kuis, int uts, int uas){
        namaMhs = nm;
        nilaiTugas = tgs;
        nilaiKuis = kuis;
        nilaiUTS = uts;
        nilaiUAS = uas;
    }
    public double hitungTotalNilai(){
        int total = (nilaiTugas*30/100) + (nilaiKuis*20/100) + (nilaiUTS*20/100) + (nilaiUAS*30/100 );
        return total;
    }
    public double hitungRata(double total[]){
        double totalSemua = 0; 
        for (int i = 0; i < total.length; i++) {
            totalSemua += total[i];  //menghitung totol nilai
            
        }
        return totalSemua; //mengulang sebuah perhitungan
    }
}

class MainNilaiAlgoritma{
    public static void main (String [] args){
        Scanner sc = new Scanner (System.in);
        
        System.out.println("=============================================");
        System.out.print("  Masukkan Jumlah Mahasiswa : ");
        int jmlh = sc.nextInt();
        System.out.println("=============================================");
        
        NilaiAlgoritma [] na = new NilaiAlgoritma [jmlh];
        
        for (int i = 0; i < na.length; i++) {
            System.out.println("========================================");
            System.out.println("    Input Data Mahasiswa ke-" + (i+1));
            System.out.println("========================================");
            
            System.out.print("  Masukkan Nama        : ");
            String nama = sc.next();
            System.out.print("  Masukkan Nilai Tugas : ");
            int tugas= sc.nextInt();
            System.out.print("  Masukkan Nilai Kuis  : ");
            int kuis= sc.nextInt();
            System.out.print("  Masukkan Nilai UTS   : ");
            int uts= sc.nextInt();
            System.out.print("  Masukkan Nilai UAS   : ");
            int uas= sc.nextInt();
            
            na [i] = new NilaiAlgoritma (nama, tugas, kuis, uts, uas);
        }
        for (int i = 0; i < na.length; i++) {
            System.out.println("========================================");
            System.out.println("     Data Mahasiswa dan Total Nilai ");
            System.out.println("========================================");
            double total = na[i].hitungTotalNilai();
            System.out.println(" Nama Mahasiswa : " + na[i].namaMhs);
            System.out.println(" Nilai Total    : " + total);
            
        }
        
        System.out.println("=============================================");
        double rerata = 0;
        double total [] = new double [jmlh];
        for (int i = 0; i < na.length; i++) {
            total[i] = na[i].hitungTotalNilai();
            rerata = na[i].hitungRata(total);
        }
        System.out.println("=============================================");
        System.out.println("Rata rata kelas\t: "+rerata/jmlh);
        System.out.println("=============================================");

    }
}
