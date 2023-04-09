/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Soal1;

/**
 *
 * @author WINDOWS 10
 */
import java.util.Scanner;
public class BangunMain {
    public static void main (String [] args){
        Scanner sc = new Scanner (System.in);
        
        for (int i = 0; i < Integer.MAX_VALUE; i++){
            System.out.println("============= Jenis Bangun ==========");
            System.out.println("1. Kubus");
            System.out.println("2. Balok");
            System.out.println("3. Tabung");
            System.out.println("4. Keluar");
            
            System.out.print("Masukkan angka untuk memilih bangun : ");
            int pilih = sc.nextInt();
            
            if (pilih == 4){
                break;
            }
            
            switch (pilih){
                case 1:
                    System.out.println("============ Bangun Kubus =========");
                    System.out.print("Masukkan jumlah Kubus : ");
                    int jKub = sc.nextInt();
                    
                    Kubus [] kb = new Kubus [jKub];  // deklarasi array
                    
                    for (int k = 0; k < kb.length ; k++){
                        System.out.println("==============================");
                        System.out.print("Masukkan sisi : ");
                        int s= sc.nextInt();
                        
                        kb [k] = new Kubus (s);  //instansiasi objek kubus
                        int hasilLPK = kb[k].LuasPermukaan();
                        int hasilVK = kb [k].Volume();
                        System.out.println("==============================");
                        System.out.println("Luas Pemukaan Kubus : " + hasilLPK);
                        System.out.println("Volume Kubus : " + hasilVK);
                    }
                    break;
                case 2:
                    System.out.println("============ Bangun Balok =========");
                    System.out.print("Masukkan jumlah Balok : ");
                    int jml_Balok = sc.nextInt();
                    
                    Balok [] bk = new Balok [jml_Balok];  // deklarasi array
                    
                    for (int b = 0 ; b < bk.length ; b++){
                        System.out.println("==============================");
                        System.out.print("Masukkan Panjang : ");
                        int panjang = sc.nextInt();
                        System.out.print("Masukkan Lebar : ");
                        int lebar = sc.nextInt();
                        System.out.print("Masukkan Tinggi : ");
                        int tinggi = sc.nextInt();
                        
                        bk [b] = new Balok (panjang, lebar, tinggi);  //instansiasi objek Balok
                        int hasilLPK = bk[b].LuasPermukaan();
                        int hasilVK = bk [b].Volume();
                        System.out.println("==============================");
                        System.out.println("Luas Pemukaan Kubus : " + hasilLPK);
                        System.out.println("Volume Kubus : " + hasilVK);
                    }
                    break ;
                case 3:
                    System.out.println("============ Bangun Tabung =========");
                    System.out.print("Masukkan jumlah Tabung : ");
                    int jml_Tabung = sc.nextInt();
                    
                    Tabung [] tb = new Tabung [jml_Tabung];  // deklarasi array
                    
                    for (int t = 0 ; t < tb.length ; t++){
                        System.out.println("==============================");
                        System.out.print("Masukkan jari-jari : ");
                        int jari = sc.nextInt();
                        System.out.print("Masukkan tinggi : ");
                        int tinggi = sc.nextInt();
                        
                        tb [t] = new Tabung (jari, tinggi);  //instansiasi objek Tabung
                        double hasilLPK = tb [t].LuasPermukaan();
                        double hasilVK = tb [t].Volume();
                        System.out.println("==============================");
                        System.out.println("Luas Pemukaan Kubus : " + hasilLPK);
                        System.out.println("Volume Kubus : " + hasilVK);
                    }
                    break;
            }
        } 
    }
}
