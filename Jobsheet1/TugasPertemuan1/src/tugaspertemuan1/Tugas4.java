/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugaspertemuan1;

/**
 *
 * @author WINDOWS 10
 */
import java.util.Scanner;
public class Tugas4 {
    static int hasil;
    static Scanner sc = new Scanner (System.in);
    public static void main (String[] args){
        System.out.println("=============== Menu ================");
        System.out.println("1. Menghitung Luas Segitiga");
        System.out.println("2. Menghitung Luas Persegi Panjang");
        System.out.println("3. Menghitung Luas Lingkaran");
        
        System.out.print("Pilih menu : ");
        int menu = sc.nextInt();
        System.out.println("=====================================");
        System.out.println(" ");
        Menu (menu);
        
    }
    static void Menu(int menu){
        switch (menu){
            case 1:
                System.out.println("   ===== Menu Luas Segitiga =====");
                System.out.print("Masukkan Alas : ");
                int a = sc.nextInt ();
                System.out.print("Masukkan Tinggi : ");
                int t = sc.nextInt();
                System.out.println("===========================");
                hasil = luasSegitiga (a, t);
                System.out.println("Luas Segitiga : " +  hasil);
                System.out.println("===========================");
                break;
            case 2:
                System.out.println("  ===== Menu Luas Persegi Panjang =====");
                System.out.print("Masukkan Panjang : ");
                int p = sc.nextInt ();
                System.out.print("Masukkan Lebar : ");
                int l = sc.nextInt();
                System.out.println("===========================");
                hasil = luasPersegiP (p, l);
                System.out.println("Luas Persegi Panjang : " +  hasil);
                System.out.println("===========================");
                break;
            case 3:
                System.out.println("  ===== Menu Luas Lingkaran =====");
                System.out.print("Masukkan jari-jari : ");
                double r = sc.nextInt ();
                System.out.println("===========================");
                double luas = luasLingkaran (r);
                System.out.println("Luas Lingkaran : " +  luas);
                System.out.println("===========================");
                break;
        }
    }
    static int luasSegitiga (int a, int t){
        double set = 0.5;
        hasil = (int) (set * a * t);
        return hasil;
    }
    static int luasPersegiP (int p, int t){
        hasil = p * t;
        return hasil;
    }
    static double luasLingkaran (double r){
        double hasilLuas = 22 * r * r /7;
        return hasilLuas;
    }
    
}
