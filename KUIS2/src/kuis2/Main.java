/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kuis2;

/**
 *
 * @author WINDOWS 10
 */
import java.util.Scanner;

public class Main {

    public static void menu() {
        System.out.println("Masukkan Operasi yang anda inginkan : ");
        System.out.println("1. Tambah Data");
        System.out.println("2. Hapus Data");
        System.out.println("3. Tampilkan Data Teratas");
        System.out.println("4. Tampilkan Semua Data");
        System.out.println("5. Mencari Judul Buku");
        System.out.println("6. Hapus Semua Data");
        System.out.println("7. Keluar");

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        SingleLinkedList singLL = new SingleLinkedList();

        Buku b1 = new Buku("Umiku Surgaku", "Abd Sahaja", "2018", 122);
        Buku b2 = new Buku("Siapakah Uwis Al-Qarni?", "Derismono B.", "2010", 136);
        Buku b3 = new Buku("Dilarang Mudik tapi Boleh Jalan-jalan", "Maharani Suci N", "2009", 192);
        Buku b4 = new Buku("Antara Toleransi dan Telor Asin", "Basuki Maharja", "2013", 261);
        Buku b5 = new Buku("Sampeyan Ancen Ngaten!", "Bintang R", "2004", 192);

        singLL.addFirst(b1);
        singLL.addFirst(b2);
        singLL.addFirst(b3);
        singLL.addFirst(b4);
        singLL.addFirst(b5);

        int pilih = 0;
        do {
            menu();
            System.out.println("-------------------");
            System.out.print("   Pilihan : ");
            pilih = sc.nextInt();
            System.out.println("-------------------");
            switch (pilih) {
                case 1:
                    System.out.println("========= ISI DATA BUKU =======");
                    System.out.print("Judul \t\t : ");
                    String judul = sc1.nextLine();
                    System.out.print("Penerbit \t: ");
                    String penerbit = sc1.nextLine();
                    System.out.print("Tahun Terbit \t: ");
                    String tahunTerbit = sc1.nextLine();
                    System.out.print("Jumlah Halaman \t: ");
                    int jmlHal = sc.nextInt();
                    Buku add = new Buku(judul, penerbit, tahunTerbit, jmlHal);
                    singLL.addFirst(add);
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
                    System.out.println("==========================================");
                    System.out.println("  *** Masukkan Judul Buku Yang Dicari ***");
                    System.out.print("   Judul : ");
                    String cari = sc1.nextLine();
                    int pencarian = singLL.indexOf(cari);
                    if (pencarian != -1) {
                        System.out.println("Buku "+ cari +"yang dicari berada pada di Node ke-" + pencarian);
                    } else {
                        System.out.println("Buku tidak ditemukan");
                    }
                    System.out.println("==========================================");
                    break;
                case 6:
                    singLL.clear();
                    singLL.print();
                    break;
                default:
                    System.out.println("=== Selesai ===");
                    break;
            }
        } while (pilih != 7);
    }
}
