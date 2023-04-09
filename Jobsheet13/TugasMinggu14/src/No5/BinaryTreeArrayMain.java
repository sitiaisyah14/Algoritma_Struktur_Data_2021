/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package No5;

/**
 *
 * @author WINDOWS 10
 */
import java.util.Scanner;
public class BinaryTreeArrayMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        BinaryTreeArray bta = new BinaryTreeArray();
        int [] data = {6,4,8,3,5,7,9,0,0,0};
        int idxLast = 6;
        
        while (idxLast < data.length-1){
            idxLast += 1;
            System.out.println("Silahkan masukkan data yang ingin ditambahkan");
            System.out.print("Data : ");
            int dt = sc.nextInt();
            bta.populateData(data, idxLast);
            bta.add(dt, idxLast);
            System.out.print("Apakah ingin input data lagi? (y/n) : ");
            char pil = sc.next().charAt(0);
            if (pil == 'n'){
                break;
            }
        }
        System.out.println("InOrder : ");
        bta.traverseInOrder(0);
        System.out.println("");
        System.out.println("PreOrder : ");
        bta.traversePreOrder(0);
        System.out.println("");
        System.out.println("PostOrder : ");
        bta.traversePostOrder(0);
    }
}
