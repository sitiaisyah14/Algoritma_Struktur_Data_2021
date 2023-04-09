/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugaspertemuan1;

/**
 *
 * @author WINDOWS 10
 */
import java.util.Scanner;
public class Tugas3 {
    public static void main (String [] args){
        Scanner input = new Scanner (System.in);
        
        System.out.print("Masukkan nilai n : ");
        int n = input.nextInt();
        
        for (int i = 0; i < 11; i++){
            if (i%2==0){
                System.out.print("");
            }else{
                int x = 2*i;
                System.out.print(" " + x);
            }
            System.out.print(" ");
        }
    }
}
