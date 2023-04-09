/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package No2;

/**
 *
 * @author WINDOWS 10
 */
import java.util.Scanner;
public class Main {
    public static void menu(){
        System.out.println("====================================");
        System.out.println("            Menu Pilihan ");
        System.out.println("====================================");
        System.out.println("1. Entry Judul Buku");
        System.out.println("2. Ambil Buku Teratas");
        System.out.println("3. Cek Judul Buku Teratas");
        System.out.println("4. Info Semua Judul Buku");
        System.out.println("5. Keluar");
    }
    public static void main(String [] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        
        DoubleLinkedList dll = new DoubleLinkedList();
        dll.addLast("3D Computer Vision");
        dll.addLast("Undesrstanding Software");
        dll.addLast("Algorithms Notes For profesionals");
        dll.addLast("Getting Started with C++ Audio Programming for Game Development");
        
        int pilih = 0;
        do {
            menu();
            System.out.println("--------------");
            System.out.print("  Pilih : ");
            pilih = sc.nextInt();
            System.out.println("--------------");
            
            switch(pilih){
                case 1:
                    System.out.print("Masukkan Judul Buku : ");
                    String jdl = sc1.nextLine();
                    dll.addLast(jdl);
                    break;
                case 2:
                    System.out.println("========================");
                    System.out.println("Buku pada Tumpukan TEratas telah Diambil");
                    dll.removeFirst();
                    System.out.println("========================");
                    break;
                case 3:
                    System.out.println("========================");
                    System.out.println("Buku urutan teratas");
                    System.out.println(" " + dll.getFirst() );
                    System.out.println("========================");
                    break;
                case 4:
                    dll.print();
                    break;
                case 5:
                    System.out.println(" PROGRAM BERAKHIR ");
            }
        } while (pilih != 6);
    }
}
