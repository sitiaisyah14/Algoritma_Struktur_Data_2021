/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Soal2dan3;

/**
 *
 * @author WINDOWS 10
 */
import java.util.Scanner;
public class Tanah {
    public int panjang, lebar, terluas;
    
    public Tanah (int p, int l){
        panjang = p;
        lebar = l;
    }
    
    public int LuasTanah (){
        return panjang * lebar;
    }
    public int Cari (int luas []){
        for (int i = 1 ; i < luas.length ; i++){
            if (luas [i-1] < luas [i]){
                terluas = luas[i];
            }
        }
        return terluas;
    }
}

class Tnh {
    public static void main (String [] args){
        Scanner sc = new Scanner (System.in);
        
        System.out.print("Jumlah Tanah : ");
        int jml = sc.nextInt();
        
        Tanah [] tn = new Tanah [jml];
        for (int i = 0; i < tn.length ; i++){
            System.out.println("======== Tanah ke- " + (i+1)+ " ==========");
            System.out.print("   Panjang : " );
            int p = sc.nextInt();
            System.out.print("   Lebar : " );
            int l = sc.nextInt();
            tn[i] = new Tanah (p, l);
            System.out.println("==============================");
            System.out.println("  Luas Tanah ke- " + (i+1) + " : "+ tn[i].LuasTanah()+ " cm2");
            System.out.println("==============================");
        }
        int luas [] = new int [jml];
        int x = 0;
        for (int j = 0; j < tn.length; j++ ){
            luas [j] = tn[j].LuasTanah();
            x = tn[j].Cari(luas); 
        }
        System.out.println("==============================");
        System.out.println("   Tanah yang terluas : " + x);
        System.out.println("==============================");
    }
}
