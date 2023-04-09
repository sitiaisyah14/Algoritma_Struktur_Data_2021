/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nasabah;
import java.util.Scanner;
public class NasabahMain {
    public static void main (String [] args){
        Scanner sc = new Scanner (System.in);
        
        System.out.print("Masukkan jumlah nasabah : ");
        int jml = sc.nextInt();
        System.out.println("");
        
        Nasabah [] ns = new Nasabah [jml]; 
        for (int i = 0; i < ns.length ; i++){
            System.out.println("");
            System.out.println("===========================================");
            System.out.println("            INPUT DATA NASABAH");
            System.out.println("===========================================");
            System.out.println("\n === Masukkan Data Nasabah ke- " + (i+1) + " ===");
            System.out.print(" Masukkan Nama          : ");
            String nama = sc.next();
            System.out.print(" Masukkan No Rekening   : ");
            String no_rek = sc.next();
            System.out.print(" Masukkan Alamat        : ");
            String alamat = sc.next();
            System.out.print(" No KTP                 : ");
            String no_ktp = sc.next();
            System.out.print(" Saldo                  : ");
            int saldo = sc.nextInt();
            
            ns [i] = new Nasabah (nama, no_rek, alamat, no_ktp, saldo);
        }
        for (int i=0 ; i< ns.length ; i++){
            System.out.println("");
            System.out.println("===========================================");
            System.out.println("               DATA NASABAH");
            System.out.println("===========================================");
            System.out.println("\n ===== Data Nasabah ke- " + (i+1) + " =====");
            ns[i].tampilData();
        }
        for (int i=0 ; i< ns.length ; i++){
            System.out.println("");
            System.out.println("===========================================");
            System.out.println("            SISTEM TRANSAKSI");
            System.out.println("===========================================");
            System.out.println("\n ====== Nasabah ke- " + (i+1) + " ======");
            System.out.println("1. Menabung ");
            System.out.println("2. Ambil Uang");
            System.out.println("3. Keluar ");
            System.out.print(" Masukkan pilihan anda : ");
            int plh = sc.nextInt();
            
            if (plh == 3){
                break;
            }
            
            int uang, saldoAkhir;
            switch (plh){
                case 1:
                    System.out.print("Masukkan uang tabungan : ");
                    uang = sc.nextInt();
                    
                    saldoAkhir = ns [i].tabungan(uang); 
                    System.out.println("Saldo Akhir : " +  saldoAkhir);
                break;
                case 2:
                    System.out.print("Masukkan uang yang di ambil : ");
                    uang = sc.nextInt();
                    
                    saldoAkhir = ns [i].ambilUang(uang);
                    System.out.println("Saldo Akhir : " +  saldoAkhir);
                break;
            }

        }
    }
}
