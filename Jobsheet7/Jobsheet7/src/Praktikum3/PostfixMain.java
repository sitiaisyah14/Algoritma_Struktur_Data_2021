/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum3;

/**
 *
 * @author WINDOWS 10
 */
import java.util.Scanner;
public class PostfixMain {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        String p, Q;
        
        System.out.println("Masukkan ekspresi matematika (infix) : ");
        Q = sc.nextLine();
        Q = Q.trim();
        Q = Q + ")";
        
       int total = Q.length(); 
       
       Postfix post = new Postfix (total);
       p = post.konversi(Q);
       System.out.println("Postifix : " + p);
    }
}
