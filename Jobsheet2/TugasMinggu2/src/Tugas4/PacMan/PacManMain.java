/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas4.PacMan;

/**
 *
 * @author WINDOWS 10
 */
import java.util.Scanner;
public class PacManMain {
    public static void main( String [] args){
        PacMan pm = new PacMan();
        
        Scanner sc = new Scanner (System.in);
        
        System.out.print("Masukan nilai x (posisi horizontal) : " );
        int horizontal = sc.nextInt();
        System.out.print("Masukan nilai y (posisi vertikal)   : " );
        int vertikal = sc.nextInt();
        System.out.print("Masukkan batas lebar permainan      : ");
        int lebar = sc.nextInt();
        System.out.print("Masukkan batas tinggi permainan     : ");
        int tinggi = sc.nextInt();
        
        pm.x = horizontal;
        pm.y = vertikal;
        pm.width =  lebar;
        pm.height =  tinggi;
        pm.printPosition();
        
        System.out.println("==============================");
        System.out.println("1. Kiri");
        System.out.println("2. Kanan");
        System.out.println("3. Bawah");
        System.out.println("4. Atas");
        System.out.print("Masukkan gerakkan : ");
        int gerak = sc.nextInt();
        
        System.out.println("===============================");
        if (gerak == 1){
            pm.moveLeft();
            pm.printPosition();
        }
        else if(gerak == 2){
            pm.moveRight();
            pm.printPosition();
        }
        else if(gerak == 3){
            pm.moveDown();
            pm.printPosition();
        }
        else if(gerak == 4){
            pm.moveUp();
            pm.printPosition();
        }
        System.out.println("===============================");
    }
}
