/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package No3;

/**
 *
 * @author WINDOWS 10
 */
import java.util.Scanner;
public class Main {
    public static void menu(){
        System.out.println("Masukkan Operasi yang anda inginkan : ");
        System.out.println("1. Tambah Data");
        System.out.println("2. Hapus Data");
        System.out.println("3. Tampilkan Data Teratas");
        System.out.println("4. Tampilkan Semua Data");
        System.out.println("5. Hapus Semua Data");
        System.out.println("6. Keluar");
        System.out.println("-------------------");    
    }
    
    public static void main (String [] args){
        Scanner sc = new Scanner (System.in);
        SingleLingkedList singLL = new SingleLingkedList ();
        
        singLL.addFirst("Bahasa");
        singLL.addFirst("Android");
        singLL.addFirst("Komputer");
        singLL.addFirst("Basis Data");
        singLL.addFirst("Matematika");
        singLL.addFirst("Algoritma");
        singLL.addFirst("Statistika");
        singLL.addFirst("Multimedia");
        
        int pilih = 0;
        do{
            menu ();
            System.out.print("   Pilihan : ");
            pilih = sc.nextInt();
            switch (pilih){
                case 1:
                    System.out.print("Masukkan data baru : ");
                    String dataMasuk = sc.next();
                    singLL.addFirst(dataMasuk);
                    singLL.print();
                    break;
                case 2:
                    singLL.removeFirst();
                    singLL.print();
                    break;
                case 3:
                    singLL.peek();
                    break;
                case 4:
                    singLL.print();
                    break;
                case 5:
                    singLL.clear();
                    singLL.print();
                    break;
                default :
                    System.out.println("=== Selesai ===");
                    break;
            }
        }while (pilih !=6);
    }
}
