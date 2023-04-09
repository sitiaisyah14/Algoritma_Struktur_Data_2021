/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu5;

/**
 *
 * @author WINDOWS 10
 */
import java.util.Scanner;

public class Faktorial {

    public int nilai;

    public int faktorialBF(int n) {
        int fakto = 1;
        int i = 0;
        while (i <= n){
            fakto = fakto*i;
            i++;
        }
        //for (int i = 1; i <= n; i++) {
            //fakto = fakto * i;
        //}
        return fakto;
    }

    public int faktorialDC(int n) {
        if (n == 1) {
            return 1;
        } else {
            int fakto = n * faktorialDC(n - 1);
            return fakto;
        }
    }
}

class MainFaktorial {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=================================================");
        System.out.print("Masukkan jumlah elemen yang ingin dihitung : ");
        int elemen = sc.nextInt();

        Faktorial[] fk = new Faktorial[elemen];
        for (int i = 0; i < elemen; i++) {
            fk [i] = new Faktorial();
            System.out.print("Masukkan nilai data ke-" + (i+1) + " : ");
            fk [i].nilai = sc.nextInt();
        }
        long startTime1 = System.nanoTime(); // mengambil awal waktu eksekusi
        
        System.out.println("=================================================");
        System.out.println("Hasil Faktorial dengan Brute Force");
        for (int i = 0; i < elemen; i++){
            System.out.println("Faktorial dari nilai " + fk[i].nilai + " adalah : " + fk[i].faktorialBF(fk[i].nilai));
        }
        
        long endTime1 = System.nanoTime(); // mengambil akhir waktu eksekusi
        long x = endTime1 - startTime1;    // menghitung waktu eksekusi

        
        long startTime2 = System.nanoTime(); // mengambil awal waktu eksekusi ke 2
        
        System.out.println("=================================================");
        System.out.println("Hasil Faktorial dengan Devide and Conquere");
        for (int i = 0; i < elemen ;i++){
            System.out.println("Faktorial dari nilai " + fk[i].nilai + " adalah : " + fk[i].faktorialDC(fk[i].nilai));   
        }
        
        long endTime2 = System.nanoTime();   // mengambil akhir waktu eksekusi 2
        long y = endTime2 - startTime2;      // menghitung waktu eksekusi 2

        System.out.println("=================================================");
        
        System.out.println("Waktu eksekusi menggunakan method faktorialBF : "+ x + " mili detik");
        System.out.println("Waktu eksekusi menggunakan method faktorialDC : "+ y + " mili detik");

    }
}
