/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package No1;
import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author WINDOWS 10
 */
public class MainBuku {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Stack<Buku> buku = new Stack<>();
        int pilih;

        do {
            System.out.println("==============================");
            System.out.println("    Data Buku Perpustakaan");
            System.out.println("==============================");
            System.out.println("");
            System.out.println("1. Entry Judul Buku");
            System.out.println("2. Ambil Buku Teratas");
            System.out.println("3. Cetak Buku Teratas");
            System.out.println("4. Info Semua Judul Buku");
            System.out.println("5. Keluar");
            System.out.println("=============================");
            System.out.print(" Pilih : ");
            pilih = sc.nextInt();

            switch (pilih) {
                case 1:
                    sc.nextLine();
                    System.out.print("Isbn\t : ");
                    String isbn = sc.nextLine();
                    System.out.print("Judul \t : ");
                    String judul = sc.nextLine();
                    System.out.print("Terbit \t : ");
                    String terbit = sc.nextLine();
                    System.out.print("Penerbit : ");
                    String penerbit = sc.nextLine();

                    Buku bk1 = new Buku(isbn, judul, terbit, penerbit);
                    buku.push(bk1);
                    break;
                case 2:
                    buku.pop();
                    System.out.println("Terlah Dikeluarkan");
                    break;
                case 3:
                    System.out.println(buku.peek());
                    break;
                case 4:
                    buku.stream().forEach(bku -> {
                        
                        System.out.println("" + bku.toString());
                    });
                    break;
            }
        } while (pilih < 5 && pilih > 0);
    
    }
}
