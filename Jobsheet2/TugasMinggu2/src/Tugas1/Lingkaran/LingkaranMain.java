/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas1.Lingkaran;

/**
 *
 * @author WINDOWS 10
 */
import java.util.Scanner;
public class LingkaranMain {
    public static void main(String [] args){
        Lingkaran L1 = new Lingkaran ();
        Scanner sc = new Scanner (System.in);
        
        System.out.print("Jari- jari : ");
        double jari = sc.nextInt();
        
        L1.phi = 3.14;
        L1.r = jari;

        System.out.println("=========================");
        double hasilLuas =  L1.hitungLuas();
        System.out.println("Hasil Luas : " + hasilLuas);
        double hasilKel = L1.hitungKeliling();
        System.out.println("Hasil Keliling : " + hasilKel);
        System.out.println("=========================");
    }
}
