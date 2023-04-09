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
        System.out.println("===========================================");
        System.out.println("            MENU ANTRIAN NASABAH");
        System.out.println("===========================================");
        System.out.println("1. Tambah Antrian dari Depan");
        System.out.println("2. Tambah Antrian dari Belakang");
        System.out.println("3. Tambah Antrian pada Urutan Tertentu");
        System.out.println("4. Keluarkan Antrian dari Depan");
        System.out.println("5. Keluarkan Antrian dari Belakang");
        System.out.println("6. Keluarkan Antrian pada Urutan Tertentu");
        System.out.println("7. Tampilakn Seluruh Antrian Nasabah");
        System.out.println("8. Keluar");
    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);

        SingleLingkedList singLL = new SingleLingkedList();

        Nasabah n1 = new Nasabah("Aisyah", "Pasuruan", "350 621 966 0001");
        Nasabah n2 = new Nasabah("Aprilia", "Surabaya", "350 873 231 0005");
        Nasabah n3 = new Nasabah("Faranisa", "Denpasar", "350 321 268 0017");
        Nasabah n4 = new Nasabah("Azni", "Makassar", "350 652 579 0928");
        Nasabah n5 = new Nasabah("Ageng", "Medan", "350 321 485 0089");

        singLL.addFirst(n1);
        singLL.addLast(n2);
        singLL.addLast(n3);
        singLL.addLast(n4);
        singLL.addLast(n5);

        int pilih = 0;
        do {
            menu();
            System.out.println("----------------");
            System.out.print("  Pilihan : ");
            pilih = sc.nextInt();
            System.out.println("---------------");

            switch (pilih) {
                case 1:
                    System.out.println("Masukkan Data Nasabah !! ");
                    System.out.print("Nama \t\t : ");
                    String nama = sc1.nextLine();
                    System.out.print("Alamat \t\t : ");
                    String alamat = sc1.nextLine();
                    System.out.print("No Rek \t\t : ");
                    String noRek = sc1.nextLine();

                    Nasabah nFirst = new Nasabah(nama, alamat, noRek);
                    singLL.addFirst(nFirst);
                    System.out.println(" ");
                    break;
                case 2:
                    System.out.println("Masukkan Data Nasabah !! ");
                    System.out.print("Nama \t\t : ");
                    String nama1 = sc1.nextLine();
                    System.out.print("Alamat \t\t : ");
                    String alamat1 = sc1.nextLine();
                    System.out.print("No Rek \t\t : ");
                    String noRek1 = sc1.nextLine();

                    Nasabah nLast = new Nasabah(nama1, alamat1, noRek1);
                    singLL.addLast(nLast);
                    System.out.println(" ");
                    break;
                case 3:
                    System.out.println("Masukkan Data Nasabah !! ");
                    System.out.print("Nama \t\t : ");
                    String nama2 = sc1.nextLine();
                    System.out.print("Alamat \t\t : ");
                    String alamat2 = sc1.nextLine();
                    System.out.print("No Rek \t\t : ");
                    String noRek2 = sc1.nextLine();

                    Nasabah nAt = new Nasabah(nama2, alamat2, noRek2);
                    
                    System.out.print("Masukkan index yang ditambah : ");
                    int idx = sc.nextInt();
                    singLL.insertAt(idx, nAt);
                    System.out.println(" ");
                    break;
                case 4 :
                    singLL.removeFirst();
                    System.out.println("");
                    break;
                case 5:
                    singLL.removeLast();
                    System.out.println("");
                    break;
                case 6:
                    System.out.print("Masukkan index yang dihapus : ");
                    int idx1 = sc.nextInt();
                    singLL.removeAt(idx1);
                    break;
                case 7:
                    singLL.print();
                    break;
            }
        } while (pilih != 8);
    }
}
