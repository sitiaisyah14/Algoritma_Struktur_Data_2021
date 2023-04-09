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
public class coba {
    public static void main (String [] args){
        // no 2
        char [] kata = { 'S', 'E', 'L', 'A', 'M', 'A', 'T'};
        
        for (int i = kata.length - 1 ; i>= 0; i--){
          System.out.print(kata [i] + " ");
        }
        
        Scanner sc = new Scanner (System.in);
        
        // no 3
        System.out.print("Masukkan detik : ");
        int detik = sc.nextInt();
        
        int hari =  detik/86400;
        int hari1 = detik%86400;
        
        int jam =  hari1/3600;
        int jam1 = hari1%3600;
        
        int menit =  jam1/60;
        int menit1 = jam1%60;
        
        int detik1 = menit1;
        
        System.out.print(hari + " hari : " + jam + " jam : " + menit + " menit : " + detik1 + " detik ");
        
    }
    
}
