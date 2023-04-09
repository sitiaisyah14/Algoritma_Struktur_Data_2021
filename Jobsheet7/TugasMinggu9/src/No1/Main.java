/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package No1;

/**
 *
 * @author WINDOWS 10
 */
import java.util.Scanner;
public class Main {
    public static void main(String [] args){
        Scanner sc = new Scanner (System.in);
        
        System.out.print("Masukkan Kalimat : ");
        String kalimat = sc.nextLine();
        
        int ukuran = kalimat.length();
        KarakterKebalik kt = new KarakterKebalik (ukuran, kalimat);
        
        kt.konversi(kalimat);
        kt.print();
    }
}
