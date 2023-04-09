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
public class Perulangan {
    public static void main (String [] args){
        Scanner input = new Scanner (System.in);
        
        String hari[] = {"Senin", "Selasa", "Rabu", "Kamis", "Jumat", "Sabtu", "Minggu"};
        System.out.print ("Masukkan NIM : ");
        String nim = input.next();
        String substring = nim.substring(nim.length()-2);
        
        int parseInt = Integer.parseInt(substring);
        int n = parseInt;
        System.out.println(" n = "+n);
        System.out.println(" ");
        if (parseInt<10){
            n += 10;
            for (int i = 0; i < n; i++) {
                if (i>6){
                    System.out.print(hari[i-7]+ ", ");
                } else {
                    System.out.print(hari[i] + ", ");
                }
                
            }
        } else {
            int m = n/7;
            int l = n%7;
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < hari.length; j++) {
                    System.out.println(hari[j] + " ");
                }
            }
            for (int i = 0; i < l; i++) {
                System.out.print(hari[i]+ " ");
            }
        }
        
    }

}
