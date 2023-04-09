/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package No2;

import java.util.Scanner;

/**
 *
 * @author WINDOWS 10
 */
public class Main {
    public static void menu(){
        System.out.println("========================================");
        System.out.println("        MENU UNTUK MENGECEK ANTRIAN");
        System.out.println("========================================");
        System.out.println("1. Antrian baru");
        System.out.println("2. Antian Keluar");
        System.out.println("3. Cek Antrian terdepan");
        System.out.println("4. Cek Antrian terakhir");
        System.out.println("5. Cek posisi antrian");
        System.out.println("6. Cek data pada posisi tertentu");
        System.out.println("7. Cek semua antrian");
        System.out.println("------------------------------");    
    }
    
    public static void main (String [] args){
        Scanner sc = new Scanner (System.in);
        
        System.out.print("Masukkan kapasitas Queue : ");
        int jumlah  = sc.nextInt();
        
        Queue antri = new Queue (jumlah);
        
        int pilih;
        do {
            menu();
            System.out.print(" Pilih : ");
            pilih = sc.nextInt();
            sc.nextLine();
            
            switch (pilih){
                case 1:
                    System.out.println("------------------------------");
                    System.out.print("NIM \t: ");
                    String nim = sc.nextLine();
                    System.out.print("Nama \t: ");
                    String nama = sc.nextLine();
                    System.out.print("Absen \t: ");
                    int absen = sc.nextInt();
                    System.out.print("IPK \t: ");
                    double ipk = sc.nextDouble();
                    Mahasiswa dt = new Mahasiswa (nim, nama, absen, ipk);
                    sc.nextLine();
                    antri.Enqueue(dt);
                    break;
                case 2:
                    System.out.println("------------------------------");
                    Mahasiswa data = antri.Dequeue();
                    if (!"".equals(data.nim) && !"".equals(data.nama) && !"".equals(data.absen) 
                            && !"".equals(data.ipk) ){
                        System.out.println("Data yang dikeluarkan : " + data.nim + " " + data.nama + " " + 
                                data.absen + " " + data.ipk + " " );
                        break;
                    }
                case 3:
                    System.out.println("------------------------------");
                    antri.peek();
                    break;
                case 4:
                    System.out.println("------------------------------");
                    antri.peekrear();
                    break;
                case 5:
                    System.out.println("------------------------------");
                    System.out.print("Masukkan NIM yang dicari : ");
                    String dc = sc.nextLine();
                    antri.peekPosition(dc);
                    break;
                case 6 :
                    System.out.println("------------------------------");
                    System.out.print("Masukkan indeks yang dicari : ");
                    int posisi = sc.nextInt();
                    antri.printMahasiswa(posisi);
                    break;
                case 7 :
                    System.out.println("------------------------------");
                    antri.print();
                    break;
            }
        } while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4 || pilih == 5 || pilih == 6 || pilih == 7);
    }
}
