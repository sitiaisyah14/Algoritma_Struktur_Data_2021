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
public class Fungsi2 {
    public static void main (String [] args){
        Scanner input = new Scanner (System.in);
        
        System.out.print("Masukkan Jumlah deret bilangan fibonacci : ");
        int a = input.nextInt(); 
        
        for (int i = 1; i<= a; i++){
            int hasil = fibo (i);
            System.out.print(hasil + " ");
        }
    }
    static int fibo (int i){
        if (i == 1 || i == 2){
            return 1;
        } else {
            return fibo (i - 1) + fibo (i - 2);
        }
    }
}
