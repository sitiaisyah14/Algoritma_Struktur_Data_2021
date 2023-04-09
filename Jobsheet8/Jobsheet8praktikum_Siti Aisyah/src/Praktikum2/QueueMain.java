/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum2;

import java.util.Scanner;

/**
 *
 * @author WINDOWS 10
 */
public class QueueMain {
    public static void menu(){
        System.out.println("Pilih menu : ");
        System.out.println("1. Antrian baru");
        System.out.println("2. Antian Keluar");
        System.out.println("3. Cek Antrian terdepan");
        System.out.println("4. Cek Antrian terakhir");
        System.out.println("5. Cek semua antrian");
        System.out.println("-------------------");    
    }
    
    public static void main (String [] args){
        Scanner sc = new Scanner (System.in);
        
        System.out.print("Masukkan kapasitas Queue : ");
        int jumlah  = sc.nextInt();
        
        Penumpang antri = new Penumpang (jumlah);
        
        int pilih;
        do {
            menu();
            pilih = sc.nextInt();
            sc.nextLine();
            
            switch (pilih){
                case 1:
                    System.out.print("Nama \t: ");
                    String nama = sc.nextLine();
                    System.out.print("Kota Asal : ");
                    String asal = sc.nextLine();
                    System.out.print("Kota Tujuan : ");
                    String tujuan = sc.nextLine();
                    System.out.print("Jumlah Tiket : ");
                    int jml = sc.nextInt();
                    System.out.print("Harga : ");
                    int hrg = sc.nextInt();
                    Penumpang p = new Penumpang (nama, asal, tujuan, jml, hrg);
                    sc.nextLine();
                    antri.Enqueue(p);
                    break;
                case 2:
                    Penumpang data = antri.Dequeue();
                    if (!"".equals(data.nama) && !"".equals(data.kotaAsal) && !"".equals(data.kotaTujuan) 
                            && !"".equals(data.jumlahTiket) && !"".equals(data.harga)){
                        System.out.println("Data yang dikeluarkan : " + data.nama + " " + data.kotaAsal + " " + 
                                data.kotaTujuan + " " + data.jumlahTiket + " " + data.harga + " " );
                        break;
                    }
                case 3:
                    antri.peek();
                    break;
                case 4:
                    antri.peekrear();
                    break;
                case 5:
                    antri.print();
                    break;
            }
        } while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4 || pilih == 5);
    }

}
