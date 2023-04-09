/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package No4;

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
        System.out.println("1. Tambah Data Awal");
        System.out.println("2. Tambah Data Akhir");
        System.out.println("3. Tambah Data Indeks Tertentu");
        System.out.println("4. Hapus Data Awal");
        System.out.println("5. Hapus Data Akhir");
        System.out.println("6. Hapus Data Indeks Tertentu");
        System.out.println("7. Cetak");
        System.out.println("8. Cari NIM");
        System.out.println("9. Urut Data IPK-DESC");
        System.out.println("10. Keluar");
    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);

        DoubleLinkedList dll = new DoubleLinkedList();

        Mahasiswa m1 = new Mahasiswa("788", "Wendy", 3.87);
        Mahasiswa m2 = new Mahasiswa("234", "Rendy", 3.45);
        Mahasiswa m3 = new Mahasiswa("265", "Ahmad", 4.0);
        
        dll.addFirst(m1);
        dll.addFirst(m2);
        dll.addFirst(m3);

        int pilih = 0;
        do {
            menu();
            System.out.println("--------------");
            System.out.print("  Pilih : ");
            pilih = sc.nextInt();
            System.out.println("--------------");

            switch (pilih) {
                case 1:
                    System.out.println("   Masukkan Data Mahasiswa Posisi Awal");
                    System.out.print("NIM : ");
                    String nim = sc1.nextLine();
                    System.out.print("Nama : ");
                    String nama = sc1.nextLine();
                    System.out.print("IPK : ");
                    double ipk = sc.nextDouble();
                    Mahasiswa addFirst = new Mahasiswa (nim, nama, ipk);
                    dll.addFirst(addFirst);
                    break;
                case 2:
                    System.out.println("   Masukkan Data Mahasiswa Posisi Akhir");
                    System.out.print("NIM : ");
                    String nim1 = sc1.nextLine();
                    System.out.print("Nama : ");
                    String nama1 = sc1.nextLine();
                    System.out.print("IPK : ");
                    double ipk1 = sc.nextDouble();
                    Mahasiswa addLast = new Mahasiswa (nim1, nama1, ipk1);
                    dll.addLast(addLast);
                    break;
                case 3:
                    System.out.print("Masukkan Indeks : ");
                    int idx = sc.nextInt();
                    System.out.println("   Masukkan Data Mahasiswa Posisi Indeks ke-" + idx);
                    System.out.print("NIM : ");
                    String nim2 = sc1.nextLine();
                    System.out.print("Nama : ");
                    String nama2 = sc1.nextLine();
                    System.out.print("IPK : ");
                    double ipk2 = sc.nextDouble();
                    Mahasiswa add = new Mahasiswa (nim2, nama2, ipk2);
                    dll.add(add, idx);
                    break;
                case 4:
                    dll.removeFirst();
                    break;
                case 5:
                    dll.removeLast();
                    break;
                case 6:
                    System.out.println("Masukkan Indeks : ");
                    int idks = sc.nextInt();
                    dll.remove(idks);
                    break;
                case 7:
                    dll.print();
                    break;
                case 8:
                    System.out.println(" Pencarian Data");
                    System.out.print("NIM : ");
                    String nims = sc1.nextLine();
                    dll.seqSearch(nims);
                    break;
                case 9:
                    dll.bubbleSort();
                    dll.print();
            }
        } while (pilih != 10);
    }
}
