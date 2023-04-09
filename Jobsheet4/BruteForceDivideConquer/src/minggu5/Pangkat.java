/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu5;

/**
 *
 * @author WINDOWS 10
 */
import java.util.Scanner;
public class Pangkat {
    public int nilai, pangkat;
    
    Pangkat (int nli, int pngkt){
        nilai = nli;
        pangkat = pngkt;
    }
    public int pangkatBF (int a, int n){
        int hasil = 1;
        for (int i = 0;  i< n; i++){
            hasil = hasil * a;
        }
        return hasil;
    }
    
    public int pangkatDC(int a, int n){
        if (n==0){
            return 1;
        }
        else{
            if (n%2==1){ // bilangan ganjil
                return (pangkatDC(a,n/2)*pangkatDC(a,n/2)*a);
            }
            else{ // bilangan genap
                return (pangkatDC(a,n/2)*pangkatDC(a,n/2));
            }
        }
    }
}

class MainPangkat{
    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);
        
        System.out.println("======================================================");
        System.out.print("Masukkan jumlah elemen yang ingin dihitung : ");
        int elemen = sc.nextInt();
        
        Pangkat [] png = new Pangkat [elemen];
        
        for (int i = 0; i < elemen; i++){
            System.out.print("Masukkan nilai yang akan dipangkatkan ke- " + (i+1) + " : ");
            int nilai = sc.nextInt();
            System.out.print("Masukkan nilai pangkat ke- " + (i+1) + " : ");
            int pangkat = sc.nextInt();
            
            png [i] = new Pangkat (nilai, pangkat);
        }
        System.out.println("======================================================");
        System.out.println("================== Pilih Perhitungan =================");
        System.out.println(" 1. Brute Force \n 2. Devide and Conquer \n 3. keluar");
        System.out.print("    Masukkan angka pilihan anda : ");
        int plh = sc.nextInt();
        
        switch (plh){
            case 1:
                System.out.println("======================================================");
                System.out.println("Hasil Pangkat dengan Brute Force");
                for (int i = 0; i < elemen; i++){
                    System.out.println("Nilai " + png[i].nilai + " pangkat " + png[i].pangkat + " adalah : " + png[i].pangkatBF(png[i].nilai, png[i].pangkat));
                }
                System.out.println("======================================================");
            break;
            case 2:
                System.out.println("Hasil Pangkat dengan Devide and Conquer");
                for (int i = 0; i < elemen; i++){
                    System.out.println("Nilai " + png[i].nilai + " pangkat " + png[i].pangkat + " adalah : " + png[i].pangkatDC(png[i].nilai, png[i].pangkat));
                }
                System.out.println("======================================================"); 
            break;
            case 3:
                break;
        }
    }
}
