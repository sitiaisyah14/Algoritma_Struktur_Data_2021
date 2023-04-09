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

    public static void menu() {
        System.out.println("====================================");
        System.out.println("            Menu Pilihan ");
        System.out.println("====================================");
        System.out.println("1. Tambah Data Penerima Vaksin");
        System.out.println("2. Hapus Data Pengantri vaksin");
        System.out.println("3. Daftar PEnerima Vaksin");
        System.out.println("4. Keluar");
    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);

        DoubleLinkedList dll = new DoubleLinkedList();

        PenerimaVaksin p1 = new PenerimaVaksin(124, "Mely");
        PenerimaVaksin p2 = new PenerimaVaksin(135, "Johan");
        PenerimaVaksin p3 = new PenerimaVaksin(146, "Rosi");

        dll.addFirst(p3);
        dll.addFirst(p2);
        dll.addFirst(p1);

        int pilih = 0;
        do {
            menu();
            System.out.println("--------------");
            System.out.print("  Pilih : ");
            pilih = sc.nextInt();
            System.out.println("--------------");

            switch (pilih) {
                case 1:
                    System.out.print("No Antrian : ");
                    int noAntrian = sc.nextInt();
                    System.out.print("Nama : ");
                    String nama = sc1.nextLine();
                    PenerimaVaksin add = new PenerimaVaksin(noAntrian, nama);
                    dll.addFirst(add);
                    break;
                case 2:
                    System.out.println("========================");
                    dll.removeFirst();
                    System.out.println("========================");
                    break;
                case 3:
                    dll.print();
                    break;
                case 4:
                    System.out.println(" PROGRAM BERAKHIR ");
            }
        } while (pilih != 6);
    }
}
