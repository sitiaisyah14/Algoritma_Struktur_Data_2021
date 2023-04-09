/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SitiAisyahUAS;

/**
 *
 * @author WINDOWS 10
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] abcd) {
        Scanner s = new Scanner(System.in);
        Scanner s1 = new Scanner(System.in);

        Barang data = new Barang();
        Transaksi saldo = new Transaksi();

        Barang [] abc = new Barang[5];
        data.abc[0] = new Barang("ABC", "Sepatu", 100000, 5);
        data.abc[1] = new Barang("DEF", "Baju", 50000, 4);
        data.abc[2] = new Barang("GHI", "Celana", 45000, 6);
        
        saldo.abc[0] = new Transaksi(001, 1, 100000);
        saldo.abc[1] = new Transaksi(002, 1, 50000);
        saldo.abc[2] = new Transaksi(003, 1, 45000);


        System.out.print(" 1. Tampil data Rekening \n 2. Tampil data transaksi \n 3. Sorting \n 4. Keluar");
        System.out.println("");
        System.out.print("Pilih Menu : ");
        int menu = s.nextInt();

        switch (menu) {
            case 1:
                System.out.println("----------------------------------------------------");
                System.out.println("\tData seluruh Member  ");
                data.tampilAll();
                break;
            case 2:
                System.out.println("----------------------------------------------------");
                System.out.println("\tData seluruh Saldo Member  ");
                saldo.tampilAll();
                break;
            case 3:
                System.out.println("----------------------------------------------------");
                System.out.println("\tHasil Sorting Saldo  ");
                saldo.selectionSort();
                saldo.tampilAll();
                break;
            case 4:
                System.out.println("=== SISTEM BERHENTI ===");
                break;
        }
    }
}
