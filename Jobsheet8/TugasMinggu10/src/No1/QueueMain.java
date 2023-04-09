/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package No1;

import java.util.Scanner;

/**
 *
 * @author WINDOWS 10
 */
public class QueueMain {
    public static void menu(){
        System.out.println("Masukkan Operasi yang anda inginkan : ");
        System.out.println("1. Enqueue");
        System.out.println("2. Dequeue");
        System.out.println("3. Print");
        System.out.println("4. Peek");
        System.out.println("5. Peek Position");
        System.out.println("6. Peek At");
        System.out.println("7. Clear");
        System.out.println("-------------------");    
    }
    
    public static void main (String [] args){
        Scanner sc = new Scanner (System.in);
        
        System.out.print("Masukkan kapasitas Queue : ");
        int n = sc.nextInt();
        
        Queue Q = new Queue (n);
        
        int pilih;
        do {
            menu();
            pilih = sc.nextInt();
            switch (pilih){
                case 1:
                    System.out.println("----------------------------");
                    System.out.print("Masukkan data baru : ");
                    int dataMasuk = sc.nextInt();
                    Q.Enqueue(dataMasuk);
                    break;
                case 2:
                    System.out.println("----------------------------");
                    int dataKeluar = Q.Dequeue();
                    if (dataKeluar != 0){
                        System.out.println("Data yang dikeluarkan : " + dataKeluar);
                        break;
                    }
                case 3:
                    System.out.println("----------------------------");
                    Q.print();
                    break;
                case 4:
                    System.out.println("----------------------------");
                    Q.peek();
                    break;
                case 5:
                    System.out.println("----------------------------");
                    System.out.print("Masukkan data yang dicari : ");
                    int dc = sc.nextInt();
                    Q.peekPosition(dc);
                    break;
                case 6 :
                    System.out.println("----------------------------");
                    System.out.print("Masukkan indeks yang dicari : ");
                    int pss = sc.nextInt();
                    Q.peekAt(pss);
                    break;
                case 7 : 
                    System.out.println("----------------------------");
                    Q.clear();
                    break;
            }
        } while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4 || pilih == 5);
    }
}
