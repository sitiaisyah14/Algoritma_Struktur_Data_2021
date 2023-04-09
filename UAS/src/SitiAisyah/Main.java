/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SitiAisyah;

/**
 *
 * @author WINDOWS 10
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        LinkedList ll = new LinkedList();
        Barang b1 = new Barang("001", "Sepatu Adidas", 70000, 5);
        Barang b2 = new Barang("002", "Sepatu Ardiles", 100000, 2);
        Barang b3 = new Barang("003", "Sepatu PVN", 150000, 7);
        
        Transaksi t1 = new Transaksi("AAA", 1, 150000);
        Transaksi t2 = new Transaksi("BBB", 1, 100000);
        Transaksi t3 = new Transaksi("BBB", 1, 70000);
        
        ll.addFirst(b1, t1);
        ll.addFirst(b2, t2);
        ll.addFirst(b3, t3);
        
        int pilih;
        do{
            System.out.println("********************************");
            System.out.println("         Penjualan Barang");
            System.out.println("********************************");
            System.out.println("1. Input Data\n2. Tampil Nilai \n3. Keluar");

            System.out.println("*********************************");
            System.out.print("Pilih: ");
            pilih = sc.nextInt();
            System.out.println("");
            
            int kode;
            int kodeTr;
            switch(pilih){
                case 1 :
                    System.out.print("Kode Transaksi\t : ");
                    int kd = sc.nextInt();
                    System.out.println("");
                    System.out.println(" Pembelian Barang ");
                            
                    System.out.println("***********************************************");

                    System.out.println("Kode\tNama\t\tHarga\tStok");
                    ll.print();
                    System.out.print("Pilih mahasiswa by nim : ");
                    kode = sc.nextInt();
                    
                    System.out.println("");
                    System.out.println("DAFTAR MATA KULIAH");
                    System.out.println("********************************** *************");
                    System.out.println("Kode\tJumlah Barang\t\t\t\tTotalHarga");
                    ll.print();
                    System.out.print("Pilih MK by kode : ");
                    kodeTr = sc.nextInt();
                    nl = new Nilai(kd, nilMhs, mahasis, mkl);
                    nilaiX.add(nl);
            }
        } while (pilih < 5 && pilih > 0);
    }
}
