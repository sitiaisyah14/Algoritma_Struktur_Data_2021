/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package No4;

/**
 *
 * @author WINDOWS 10
 */
import java.util.Scanner;
public class Main {
     public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        Graph graph = new Graph(6);
//      0 Surabaya
//      1 Malang
//      2 Gresik
//      3 Blitar
//      4 Sidoarjo
        graph.addEdge(0, 1, "Surabaya", "Malang");
        graph.addEdge(0, 4, "Surabaya", "Sidoarjo");
        graph.addEdge(1, 2, "Malang", "Gresik");
        graph.addEdge(1, 3, "Malang", "Blitar");
        graph.addEdge(1, 4, "Malang", "Sidoarjo");
        graph.addEdge(2, 3, "Gresik", "Blitar");
        graph.addEdge(3, 4, "Blitar", "Sidoarjo");
        graph.addEdge(3, 0, "Blitar", "Surabaya");
        System.out.println("");
        graph.printGraph(); 
        graph.degree(2); 
        graph.removeEdge(1, 2);
        graph.printGraph(); 
    }
}
