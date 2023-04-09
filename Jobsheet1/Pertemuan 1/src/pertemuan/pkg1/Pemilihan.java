/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan.pkg1;

/**
 *
 * @author WINDOWS 10
 */
import java.util.Scanner;
public class Pemilihan {
    public static void main (String [] args){
        Scanner input = new Scanner (System.in);
        
        System.out.println("==== Program Menghitung Nilai Akhir ====");
        
        System.out.print("Masukkan nilai Tugas : ");
        int tugas = input.nextInt();
        System.out.print("Masukkan nilai UTS   : ");
        int uts = input.nextInt();
        System.out.print("Masukkan nilai UAS   : ");
        int uas = input.nextInt();
        
        System.out.println("========================");
        System.out.println("========================");
        
        double rata = (tugas * 0.2) + (uts * 0.35) + (uas * 0.45);
        System.out.println("Nilai Akhir : " + rata);
        
        
        String huruf;
        
        if(rata > 80){
            huruf = "A";
            System.out.println("Nilai huruf : " + huruf);
        }
        else if (rata > 73){
            huruf = "B+";
            System.out.println("Nilai huruf : " + huruf);
        }
        else if (rata > 65){
            huruf = "B";
            System.out.println("Nilai huruf : " + huruf);
        }
        else if (rata > 60){
            huruf = "C+";
            System.out.println("Nilai huruf : " + huruf);
        }
        else if (rata > 50){
            huruf = "C";
            System.out.println("Nilai huruf : " + huruf);
        }
        else if (rata > 39){
            huruf = "D";
            System.out.println("Nilai huruf : " + huruf);
        }
        else {
            huruf = "E";
            System.out.println("Nilai huruf : " + huruf);
        }
        
        if (huruf == "A" || huruf == "B+" || huruf == "B" || huruf == "C" || huruf == "C+"){
            System.out.println("=========================");
            System.out.println("      SELAMAT LULUS");
            System.out.println("=========================");
        }
        else {
            System.out.println("=========================");
            System.out.println(" MAAF ANDA TIDAK LULUS");
            System.out.println("=========================");
        }
    }
}
