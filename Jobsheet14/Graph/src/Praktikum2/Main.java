/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum2;

/**
 *
 * @author WINDOWS 10
 */
import java.util.Scanner;
public class Main {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int v, e, count = 1, to = 0, from = 0;
        
        graphArray graph;
        
        try {
            System.out.print("Masukkan jumlah vertices : ");
            v = sc.nextInt();
            System.out.print("Masukkan jumlah edges : ");
            e = sc.nextInt();
            
            graph = new graphArray(v);
            
            System.out.println("Masukkan edges : <to> <from>");
            while (count <= e){
                to = sc.nextInt();
                from = sc.nextInt();
                
                graph.makeEdge(to, from, 1);
                count++;
            }
            
            System.out.println("array 2D sebagai representasi graph sbb : ");
            System.out.println("  ");
            for (int i = 1; i <= v; i++) {
                System.out.print(" " + i );
            }
            System.out.println();
            
            for (int i = 1; i <= v; i++) {
                System.out.print(i + " ");
                for (int j = 1; j < v; j++) {
                    System.out.print( graph.getEdge(i, j) + " ");
                }
                System.out.println();
            }
        } 
        catch (Exception E){
            System.out.println("Error. Silahkan cek kembali \n" + E.getMessage());
        }
        sc.close();
    }
}
