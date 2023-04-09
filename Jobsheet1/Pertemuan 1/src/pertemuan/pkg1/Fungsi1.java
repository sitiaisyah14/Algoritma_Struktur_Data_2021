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
public class Fungsi1 {
    public static void main (String [] args){
        Scanner input = new Scanner (System.in);
        
        System.out.print("Masukkan Jumlah deret bilangan fibonacci : ");
        int a = input.nextInt(); 
        
        fib (a);
    }
    
    
    static int fib(int a){
        int i = 0;
        int s = 1;
        int y = 0;   
        
        for (int j = 1 ; j <= a ; j++){
            System.out.print(y + " ");
            y = i + y;
            i = s;
            s = y;
        }
        return 0;
    }

}
