/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UTSAisyah;

/**
 *
 * @author WINDOWS 10
 */
import java.util.Scanner;

public class MainTransaksi {

    public static void main(String[] abcd) {
        Scanner s = new Scanner(System.in);
        Scanner s1 = new Scanner(System.in);

        Rekening data = new Rekening();
        Transaksi saldo = new Transaksi();

        Rekening [] abc = new Rekening[5];
        data.abc[0] = new Rekening("16030927 3084", "Siti", "\t Aisyah Aisyah", "1-458-264-3263", "sitiaisyah4110@gmail.com");
        data.abc[1] = new Rekening("16100617 0573", "Darius", "\t Julian Daniel", "1-357-843-0547", "nec@lectusjusto.org");
        data.abc[2] = new Rekening("16240401 2243", "Fuller", "\t Finn Dunlap", "571-7062", "convalli@Vestibulumanteispum.org");
        data.abc[3] = new Rekening("16270525 0112", "Malcolm", "Keane Floyd", "623-0234", "porttitor.tellus.non@Curabitur.ca");
        data.abc[4] = new Rekening("16971204 2416", "Geoffrey", "Stephen Pratt", "1-683-416-8323", "ut.pellentenesque@luctusutpellentesque.com");

        saldo.abc[0] = new Transaksi(898214.0, 494048.0, 3587.0, "\t2021-03-09 07:54:42", " ");
        saldo.abc[1] = new Transaksi(205420.0, 200162.0, 775880.0, "2021-06-25 10:23:00", " ");
        saldo.abc[2] = new Transaksi(838632.0, 350929.0, 328316.0, "2021-09-18 23:00:04", " ");
        saldo.abc[3] = new Transaksi(230659.0, 204434.0, 690503.0, "2022-02-02 19:10:34", " ");
        saldo.abc[4] = new Transaksi(770592.0, 334245.0, 444267.0, "2020-08-11 13:36:56", " ");


        System.out.print(" 1. Tampil data Rekening \n 2. Tampil data transaksi \n 3. Mencari Saldo > 50.000 \n 4. Sorting \n 5. Keluar");
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
                System.out.println("\t Pencarian Data  ");
                System.out.println("   Masukkan Saldo yang dicari  ");
                System.out.print("Saldo : ");
                double cari = s.nextDouble();
                System.out.println("========================================");
                System.out.println("     Menggunakan Squential Search");
                int posisi = saldo.FindSeqSearch(cari);
                saldo.TampilPosisi(cari, posisi);
                saldo.TampilData(cari, posisi);
                break;
            case 4:
                System.out.println("----------------------------------------------------");
                System.out.println("\tHasil Sorting Saldo  ");
                saldo.selectionSort();
                saldo.tampilAll();
                break;
            case 5:
                System.out.println("=== SISTEM BERHENTI ===");
                break;
        }
    }
}
