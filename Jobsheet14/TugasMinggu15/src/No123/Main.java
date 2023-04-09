/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package No123;

/**
 *
 * @author WINDOWS 10
 */
import java.util.Scanner;
public class Main {
   public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int v, e, jenis, count = 1, to = 0, from = 0;
        
        System.out.println("Silakan masukkan jenis graph : ");
        System.out.println("1. Directed Graph");
        System.out.println("2. Undirected Graph");
        jenis = sc.nextInt();
        System.out.println("Masukkan jumlah vertices : ");
        v = sc.nextInt();
        System.out.println("Masukkan jumlah edges : ");
        e = sc.nextInt();
        
        Graph graph = new Graph(v, jenis);
            
        System.out.println("Masukkan edges : <to> <from>");
        while (count <= e) {                
            to = sc.nextInt();
            from = sc.nextInt();

            graph.addEdge(to, from);
            count++;
        }
        graph.printGraph();
        graph.degree(2);
        graph.removeEdge(1, 3);
        graph.printGraph();
    }
}
