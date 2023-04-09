/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasminggu5;

/**
 *
 * @author WINDOWS 10
 */
import java.util.Scanner;
public class Mayoritas{
    public String nama;
    
    Mayoritas (String nm){
        nama = nm;
    }
}
class MayoritasMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("==================================");
        System.out.print("  Masukkan Jumlah Elemen : ");
        int jumlah = input.nextInt();
        System.out.println("==================================");
        
        System.out.println(" ");
        Mayoritas my[] = new Mayoritas[jumlah];
        System.out.println("==================================");
        System.out.println("  Inputkan Nama Calon Ketua BEM");
        System.out.println("==================================");
        
        for (int i = 0; i < my.length; i++) {
            System.out.print("Masukkan Nama Index Ke-" + i + " = ");
            String nama = input.next();
            my[i] = new Mayoritas(nama);
        }
        
        System.out.println("\n=====================================================================");
        for (int i = 0; i < my.length; i++) {
            System.out.print(my[i].nama + " || ");
        }
        System.out.println("\n ====================================================================");

        int arr[] = new int[my.length];

        int  modus = 0, index = 0;  //modus nilai sering muncul  //indeks
        for (int i = 0; i < arr.length; i++) {
            if (modus > arr[i]) { //jika modus lebih dari inputan
            } 
            else {
                modus = arr[i]; //modus sama dengan jumlah index
                index = i; //indeks sama dengan panjang i
            }
        }
        System.out.println();
        System.out.println("Mayoritas adalah  " + my[index].nama);
    }
}

