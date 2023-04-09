/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package No1.Tiket;

/**
 *
 * @author WINDOWS 10
 */
import java.util.Scanner;
public class MainTiket {
    public static void main(String [] args){
        Scanner sc = new Scanner (System.in);
        
        TiketService tkt = new TiketService();
        Tiket m1 = new Tiket ("Adre", 30000, "Madura","Bali");
        Tiket m2 = new Tiket ("Dera", 28000, "Bandung","Bali");
        Tiket m3 = new Tiket ("Haris", 50000, "Surabaya","Bali");
        Tiket m4 = new Tiket ("Rizki", 22000, "Lombok","Bali");
        Tiket m5 = new Tiket ("Vriza", 35000, "Jakarta","Bali");
        
        tkt.tambah(m1);
        tkt.tambah(m2);
        tkt.tambah(m3);
        tkt.tambah(m4);
        tkt.tambah(m5);
        
        System.out.println("====================================");
        System.out.println("Data Tiket Pesawat sebelum sorting  ");
        System.out.println("====================================");
        tkt.tampilAll();
        
        System.out.println("===========================================================");
        System.out.println("Data Tiket setelah sorting asc berdasarkan harga Tiket");
        System.out.println("===========================================================");
        tkt.bubleSort();
        tkt.tampilAll();
        
        System.out.println("===========================================================");
        System.out.println("Data Tiket setelah sorting asc berdasarkan harga Tiket");
        System.out.println("===========================================================");
        tkt.selectionSort();
        tkt.tampilAll();
        
    }
}
