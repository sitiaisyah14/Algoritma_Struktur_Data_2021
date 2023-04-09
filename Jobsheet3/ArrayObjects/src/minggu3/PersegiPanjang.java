/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu3;

/**
 *
 * @author WINDOWS 10
 */
import java.util.Scanner;
public class PersegiPanjang {
    public int panjang;
    public int lebar;
}
class ArrayObjects {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan baris array : " );
        int a = sc.nextInt();
        System.out.print("Masukkan kolom array : " );
        int s = sc.nextInt();
        
        PersegiPanjang [][] ppArray = new PersegiPanjang [a][s];
        for(int i = 0; i < ppArray.length ; i++){
            for(int j = 0; j < ppArray[0].length ; j++){
                ppArray[i][j] = new PersegiPanjang();
                System.out.println("Persegi panjang ke- " + j);
                System.out.print("Masukkan panjang : ");
                ppArray[i][j].panjang = sc.nextInt();
                System.out.print("Masukkan lebar : ");
                ppArray[i][j].lebar = sc.nextInt();
            }
        }
        for (int i = 0; i < ppArray.length; i++){
            for(int j = 0; j < ppArray[0].length ; j++){
            System.out.println("Persegi Panjang ke-" + j);
            System.out.println("Panjang : " + ppArray[i][j].panjang + " , lebar : " + ppArray[i][j].lebar);
            }
        }
    }
}
