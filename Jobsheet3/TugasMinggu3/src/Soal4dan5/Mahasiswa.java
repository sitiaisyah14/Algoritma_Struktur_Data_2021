/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Soal4dan5;
import java.util.Scanner;
public class Mahasiswa {
    public String nama, nim;
    public char jenisKel;
    public double ipk;
    
    public Mahasiswa (String nm, String ni, char jk, double ip){
        nama = nm;
        nim = ni;
        jenisKel = jk;
        ipk = ip;  
    }
    
    public double TampilData (){
        System.out.println("Nama          : " + nama);
        System.out.println("NIM           : " + nim);
        System.out.println("Jenis Kelamin : " + jenisKel);
        System.out.println("IPK           : " + ipk);
        return ipk;
    }
    
    public double RataIpk (double [] ip){
        double total = 0;
        for (int i = 0; i < ip.length; i++){
            total += ip[i];
        }
        double ratarata = total / ip.length;
        return ratarata;
    }
}

class Mhs{
    public static void main (String [] args){
        Scanner sc = new Scanner (System.in);
        
        System.out.print("Jumlah Mahasiswa : ");
        int mhs = sc.nextInt();
        
        Mahasiswa [] ms = new Mahasiswa [mhs];
        
        for (int i = 0; i < ms.length ; i++){
            System.out.println("=== Masukkan Data Mahasiswa ke- " + (i+1) + " ===");
            System.out.print(" Masukkan Nama          : ");
            String nama = sc.next();
            System.out.print(" Masukkan NIM           : ");
            String nim = sc.next();
            System.out.print(" Masukkan Jenis Kelamin : ");
            char jenisKel = sc.next().charAt(0);
            System.out.print(" Masukkan IPK           : ");
            double ipk = sc.nextDouble();
            
            ms [i] = new Mahasiswa (nama, nim, jenisKel, ipk);
        }
        System.out.println(" ");
        
        for (int i = 0; i < ms.length; i++){
            System.out.println("================================");
            System.out.println(" ==== Data Mahasiswa ke- " + (i+1) + " ====");
            System.out.println("================================");
            ms[i].TampilData();
            System.out.println("================================");
        }
        
        double x = 0;
        double ip [] = new double [mhs];
        for (int i = 0; i < ms.length ; i++){
           x = ms[i].RataIpk(ip);       
        }
        
        System.out.println("");
        System.out.println("=========================================");
        System.out.println("Rata-rata IPK seluruh Mahasiswa : " +  x);
        System.out.println("=========================================");
        
        
    }
}
